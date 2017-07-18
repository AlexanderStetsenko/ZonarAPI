package Entyties.Project.Development;

import Entyties.Project.Development.BuildingWrapper.BuildingsWrappers;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Александр on 21.06.2017.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class DevelopmentsWrappers {

    @JsonProperty("_isReady")
    private Boolean isReady;

    @JsonProperty("Development")
    private Development development;

    @JsonProperty("collectionName")
    private String collectionName;

    @JsonProperty("type")
    private int type;

    @JsonProperty("BuildingsWrappers")
    private List<BuildingsWrappers> buildingsWrappers = new ArrayList<BuildingsWrappers>();

    public Boolean getReady() {
        return isReady;
    }

    public void setReady(Boolean ready) {
        isReady = ready;
    }

    public Development getDevelopment() {
        return development;
    }

    public void setDevelopment(Development development) {
        this.development = development;
    }

    public String getCollectionName() {
        return collectionName;
    }

    public void setCollectionName(String collectionName) {
        this.collectionName = collectionName;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    public List<BuildingsWrappers> getBuildingsWrappers() {
        return buildingsWrappers;
    }

    public void setBuildingsWrappers(List<BuildingsWrappers> buildingsWrappers) {
        this.buildingsWrappers = buildingsWrappers;
    }

    @Override
    public String toString() {
        return "DevelopmentsWrappers{" +
                "isReady=" + isReady +
                ", development=" + development +
                ", collectionName='" + collectionName + '\'' +
                ", type=" + type +
                ", buildingsWrappers=" + buildingsWrappers +
                '}';
    }
}
