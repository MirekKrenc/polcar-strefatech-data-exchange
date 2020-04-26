package streafa.tech.polcar.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.math.BigDecimal;

@Entity
@Table(name = "polcar_price_list")
public class PriceProductData {

    @Id
    @Column(name="product_id")
    private String productId;

    private BigDecimal price;

    public PriceProductData(String productId, BigDecimal price) {
        this.productId = productId;
        this.price = price;
    }

    public PriceProductData() {
    }

    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "PriceList{" +
                "productId='" + productId + '\'' +
                ", price=" + price +
                '}';
    }
}
