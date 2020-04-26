
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
    "gfx_id",
    "name",
    "unic_name",
    "order",
    "hidden",
    "translations"
})
public class MainImage {

    @JsonProperty("gfx_id")
    private String gfxId;
    @JsonProperty("name")
    private String name;
    @JsonProperty("unic_name")
    private String unicName;
    @JsonProperty("order")
    private String order;
    @JsonProperty("hidden")
    private String hidden;
    @JsonProperty("translations")
    private Translations_ translations;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("gfx_id")
    public String getGfxId() {
        return gfxId;
    }

    @JsonProperty("gfx_id")
    public void setGfxId(String gfxId) {
        this.gfxId = gfxId;
    }

    @JsonProperty("name")
    public String getName() {
        return name;
    }

    @JsonProperty("name")
    public void setName(String name) {
        this.name = name;
    }

    @JsonProperty("unic_name")
    public String getUnicName() {
        return unicName;
    }

    @JsonProperty("unic_name")
    public void setUnicName(String unicName) {
        this.unicName = unicName;
    }

    @JsonProperty("order")
    public String getOrder() {
        return order;
    }

    @JsonProperty("order")
    public void setOrder(String order) {
        this.order = order;
    }

    @JsonProperty("hidden")
    public String getHidden() {
        return hidden;
    }

    @JsonProperty("hidden")
    public void setHidden(String hidden) {
        this.hidden = hidden;
    }

    @JsonProperty("translations")
    public Translations_ getTranslations() {
        return translations;
    }

    @JsonProperty("translations")
    public void setTranslations(Translations_ translations) {
        this.translations = translations;
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
