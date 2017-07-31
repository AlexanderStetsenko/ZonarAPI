package Entyties.Project.Development.BuildingWrapper.CalibrationData.ZcCalibrations.Uses;

import com.fasterxml.jackson.annotation.JsonProperty;
import javax.annotation.Generated;

@Generated("com.robohorse.robopojogenerator")
public class UsesRow{

	@JsonProperty("AllowedUsesId")
	private int allowedUsesId;

	@JsonProperty("TypeId")
	private int typeId;

	@JsonProperty("ParkingRequired")
	private Object parkingRequired;

	@JsonProperty("Label")
	private String label;

	@JsonProperty("Value")
	private String value;

	@JsonProperty("CalibrationUsesLabelId")
	private int calibrationUsesLabelId;

	@JsonProperty("ValueId")
	private int valueId;

	@JsonProperty("UseLimit")
	private Object useLimit;

	public void setAllowedUsesId(int allowedUsesId){
		this.allowedUsesId = allowedUsesId;
	}

	public int getAllowedUsesId(){
		return allowedUsesId;
	}

	public void setTypeId(int typeId){
		this.typeId = typeId;
	}

	public int getTypeId(){
		return typeId;
	}

	public void setParkingRequired(Object parkingRequired){
		this.parkingRequired = parkingRequired;
	}

	public Object getParkingRequired(){
		return parkingRequired;
	}

	public void setLabel(String label){
		this.label = label;
	}

	public String getLabel(){
		return label;
	}

	public void setValue(String value){
		this.value = value;
	}

	public String getValue(){
		return value;
	}

	public void setCalibrationUsesLabelId(int calibrationUsesLabelId){
		this.calibrationUsesLabelId = calibrationUsesLabelId;
	}

	public int getCalibrationUsesLabelId(){
		return calibrationUsesLabelId;
	}

	public void setValueId(int valueId){
		this.valueId = valueId;
	}

	public int getValueId(){
		return valueId;
	}

	public void setUseLimit(Object useLimit){
		this.useLimit = useLimit;
	}

	public Object getUseLimit(){
		return useLimit;
	}

	@Override
 	public String toString(){
		return 
			"UsesRow{" + 
			"allowedUsesId = '" + allowedUsesId + '\'' + 
			",typeId = '" + typeId + '\'' + 
			",parkingRequired = '" + parkingRequired + '\'' + 
			",label = '" + label + '\'' + 
			",value = '" + value + '\'' + 
			",calibrationUsesLabelId = '" + calibrationUsesLabelId + '\'' + 
			",valueId = '" + valueId + '\'' + 
			",useLimit = '" + useLimit + '\'' + 
			"}";
		}


	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;

		UsesRow usesRow = (UsesRow) o;

		if (allowedUsesId != usesRow.allowedUsesId) return false;
		if (typeId != usesRow.typeId) return false;
		if (calibrationUsesLabelId != usesRow.calibrationUsesLabelId) return false;
		if (valueId != usesRow.valueId) return false;
		if (!parkingRequired.equals(usesRow.parkingRequired)) return false;
		if (!label.equals(usesRow.label)) return false;
		if (!value.equals(usesRow.value)) return false;
		if (!useLimit.equals(usesRow.useLimit)) return false;

		return true;
	}

	@Override
	public int hashCode() {
		int result = allowedUsesId;
		result = 31 * result + typeId;
		result = 31 * result + parkingRequired.hashCode();
		result = 31 * result + label.hashCode();
		result = 31 * result + value.hashCode();
		result = 31 * result + calibrationUsesLabelId;
		result = 31 * result + valueId;
		result = 31 * result + useLimit.hashCode();
		return result;
	}
}