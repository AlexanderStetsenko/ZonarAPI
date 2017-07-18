package Entyties.Project.Development.BuildingWrapper.CalibrationData.ZcCalibrations.GeneralInfo;

import com.fasterxml.jackson.annotation.JsonProperty;
import javax.annotation.Generated;

@Generated("com.robohorse.robopojogenerator")
public class GeneralInfo{

	@JsonProperty("load")
	private boolean load;

	@JsonProperty("row")
	private GeneralInfoRow row;

	public void setLoad(boolean load){
		this.load = load;
	}

	public boolean isLoad(){
		return load;
	}

	public void setRow(GeneralInfoRow row){
		this.row = row;
	}

	public GeneralInfoRow getRow(){
		return row;
	}

	@Override
 	public String toString(){
		return 
			"GeneralInfo{" + 
			"load = '" + load + '\'' + 
			",row = '" + row + '\'' + 
			"}";
		}
}