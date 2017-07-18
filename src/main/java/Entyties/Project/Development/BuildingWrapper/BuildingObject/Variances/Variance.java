
package Entyties.Project.Development.BuildingWrapper.BuildingObject.Variances;

import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;



public class Variance {

    @JsonProperty("Id")
    private int Id;

    @JsonProperty("Overrides")
    private List<Override> Overrides = new ArrayList<Override>();




    @JsonProperty("Id")
    public int getId() {
        return Id;
    }

    @JsonProperty("Id")
    public void setId(int Id) {
        this.Id = Id;
    }

    @JsonProperty("Overrides")
    public List<Override> getOverrides() {
        return Overrides;
    }

    @JsonProperty("Overrides")
    public void setOverrides(List<Override> Overrides) {
        this.Overrides = Overrides;
    }

    @java.lang.Override
    public String toString() {
        return "Variance{" +
                "Id=" + Id +
                ", Overrides=" + Overrides +
                '}';
    }
}
