package Settings;

import com.fasterxml.jackson.annotation.JsonProperty;

public class RequestSettings{

	@JsonProperty("BaseUrl")
	private static String BaseUrl;

	@JsonProperty("BaseUrlService")
	private static String BaseUrlService;

	public void setBaseUrl(String baseUrl){
		this.BaseUrl = baseUrl;
	}

	public String getBaseUrl(){
		return BaseUrl;
	}

	public void setBaseUrlService(String baseUrlService){
		this.BaseUrlService = baseUrlService;
	}

	public String getBaseUrlService(){
		return BaseUrlService;
	}

	@Override
 	public String toString(){
		return 
			"RequestSettings{" + 
			"BaseUrl = '" + BaseUrl + '\'' +
			",BaseUrlService = '" + BaseUrlService + '\'' +
			"}";
		}
}