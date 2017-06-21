package Entyties.Project;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Created by Александр on 21.06.2017.
 */

@JsonIgnoreProperties(ignoreUnknown = true)
public class ProjectInfo {

    @JsonProperty("Id")
    private int id;

    @JsonProperty("Name")
    private String name;


    @Override
    public String toString() {
        return "ProjectInfo{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
