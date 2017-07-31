package Entyties.Project.Development.BuildingWrapper;

import Entyties.Project.Development.BuildingWrapper.AnalyzeData.AnalyzeData;
import Entyties.Project.Development.BuildingWrapper.BuildingEnvelope.BuildingEnvelope;
import Entyties.Project.Development.BuildingWrapper.BuildingObject.BuildingObject;
import Entyties.Project.Development.BuildingWrapper.CalibrationData.CalibrationData;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

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

    @JsonProperty("BuildingEnvelope")
    BuildingEnvelope buildingEnvelope;

    @JsonProperty("CalibrationData")
    CalibrationData calibrationData;

    @JsonProperty("AnalyzeData")
    AnalyzeData analyzeData;

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

    public BuildingEnvelope getBuildingEnvelope() {
        return buildingEnvelope;
    }

    public void setBuildingEnvelope(BuildingEnvelope buildingEnvelope) {
        this.buildingEnvelope = buildingEnvelope;
    }

    public CalibrationData getCalibrationData() {
        return calibrationData;
    }

    public void setCalibrationData(CalibrationData calibrationData) {
        this.calibrationData = calibrationData;
    }

    public AnalyzeData getAnalyzeData() {
        return analyzeData;
    }

    public void setAnalyzeData(AnalyzeData analyzeData) {
        this.analyzeData = analyzeData;
    }

    @Override
    public String toString() {
        return "BuildingsWrappers{" +
                "isReady=" + isReady +
                ", buildingObject=" + buildingObject +
                ", buildingEnvelope=" + buildingEnvelope +
                ", calibrationData=" + calibrationData +
                ", analyzeData=" + analyzeData +
                '}';
    }


}
