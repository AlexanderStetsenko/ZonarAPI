package Entyties.Project.Development.BuildingWrapper.CalibrationData.ZcCalibrations.SetbackConditions;

import com.fasterxml.jackson.annotation.JsonProperty;
import javax.annotation.Generated;

@Generated("com.robohorse.robopojogenerator")
public class SetbackConditionsRow{

	@JsonProperty("SetbackConditionalComparisonValue")
	private int setbackConditionalComparisonValue;

	@JsonProperty("FieldReference")
	private String fieldReference;

	@JsonProperty("SetbackValueType")
	private int setbackValueType;

	@JsonProperty("_plainModelWithRelations")
	private Object plainModelWithRelations;

	@JsonProperty("entityDBSettings")
	private EntityDBSettings entityDBSettings;

	@JsonProperty("SetbackConditionalReference")
	private Object setbackConditionalReference;

	@JsonProperty("OverlayId")
	private int overlayId;

	@JsonProperty("SetbackConditionalComparison")
	private int setbackConditionalComparison;

	@JsonProperty("SetbackValue")
	private int setbackValue;

	@JsonProperty("_isReady")
	private boolean isReady;

	@JsonProperty("ZoneCombinationId")
	private int zoneCombinationId;

	@JsonProperty("_plainModel")
	private Object plainModel;

	@JsonProperty("SetbackValueReference")
	private Object setbackValueReference;

	public void setSetbackConditionalComparisonValue(int setbackConditionalComparisonValue){
		this.setbackConditionalComparisonValue = setbackConditionalComparisonValue;
	}

	public int getSetbackConditionalComparisonValue(){
		return setbackConditionalComparisonValue;
	}

	public void setFieldReference(String fieldReference){
		this.fieldReference = fieldReference;
	}

	public String getFieldReference(){
		return fieldReference;
	}

	public void setSetbackValueType(int setbackValueType){
		this.setbackValueType = setbackValueType;
	}

	public int getSetbackValueType(){
		return setbackValueType;
	}

	public void setPlainModelWithRelations(Object plainModelWithRelations){
		this.plainModelWithRelations = plainModelWithRelations;
	}

	public Object getPlainModelWithRelations(){
		return plainModelWithRelations;
	}

	public void setEntityDBSettings(EntityDBSettings entityDBSettings){
		this.entityDBSettings = entityDBSettings;
	}

	public EntityDBSettings getEntityDBSettings(){
		return entityDBSettings;
	}

	public void setSetbackConditionalReference(Object setbackConditionalReference){
		this.setbackConditionalReference = setbackConditionalReference;
	}

	public Object getSetbackConditionalReference(){
		return setbackConditionalReference;
	}

	public void setOverlayId(int overlayId){
		this.overlayId = overlayId;
	}

	public int getOverlayId(){
		return overlayId;
	}

	public void setSetbackConditionalComparison(int setbackConditionalComparison){
		this.setbackConditionalComparison = setbackConditionalComparison;
	}

	public int getSetbackConditionalComparison(){
		return setbackConditionalComparison;
	}

	public void setSetbackValue(int setbackValue){
		this.setbackValue = setbackValue;
	}

	public int getSetbackValue(){
		return setbackValue;
	}

	public void setIsReady(boolean isReady){
		this.isReady = isReady;
	}

	public boolean isIsReady(){
		return isReady;
	}

	public void setZoneCombinationId(int zoneCombinationId){
		this.zoneCombinationId = zoneCombinationId;
	}

	public int getZoneCombinationId(){
		return zoneCombinationId;
	}

	public void setPlainModel(Object plainModel){
		this.plainModel = plainModel;
	}

	public Object getPlainModel(){
		return plainModel;
	}

	public void setSetbackValueReference(Object setbackValueReference){
		this.setbackValueReference = setbackValueReference;
	}

	public Object getSetbackValueReference(){
		return setbackValueReference;
	}

	@Override
 	public String toString(){
		return 
			"SetbackConditionsRow{" + 
			"setbackConditionalComparisonValue = '" + setbackConditionalComparisonValue + '\'' + 
			",fieldReference = '" + fieldReference + '\'' + 
			",setbackValueType = '" + setbackValueType + '\'' + 
			",_plainModelWithRelations = '" + plainModelWithRelations + '\'' + 
			",entityDBSettings = '" + entityDBSettings + '\'' + 
			",setbackConditionalReference = '" + setbackConditionalReference + '\'' + 
			",overlayId = '" + overlayId + '\'' + 
			",setbackConditionalComparison = '" + setbackConditionalComparison + '\'' + 
			",setbackValue = '" + setbackValue + '\'' + 
			",_isReady = '" + isReady + '\'' + 
			",zoneCombinationId = '" + zoneCombinationId + '\'' + 
			",_plainModel = '" + plainModel + '\'' + 
			",setbackValueReference = '" + setbackValueReference + '\'' + 
			"}";
		}
}