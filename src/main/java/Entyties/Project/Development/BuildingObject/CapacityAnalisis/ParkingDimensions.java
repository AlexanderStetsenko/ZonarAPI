
package Entyties.Project.Development.BuildingObject.CapacityAnalisis;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class ParkingDimensions {

    @JsonProperty("ParkingSpaceWidth")
    private int parkingSpaceWidth;
    @JsonProperty("PkgStructureRampDim")
    private int pkgStructureRampDim;
    @JsonProperty("TypBayDim")
    private int typBayDim;

    public int getParkingSpaceWidth() {
        return parkingSpaceWidth;
    }

    public void setParkingSpaceWidth(int parkingSpaceWidth) {
        this.parkingSpaceWidth = parkingSpaceWidth;
    }

    public int getPkgStructureRampDim() {
        return pkgStructureRampDim;
    }

    public void setPkgStructureRampDim(int pkgStructureRampDim) {
        this.pkgStructureRampDim = pkgStructureRampDim;
    }

    public int getTypBayDim() {
        return typBayDim;
    }

    public void setTypBayDim(int typBayDim) {
        this.typBayDim = typBayDim;
    }

    @Override
    public String toString() {
        return "ParkingDimensions{" +
                "parkingSpaceWidth=" + parkingSpaceWidth +
                ", pkgStructureRampDim=" + pkgStructureRampDim +
                ", typBayDim=" + typBayDim +
                '}';
    }
}
