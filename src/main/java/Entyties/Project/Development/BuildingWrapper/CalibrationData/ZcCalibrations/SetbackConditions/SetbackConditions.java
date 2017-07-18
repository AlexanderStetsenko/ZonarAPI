package Entyties.Project.Development.BuildingWrapper.CalibrationData.ZcCalibrations.SetbackConditions;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;
import javax.annotation.Generated;

@Generated("com.robohorse.robopojogenerator")
public class SetbackConditions{

	@JsonProperty("load")
	private boolean load;

	@JsonProperty("row")
	private List<SetbackConditionsRow> row;

	public void setLoad(boolean load){
		this.load = load;
	}

	public boolean isLoad(){
		return load;
	}

	public void setRow(List<SetbackConditionsRow> row){
		this.row = row;
	}

	public List<SetbackConditionsRow> getRow(){
		return row;
	}

	@Override
 	public String toString(){
		return 
			"SetbackConditions{" + 
			"load = '" + load + '\'' + 
			",row = '" + row + '\'' + 
			"}";
		}
}