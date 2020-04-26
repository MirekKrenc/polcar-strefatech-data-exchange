package streafa.tech;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;

import org.springframework.context.event.EventListener;
import streafa.tech.cliskshop.rest.RestBearerToken;
import streafa.tech.polcar.service.PolcarDataService;
import streafa.tech.polcar.service.xmlobject.XMLPricesList;
import streafa.tech.polcar.service.xmlobject.XMLStockLevels;

@SpringBootApplication
public class PolcarShopDataExchangeApplication {

	public static void main(String[] args) {
		SpringApplication.run(PolcarShopDataExchangeApplication.class, args);
	}

}
