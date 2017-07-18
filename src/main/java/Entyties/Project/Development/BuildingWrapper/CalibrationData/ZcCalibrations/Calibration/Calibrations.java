package Entyties.Project.Development.BuildingWrapper.CalibrationData.ZcCalibrations.Calibration;

import Entyties.Project.Development.BuildingWrapper.CalibrationData.ZcCalibrations.ZcCalibrations;
import com.fasterxml.jackson.annotation.JsonProperty;
import javax.annotation.Generated;

@Generated("com.robohorse.robopojogenerator")
public class Calibrations{

	@JsonProperty("zcCalibrations")
	private ZcCalibrations zcCalibrations;

	public void setZcCalibrations(ZcCalibrations zcCalibrations){
		this.zcCalibrations = zcCalibrations;
	}

	public ZcCalibrations getZcCalibrations(){
		return zcCalibrations;
	}

	@Override
 	public String toString(){
		return 
			"Calibrations{" + 
			"zcCalibrations = '" + zcCalibrations + '\'' + 
			"}";
		}
}