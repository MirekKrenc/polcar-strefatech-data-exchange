
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
    "translation_id",
    "product_id",
    "name",
    "short_description",
    "description",
    "active",
    "lang_id",
    "isdefault",
    "seo_title",
    "seo_description",
    "seo_keywords",
    "order",
    "main_page",
    "main_page_order",
    "booster",
    "seo_url",
    "permalink"
})
public class PlPL {

    @JsonProperty("translation_id")
    private String translationId;
    @JsonProperty("product_id")
    private String productId;
    @JsonProperty("name")
    private String name;
    @JsonProperty("short_description")
    private String shortDescription;
    @JsonProperty("description")
    private String description;
    @JsonProperty("active")
    private String active;
    @JsonProperty("lang_id")
    private String langId;
    @JsonProperty("isdefault")
    private String isdefault;
    @JsonProperty("seo_title")
    private String seoTitle;
    @JsonProperty("seo_description")
    private String seoDescription;
    @JsonProperty("seo_keywords")
    private String seoKeywords;
    @JsonProperty("order")
    private String order;
    @JsonProperty("main_page")
    private String mainPage;
    @JsonProperty("main_page_order")
    private String mainPageOrder;
    @JsonProperty("booster")
    private String booster;
    @JsonProperty("seo_url")
    private String seoUrl;
    @JsonProperty("permalink")
    private String permalink;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("translation_id")
    public String getTranslationId() {
        return translationId;
    }

    @JsonProperty("translation_id")
    public void setTranslationId(String translationId) {
        this.translationId = translationId;
    }

    @JsonProperty("product_id")
    public String getProductId() {
        return productId;
    }

    @JsonProperty("product_id")
    public void setProductId(String productId) {
        this.productId = productId;
    }

    @JsonProperty("name")
    public String getName() {
        return name;
    }

    @JsonProperty("name")
    public void setName(String name) {
        this.name = name;
    }

    @JsonProperty("short_description")
    public String getShortDescription() {
        return shortDescription;
    }

    @JsonProperty("short_description")
    public void setShortDescription(String shortDescription) {
        this.shortDescription = shortDescription;
    }

    @JsonProperty("description")
    public String getDescription() {
        return description;
    }

    @JsonProperty("description")
    public void setDescription(String description) {
        this.description = description;
    }

    @JsonProperty("active")
    public String getActive() {
        return active;
    }

    @JsonProperty("active")
    public void setActive(String active) {
        this.active = active;
    }

    @JsonProperty("lang_id")
    public String getLangId() {
        return langId;
    }

    @JsonProperty("lang_id")
    public void setLangId(String langId) {
        this.langId = langId;
    }

    @JsonProperty("isdefault")
    public String getIsdefault() {
        return isdefault;
    }

    @JsonProperty("isdefault")
    public void setIsdefault(String isdefault) {
        this.isdefault = isdefault;
    }

    @JsonProperty("seo_title")
    public String getSeoTitle() {
        return seoTitle;
    }

    @JsonProperty("seo_title")
    public void setSeoTitle(String seoTitle) {
        this.seoTitle = seoTitle;
    }

    @JsonProperty("seo_description")
    public String getSeoDescription() {
        return seoDescription;
    }

    @JsonProperty("seo_description")
    public void setSeoDescription(String seoDescription) {
        this.seoDescription = seoDescription;
    }

    @JsonProperty("seo_keywords")
    public String getSeoKeywords() {
        return seoKeywords;
    }

    @JsonProperty("seo_keywords")
    public void setSeoKeywords(String seoKeywords) {
        this.seoKeywords = seoKeywords;
    }

    @JsonProperty("order")
    public String getOrder() {
        return order;
    }

    @JsonProperty("order")
    public void setOrder(String order) {
        this.order = order;
    }

    @JsonProperty("main_page")
    public String getMainPage() {
        return mainPage;
    }

    @JsonProperty("main_page")
    public void setMainPage(String mainPage) {
        this.mainPage = mainPage;
    }

    @JsonProperty("main_page_order")
    public String getMainPageOrder() {
        return mainPageOrder;
    }

    @JsonProperty("main_page_order")
    public void setMainPageOrder(String mainPageOrder) {
        this.mainPageOrder = mainPageOrder;
    }

    @JsonProperty("booster")
    public String getBooster() {
        return booster;
    }

    @JsonProperty("booster")
    public void setBooster(String booster) {
        this.booster = booster;
    }

    @JsonProperty("seo_url")
    public String getSeoUrl() {
        return seoUrl;
    }

    @JsonProperty("seo_url")
    public void setSeoUrl(String seoUrl) {
        this.seoUrl = seoUrl;
    }

    @JsonProperty("permalink")
    public String getPermalink() {
        return permalink;
    }

    @JsonProperty("permalink")
    public void setPermalink(String permalink) {
        this.permalink = permalink;
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
