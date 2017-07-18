package Entyties.Project;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

//not all fields are added

@JsonIgnoreProperties(ignoreUnknown = true)
public class ProjectInfo {

    @JsonProperty("Id")
    private int id;

    @JsonProperty("Name")
    private String name;

    @JsonProperty("Owner")
    private int owner;


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getOwner() {
        return owner;
    }

    public void setOwner(int owner) {
        this.owner = owner;
    }

    @Override
    public String toString() {
        return "ProjectInfo{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
