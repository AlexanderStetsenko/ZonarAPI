package Entyties.Project.Development.BuildingWrapper.BuildingEnvelope;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;
import javax.annotation.Generated;

@Generated("com.robohorse.robopojogenerator")
public class EntityDBSettings{

	@JsonProperty("TableName")
	private String tableName;

	@JsonProperty("Fields")
	private List<String> fields;

	@JsonProperty("KeyFields")
	private List<String> keyFields;

	@JsonProperty("ParentKeyField")
	private String parentKeyField;

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

	public void setParentKeyField(String parentKeyField){
		this.parentKeyField = parentKeyField;
	}

	public String getParentKeyField(){
		return parentKeyField;
	}

	@Override
 	public String toString(){
		return 
			"EntityDBSettings{" + 
			"tableName = '" + tableName + '\'' + 
			",fields = '" + fields + '\'' + 
			",keyFields = '" + keyFields + '\'' + 
			",parentKeyField = '" + parentKeyField + '\'' + 
			"}";
		}
}