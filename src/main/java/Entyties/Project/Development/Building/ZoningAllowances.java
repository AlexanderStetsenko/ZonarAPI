package Entyties.Project.Development.Building;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Created by Александр on 21.06.2017.
 */

// Not all fields are added

@JsonIgnoreProperties(ignoreUnknown = true)
public class ZoningAllowances {

    @JsonProperty("Id")
    int id;

    @JsonProperty("ZoningCodeId")
    int zoningCodeId;


    public ZoningAllowances() {
    }

    public ZoningAllowances(int id, int zoningCodeId) {
        this.id = id;
        this.zoningCodeId = zoningCodeId;
    }

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


    @Override
    public String toString() {
        return "ZoningAllowances{" +
                "id=" + id +
                ", zoningCodeId=" + zoningCodeId +
                '}';
    }
}
