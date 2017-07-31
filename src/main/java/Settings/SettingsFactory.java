package Settings;


import Services.JsonConverter;

import java.io.File;

/**
 * Created by Александр on 11.07.2017.
 */
public class SettingsFactory {

    public static MySettings getSettingsProperty(String settingName, MySettings settings){
    switch(settingName) {
        case "base":
            settings = (MySettings) JsonConverter.getObjectFromFile(new File("src\\test\\resources\\base.json"), settings);
            return settings;
        default:
            return (MySettings) JsonConverter.getObjectFromFile(new File("src\\test\\resources\\base.json"), settings);
        }
    }
}
