package Entyties.Project.Development.BuildingWrapper.BuildingObject;

import Entyties.Project.Development.BuildingWrapper.BuildingObject.CapacityAnalisis.CapacityAnalysis;
import Entyties.Project.Development.BuildingWrapper.BuildingObject.GeneralInformation.GeneralInformation;
import Entyties.Project.Development.BuildingWrapper.BuildingObject.Variances.Variances;
import Entyties.Project.Development.BuildingWrapper.BuildingObject.Building.Building;
import Entyties.Project.Development.BuildingWrapper.BuildingObject.ZoningAllowances.ZoningAllowances;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Created by Александр on 21.06.2017.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class BuildingObject {

    @JsonProperty("BuildingObject")
    Building building;

    @JsonProperty("ZoningAllowances")
    ZoningAllowances zoningAllowances;

    @JsonProperty("CapacityAnalysis")
    CapacityAnalysis capacityAnalysis;

    @JsonProperty("Variances")
    Variances variances;

    @JsonProperty("GeneralInformation")
    GeneralInformation generalInformation;

    public BuildingObject() {
    }

    public BuildingObject(Building building, ZoningAllowances zoningAllowances) {
        this.building = building;
        this.zoningAllowances = zoningAllowances;
    }

    public Building getBuilding() {
        return building;
    }

    public void setBuilding(Building building) {
        this.building = building;
    }

    public ZoningAllowances getZoningAllowances() {
        return zoningAllowances;
    }

    public void setZoningAllowances(ZoningAllowances zoningAllowances) {
        this.zoningAllowances = zoningAllowances;
    }


    public Variances getVariances() {
        return variances;
    }

    public void setVariances(Variances variances) {
        this.variances = variances;
    }

    public CapacityAnalysis getCapacityAnalysis() {
        return capacityAnalysis;
    }

    public void setCapacityAnalysis(CapacityAnalysis capacityAnalysis) {
        this.capacityAnalysis = capacityAnalysis;
    }

    public GeneralInformation getGeneralInformation() {
        return generalInformation;
    }

    public void setGeneralInformation(GeneralInformation generalInformation) {
        this.generalInformation = generalInformation;
    }

    @Override
    public String toString() {
        return "BuildingObject{" +
                "building=" + building +
                ", zoningAllowances=" + zoningAllowances +
                ", capacityAnalysis=" + capacityAnalysis +
                ", variances=" + variances +
                ", generalInformation=" + generalInformation +
                '}';
    }
}
