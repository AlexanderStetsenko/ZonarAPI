
package Entyties.Project.Development.BuildingWrapper.BuildingObject.Variances;

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
public class Waiver {

    @JsonProperty("Id")
    private int Id;
    @JsonProperty("Overrides")
    private List<Entyties.Project.Development.BuildingWrapper.BuildingObject.Variances.Override> Overrides = new ArrayList<Entyties.Project.Development.BuildingWrapper.BuildingObject.Variances.Override>();


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
    public List<Entyties.Project.Development.BuildingWrapper.BuildingObject.Variances.Override> getOverrides() {
        return Overrides;
    }

    /**
     * 
     * @param Overrides
     *     The Overrides
     */
    @JsonProperty("Overrides")
    public void setOverrides(List<Entyties.Project.Development.BuildingWrapper.BuildingObject.Variances.Override> Overrides) {
        this.Overrides = Overrides;
    }

    @java.lang.Override
    public String toString() {
        return "Waiver{" +
                "Id=" + Id +
                ", Overrides=" + Overrides +
                '}';
    }
}
