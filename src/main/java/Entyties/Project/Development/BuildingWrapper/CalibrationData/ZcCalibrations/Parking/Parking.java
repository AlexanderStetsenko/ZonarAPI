package Entyties.Project.Development.BuildingWrapper.CalibrationData.ZcCalibrations.Parking;

import com.fasterxml.jackson.annotation.JsonProperty;
import javax.annotation.Generated;

@Generated("com.robohorse.robopojogenerator")
public class Parking{

	@JsonProperty("load")
	private boolean load;

	@JsonProperty("row")
	private ParkingRow row;

	public void setLoad(boolean load){
		this.load = load;
	}

	public boolean isLoad(){
		return load;
	}

	public void setRow(ParkingRow row){
		this.row = row;
	}

	public ParkingRow getRow(){
		return row;
	}

	@Override
 	public String toString(){
		return 
			"Parking{" + 
			"load = '" + load + '\'' + 
			",row = '" + row + '\'' + 
			"}";
		}
}