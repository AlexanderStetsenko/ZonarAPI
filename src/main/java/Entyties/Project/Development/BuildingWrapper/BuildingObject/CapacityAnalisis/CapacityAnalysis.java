
package Entyties.Project.Development.BuildingWrapper.BuildingObject.CapacityAnalisis;

import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class CapacityAnalysis {

    @JsonProperty("Id")
    private int id;
    @JsonProperty("Residential")
    private int residential;
    @JsonProperty("DwellingUnitsAverageArea")
    private int dwellingUnitsAverageArea;
    @JsonProperty("Lodging")
    private int lodging;
    @JsonProperty("LodgingRoomsAverageArea")
    private int lodgingRoomsAverageArea;
    @JsonProperty("Office")
    private int office;
    @JsonProperty("Commercial")
    private int commercial;
    @JsonProperty("PkgStructure")
    private boolean pkgStructure;
    @JsonProperty("StructureToBegin")
    private int structureToBegin;
    @JsonProperty("Underground")
    private boolean underground;
    @JsonProperty("LevelsUnderground")
    private int levelsUnderground;
    @JsonProperty("SurfaceParking")
    private boolean surfaceParking;
    @JsonProperty("InducedPkgReserve")
    private boolean inducedPkgReserve;
    @JsonProperty("InducedPkgReserveValue")
    private int inducedPkgReserveValue;
    @JsonProperty("OffSitePkgReserve")
    private boolean offSitePkgReserve;
    @JsonProperty("OffSitePkgReserveHowMany")
    private int offSitePkgReserveHowMany;
    @JsonProperty("OffSitePkgReserveHowFarAway")
    private int offSitePkgReserveHowFarAway;
    @JsonProperty("CustomFootprint")
    private boolean customFootprint;
    @JsonProperty("CustomFootprintValue")
    private int customFootprintValue;
    @JsonProperty("CustomTowerFootprint")
    private boolean customTowerFootprint;
    @JsonProperty("CustomTowerFootprintValue")
    private int customTowerFootprintValue;
    @JsonProperty("NumberOfTowers")
    private Object numberOfTowers;
    @JsonProperty("NumberOfTowersValue")
    private int numberOfTowersValue;
    @JsonProperty("ExtendLiner")
    private boolean extendLiner;
    @JsonProperty("parkingDimensions")
    private ParkingDimensions parkingDimensions;
    @JsonProperty("modules")
    private Modules modules;
    @JsonProperty("sharedParkings")
    private List<SharedParking> sharedParkings = new ArrayList<SharedParking>();

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getResidential() {
        return residential;
    }

    public void setResidential(int residential) {
        this.residential = residential;
    }

    public int getDwellingUnitsAverageArea() {
        return dwellingUnitsAverageArea;
    }

    public void setDwellingUnitsAverageArea(int dwellingUnitsAverageArea) {
        this.dwellingUnitsAverageArea = dwellingUnitsAverageArea;
    }

    public int getLodging() {
        return lodging;
    }

    public void setLodging(int lodging) {
        this.lodging = lodging;
    }

    public int getLodgingRoomsAverageArea() {
        return lodgingRoomsAverageArea;
    }

    public void setLodgingRoomsAverageArea(int lodgingRoomsAverageArea) {
        this.lodgingRoomsAverageArea = lodgingRoomsAverageArea;
    }

    public int getOffice() {
        return office;
    }

    public void setOffice(int office) {
        this.office = office;
    }

    public int getCommercial() {
        return commercial;
    }

    public void setCommercial(int commercial) {
        this.commercial = commercial;
    }

    public boolean isPkgStructure() {
        return pkgStructure;
    }

    public void setPkgStructure(boolean pkgStructure) {
        this.pkgStructure = pkgStructure;
    }

    public int getStructureToBegin() {
        return structureToBegin;
    }

    public void setStructureToBegin(int structureToBegin) {
        this.structureToBegin = structureToBegin;
    }

    public boolean isUnderground() {
        return underground;
    }

    public void setUnderground(boolean underground) {
        this.underground = underground;
    }

    public int getLevelsUnderground() {
        return levelsUnderground;
    }

    public void setLevelsUnderground(int levelsUnderground) {
        this.levelsUnderground = levelsUnderground;
    }

    public boolean isSurfaceParking() {
        return surfaceParking;
    }

    public void setSurfaceParking(boolean surfaceParking) {
        this.surfaceParking = surfaceParking;
    }

    public boolean isInducedPkgReserve() {
        return inducedPkgReserve;
    }

    public void setInducedPkgReserve(boolean inducedPkgReserve) {
        this.inducedPkgReserve = inducedPkgReserve;
    }

    public int getInducedPkgReserveValue() {
        return inducedPkgReserveValue;
    }

    public void setInducedPkgReserveValue(int inducedPkgReserveValue) {
        this.inducedPkgReserveValue = inducedPkgReserveValue;
    }

    public boolean isOffSitePkgReserve() {
        return offSitePkgReserve;
    }

    public void setOffSitePkgReserve(boolean offSitePkgReserve) {
        this.offSitePkgReserve = offSitePkgReserve;
    }

    public int getOffSitePkgReserveHowMany() {
        return offSitePkgReserveHowMany;
    }

    public void setOffSitePkgReserveHowMany(int offSitePkgReserveHowMany) {
        this.offSitePkgReserveHowMany = offSitePkgReserveHowMany;
    }

    public int getOffSitePkgReserveHowFarAway() {
        return offSitePkgReserveHowFarAway;
    }

    public void setOffSitePkgReserveHowFarAway(int offSitePkgReserveHowFarAway) {
        this.offSitePkgReserveHowFarAway = offSitePkgReserveHowFarAway;
    }

    public boolean isCustomFootprint() {
        return customFootprint;
    }

    public void setCustomFootprint(boolean customFootprint) {
        this.customFootprint = customFootprint;
    }

    public int getCustomFootprintValue() {
        return customFootprintValue;
    }

    public void setCustomFootprintValue(int customFootprintValue) {
        this.customFootprintValue = customFootprintValue;
    }

    public boolean isCustomTowerFootprint() {
        return customTowerFootprint;
    }

    public void setCustomTowerFootprint(boolean customTowerFootprint) {
        this.customTowerFootprint = customTowerFootprint;
    }

    public int getCustomTowerFootprintValue() {
        return customTowerFootprintValue;
    }

    public void setCustomTowerFootprintValue(int customTowerFootprintValue) {
        this.customTowerFootprintValue = customTowerFootprintValue;
    }

    public Object getNumberOfTowers() {
        return numberOfTowers;
    }

    public void setNumberOfTowers(Object numberOfTowers) {
        this.numberOfTowers = numberOfTowers;
    }

    public int getNumberOfTowersValue() {
        return numberOfTowersValue;
    }

    public void setNumberOfTowersValue(int numberOfTowersValue) {
        this.numberOfTowersValue = numberOfTowersValue;
    }

    public boolean isExtendLiner() {
        return extendLiner;
    }

    public void setExtendLiner(boolean extendLiner) {
        this.extendLiner = extendLiner;
    }

    public ParkingDimensions getParkingDimensions() {
        return parkingDimensions;
    }

    public void setParkingDimensions(ParkingDimensions parkingDimensions) {
        this.parkingDimensions = parkingDimensions;
    }

    public Modules getModules() {
        return modules;
    }

    public void setModules(Modules modules) {
        this.modules = modules;
    }

    public List<SharedParking> getSharedParkings() {
        return sharedParkings;
    }

    public void setSharedParkings(List<SharedParking> sharedParkings) {
        this.sharedParkings = sharedParkings;
    }


    @Override
    public String toString() {
        return "CapacityAnalysis{" +
                "id=" + id +
                ", residential=" + residential +
                ", dwellingUnitsAverageArea=" + dwellingUnitsAverageArea +
                ", lodging=" + lodging +
                ", lodgingRoomsAverageArea=" + lodgingRoomsAverageArea +
                ", office=" + office +
                ", commercial=" + commercial +
                ", pkgStructure=" + pkgStructure +
                ", structureToBegin=" + structureToBegin +
                ", underground=" + underground +
                ", levelsUnderground=" + levelsUnderground +
                ", surfaceParking=" + surfaceParking +
                ", inducedPkgReserve=" + inducedPkgReserve +
                ", inducedPkgReserveValue=" + inducedPkgReserveValue +
                ", offSitePkgReserve=" + offSitePkgReserve +
                ", offSitePkgReserveHowMany=" + offSitePkgReserveHowMany +
                ", offSitePkgReserveHowFarAway=" + offSitePkgReserveHowFarAway +
                ", customFootprint=" + customFootprint +
                ", customFootprintValue=" + customFootprintValue +
                ", customTowerFootprint=" + customTowerFootprint +
                ", customTowerFootprintValue=" + customTowerFootprintValue +
                ", numberOfTowers=" + numberOfTowers +
                ", numberOfTowersValue=" + numberOfTowersValue +
                ", extendLiner=" + extendLiner +
                ", parkingDimensions=" + parkingDimensions +
                ", modules=" + modules +
                ", sharedParkings=" + sharedParkings +
                '}';
    }
}
