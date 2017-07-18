package Entyties.Project.Development.BuildingWrapper.CalibrationData.ZcCalibrations.Parking;

import com.fasterxml.jackson.annotation.JsonProperty;
import javax.annotation.Generated;

@Generated("com.robohorse.robopojogenerator")
public class ParkingRow{

	@JsonProperty("Office")
	private double office;

	@JsonProperty("LodgingTODBenefitReduction")
	private Object lodgingTODBenefitReduction;

	@JsonProperty("Residential")
	private double residential;

	@JsonProperty("TODMaxDistanceToStation")
	private Object tODMaxDistanceToStation;

	@JsonProperty("OverlayTypologyId")
	private Object overlayTypologyId;

	@JsonProperty("LodgingVisitors")
	private double lodgingVisitors;

	@JsonProperty("TODMinDistanceToLowDensity")
	private Object tODMinDistanceToLowDensity;

	@JsonProperty("Commercial")
	private double commercial;

	@JsonProperty("CivicAssembly")
	private double civicAssembly;

	@JsonProperty("CivicTODBenefitReduction")
	private Object civicTODBenefitReduction;

	@JsonProperty("OfficeTODBenefitReduction")
	private Object officeTODBenefitReduction;

	@JsonProperty("CommercialTODBenefitReduction")
	private Object commercialTODBenefitReduction;

	@JsonProperty("ZoneCombinationId")
	private int zoneCombinationId;

	@JsonProperty("ResidentialTODBenefitReduction")
	private Object residentialTODBenefitReduction;

	@JsonProperty("ResidentialVisitors")
	private double residentialVisitors;

	@JsonProperty("LodgingRooms")
	private double lodgingRooms;

	public void setOffice(double office){
		this.office = office;
	}

	public double getOffice(){
		return office;
	}

	public void setLodgingTODBenefitReduction(Object lodgingTODBenefitReduction){
		this.lodgingTODBenefitReduction = lodgingTODBenefitReduction;
	}

	public Object getLodgingTODBenefitReduction(){
		return lodgingTODBenefitReduction;
	}

	public void setResidential(double residential){
		this.residential = residential;
	}

	public double getResidential(){
		return residential;
	}

	public void setTODMaxDistanceToStation(Object tODMaxDistanceToStation){
		this.tODMaxDistanceToStation = tODMaxDistanceToStation;
	}

	public Object getTODMaxDistanceToStation(){
		return tODMaxDistanceToStation;
	}

	public void setOverlayTypologyId(Object overlayTypologyId){
		this.overlayTypologyId = overlayTypologyId;
	}

	public Object getOverlayTypologyId(){
		return overlayTypologyId;
	}

	public void setLodgingVisitors(double lodgingVisitors){
		this.lodgingVisitors = lodgingVisitors;
	}

	public double getLodgingVisitors(){
		return lodgingVisitors;
	}

	public void setTODMinDistanceToLowDensity(Object tODMinDistanceToLowDensity){
		this.tODMinDistanceToLowDensity = tODMinDistanceToLowDensity;
	}

	public Object getTODMinDistanceToLowDensity(){
		return tODMinDistanceToLowDensity;
	}

	public void setCommercial(double commercial){
		this.commercial = commercial;
	}

	public double getCommercial(){
		return commercial;
	}

	public void setCivicAssembly(double civicAssembly){
		this.civicAssembly = civicAssembly;
	}

	public double getCivicAssembly(){
		return civicAssembly;
	}

	public void setCivicTODBenefitReduction(Object civicTODBenefitReduction){
		this.civicTODBenefitReduction = civicTODBenefitReduction;
	}

	public Object getCivicTODBenefitReduction(){
		return civicTODBenefitReduction;
	}

	public void setOfficeTODBenefitReduction(Object officeTODBenefitReduction){
		this.officeTODBenefitReduction = officeTODBenefitReduction;
	}

	public Object getOfficeTODBenefitReduction(){
		return officeTODBenefitReduction;
	}

	public void setCommercialTODBenefitReduction(Object commercialTODBenefitReduction){
		this.commercialTODBenefitReduction = commercialTODBenefitReduction;
	}

	public Object getCommercialTODBenefitReduction(){
		return commercialTODBenefitReduction;
	}

	public void setZoneCombinationId(int zoneCombinationId){
		this.zoneCombinationId = zoneCombinationId;
	}

	public int getZoneCombinationId(){
		return zoneCombinationId;
	}

	public void setResidentialTODBenefitReduction(Object residentialTODBenefitReduction){
		this.residentialTODBenefitReduction = residentialTODBenefitReduction;
	}

	public Object getResidentialTODBenefitReduction(){
		return residentialTODBenefitReduction;
	}

	public void setResidentialVisitors(double residentialVisitors){
		this.residentialVisitors = residentialVisitors;
	}

	public double getResidentialVisitors(){
		return residentialVisitors;
	}

	public void setLodgingRooms(double lodgingRooms){
		this.lodgingRooms = lodgingRooms;
	}

	public double getLodgingRooms(){
		return lodgingRooms;
	}

	@Override
 	public String toString(){
		return 
			"ParkingRow{" + 
			"office = '" + office + '\'' + 
			",lodgingTODBenefitReduction = '" + lodgingTODBenefitReduction + '\'' + 
			",residential = '" + residential + '\'' + 
			",tODMaxDistanceToStation = '" + tODMaxDistanceToStation + '\'' + 
			",overlayTypologyId = '" + overlayTypologyId + '\'' + 
			",lodgingVisitors = '" + lodgingVisitors + '\'' + 
			",tODMinDistanceToLowDensity = '" + tODMinDistanceToLowDensity + '\'' + 
			",commercial = '" + commercial + '\'' + 
			",civicAssembly = '" + civicAssembly + '\'' + 
			",civicTODBenefitReduction = '" + civicTODBenefitReduction + '\'' + 
			",officeTODBenefitReduction = '" + officeTODBenefitReduction + '\'' + 
			",commercialTODBenefitReduction = '" + commercialTODBenefitReduction + '\'' + 
			",zoneCombinationId = '" + zoneCombinationId + '\'' + 
			",residentialTODBenefitReduction = '" + residentialTODBenefitReduction + '\'' + 
			",residentialVisitors = '" + residentialVisitors + '\'' + 
			",lodgingRooms = '" + lodgingRooms + '\'' + 
			"}";
		}
}