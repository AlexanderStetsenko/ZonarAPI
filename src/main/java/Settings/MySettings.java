package Settings;

import Services.JsonConverter;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.File;

@JsonIgnoreProperties(ignoreUnknown = true)
public class MySettings{


	@JsonProperty("testSettings")
	public static TestSettings testSettings;

	@JsonProperty("requestSettings")
	public static RequestSettings requestSettings;

	private static boolean IsInit = false;

	private MySettings() {
	}

	public static MySettings settingsInit(){
		MySettings settings = new MySettings();
		if (IsInit == false)
		{
			settings = SettingsFactory.getSettingsProperty("base", settings);
			setIsInit(true);
			return settings;
		}
		else return settings;
//		MySettings settings = (MySettings) JsonConverter.getObjectFromFile(new File("D:\\Project\\ZonarAPI\\src\\test\\resources\\base.json"), this);
//		setIsInit(true);
//		return settings;
	}

	public void setTestSettings(TestSettings testSettings){
		this.testSettings = testSettings;
	}

	public static TestSettings getTestSettings(){
		return testSettings;
	}

	public void setRequestSettings(RequestSettings requestSettings){
		this.requestSettings = requestSettings;
	}

	public static RequestSettings getRequestSettings(){
		return requestSettings;
	}

	@Override
 	public String toString(){
		return 
			"MySettings{" + 
			"testSettings = '" + testSettings + '\'' + 
			",requestSettings = '" + requestSettings + '\'' + 
			"}";
		}

	public static boolean getIsInit() {
		return IsInit;
	}

	public static void setIsInit(boolean isInit) {
		IsInit = isInit;
	}
}