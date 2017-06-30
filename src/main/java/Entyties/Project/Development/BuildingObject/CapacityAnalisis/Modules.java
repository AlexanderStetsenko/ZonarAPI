
package Entyties.Project.Development.BuildingObject.CapacityAnalisis;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)

public class Modules {

    @JsonProperty("abuttingSetbacks")
    private boolean abuttingSetbacks;
    @JsonProperty("sharedParking")
    private boolean sharedParking;
    @JsonProperty("TOD")
    private boolean TOD;
    @JsonProperty("incentives")
    private boolean incentives;
    @JsonProperty("overlay")
    private boolean overlay;
    @JsonProperty("variances")
    private boolean variances;
    @JsonProperty("buildingAnalysis")
    private boolean buildingAnalysis;

    public boolean isAbuttingSetbacks() {
        return abuttingSetbacks;
    }

    public void setAbuttingSetbacks(boolean abuttingSetbacks) {
        this.abuttingSetbacks = abuttingSetbacks;
    }

    public boolean isSharedParking() {
        return sharedParking;
    }

    public void setSharedParking(boolean sharedParking) {
        this.sharedParking = sharedParking;
    }

    public boolean isTOD() {
        return TOD;
    }

    public void setTOD(boolean TOD) {
        this.TOD = TOD;
    }

    public boolean isIncentives() {
        return incentives;
    }

    public void setIncentives(boolean incentives) {
        this.incentives = incentives;
    }

    public boolean isOverlay() {
        return overlay;
    }

    public void setOverlay(boolean overlay) {
        this.overlay = overlay;
    }

    public boolean isVariances() {
        return variances;
    }

    public void setVariances(boolean variances) {
        this.variances = variances;
    }

    public boolean isBuildingAnalysis() {
        return buildingAnalysis;
    }

    public void setBuildingAnalysis(boolean buildingAnalysis) {
        this.buildingAnalysis = buildingAnalysis;
    }

    @Override
    public String toString() {
        return "Modules{" +
                "abuttingSetbacks=" + abuttingSetbacks +
                ", sharedParking=" + sharedParking +
                ", TOD=" + TOD +
                ", incentives=" + incentives +
                ", overlay=" + overlay +
                ", variances=" + variances +
                ", buildingAnalysis=" + buildingAnalysis +
                '}';
    }
}
