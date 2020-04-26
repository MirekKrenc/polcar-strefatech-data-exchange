package streafa.tech.polcar.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.math.BigInteger;

@Entity
@Table(name = "polcar_stock_list")
public class StockProductData {

    @Id
    @Column(name = "product_id")
    private String productId;

    private BigInteger stock;

    public StockProductData(String productId, BigInteger stock) {
        this.productId = productId;
        this.stock = stock;
    }

    public StockProductData() {
    }

    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public BigInteger getStock() {
        return stock;
    }

    public void setStock(BigInteger stock) {
        this.stock = stock;
    }

    @Override
    public String toString() {
        return "StockList{" +
                "productId='" + productId + '\'' +
                ", stock=" + stock +
                '}';
    }
}
