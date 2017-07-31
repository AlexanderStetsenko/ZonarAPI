package Entyties.Project.Development.BuildingWrapper.CalibrationData.ZcCalibrations.OfficeCommercial;

import com.fasterxml.jackson.annotation.JsonProperty;
import javax.annotation.Generated;

@Generated("com.robohorse.robopojogenerator")
public class OfficeCommercialRow {

	@JsonProperty("CommercialEstabMaxArea")
	private int commercialEstabMaxArea;

	@JsonProperty("ZoneCombinationId")
	private int zoneCombinationId;

	@JsonProperty("OverlayTypologyId")
	private Object overlayTypologyId;

	@JsonProperty("OfficeCommercialMaxStories")
	private int officeCommercialMaxStories;

	@JsonProperty("OfficeCommercialMaxPercentArea")
	private int officeCommercialMaxPercentArea;

	@JsonProperty("CommercialFoodMaxSeating")
	private Object commercialFoodMaxSeating;

	@JsonProperty("OfficeMaxStories")
	private int officeMaxStories;

	public void setCommercialEstabMaxArea(int commercialEstabMaxArea){
		this.commercialEstabMaxArea = commercialEstabMaxArea;
	}

	public int getCommercialEstabMaxArea(){
		return commercialEstabMaxArea;
	}

	public void setZoneCombinationId(int zoneCombinationId){
		this.zoneCombinationId = zoneCombinationId;
	}

	public int getZoneCombinationId(){
		return zoneCombinationId;
	}

	public void setOverlayTypologyId(Object overlayTypologyId){
		this.overlayTypologyId = overlayTypologyId;
	}

	public Object getOverlayTypologyId(){
		return overlayTypologyId;
	}

	public void setOfficeCommercialMaxStories(int officeCommercialMaxStories){
		this.officeCommercialMaxStories = officeCommercialMaxStories;
	}

	public int getOfficeCommercialMaxStories(){
		return officeCommercialMaxStories;
	}

	public void setOfficeCommercialMaxPercentArea(int officeCommercialMaxPercentArea){
		this.officeCommercialMaxPercentArea = officeCommercialMaxPercentArea;
	}

	public int getOfficeCommercialMaxPercentArea(){
		return officeCommercialMaxPercentArea;
	}

	public void setCommercialFoodMaxSeating(Object commercialFoodMaxSeating){
		this.commercialFoodMaxSeating = commercialFoodMaxSeating;
	}

	public Object getCommercialFoodMaxSeating(){
		return commercialFoodMaxSeating;
	}

	public void setOfficeMaxStories(int officeMaxStories){
		this.officeMaxStories = officeMaxStories;
	}

	public int getOfficeMaxStories(){
		return officeMaxStories;
	}

	@Override
 	public String toString(){
		return 
			"OfficeCommercialRow{" +
			"commercialEstabMaxArea = '" + commercialEstabMaxArea + '\'' + 
			",zoneCombinationId = '" + zoneCombinationId + '\'' + 
			",overlayTypologyId = '" + overlayTypologyId + '\'' + 
			",officeCommercialMaxStories = '" + officeCommercialMaxStories + '\'' + 
			",officeCommercialMaxPercentArea = '" + officeCommercialMaxPercentArea + '\'' + 
			",commercialFoodMaxSeating = '" + commercialFoodMaxSeating + '\'' + 
			",officeMaxStories = '" + officeMaxStories + '\'' + 
			"}";
		}
}