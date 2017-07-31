package Services;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;

//I used Jacson tool for mapping Json and POJO java classes
//To mapping you should set Json like string or File with Json and Object
//Methods return appropriate set Objects
public class JsonConverter {

    public static Object getObjectFromFile(String str, Object inputEntity){
        ObjectMapper mapper = new ObjectMapper();
        try {
            inputEntity = mapper.readValue(str, inputEntity.getClass());
        } catch (IOException e) {
            e.printStackTrace();
        }
        return inputEntity;
    }


    public static Object getObjectFromFile(File json, Object inputEntity){
        ObjectMapper mapper = new ObjectMapper();
        try {
            inputEntity = mapper.readValue(json, inputEntity.getClass());
        } catch (IOException e) {
            e.printStackTrace();
        }
        return inputEntity;
    }

}
