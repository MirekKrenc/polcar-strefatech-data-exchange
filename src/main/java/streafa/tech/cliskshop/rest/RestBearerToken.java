package streafa.tech.cliskshop.rest;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Scope;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.util.Base64Utils;
import org.springframework.util.MultiValueMap;
import org.springframework.web.client.RestTemplate;
import streafa.tech.cliskshop.properties.ClickShopProperties;
import streafa.tech.cliskshop.token.Token;
import streafa.tech.cliskshop.token.TokenRepository;

import java.time.LocalDateTime;
import java.util.Optional;

@Service
public class RestBearerToken {

    private RestTemplate restTemplate;
    private ClickShopProperties clickShopProperties;
    private static String POST_TOKEN_URL = null;

    private TokenRepository tokenRepository;

    public RestBearerToken(ClickShopProperties clickShopProperties, TokenRepository tokenRepository) {
        this.restTemplate = new RestTemplate();
        this.tokenRepository = tokenRepository;
        this.clickShopProperties = clickShopProperties;
        POST_TOKEN_URL = clickShopProperties.getToken_url();
    }

    //@Bean
    //@Scope(value = ConfigurableBeanFactory.SCOPE_SINGLETON)
    public Token getBearerToken()
    {
        BearerToken bearerToken = new BearerToken();
        Token token = null;

        //wyciagam token i jego dane z bazy i sprawdzm czy wciaz jest valid - zawsze ma id = 1 i moze byc tylko 1 token b tabeli
        Optional<Token> tokenDBOptional = tokenRepository.findById(1L);
        if (tokenDBOptional.isPresent())
        {
            //sprawdzam jego dane
            token = tokenDBOptional.get();
            if (checkIfTokenIsValid(token))
            {
                System.out.println("TOKENE BIORE Z BAZY DANYCH: " + token.getToken());
                return token;
            }
        }

        //TODO jestem tu czyli trzeba pobrac nowy token ze sklepu , usinąc stary i zapisac nowy do bazy danych i zwrocic ten token do reszty funkcji
        HttpHeaders headers = new HttpHeaders();
        String auth = clickShopProperties.getLogin() + ":" + clickShopProperties.getPassword();
        byte [] authentication = auth.getBytes();
        byte[] base64Authentication = Base64Utils.encode(authentication);
        String baseCredential = new String(base64Authentication);

        headers.add(HttpHeaders.AUTHORIZATION, "Basic " + baseCredential);

        HttpEntity httpEntity = new HttpEntity(headers);

        ResponseEntity<BearerToken>  responseEntityToken = restTemplate.exchange(POST_TOKEN_URL, HttpMethod.POST, httpEntity, BearerToken.class);
        System.out.println("token=" + responseEntityToken.getBody().getAccessToken());
        bearerToken = responseEntityToken.getBody();
        LocalDateTime current = LocalDateTime.now();
        LocalDateTime expirationDate = current.plusSeconds(bearerToken.getExpiresIn());
        //to bedzie zwracane z requestu
        token = new Token(1L, bearerToken.getAccessToken(), current.getYear(), current.getDayOfYear(), expirationDate.getDayOfYear());
        //usuwanie starego - motoda deleteAll ale jest tylko 1 rekord
        tokenRepository.deleteAll();
        // zapis do bazy
        tokenRepository.save(token);
        //zwracam nowy token
        return token;
    }

    private boolean checkIfTokenIsValid(Token token) {
        int currentDayOfYear = LocalDateTime.now().getDayOfYear();
        int currentYear = LocalDateTime.now().getYear();

        //zmian roku - od razu pobieram nowy token
        if (token.getYear() < currentYear)
            return false;
        //dodaje margines bledu z uwagi na czas pobierania
        else if (token.getDayOfYearExpiration() + 1  > currentDayOfYear )
            return true;

        return false;
    }

}


