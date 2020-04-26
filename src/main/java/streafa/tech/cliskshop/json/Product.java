
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
    "product_id",
    "producer_id",
    "group_id",
    "tax_id",
    "add_date",
    "edit_date",
    "other_price",
    "pkwiu",
    "unit_id",
    "in_loyalty",
    "loyalty_score",
    "loyalty_price",
    "bestseller",
    "newproduct",
    "dimension_w",
    "dimension_h",
    "dimension_l",
    "vol_weight",
    "currency_id",
    "gauge_id",
    "unit_price_calculation",
    "type",
    "category_id",
    "categories",
    "promo_price",
    "code",
    "ean",
    "stock",
    "translations",
    "options",
    "attributes",
    "related",
    "main_image",
    "is_product_of_day",
    "feeds_excludes",
    "tags"
})
public class Product {

    @JsonProperty("product_id")
    private String productId;
    @JsonProperty("producer_id")
    private String producerId;
    @JsonProperty("group_id")
    private Object groupId;
    @JsonProperty("tax_id")
    private String taxId;
    @JsonProperty("add_date")
    private String addDate;
    @JsonProperty("edit_date")
    private String editDate;
    @JsonProperty("other_price")
    private String otherPrice;
    @JsonProperty("pkwiu")
    private String pkwiu;
    @JsonProperty("unit_id")
    private String unitId;
    @JsonProperty("in_loyalty")
    private String inLoyalty;
    @JsonProperty("loyalty_score")
    private Object loyaltyScore;
    @JsonProperty("loyalty_price")
    private Object loyaltyPrice;
    @JsonProperty("bestseller")
    private String bestseller;
    @JsonProperty("newproduct")
    private String newproduct;
    @JsonProperty("dimension_w")
    private String dimensionW;
    @JsonProperty("dimension_h")
    private String dimensionH;
    @JsonProperty("dimension_l")
    private String dimensionL;
    @JsonProperty("vol_weight")
    private String volWeight;
    @JsonProperty("currency_id")
    private Object currencyId;
    @JsonProperty("gauge_id")
    private Object gaugeId;
    @JsonProperty("unit_price_calculation")
    private String unitPriceCalculation;
    @JsonProperty("type")
    private String type;
    @JsonProperty("category_id")
    private String categoryId;
    @JsonProperty("categories")
    private java.util.List<Integer> categories = null;
    @JsonProperty("promo_price")
    private Object promoPrice;
    @JsonProperty("code")
    private String code;
    @JsonProperty("ean")
    private String ean;
    @JsonProperty("stock")
    private Stock stock;
    @JsonProperty("translations")
    private Translations translations;
    @JsonProperty("options")
    private java.util.List<Object> options = null;
    @JsonProperty("attributes")
    private java.util.List<Object> attributes = null;
    @JsonProperty("related")
    private java.util.List<Object> related = null;
    @JsonProperty("main_image")
    private MainImage mainImage;
    @JsonProperty("is_product_of_day")
    private Boolean isProductOfDay;
    @JsonProperty("feeds_excludes")
    private java.util.List<Object> feedsExcludes = null;
    @JsonProperty("tags")
    private java.util.List<Object> tags = null;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("product_id")
    public String getProductId() {
        return productId;
    }

    @JsonProperty("product_id")
    public void setProductId(String productId) {
        this.productId = productId;
    }

    @JsonProperty("producer_id")
    public String getProducerId() {
        return producerId;
    }

    @JsonProperty("producer_id")
    public void setProducerId(String producerId) {
        this.producerId = producerId;
    }

    @JsonProperty("group_id")
    public Object getGroupId() {
        return groupId;
    }

    @JsonProperty("group_id")
    public void setGroupId(Object groupId) {
        this.groupId = groupId;
    }

    @JsonProperty("tax_id")
    public String getTaxId() {
        return taxId;
    }

    @JsonProperty("tax_id")
    public void setTaxId(String taxId) {
        this.taxId = taxId;
    }

    @JsonProperty("add_date")
    public String getAddDate() {
        return addDate;
    }

    @JsonProperty("add_date")
    public void setAddDate(String addDate) {
        this.addDate = addDate;
    }

    @JsonProperty("edit_date")
    public String getEditDate() {
        return editDate;
    }

    @JsonProperty("edit_date")
    public void setEditDate(String editDate) {
        this.editDate = editDate;
    }

    @JsonProperty("other_price")
    public String getOtherPrice() {
        return otherPrice;
    }

    @JsonProperty("other_price")
    public void setOtherPrice(String otherPrice) {
        this.otherPrice = otherPrice;
    }

    @JsonProperty("pkwiu")
    public String getPkwiu() {
        return pkwiu;
    }

    @JsonProperty("pkwiu")
    public void setPkwiu(String pkwiu) {
        this.pkwiu = pkwiu;
    }

    @JsonProperty("unit_id")
    public String getUnitId() {
        return unitId;
    }

    @JsonProperty("unit_id")
    public void setUnitId(String unitId) {
        this.unitId = unitId;
    }

    @JsonProperty("in_loyalty")
    public String getInLoyalty() {
        return inLoyalty;
    }

    @JsonProperty("in_loyalty")
    public void setInLoyalty(String inLoyalty) {
        this.inLoyalty = inLoyalty;
    }

    @JsonProperty("loyalty_score")
    public Object getLoyaltyScore() {
        return loyaltyScore;
    }

    @JsonProperty("loyalty_score")
    public void setLoyaltyScore(Object loyaltyScore) {
        this.loyaltyScore = loyaltyScore;
    }

    @JsonProperty("loyalty_price")
    public Object getLoyaltyPrice() {
        return loyaltyPrice;
    }

    @JsonProperty("loyalty_price")
    public void setLoyaltyPrice(Object loyaltyPrice) {
        this.loyaltyPrice = loyaltyPrice;
    }

    @JsonProperty("bestseller")
    public String getBestseller() {
        return bestseller;
    }

    @JsonProperty("bestseller")
    public void setBestseller(String bestseller) {
        this.bestseller = bestseller;
    }

    @JsonProperty("newproduct")
    public String getNewproduct() {
        return newproduct;
    }

    @JsonProperty("newproduct")
    public void setNewproduct(String newproduct) {
        this.newproduct = newproduct;
    }

    @JsonProperty("dimension_w")
    public String getDimensionW() {
        return dimensionW;
    }

    @JsonProperty("dimension_w")
    public void setDimensionW(String dimensionW) {
        this.dimensionW = dimensionW;
    }

    @JsonProperty("dimension_h")
    public String getDimensionH() {
        return dimensionH;
    }

    @JsonProperty("dimension_h")
    public void setDimensionH(String dimensionH) {
        this.dimensionH = dimensionH;
    }

    @JsonProperty("dimension_l")
    public String getDimensionL() {
        return dimensionL;
    }

    @JsonProperty("dimension_l")
    public void setDimensionL(String dimensionL) {
        this.dimensionL = dimensionL;
    }

    @JsonProperty("vol_weight")
    public String getVolWeight() {
        return volWeight;
    }

    @JsonProperty("vol_weight")
    public void setVolWeight(String volWeight) {
        this.volWeight = volWeight;
    }

    @JsonProperty("currency_id")
    public Object getCurrencyId() {
        return currencyId;
    }

    @JsonProperty("currency_id")
    public void setCurrencyId(Object currencyId) {
        this.currencyId = currencyId;
    }

    @JsonProperty("gauge_id")
    public Object getGaugeId() {
        return gaugeId;
    }

    @JsonProperty("gauge_id")
    public void setGaugeId(Object gaugeId) {
        this.gaugeId = gaugeId;
    }

    @JsonProperty("unit_price_calculation")
    public String getUnitPriceCalculation() {
        return unitPriceCalculation;
    }

    @JsonProperty("unit_price_calculation")
    public void setUnitPriceCalculation(String unitPriceCalculation) {
        this.unitPriceCalculation = unitPriceCalculation;
    }

    @JsonProperty("type")
    public String getType() {
        return type;
    }

    @JsonProperty("type")
    public void setType(String type) {
        this.type = type;
    }

    @JsonProperty("category_id")
    public String getCategoryId() {
        return categoryId;
    }

    @JsonProperty("category_id")
    public void setCategoryId(String categoryId) {
        this.categoryId = categoryId;
    }

    @JsonProperty("categories")
    public java.util.List<Integer> getCategories() {
        return categories;
    }

    @JsonProperty("categories")
    public void setCategories(java.util.List<Integer> categories) {
        this.categories = categories;
    }

    @JsonProperty("promo_price")
    public Object getPromoPrice() {
        return promoPrice;
    }

    @JsonProperty("promo_price")
    public void setPromoPrice(Object promoPrice) {
        this.promoPrice = promoPrice;
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

    @JsonProperty("stock")
    public Stock getStock() {
        return stock;
    }

    @JsonProperty("stock")
    public void setStock(Stock stock) {
        this.stock = stock;
    }

    @JsonProperty("translations")
    public Translations getTranslations() {
        return translations;
    }

    @JsonProperty("translations")
    public void setTranslations(Translations translations) {
        this.translations = translations;
    }

    @JsonProperty("options")
    public java.util.List<Object> getOptions() {
        return options;
    }

    @JsonProperty("options")
    public void setOptions(java.util.List<Object> options) {
        this.options = options;
    }

    @JsonProperty("attributes")
    public java.util.List<Object> getAttributes() {
        return attributes;
    }

    @JsonProperty("attributes")
    public void setAttributes(java.util.List<Object> attributes) {
        this.attributes = attributes;
    }

    @JsonProperty("related")
    public java.util.List<Object> getRelated() {
        return related;
    }

    @JsonProperty("related")
    public void setRelated(java.util.List<Object> related) {
        this.related = related;
    }

    @JsonProperty("main_image")
    public MainImage getMainImage() {
        return mainImage;
    }

    @JsonProperty("main_image")
    public void setMainImage(MainImage mainImage) {
        this.mainImage = mainImage;
    }

    @JsonProperty("is_product_of_day")
    public Boolean getIsProductOfDay() {
        return isProductOfDay;
    }

    @JsonProperty("is_product_of_day")
    public void setIsProductOfDay(Boolean isProductOfDay) {
        this.isProductOfDay = isProductOfDay;
    }

    @JsonProperty("feeds_excludes")
    public java.util.List<Object> getFeedsExcludes() {
        return feedsExcludes;
    }

    @JsonProperty("feeds_excludes")
    public void setFeedsExcludes(java.util.List<Object> feedsExcludes) {
        this.feedsExcludes = feedsExcludes;
    }

    @JsonProperty("tags")
    public java.util.List<Object> getTags() {
        return tags;
    }

    @JsonProperty("tags")
    public void setTags(java.util.List<Object> tags) {
        this.tags = tags;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

    @Override
    public String toString() {
        return "Product{" +
                "productId='" + productId + '\'' +
                ", producerId='" + producerId + '\'' +
                ", groupId=" + groupId +
                ", taxId='" + taxId + '\'' +
                ", addDate='" + addDate + '\'' +
                ", editDate='" + editDate + '\'' +
                ", otherPrice='" + otherPrice + '\'' +
                ", pkwiu='" + pkwiu + '\'' +
                ", unitId='" + unitId + '\'' +
                ", inLoyalty='" + inLoyalty + '\'' +
                ", loyaltyScore=" + loyaltyScore +
                ", loyaltyPrice=" + loyaltyPrice +
                ", bestseller='" + bestseller + '\'' +
                ", newproduct='" + newproduct + '\'' +
                ", dimensionW='" + dimensionW + '\'' +
                ", dimensionH='" + dimensionH + '\'' +
                ", dimensionL='" + dimensionL + '\'' +
                ", volWeight='" + volWeight + '\'' +
                ", currencyId=" + currencyId +
                ", gaugeId=" + gaugeId +
                ", unitPriceCalculation='" + unitPriceCalculation + '\'' +
                ", type='" + type + '\'' +
                ", categoryId='" + categoryId + '\'' +
                ", categories=" + categories +
                ", promoPrice=" + promoPrice +
                ", code='" + code + '\'' +
                ", ean='" + ean + '\'' +
                ", stock=" + stock +
                ", translations=" + translations +
                ", options=" + options +
                ", attributes=" + attributes +
                ", related=" + related +
                ", mainImage=" + mainImage +
                ", isProductOfDay=" + isProductOfDay +
                ", feedsExcludes=" + feedsExcludes +
                ", tags=" + tags +
                ", additionalProperties=" + additionalProperties +
                '}';
    }
}
