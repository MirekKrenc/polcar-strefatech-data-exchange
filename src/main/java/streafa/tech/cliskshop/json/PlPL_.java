
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
    "gfx_id",
    "name",
    "lang_id"
})
public class PlPL_ {

    @JsonProperty("translation_id")
    private String translationId;
    @JsonProperty("gfx_id")
    private String gfxId;
    @JsonProperty("name")
    private String name;
    @JsonProperty("lang_id")
    private String langId;
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

    @JsonProperty("lang_id")
    public String getLangId() {
        return langId;
    }

    @JsonProperty("lang_id")
    public void setLangId(String langId) {
        this.langId = langId;
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
