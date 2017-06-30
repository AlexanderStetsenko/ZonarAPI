
package Entyties.Project.Development.BuildingObject.Variances;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@Generated("org.jsonschema2pojo")
@JsonPropertyOrder({
    "Id",
    "Overrides"
})
public class SpecialPermit {

    @JsonProperty("Id")
    private int Id;
    @JsonProperty("Overrides")
    private List<Override> Overrides = new ArrayList<Override>();

    /**
     * 
     * @return
     *     The Id
     */
    @JsonProperty("Id")
    public int getId() {
        return Id;
    }

    /**
     * 
     * @param Id
     *     The Id
     */
    @JsonProperty("Id")
    public void setId(int Id) {
        this.Id = Id;
    }

    /**
     * 
     * @return
     *     The Overrides
     */
    @JsonProperty("Overrides")
    public List<Override> getOverrides() {
        return Overrides;
    }

    /**
     * 
     * @param Overrides
     *     The Overrides
     */
    @JsonProperty("Overrides")
    public void setOverrides(List<Override> Overrides) {
        this.Overrides = Overrides;
    }


    @java.lang.Override
    public String toString() {
        return "SpecialPermit{" +
                "Id=" + Id +
                ", Overrides=" + Overrides +
                '}';
    }
}
