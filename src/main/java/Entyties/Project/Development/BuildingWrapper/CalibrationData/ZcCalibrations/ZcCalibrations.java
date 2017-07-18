package Entyties.Project.Development.BuildingWrapper.CalibrationData.ZcCalibrations;

import Entyties.Project.Development.BuildingWrapper.CalibrationData.ZcCalibrations.Bonus.Bonus;
import Entyties.Project.Development.BuildingWrapper.CalibrationData.ZcCalibrations.GeneralInfo.GeneralInfo;
import Entyties.Project.Development.BuildingWrapper.CalibrationData.ZcCalibrations.OfficeCommercial.OfficeCommercial;
import Entyties.Project.Development.BuildingWrapper.CalibrationData.ZcCalibrations.Parking.Parking;
import Entyties.Project.Development.BuildingWrapper.CalibrationData.ZcCalibrations.SetbackConditions.SetbackConditions;
import Entyties.Project.Development.BuildingWrapper.CalibrationData.ZcCalibrations.Uses.Uses;
import Entyties.Project.Development.BuildingWrapper.CalibrationData.ZcCalibrations.ZoneCombination.ZoneCombination;
import com.fasterxml.jackson.annotation.JsonProperty;
import javax.annotation.Generated;

@Generated("com.robohorse.robopojogenerator")
public class ZcCalibrations{

	@JsonProperty("GeneralInfo")
	private GeneralInfo generalInfo;

	@JsonProperty("Uses")
	private Uses uses;

	@JsonProperty("OfficeCommercial")
	private OfficeCommercial officeCommercial;

	@JsonProperty("ZoneCombination")
	private ZoneCombination zoneCombination;

	@JsonProperty("Bonus")
	private Bonus bonus;

	@JsonProperty("Parking")
	private Parking parking;

	@JsonProperty("SetbackConditions")
	private SetbackConditions setbackConditions;

	public void setGeneralInfo(GeneralInfo generalInfo){
		this.generalInfo = generalInfo;
	}

	public GeneralInfo getGeneralInfo(){
		return generalInfo;
	}

	public void setUses(Uses uses){
		this.uses = uses;
	}

	public Uses getUses(){
		return uses;
	}

	public void setOfficeCommercial(OfficeCommercial officeCommercial){
		this.officeCommercial = officeCommercial;
	}

	public OfficeCommercial getOfficeCommercial(){
		return officeCommercial;
	}

	public void setZoneCombination(ZoneCombination zoneCombination){
		this.zoneCombination = zoneCombination;
	}

	public ZoneCombination getZoneCombination(){
		return zoneCombination;
	}

	public void setBonus(Bonus bonus){
		this.bonus = bonus;
	}

	public Bonus getBonus(){
		return bonus;
	}

	public void setParking(Parking parking){
		this.parking = parking;
	}

	public Parking getParking(){
		return parking;
	}

	public void setSetbackConditions(SetbackConditions setbackConditions){
		this.setbackConditions = setbackConditions;
	}

	public SetbackConditions getSetbackConditions(){
		return setbackConditions;
	}

	@Override
 	public String toString(){
		return 
			"ZcCalibrations{" + 
			"generalInfo = '" + generalInfo + '\'' + 
			",uses = '" + uses + '\'' + 
			",officeCommercial = '" + officeCommercial + '\'' + 
			",zoneCombination = '" + zoneCombination + '\'' + 
			",bonus = '" + bonus + '\'' + 
			",parking = '" + parking + '\'' + 
			",setbackConditions = '" + setbackConditions + '\'' + 
			"}";
		}
}