package Entyties.Project.Development.BuildingWrapper.CalibrationData.ZcCalibrations.Uses;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;
import javax.annotation.Generated;

@Generated("com.robohorse.robopojogenerator")
public class Uses{

	@JsonProperty("load")
	private boolean load;

	@JsonProperty("row")
	private List<UsesRow> row;

	public void setLoad(boolean load){
		this.load = load;
	}

	public boolean isLoad(){
		return load;
	}

	public void setRow(List<UsesRow> row){
		this.row = row;
	}

	public List<UsesRow> getRow(){
		return row;
	}

	@Override
 	public String toString(){
		return 
			"Uses{" + 
			"load = '" + load + '\'' + 
			",row = '" + row + '\'' + 
			"}";
		}
}