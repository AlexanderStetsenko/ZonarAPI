package Entyties.Project.Development.BuildingWrapper.CalibrationData.ZcCalibrations.ZoneCombination;

import com.fasterxml.jackson.annotation.JsonProperty;
import javax.annotation.Generated;

@Generated("com.robohorse.robopojogenerator")
public class ZoneCombinationRow{

	@JsonProperty("ZoneId")
	private int zoneId;

	@JsonProperty("ModifiedOn")
	private String modifiedOn;

	@JsonProperty("GridicsId")
	private int gridicsId;

	@JsonProperty("CloneId")
	private Object cloneId;

	@JsonProperty("SubZoneId")
	private int subZoneId;

	@JsonProperty("CalibrationErrorMessage")
	private Object calibrationErrorMessage;

	@JsonProperty("BuildingTypologyMandatory")
	private boolean buildingTypologyMandatory;

	@JsonProperty("ZoneTypeId")
	private int zoneTypeId;

	@JsonProperty("Id")
	private int id;

	@JsonProperty("CreatedOn")
	private String createdOn;

	@JsonProperty("DefaultBuildingTypology")
	private Object defaultBuildingTypology;

	@JsonProperty("IsNotCalibrated")
	private Object isNotCalibrated;

	public void setZoneId(int zoneId){
		this.zoneId = zoneId;
	}

	public int getZoneId(){
		return zoneId;
	}

	public void setModifiedOn(String modifiedOn){
		this.modifiedOn = modifiedOn;
	}

	public String getModifiedOn(){
		return modifiedOn;
	}

	public void setGridicsId(int gridicsId){
		this.gridicsId = gridicsId;
	}

	public int getGridicsId(){
		return gridicsId;
	}

	public void setCloneId(Object cloneId){
		this.cloneId = cloneId;
	}

	public Object getCloneId(){
		return cloneId;
	}

	public void setSubZoneId(int subZoneId){
		this.subZoneId = subZoneId;
	}

	public int getSubZoneId(){
		return subZoneId;
	}

	public void setCalibrationErrorMessage(Object calibrationErrorMessage){
		this.calibrationErrorMessage = calibrationErrorMessage;
	}

	public Object getCalibrationErrorMessage(){
		return calibrationErrorMessage;
	}

	public void setBuildingTypologyMandatory(boolean buildingTypologyMandatory){
		this.buildingTypologyMandatory = buildingTypologyMandatory;
	}

	public boolean isBuildingTypologyMandatory(){
		return buildingTypologyMandatory;
	}

	public void setZoneTypeId(int zoneTypeId){
		this.zoneTypeId = zoneTypeId;
	}

	public int getZoneTypeId(){
		return zoneTypeId;
	}

	public void setId(int id){
		this.id = id;
	}

	public int getId(){
		return id;
	}

	public void setCreatedOn(String createdOn){
		this.createdOn = createdOn;
	}

	public String getCreatedOn(){
		return createdOn;
	}

	public void setDefaultBuildingTypology(Object defaultBuildingTypology){
		this.defaultBuildingTypology = defaultBuildingTypology;
	}

	public Object getDefaultBuildingTypology(){
		return defaultBuildingTypology;
	}

	public void setIsNotCalibrated(Object isNotCalibrated){
		this.isNotCalibrated = isNotCalibrated;
	}

	public Object getIsNotCalibrated(){
		return isNotCalibrated;
	}

	@Override
 	public String toString(){
		return 
			"ZoneCombinationRow{" + 
			"zoneId = '" + zoneId + '\'' + 
			",modifiedOn = '" + modifiedOn + '\'' + 
			",gridicsId = '" + gridicsId + '\'' + 
			",cloneId = '" + cloneId + '\'' + 
			",subZoneId = '" + subZoneId + '\'' + 
			",calibrationErrorMessage = '" + calibrationErrorMessage + '\'' + 
			",buildingTypologyMandatory = '" + buildingTypologyMandatory + '\'' + 
			",zoneTypeId = '" + zoneTypeId + '\'' + 
			",id = '" + id + '\'' + 
			",createdOn = '" + createdOn + '\'' + 
			",defaultBuildingTypology = '" + defaultBuildingTypology + '\'' + 
			",isNotCalibrated = '" + isNotCalibrated + '\'' + 
			"}";
		}
}