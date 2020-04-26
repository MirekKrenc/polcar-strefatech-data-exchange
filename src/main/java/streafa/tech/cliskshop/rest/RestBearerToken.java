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

@Service
public class RestBearerToken {

    private RestTemplate restTemplate;
    private ClickShopProperties clickShopProperties;
    private static String POST_TOKEN_URL = null;


    public RestBearerToken(ClickShopProperties clickShopProperties) {
        this.restTemplate = new RestTemplate();
        this.clickShopProperties = clickShopProperties;
        POST_TOKEN_URL = clickShopProperties.getToken_url();
    }

    //@Bean
    //@Scope(value = ConfigurableBeanFactory.SCOPE_SINGLETON)
    public BearerToken getBearerToken()
    {
        BearerToken bearerToken = new BearerToken();
        HttpHeaders headers = new HttpHeaders();

        String auth = clickShopProperties.getLogin() + ":" + clickShopProperties.getPassword();
        byte [] authentication = auth.getBytes();
        byte[] base64Authentication = Base64Utils.encode(authentication);
        String baseCredential = new String(base64Authentication);

        headers.add(HttpHeaders.AUTHORIZATION, "Basic " + baseCredential);

        HttpEntity httpEntity = new HttpEntity(headers);

        ResponseEntity<BearerToken>  responseEntityToken = restTemplate.exchange(POST_TOKEN_URL, HttpMethod.POST, httpEntity, BearerToken.class);
        System.out.println("token=" + responseEntityToken.getBody().getAccessToken());
        return bearerToken;
    }

}


