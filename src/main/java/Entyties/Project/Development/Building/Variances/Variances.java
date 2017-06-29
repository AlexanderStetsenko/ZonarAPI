
package Entyties.Project.Development.Building.Variances;

import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@Generated("org.jsonschema2pojo")
@JsonPropertyOrder({
    "Variances"
})
public class Variances {

    @JsonProperty("Variances")
    private Variances_ Variances;

    /**
     * 
     * @return
     *     The Variances
     */
    @JsonProperty("Variances")
    public Variances_ getVariances() {
        return Variances;
    }

    /**
     * 
     * @param Variances
     *     The Variances
     */
    @JsonProperty("Variances")
    public void setVariances(Variances_ Variances) {
        this.Variances = Variances;
    }



}
