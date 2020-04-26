package streafa.tech.cliskshop.properties;

import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;

@Component
@ConfigurationProperties(prefix = "clickshop")
public class ClickShopProperties {

    private String login;
    private String password;
    private BigDecimal margin;
    private String token_url;
    private String products_list_url;

    public String getProducts_list_url() {
        return products_list_url;
    }

    public void setProducts_list_url(String products_list_url) {
        this.products_list_url = products_list_url;
    }

    public String getToken_url() {
        return token_url;
    }

    public void setToken_url(String token_url) {
        this.token_url = token_url;
    }

    @EventListener(ApplicationReadyEvent.class)
    public void listProps()
    {
        System.out.println(login);
        System.out.println(password);
        System.out.println(margin);
        System.out.println(token_url);
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public BigDecimal getMargin() {
        return margin;
    }

    public void setMargin(BigDecimal margin) {
        this.margin = margin;
    }
}
