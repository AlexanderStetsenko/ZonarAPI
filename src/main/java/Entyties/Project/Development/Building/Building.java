package Entyties.Project.Development.Building;

import Entyties.User.Date;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Created by Александр on 21.06.2017.
 */

// Not all fields are added
@JsonIgnoreProperties(ignoreUnknown = true)
public class Building {

    @JsonProperty("Id")
    int id;

    @JsonProperty("Name")
    String name;

    @JsonProperty("Description")
    String description;

    @JsonProperty("CreatedBy")
    String createdBy;

    @JsonProperty("AppliedOverrideId")
    int appliedOverrideId;

    @JsonIgnore(true)
//    @JsonProperty("CreatedOn")
     Date createdOn;

    @JsonProperty("ModifiedBy")
    String modifiedBy;

    @JsonIgnore(true)

    @JsonProperty("ModifiedOn")
    Date modifiedOn;

    @JsonProperty("ZoningAllowancesId")
    int zoningAllowancesId;

    @JsonProperty("CapacityAnalysisId")
    int capacityAnalysisId;

    public Building() {
    }

    public Building(int id, String name, String description, String createdBy, int appliedOverrideId, Date createdOn, String modifiedBy, Date modifiedOn, int zoningAllowancesId, int capacityAnalysisId) {
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

    public Date getCreatedOn() {
        return createdOn;
    }

    public void setCreatedOn(Date createdOn) {
        this.createdOn = createdOn;
    }

    public String getModifiedBy() {
        return modifiedBy;
    }

    public void setModifiedBy(String modifiedBy) {
        this.modifiedBy = modifiedBy;
    }

    public Date getModifiedOn() {
        return modifiedOn;
    }

    public void setModifiedOn(Date modifiedOn) {
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
}
