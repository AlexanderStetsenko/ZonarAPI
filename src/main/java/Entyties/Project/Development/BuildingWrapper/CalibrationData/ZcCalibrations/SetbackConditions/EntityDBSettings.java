package Entyties.Project.Development.BuildingWrapper.CalibrationData.ZcCalibrations.SetbackConditions;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;
import javax.annotation.Generated;

@Generated("com.robohorse.robopojogenerator")
public class EntityDBSettings{

	@JsonProperty("PreLoaded")
	private boolean preLoaded;

	@JsonProperty("TableName")
	private String tableName;

	@JsonProperty("Fields")
	private List<String> fields;

	@JsonProperty("KeyFields")
	private List<String> keyFields;

	public void setPreLoaded(boolean preLoaded){
		this.preLoaded = preLoaded;
	}

	public boolean isPreLoaded(){
		return preLoaded;
	}

	public void setTableName(String tableName){
		this.tableName = tableName;
	}

	public String getTableName(){
		return tableName;
	}

	public void setFields(List<String> fields){
		this.fields = fields;
	}

	public List<String> getFields(){
		return fields;
	}

	public void setKeyFields(List<String> keyFields){
		this.keyFields = keyFields;
	}

	public List<String> getKeyFields(){
		return keyFields;
	}

	@Override
 	public String toString(){
		return 
			"EntityDBSettings{" + 
			"preLoaded = '" + preLoaded + '\'' + 
			",tableName = '" + tableName + '\'' + 
			",fields = '" + fields + '\'' + 
			",keyFields = '" + keyFields + '\'' + 
			"}";
		}
}