
package Entyties.Project.Development.BuildingObject.CapacityAnalisis;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class SharedParking {

    @JsonProperty("Id")
    private int id;
    @JsonProperty("ZoningCodeId")
    private int zoningCodeId;
    @JsonProperty("ZoneCombinationId")
    private Object zoneCombinationId;
    @JsonProperty("Use1Id")
    private int use1Id;
    @JsonProperty("Use2Id")
    private int use2Id;
    @JsonProperty("SharedRatio")
    private double sharedRatio;


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getZoningCodeId() {
        return zoningCodeId;
    }

    public void setZoningCodeId(int zoningCodeId) {
        this.zoningCodeId = zoningCodeId;
    }

    public Object getZoneCombinationId() {
        return zoneCombinationId;
    }

    public void setZoneCombinationId(Object zoneCombinationId) {
        this.zoneCombinationId = zoneCombinationId;
    }

    public int getUse1Id() {
        return use1Id;
    }

    public void setUse1Id(int use1Id) {
        this.use1Id = use1Id;
    }

    public int getUse2Id() {
        return use2Id;
    }

    public void setUse2Id(int use2Id) {
        this.use2Id = use2Id;
    }

    public double getSharedRatio() {
        return sharedRatio;
    }

    public void setSharedRatio(double sharedRatio) {
        this.sharedRatio = sharedRatio;
    }


    @Override
    public String toString() {
        return "SharedParking{" +
                "id=" + id +
                ", zoningCodeId=" + zoningCodeId +
                ", zoneCombinationId=" + zoneCombinationId +
                ", use1Id=" + use1Id +
                ", use2Id=" + use2Id +
                ", sharedRatio=" + sharedRatio +
                '}';
    }
}
