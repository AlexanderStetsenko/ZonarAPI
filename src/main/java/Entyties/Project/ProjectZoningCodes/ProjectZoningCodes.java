package Entyties.Project.ProjectZoningCodes;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Date;


@JsonIgnoreProperties(ignoreUnknown = true)
public class ProjectZoningCodes {
    @JsonProperty("Id")
    private int id;
    @JsonProperty("Name")
    private String name;
    @JsonProperty("UserId")
    private int userId;
    @JsonProperty("CreatedOn")
    private Date createdOn;
    @JsonProperty("ModifiedOn")
    private Date modifiedOn;
    @JsonProperty("SynchronizedOn")
    private String synchronizedOn;
    @JsonProperty("Description")
    private String description;
    @JsonProperty("GridicsId")
    private int gridicsId;
    @JsonProperty("EffectiveDate")
    private String effectiveDate;
    @JsonProperty("CityId")
    private int cityId;
    @JsonProperty("Priority")
    private int priority;
    @JsonProperty("CloneId")
    private int cloneId;
    @JsonProperty("Selected")
    private int selected;
    @JsonProperty("CityName")
    private String cityName;


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

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public Date getCreatedOn() {
        return createdOn;
    }

    public void setCreatedOn(Date createdOn) {
        this.createdOn = createdOn;
    }

    public Date getModifiedOn() {
        return modifiedOn;
    }

    public void setModifiedOn(Date modifiedOn) {
        this.modifiedOn = modifiedOn;
    }

    public String getSynchronizedOn() {
        return synchronizedOn;
    }

    public void setSynchronizedOn(String synchronizedOn) {
        this.synchronizedOn = synchronizedOn;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getGridicsId() {
        return gridicsId;
    }

    public void setGridicsId(int gridicsId) {
        this.gridicsId = gridicsId;
    }

    public String getEffectiveDate() {
        return effectiveDate;
    }

    public void setEffectiveDate(String effectiveDate) {
        this.effectiveDate = effectiveDate;
    }

    public int getCityId() {
        return cityId;
    }

    public void setCityId(int cityId) {
        this.cityId = cityId;
    }

    public int getPriority() {
        return priority;
    }

    public void setPriority(int priority) {
        this.priority = priority;
    }

    public int getCloneId() {
        return cloneId;
    }

    public void setCloneId(int cloneId) {
        this.cloneId = cloneId;
    }

    public int getSelected() {
        return selected;
    }

    public void setSelected(int selected) {
        this.selected = selected;
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }


    @Override
    public String toString() {
        return "ProjectZoningCodes{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", userId=" + userId +
                ", createdOn=" + createdOn +
                ", modifiedOn=" + modifiedOn +
                ", synchronizedOn='" + synchronizedOn + '\'' +
                ", description='" + description + '\'' +
                ", gridicsId=" + gridicsId +
                ", effectiveDate='" + effectiveDate + '\'' +
                ", cityId=" + cityId +
                ", priority=" + priority +
                ", cloneId=" + cloneId +
                ", selected=" + selected +
                ", cityName='" + cityName + '\'' +
                '}';
    }
}
