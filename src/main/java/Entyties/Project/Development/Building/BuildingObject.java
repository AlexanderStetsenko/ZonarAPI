package Entyties.Project.Development.Building;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Created by Александр on 21.06.2017.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class BuildingObject {

    @JsonProperty("Building")
    Building building;

    @JsonProperty("ZoningAllowances")
    ZoningAllowances zoningAllowances;

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
}
