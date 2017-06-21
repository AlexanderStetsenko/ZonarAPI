package Entyties.Project.Development;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Date;

/**
 * Created by Александр on 21.06.2017.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class Development {

    @JsonProperty("Id")
    int id;

    @JsonProperty("Name")
    String name;

    @JsonProperty("Description")
    String description;

    @JsonProperty("ProjectId")
    int projectId;

    @JsonProperty("CreatedOn")
    Date createOn;

    @JsonProperty("ModifiedOn")
    Date modifiedOn;

    public Development() {
    }

    public Development(int id, String name, String description, int projectId, Date createOn, Date modifiedOn) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.projectId = projectId;
        this.createOn = createOn;
        this.modifiedOn = modifiedOn;
    }

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

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getProjectId() {
        return projectId;
    }

    public void setProjectId(int projectId) {
        this.projectId = projectId;
    }

    public Date getCreateOn() {
        return createOn;
    }

    public void setCreateOn(Date createOn) {
        this.createOn = createOn;
    }

    public Date getModifiedOn() {
        return modifiedOn;
    }

    public void setModifiedOn(Date modifiedOn) {
        this.modifiedOn = modifiedOn;
    }

    @Override
    public String toString() {
        return "Development{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", projectId=" + projectId +
                ", createOn=" + createOn +
                ", modifiedOn=" + modifiedOn +
                '}';
    }
}
