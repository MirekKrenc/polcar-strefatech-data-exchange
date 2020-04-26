package streafa.tech.cliskshop.rest;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import streafa.tech.cliskshop.json.Product;
import streafa.tech.cliskshop.json.ProductsList;
import streafa.tech.cliskshop.pojojson.PriceUpdate;
import streafa.tech.cliskshop.pojojson.StockInPrice;
import streafa.tech.cliskshop.pojojson.StockInStock;
import streafa.tech.cliskshop.pojojson.StockUpdate;
import streafa.tech.cliskshop.properties.ClickShopProperties;
import streafa.tech.polcar.model.PriceProductData;
import streafa.tech.polcar.model.StockProductData;
import streafa.tech.polcar.model.repo.PriceListRepo;
import streafa.tech.polcar.model.repo.StockListRepo;

import java.math.BigDecimal;
import java.util.Optional;

@Service
public class ProductsService {

    //bean for token
    //
    private static final String TOKEN = "3af22ecb0108fad3273a11fd02eae08d3772cdd9";
    private ClickShopProperties clickShopProperties;
    private BigDecimal margin;

    private PriceListRepo priceListRepo;
    private StockListRepo stockListRepo;

    private RestTemplate restTemplate;

    public ProductsService(ClickShopProperties clickShopProperties, PriceListRepo priceListRepo, StockListRepo stockListRepo) {
        this.clickShopProperties = clickShopProperties;
        this.priceListRepo = priceListRepo;
        this.stockListRepo = stockListRepo;
        this.restTemplate = new RestTemplate();
        margin = clickShopProperties.getMargin();
    }

//request GET for products

    @EventListener(ApplicationReadyEvent.class)
    public void getProducts() throws JsonProcessingException {
        System.out.println("W metodzie do pobieranaia produktow");
        HttpHeaders httpHeaders = new HttpHeaders();
        httpHeaders.add(HttpHeaders.AUTHORIZATION, "Bearer " + TOKEN);
        String URL = clickShopProperties.getProducts_list_url();

        HttpEntity httpEntity = new HttpEntity(httpHeaders);

        ResponseEntity<ProductsList> productsListResponseEntity = restTemplate.exchange(clickShopProperties.getProducts_list_url(), HttpMethod.GET, httpEntity, ProductsList.class);

        //przy pierwszym pobraniu mam liczbe stron wiec moge utworzyc kolejne requesty az sciagne wszytkie strony z pordktami:
        // ?page=<nr strony>

        ProductsList productsList = productsListResponseEntity.getBody();
        Product[] productArray = productsList.getList();
        Product product = null;
        ObjectMapper objectMapper = new ObjectMapper();

        //przeszukujemy baze stock
        for (int i=0; i<productArray.length; i++){
            Optional<StockProductData> stockProductDataOptional = stockListRepo.findById(productArray[i].getCode());
            if (stockProductDataOptional.isPresent())
            {
                System.out.println("Znaleziono w stock'ach " + stockProductDataOptional.get());
                product = productArray[i];
                product.getProductId(); //id produktu w bazie click shop
                //PUT https://shop.url/webapi/rest/products/<id>
                String updateURL = URL + "/" + product.getProductId();
                StockUpdate stockUpdate = new StockUpdate();
                StockInStock stockInStock = new StockInStock();
                stockInStock.setStock(stockProductDataOptional.get().getStock());
                stockUpdate.setStock(stockInStock);

                String JSON = objectMapper.writeValueAsString(stockUpdate);
                System.out.println(JSON);
                HttpEntity httpPUTEntity = new HttpEntity(JSON, httpHeaders);
                ResponseEntity<String> result = restTemplate.exchange(updateURL, HttpMethod.PUT, httpPUTEntity, String.class);
                System.out.println("Po uodate " + result.getBody());

            }
            else {
                System.out.println("W stock'ach nie ma produktu " + productArray[i].getCode());
            }
        }

        //przeszukuje baze prices
        for (int i=0; i<productArray.length; i++){
            Optional<PriceProductData> priceProductDataOptional = priceListRepo.findById(productArray[i].getCode());
            if (priceProductDataOptional.isPresent())
            {
                System.out.println("Znaleziono w price'ach " + priceProductDataOptional.get());
                product = productArray[i];
                product.getProductId(); //id produktu w bazie click shop
                //PUT https://shop.url/webapi/rest/products/<id>
                String updateURL = URL + "/" + product.getProductId();
                PriceUpdate priceUpdate = new PriceUpdate();
                StockInPrice stockInPrice = new StockInPrice();
                stockInPrice.setPrice(priceProductDataOptional.get().getPrice().multiply(margin));
                priceUpdate.setStock(stockInPrice);

                String JSON = objectMapper.writeValueAsString(priceUpdate);
                System.out.println(JSON);
            }
            else {
                System.out.println("W price'ach nie ma produktu " + productArray[i].getCode());
            }
        }


        if (productsList.getPages() > 1)
        {
            //buduej kolejne zaputania i wyciagam kolejne strony z produktami
        }

        //System.out.println(productsListResponseEntity.getBody());
    }





}
