package Services;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;

/**
 * Created by Александр on 13.06.2017.
 */
public class JsonConverter {
    private final static String baseFile = "user.json";

    public Object getObjectFromString(String str, Object inputEntity){
        ObjectMapper mapper = new ObjectMapper();
        try {
            inputEntity = mapper.readValue(str, inputEntity.getClass());
        } catch (IOException e) {
            e.printStackTrace();
        }
        return inputEntity;
    }

}
