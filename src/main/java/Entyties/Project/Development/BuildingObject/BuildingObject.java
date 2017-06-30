package Entyties.Project.Development.BuildingObject;

import Entyties.Project.Development.BuildingObject.CapacityAnalisis.CapacityAnalysis;
import Entyties.Project.Development.BuildingObject.Variances.Variances;
import Entyties.Project.Development.BuildingObject.Building.Building;
import Entyties.Project.Development.BuildingObject.ZoningAllowances.ZoningAllowances;
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


    @Override
    public String toString() {
        return "BuildingObject{" +
                "Building=" + building +
                ", zoningAllowances=" + zoningAllowances +
                ", variances=" + variances +
                '}';
    }
}
