package Entyties.Project.Development.BuildingWrapper.CalibrationData.ZcCalibrations.Bonus;

import com.fasterxml.jackson.annotation.JsonProperty;
import javax.annotation.Generated;

@Generated("com.robohorse.robopojogenerator")
public class Bonus{

	@JsonProperty("load")
	private boolean load;

	@JsonProperty("row")
	private BonusRow row;

	public void setLoad(boolean load){
		this.load = load;
	}

	public boolean isLoad(){
		return load;
	}

	public void setRow(BonusRow row){
		this.row = row;
	}

	public BonusRow getRow(){
		return row;
	}

	@Override
 	public String toString(){
		return 
			"Bonus{" + 
			"load = '" + load + '\'' + 
			",row = '" + row + '\'' + 
			"}";
		}
}