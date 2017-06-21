package Entyties.Project.Development.Building;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Александр on 21.06.2017.
 */

// Not all fields are added

@JsonIgnoreProperties(ignoreUnknown = true)
public class BuildingsWrappers {

    @JsonProperty("_isReady")
    Boolean isReady;

    @JsonProperty("BuildingObject")
    BuildingObject buildingObject ;

    public BuildingsWrappers() {
    }

    public BuildingsWrappers(Boolean isReady, BuildingObject buildingObject) {
        this.isReady = isReady;
        this.buildingObject = buildingObject;
    }

    public Boolean getReady() {
        return isReady;
    }

    public void setReady(Boolean ready) {
        isReady = ready;
    }

    public BuildingObject getBuildingObject() {
        return buildingObject;
    }

    public void setBuildingObject(BuildingObject buildingObject) {
        this.buildingObject = buildingObject;
    }

    @Override
    public String toString() {
        return "BuildingsWrappers{" +
                "isReady=" + isReady +
                ", buildingObject=" + buildingObject +
                '}';
    }
}
