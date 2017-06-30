package Entyties.Project.Development.BuildingObject.Building;

import Entyties.User.Data;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

// Not all fields are added
@JsonIgnoreProperties(ignoreUnknown = true)
public class Building {

    @JsonProperty("Id")
    private int id;

    @JsonProperty("Name")
    private String name;

    @JsonProperty("Description")
    private String description;

    @JsonProperty("CreatedBy")
    String createdBy;

    @JsonProperty("AppliedOverrideId")
    int appliedOverrideId;

    @JsonIgnore(true)
//    @JsonProperty("CreatedOn")
            Data createdOn;

    @JsonProperty("ModifiedBy")
    String modifiedBy;

    @JsonIgnore(true)

    @JsonProperty("ModifiedOn")
    Data modifiedOn;

    @JsonProperty("ZoningAllowancesId")
    int zoningAllowancesId;

    @JsonProperty("CapacityAnalysisId")
    int capacityAnalysisId;

    public Building() {
    }

    public Building(int id, String name, String description, String createdBy, int appliedOverrideId, Data createdOn, String modifiedBy, Data modifiedOn, int zoningAllowancesId, int capacityAnalysisId) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.createdBy = createdBy;
        this.appliedOverrideId = appliedOverrideId;
        this.createdOn = createdOn;
        this.modifiedBy = modifiedBy;
        this.modifiedOn = modifiedOn;
        this.zoningAllowancesId = zoningAllowancesId;
        this.capacityAnalysisId = capacityAnalysisId;
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

    public String getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }

    public int getAppliedOverrideId() {
        return appliedOverrideId;
    }

    public void setAppliedOverrideId(int appliedOverrideId) {
        this.appliedOverrideId = appliedOverrideId;
    }

    public Data getCreatedOn() {
        return createdOn;
    }

    public void setCreatedOn(Data createdOn) {
        this.createdOn = createdOn;
    }

    public String getModifiedBy() {
        return modifiedBy;
    }

    public void setModifiedBy(String modifiedBy) {
        this.modifiedBy = modifiedBy;
    }

    public Data getModifiedOn() {
        return modifiedOn;
    }

    public void setModifiedOn(Data modifiedOn) {
        this.modifiedOn = modifiedOn;
    }

    public int getZoningAllowancesId() {
        return zoningAllowancesId;
    }

    public void setZoningAllowancesId(int zoningAllowancesId) {
        this.zoningAllowancesId = zoningAllowancesId;
    }

    public int getCapacityAnalysisId() {
        return capacityAnalysisId;
    }

    public void setCapacityAnalysisId(int capacityAnalysisId) {
        this.capacityAnalysisId = capacityAnalysisId;
    }


    @Override
    public String toString() {
        return "BuildingObject{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", createdBy='" + createdBy + '\'' +
                ", appliedOverrideId=" + appliedOverrideId +
                ", createdOn=" + createdOn +
                ", modifiedBy='" + modifiedBy + '\'' +
                ", modifiedOn=" + modifiedOn +
                ", zoningAllowancesId=" + zoningAllowancesId +
                ", capacityAnalysisId=" + capacityAnalysisId +
                '}';
    }
}
