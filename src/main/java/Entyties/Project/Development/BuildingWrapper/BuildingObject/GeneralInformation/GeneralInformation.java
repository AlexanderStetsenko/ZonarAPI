package Entyties.Project.Development.BuildingWrapper.BuildingObject.GeneralInformation;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;
import javax.annotation.Generated;

@Generated("com.robohorse.robopojogenerator")
public class GeneralInformation{

	@JsonProperty("Addresses")
	private List<Addresses> addresses;

	@JsonProperty("Municipality")
	private String municipality;

	@JsonProperty("ZoningName")
	private String zoningName;

	public List<Addresses> getAddresses() {
		return addresses;
	}

	public void setAddresses(List<Addresses> addresses) {
		this.addresses = addresses;
	}

	public String getMunicipality() {
		return municipality;
	}

	public void setMunicipality(String municipality) {
		this.municipality = municipality;
	}

	public String getZoningName() {
		return zoningName;
	}

	public void setZoningName(String zoningName) {
		this.zoningName = zoningName;
	}

	@Override
 	public String toString(){
		return 
			"GeneralInformation{" + 
			"addresses = '" + addresses + '\'' + 
			",municipality = '" + municipality + '\'' + 
			",zoningName = '" + zoningName + '\'' + 
			"}";
		}
}