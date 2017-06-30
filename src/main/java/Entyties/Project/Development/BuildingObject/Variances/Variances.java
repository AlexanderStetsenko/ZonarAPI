
package Entyties.Project.Development.BuildingObject.Variances;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.lang.*;
import java.lang.Override;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Variances {

    @JsonProperty("Waiver")
    private Waiver Waiver;

    @JsonProperty("SpecialPermit")

    private SpecialPermit SpecialPermit;
    @JsonProperty("Variance")
    private Variance Variance;


    @JsonProperty("Waiver")
    public Entyties.Project.Development.BuildingObject.Variances.Waiver getWaiver() {
        return Waiver;
    }


    @JsonProperty("Waiver")
    public void setWaiver(Entyties.Project.Development.BuildingObject.Variances.Waiver Waiver) {
        this.Waiver = Waiver;
    }


    @JsonProperty("SpecialPermit")
    public Entyties.Project.Development.BuildingObject.Variances.SpecialPermit getSpecialPermit() {
        return SpecialPermit;
    }


    @JsonProperty("SpecialPermit")
    public void setSpecialPermit(Entyties.Project.Development.BuildingObject.Variances.SpecialPermit SpecialPermit) {
        this.SpecialPermit = SpecialPermit;
    }


    @JsonProperty("Variance")
    public Entyties.Project.Development.BuildingObject.Variances.Variance getVariance() {
        return Variance;
    }


    @JsonProperty("Variance")
    public void setVariance(Entyties.Project.Development.BuildingObject.Variances.Variance Variance) {
        this.Variance = Variance;
    }


    @Override
    public String toString() {
        return "Variances{" +
                "Waiver=" + Waiver +
                ", SpecialPermit=" + SpecialPermit +
                ", Variance=" + Variance +
                '}';
    }
}
