
package streafa.tech.cliskshop.json;

import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "stock_id",
    "extended",
    "price",
    "price_type",
    "price_buying",
    "stock",
    "package",
    "warn_level",
    "sold",
    "weight",
    "weight_type",
    "active",
    "default",
    "product_id",
    "availability_id",
    "delivery_id",
    "gfx_id",
    "code",
    "ean",
    "comp_weight",
    "comp_price",
    "comp_promo_price",
    "price_wholesale",
    "comp_price_wholesale",
    "comp_promo_price_wholesale",
    "price_special",
    "comp_price_special",
    "comp_promo_price_special",
    "price_type_wholesale",
    "price_type_special",
    "calculation_unit_id",
    "calculation_unit_ratio"
})
public class Stock {

    @JsonProperty("stock_id")
    private String stockId;
    @JsonProperty("extended")
    private String extended;
    @JsonProperty("price")
    private String price;
    @JsonProperty("price_type")
    private String priceType;
    @JsonProperty("price_buying")
    private String priceBuying;
    @JsonProperty("stock")
    private String stock;
    @JsonProperty("package")
    private String _package;
    @JsonProperty("warn_level")
    private String warnLevel;
    @JsonProperty("sold")
    private String sold;
    @JsonProperty("weight")
    private String weight;
    @JsonProperty("weight_type")
    private String weightType;
    @JsonProperty("active")
    private String active;
    @JsonProperty("default")
    private String _default;
    @JsonProperty("product_id")
    private String productId;
    @JsonProperty("availability_id")
    private Object availabilityId;
    @JsonProperty("delivery_id")
    private String deliveryId;
    @JsonProperty("gfx_id")
    private Object gfxId;
    @JsonProperty("code")
    private String code;
    @JsonProperty("ean")
    private String ean;
    @JsonProperty("comp_weight")
    private String compWeight;
    @JsonProperty("comp_price")
    private String compPrice;
    @JsonProperty("comp_promo_price")
    private String compPromoPrice;
    @JsonProperty("price_wholesale")
    private String priceWholesale;
    @JsonProperty("comp_price_wholesale")
    private String compPriceWholesale;
    @JsonProperty("comp_promo_price_wholesale")
    private String compPromoPriceWholesale;
    @JsonProperty("price_special")
    private String priceSpecial;
    @JsonProperty("comp_price_special")
    private String compPriceSpecial;
    @JsonProperty("comp_promo_price_special")
    private String compPromoPriceSpecial;
    @JsonProperty("price_type_wholesale")
    private String priceTypeWholesale;
    @JsonProperty("price_type_special")
    private String priceTypeSpecial;
    @JsonProperty("calculation_unit_id")
    private Object calculationUnitId;
    @JsonProperty("calculation_unit_ratio")
    private String calculationUnitRatio;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("stock_id")
    public String getStockId() {
        return stockId;
    }

    @JsonProperty("stock_id")
    public void setStockId(String stockId) {
        this.stockId = stockId;
    }

    @JsonProperty("extended")
    public String getExtended() {
        return extended;
    }

    @JsonProperty("extended")
    public void setExtended(String extended) {
        this.extended = extended;
    }

    @JsonProperty("price")
    public String getPrice() {
        return price;
    }

    @JsonProperty("price")
    public void setPrice(String price) {
        this.price = price;
    }

    @JsonProperty("price_type")
    public String getPriceType() {
        return priceType;
    }

    @JsonProperty("price_type")
    public void setPriceType(String priceType) {
        this.priceType = priceType;
    }

    @JsonProperty("price_buying")
    public String getPriceBuying() {
        return priceBuying;
    }

    @JsonProperty("price_buying")
    public void setPriceBuying(String priceBuying) {
        this.priceBuying = priceBuying;
    }

    @JsonProperty("stock")
    public String getStock() {
        return stock;
    }

    @JsonProperty("stock")
    public void setStock(String stock) {
        this.stock = stock;
    }

    @JsonProperty("package")
    public String getPackage() {
        return _package;
    }

    @JsonProperty("package")
    public void setPackage(String _package) {
        this._package = _package;
    }

    @JsonProperty("warn_level")
    public String getWarnLevel() {
        return warnLevel;
    }

    @JsonProperty("warn_level")
    public void setWarnLevel(String warnLevel) {
        this.warnLevel = warnLevel;
    }

    @JsonProperty("sold")
    public String getSold() {
        return sold;
    }

    @JsonProperty("sold")
    public void setSold(String sold) {
        this.sold = sold;
    }

    @JsonProperty("weight")
    public String getWeight() {
        return weight;
    }

    @JsonProperty("weight")
    public void setWeight(String weight) {
        this.weight = weight;
    }

    @JsonProperty("weight_type")
    public String getWeightType() {
        return weightType;
    }

    @JsonProperty("weight_type")
    public void setWeightType(String weightType) {
        this.weightType = weightType;
    }

    @JsonProperty("active")
    public String getActive() {
        return active;
    }

    @JsonProperty("active")
    public void setActive(String active) {
        this.active = active;
    }

    @JsonProperty("default")
    public String getDefault() {
        return _default;
    }

    @JsonProperty("default")
    public void setDefault(String _default) {
        this._default = _default;
    }

    @JsonProperty("product_id")
    public String getProductId() {
        return productId;
    }

    @JsonProperty("product_id")
    public void setProductId(String productId) {
        this.productId = productId;
    }

    @JsonProperty("availability_id")
    public Object getAvailabilityId() {
        return availabilityId;
    }

    @JsonProperty("availability_id")
    public void setAvailabilityId(Object availabilityId) {
        this.availabilityId = availabilityId;
    }

    @JsonProperty("delivery_id")
    public String getDeliveryId() {
        return deliveryId;
    }

    @JsonProperty("delivery_id")
    public void setDeliveryId(String deliveryId) {
        this.deliveryId = deliveryId;
    }

    @JsonProperty("gfx_id")
    public Object getGfxId() {
        return gfxId;
    }

    @JsonProperty("gfx_id")
    public void setGfxId(Object gfxId) {
        this.gfxId = gfxId;
    }

    @JsonProperty("code")
    public String getCode() {
        return code;
    }

    @JsonProperty("code")
    public void setCode(String code) {
        this.code = code;
    }

    @JsonProperty("ean")
    public String getEan() {
        return ean;
    }

    @JsonProperty("ean")
    public void setEan(String ean) {
        this.ean = ean;
    }

    @JsonProperty("comp_weight")
    public String getCompWeight() {
        return compWeight;
    }

    @JsonProperty("comp_weight")
    public void setCompWeight(String compWeight) {
        this.compWeight = compWeight;
    }

    @JsonProperty("comp_price")
    public String getCompPrice() {
        return compPrice;
    }

    @JsonProperty("comp_price")
    public void setCompPrice(String compPrice) {
        this.compPrice = compPrice;
    }

    @JsonProperty("comp_promo_price")
    public String getCompPromoPrice() {
        return compPromoPrice;
    }

    @JsonProperty("comp_promo_price")
    public void setCompPromoPrice(String compPromoPrice) {
        this.compPromoPrice = compPromoPrice;
    }

    @JsonProperty("price_wholesale")
    public String getPriceWholesale() {
        return priceWholesale;
    }

    @JsonProperty("price_wholesale")
    public void setPriceWholesale(String priceWholesale) {
        this.priceWholesale = priceWholesale;
    }

    @JsonProperty("comp_price_wholesale")
    public String getCompPriceWholesale() {
        return compPriceWholesale;
    }

    @JsonProperty("comp_price_wholesale")
    public void setCompPriceWholesale(String compPriceWholesale) {
        this.compPriceWholesale = compPriceWholesale;
    }

    @JsonProperty("comp_promo_price_wholesale")
    public String getCompPromoPriceWholesale() {
        return compPromoPriceWholesale;
    }

    @JsonProperty("comp_promo_price_wholesale")
    public void setCompPromoPriceWholesale(String compPromoPriceWholesale) {
        this.compPromoPriceWholesale = compPromoPriceWholesale;
    }

    @JsonProperty("price_special")
    public String getPriceSpecial() {
        return priceSpecial;
    }

    @JsonProperty("price_special")
    public void setPriceSpecial(String priceSpecial) {
        this.priceSpecial = priceSpecial;
    }

    @JsonProperty("comp_price_special")
    public String getCompPriceSpecial() {
        return compPriceSpecial;
    }

    @JsonProperty("comp_price_special")
    public void setCompPriceSpecial(String compPriceSpecial) {
        this.compPriceSpecial = compPriceSpecial;
    }

    @JsonProperty("comp_promo_price_special")
    public String getCompPromoPriceSpecial() {
        return compPromoPriceSpecial;
    }

    @JsonProperty("comp_promo_price_special")
    public void setCompPromoPriceSpecial(String compPromoPriceSpecial) {
        this.compPromoPriceSpecial = compPromoPriceSpecial;
    }

    @JsonProperty("price_type_wholesale")
    public String getPriceTypeWholesale() {
        return priceTypeWholesale;
    }

    @JsonProperty("price_type_wholesale")
    public void setPriceTypeWholesale(String priceTypeWholesale) {
        this.priceTypeWholesale = priceTypeWholesale;
    }

    @JsonProperty("price_type_special")
    public String getPriceTypeSpecial() {
        return priceTypeSpecial;
    }

    @JsonProperty("price_type_special")
    public void setPriceTypeSpecial(String priceTypeSpecial) {
        this.priceTypeSpecial = priceTypeSpecial;
    }

    @JsonProperty("calculation_unit_id")
    public Object getCalculationUnitId() {
        return calculationUnitId;
    }

    @JsonProperty("calculation_unit_id")
    public void setCalculationUnitId(Object calculationUnitId) {
        this.calculationUnitId = calculationUnitId;
    }

    @JsonProperty("calculation_unit_ratio")
    public String getCalculationUnitRatio() {
        return calculationUnitRatio;
    }

    @JsonProperty("calculation_unit_ratio")
    public void setCalculationUnitRatio(String calculationUnitRatio) {
        this.calculationUnitRatio = calculationUnitRatio;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
