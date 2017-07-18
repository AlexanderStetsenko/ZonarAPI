package Entyties.Project.Development.BuildingWrapper.CalibrationData;

import com.fasterxml.jackson.annotation.JsonProperty;
import javax.annotation.Generated;

@Generated("com.robohorse.robopojogenerator")
public class ZcSettings{

	@JsonProperty("MaxResidentialTowerLength")
	private int maxResidentialTowerLength;

	@JsonProperty("NonConformity")
	private int nonConformity;

	@JsonProperty("MaxPossibleLotDepth")
	private int maxPossibleLotDepth;

	@JsonProperty("PedBlockDimension")
	private int pedBlockDimension;

	@JsonProperty("MinBuildingDimension")
	private int minBuildingDimension;

	@JsonProperty("ZoningCodeId")
	private int zoningCodeId;

	@JsonProperty("MaxPossibleLotWidth")
	private int maxPossibleLotWidth;

	@JsonProperty("MaxCommercialTowerLength")
	private int maxCommercialTowerLength;

	@JsonProperty("FAREnabled")
	private boolean fAREnabled;

	@JsonProperty("Id")
	private int id;

	@JsonProperty("FLREnabled")
	private boolean fLREnabled;

	@JsonProperty("MaxDistanceToOffsiteParking")
	private int maxDistanceToOffsiteParking;

	@JsonProperty("VehBlockDimension")
	private int vehBlockDimension;

	public void setMaxResidentialTowerLength(int maxResidentialTowerLength){
		this.maxResidentialTowerLength = maxResidentialTowerLength;
	}

	public int getMaxResidentialTowerLength(){
		return maxResidentialTowerLength;
	}

	public void setNonConformity(int nonConformity){
		this.nonConformity = nonConformity;
	}

	public int getNonConformity(){
		return nonConformity;
	}

	public void setMaxPossibleLotDepth(int maxPossibleLotDepth){
		this.maxPossibleLotDepth = maxPossibleLotDepth;
	}

	public int getMaxPossibleLotDepth(){
		return maxPossibleLotDepth;
	}

	public void setPedBlockDimension(int pedBlockDimension){
		this.pedBlockDimension = pedBlockDimension;
	}

	public int getPedBlockDimension(){
		return pedBlockDimension;
	}

	public void setMinBuildingDimension(int minBuildingDimension){
		this.minBuildingDimension = minBuildingDimension;
	}

	public int getMinBuildingDimension(){
		return minBuildingDimension;
	}

	public void setZoningCodeId(int zoningCodeId){
		this.zoningCodeId = zoningCodeId;
	}

	public int getZoningCodeId(){
		return zoningCodeId;
	}

	public void setMaxPossibleLotWidth(int maxPossibleLotWidth){
		this.maxPossibleLotWidth = maxPossibleLotWidth;
	}

	public int getMaxPossibleLotWidth(){
		return maxPossibleLotWidth;
	}

	public void setMaxCommercialTowerLength(int maxCommercialTowerLength){
		this.maxCommercialTowerLength = maxCommercialTowerLength;
	}

	public int getMaxCommercialTowerLength(){
		return maxCommercialTowerLength;
	}

	public void setFAREnabled(boolean fAREnabled){
		this.fAREnabled = fAREnabled;
	}

	public boolean isFAREnabled(){
		return fAREnabled;
	}

	public void setId(int id){
		this.id = id;
	}

	public int getId(){
		return id;
	}

	public void setFLREnabled(boolean fLREnabled){
		this.fLREnabled = fLREnabled;
	}

	public boolean isFLREnabled(){
		return fLREnabled;
	}

	public void setMaxDistanceToOffsiteParking(int maxDistanceToOffsiteParking){
		this.maxDistanceToOffsiteParking = maxDistanceToOffsiteParking;
	}

	public int getMaxDistanceToOffsiteParking(){
		return maxDistanceToOffsiteParking;
	}

	public void setVehBlockDimension(int vehBlockDimension){
		this.vehBlockDimension = vehBlockDimension;
	}

	public int getVehBlockDimension(){
		return vehBlockDimension;
	}

	@Override
 	public String toString(){
		return 
			"ZcSettings{" + 
			"maxResidentialTowerLength = '" + maxResidentialTowerLength + '\'' + 
			",nonConformity = '" + nonConformity + '\'' + 
			",maxPossibleLotDepth = '" + maxPossibleLotDepth + '\'' + 
			",pedBlockDimension = '" + pedBlockDimension + '\'' + 
			",minBuildingDimension = '" + minBuildingDimension + '\'' + 
			",zoningCodeId = '" + zoningCodeId + '\'' + 
			",maxPossibleLotWidth = '" + maxPossibleLotWidth + '\'' + 
			",maxCommercialTowerLength = '" + maxCommercialTowerLength + '\'' + 
			",fAREnabled = '" + fAREnabled + '\'' + 
			",id = '" + id + '\'' + 
			",fLREnabled = '" + fLREnabled + '\'' + 
			",maxDistanceToOffsiteParking = '" + maxDistanceToOffsiteParking + '\'' + 
			",vehBlockDimension = '" + vehBlockDimension + '\'' + 
			"}";
		}
}