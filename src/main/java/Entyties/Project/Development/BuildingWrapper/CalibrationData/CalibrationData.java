package Entyties.Project.Development.BuildingWrapper.CalibrationData;

import Entyties.Project.Development.BuildingWrapper.CalibrationData.ZcCalibrations.ZcCalibrations;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Created by Александр on 07.07.2017.
 */
public class CalibrationData {

    @JsonProperty("zcSettings")
    ZcSettings zcSettings;

    @JsonProperty("zcCalibrations")
    ZcCalibrations zcCalibrations;

    @JsonProperty("zcOriginalCalibrations")
    ZcCalibrations zcOriginalCalibrations;

    @JsonProperty("zcCalibrationsWithoutVariances")
    ZcCalibrations zcCalibrationsWithoutVariances;

    public ZcSettings getZcSettings() {
        return zcSettings;
    }

    public void setZcSettings(ZcSettings zcSettings) {
        this.zcSettings = zcSettings;
    }

    public ZcCalibrations getZcCalibrations() {
        return zcCalibrations;
    }

    public void setZcCalibrations(ZcCalibrations zcCalibrations) {
        this.zcCalibrations = zcCalibrations;
    }

    public ZcCalibrations getZcOriginalCalibrations() {
        return zcOriginalCalibrations;
    }

    public void setZcOriginalCalibrations(ZcCalibrations zcOriginalCalibrations) {
        this.zcOriginalCalibrations = zcOriginalCalibrations;
    }

    public ZcCalibrations getZcCalibrationsWithoutVariances() {
        return zcCalibrationsWithoutVariances;
    }

    public void setZcCalibrationsWithoutVariances(ZcCalibrations zcCalibrationsWithoutVariances) {
        this.zcCalibrationsWithoutVariances = zcCalibrationsWithoutVariances;
    }

    @Override
    public String toString() {
        return "CalibrationData{" +
                "zcSettings=" + zcSettings +
                ", zcCalibrations=" + zcCalibrations +
                ", zcOriginalCalibrations=" + zcOriginalCalibrations +
                ", zcCalibrationsWithoutVariances=" + zcCalibrationsWithoutVariances +
                '}';
    }
}
