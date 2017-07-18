package Entyties.Project.Development.BuildingWrapper.CalibrationData.ZcCalibrations.OfficeCommercial;

import com.fasterxml.jackson.annotation.JsonProperty;
import javax.annotation.Generated;

@Generated("com.robohorse.robopojogenerator")
public class OfficeCommercial{

	@JsonProperty("load")
	private boolean load;

	@JsonProperty("row")
	private OfficeCommercialRow row;

	public void setLoad(boolean load){
		this.load = load;
	}

	public boolean isLoad(){
		return load;
	}

	public void setRow(OfficeCommercialRow row){
		this.row = row;
	}

	public OfficeCommercialRow getRow(){
		return row;
	}

	@Override
 	public String toString(){
		return 
			"OfficeCommercial{" + 
			"load = '" + load + '\'' + 
			",row = '" + row + '\'' + 
			"}";
		}
}