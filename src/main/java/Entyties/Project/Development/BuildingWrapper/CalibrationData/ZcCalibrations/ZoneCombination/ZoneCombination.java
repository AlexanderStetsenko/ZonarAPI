package Entyties.Project.Development.BuildingWrapper.CalibrationData.ZcCalibrations.ZoneCombination;

import com.fasterxml.jackson.annotation.JsonProperty;
import javax.annotation.Generated;

@Generated("com.robohorse.robopojogenerator")
public class ZoneCombination{

	@JsonProperty("load")
	private boolean load;

	@JsonProperty("row")
	private ZoneCombinationRow row;

	public void setLoad(boolean load){
		this.load = load;
	}

	public boolean isLoad(){
		return load;
	}

	public void setRow(ZoneCombinationRow row){
		this.row = row;
	}

	public ZoneCombinationRow getRow(){
		return row;
	}

	@Override
 	public String toString(){
		return 
			"ZoneCombination{" + 
			"load = '" + load + '\'' + 
			",row = '" + row + '\'' + 
			"}";
		}
}