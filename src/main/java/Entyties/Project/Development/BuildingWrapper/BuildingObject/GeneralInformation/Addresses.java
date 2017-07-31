package Entyties.Project.Development.BuildingWrapper.BuildingObject.GeneralInformation;

import com.fasterxml.jackson.annotation.JsonProperty;
import javax.annotation.Generated;

@Generated("com.robohorse.robopojogenerator")
public class Addresses {

	@JsonProperty("Address")
	private String address;

	@JsonProperty("State")
	private String state;

	@JsonProperty("ZipCode")
	private String zipCode;

	@JsonProperty("City")
	private String city;

	@JsonProperty("BuildingId")
	private int buildingId;

	@JsonProperty("FolioNumber")
	private String folioNumber;

	@Override
 	public String toString(){
		return 
			"Addresses{" +
			"address = '" + address + '\'' + 
			",state = '" + state + '\'' + 
			",zipCode = '" + zipCode + '\'' + 
			",city = '" + city + '\'' + 
			",buildingId = '" + buildingId + '\'' + 
			",folioNumber = '" + folioNumber + '\'' + 
			"}";
		}
}