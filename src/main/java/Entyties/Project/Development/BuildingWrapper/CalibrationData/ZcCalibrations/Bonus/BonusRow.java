package Entyties.Project.Development.BuildingWrapper.CalibrationData.ZcCalibrations.Bonus;

import com.fasterxml.jackson.annotation.JsonProperty;
import javax.annotation.Generated;

@Generated("com.robohorse.robopojogenerator")
public class BonusRow{

	@JsonProperty("LevelBonus")
	private int levelBonus;

	@JsonProperty("ZoneCombinationId")
	private int zoneCombinationId;

	@JsonProperty("ParkingReductionBonus")
	private int parkingReductionBonus;

	@JsonProperty("OverlayTypologyId")
	private Object overlayTypologyId;

	@JsonProperty("BrownfieldRedevelopment")
	private int brownfieldRedevelopment;

	@JsonProperty("FLRBonus")
	private int fLRBonus;

	@JsonProperty("HeightBonus")
	private int heightBonus;

	public void setLevelBonus(int levelBonus){
		this.levelBonus = levelBonus;
	}

	public int getLevelBonus(){
		return levelBonus;
	}

	public void setZoneCombinationId(int zoneCombinationId){
		this.zoneCombinationId = zoneCombinationId;
	}

	public int getZoneCombinationId(){
		return zoneCombinationId;
	}

	public void setParkingReductionBonus(int parkingReductionBonus){
		this.parkingReductionBonus = parkingReductionBonus;
	}

	public int getParkingReductionBonus(){
		return parkingReductionBonus;
	}

	public void setOverlayTypologyId(Object overlayTypologyId){
		this.overlayTypologyId = overlayTypologyId;
	}

	public Object getOverlayTypologyId(){
		return overlayTypologyId;
	}

	public void setBrownfieldRedevelopment(int brownfieldRedevelopment){
		this.brownfieldRedevelopment = brownfieldRedevelopment;
	}

	public int getBrownfieldRedevelopment(){
		return brownfieldRedevelopment;
	}

	public void setFLRBonus(int fLRBonus){
		this.fLRBonus = fLRBonus;
	}

	public int getFLRBonus(){
		return fLRBonus;
	}

	public void setHeightBonus(int heightBonus){
		this.heightBonus = heightBonus;
	}

	public int getHeightBonus(){
		return heightBonus;
	}

	@Override
 	public String toString(){
		return 
			"BonusRow{" + 
			"levelBonus = '" + levelBonus + '\'' + 
			",zoneCombinationId = '" + zoneCombinationId + '\'' + 
			",parkingReductionBonus = '" + parkingReductionBonus + '\'' + 
			",overlayTypologyId = '" + overlayTypologyId + '\'' + 
			",brownfieldRedevelopment = '" + brownfieldRedevelopment + '\'' + 
			",fLRBonus = '" + fLRBonus + '\'' + 
			",heightBonus = '" + heightBonus + '\'' + 
			"}";
		}
}