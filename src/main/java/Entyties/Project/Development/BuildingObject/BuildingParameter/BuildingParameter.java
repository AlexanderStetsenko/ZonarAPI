package Entyties.Project.Development.BuildingObject.BuildingParameter;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class BuildingParameter {

    @JsonProperty("Id")
    private int id;
    @JsonProperty("Name")
    private String name;
    @JsonProperty("IsDefault")
    private boolean isDefault;
    @JsonProperty("CreatedOn")
    private String createdOn;
    @JsonProperty("ModifiedOn")
    private String modifiedOn;
    @JsonProperty("TowersParallel")
    private boolean towersParallel;
    @JsonProperty("ParallelPkgLen")
    private int parallelPkgLen;
    @JsonProperty("HeadInPkgLen")
    private int headInPkgLen;
    @JsonProperty("DiagonalPkgLen")
    private int diagonalPkgLen;
    @JsonProperty("AreaPkgSurface")
    private int areaPkgSurface;
    @JsonProperty("AreaPkgStructure")
    private int areaPkgStructure;
    @JsonProperty("PkgStructureType")
    private int pkgStructureType;
    @JsonProperty("MinimumPkgSpacesFloor")
    private int minimumPkgSpacesFloor;
    @JsonProperty("LinerDepth")
    private int linerDepth;
    @JsonProperty("MinTowerLen")
    private int minTowerLen;
    @JsonProperty("MaxTowerDep")
    private int maxTowerDep;
    @JsonProperty("MaxTowerLenRes")
    private int maxTowerLenRes;
    @JsonProperty("MaxTowerLenComm")
    private int maxTowerLenComm;
    @JsonProperty("CirculationPercent")
    private int circulationPercent;
    @JsonProperty("GroundLevelHeight")
    private int groundLevelHeight;
    @JsonProperty("BaseLevelHeight")
    private int baseLevelHeight;
    @JsonProperty("TowerLevelHeight")
    private int towerLevelHeight;
    @JsonProperty("ParkingLevelHeight")
    private int parkingLevelHeight;
    @JsonProperty("UserId")
    private int userId;
    @JsonProperty("BuildingId")
    private int buildingId;
    @JsonProperty("ScoutLotArea")
    private boolean scoutLotArea;
    @JsonProperty("ParkingSlope")
    private int parkingSlope;

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

    public boolean isDefault() {
        return isDefault;
    }

    public void setDefault(boolean aDefault) {
        isDefault = aDefault;
    }

    public String getCreatedOn() {
        return createdOn;
    }

    public void setCreatedOn(String createdOn) {
        this.createdOn = createdOn;
    }

    public String getModifiedOn() {
        return modifiedOn;
    }

    public void setModifiedOn(String modifiedOn) {
        this.modifiedOn = modifiedOn;
    }

    public boolean isTowersParallel() {
        return towersParallel;
    }

    public void setTowersParallel(boolean towersParallel) {
        this.towersParallel = towersParallel;
    }

    public int getParallelPkgLen() {
        return parallelPkgLen;
    }

    public void setParallelPkgLen(int parallelPkgLen) {
        this.parallelPkgLen = parallelPkgLen;
    }

    public int getHeadInPkgLen() {
        return headInPkgLen;
    }

    public void setHeadInPkgLen(int headInPkgLen) {
        this.headInPkgLen = headInPkgLen;
    }

    public int getDiagonalPkgLen() {
        return diagonalPkgLen;
    }

    public void setDiagonalPkgLen(int diagonalPkgLen) {
        this.diagonalPkgLen = diagonalPkgLen;
    }

    public int getAreaPkgSurface() {
        return areaPkgSurface;
    }

    public void setAreaPkgSurface(int areaPkgSurface) {
        this.areaPkgSurface = areaPkgSurface;
    }

    public int getAreaPkgStructure() {
        return areaPkgStructure;
    }

    public void setAreaPkgStructure(int areaPkgStructure) {
        this.areaPkgStructure = areaPkgStructure;
    }

    public int getPkgStructureType() {
        return pkgStructureType;
    }

    public void setPkgStructureType(int pkgStructureType) {
        this.pkgStructureType = pkgStructureType;
    }

    public int getMinimumPkgSpacesFloor() {
        return minimumPkgSpacesFloor;
    }

    public void setMinimumPkgSpacesFloor(int minimumPkgSpacesFloor) {
        this.minimumPkgSpacesFloor = minimumPkgSpacesFloor;
    }

    public int getLinerDepth() {
        return linerDepth;
    }

    public void setLinerDepth(int linerDepth) {
        this.linerDepth = linerDepth;
    }

    public int getMinTowerLen() {
        return minTowerLen;
    }

    public void setMinTowerLen(int minTowerLen) {
        this.minTowerLen = minTowerLen;
    }

    public int getMaxTowerDep() {
        return maxTowerDep;
    }

    public void setMaxTowerDep(int maxTowerDep) {
        this.maxTowerDep = maxTowerDep;
    }

    public int getMaxTowerLenRes() {
        return maxTowerLenRes;
    }

    public void setMaxTowerLenRes(int maxTowerLenRes) {
        this.maxTowerLenRes = maxTowerLenRes;
    }

    public int getMaxTowerLenComm() {
        return maxTowerLenComm;
    }

    public void setMaxTowerLenComm(int maxTowerLenComm) {
        this.maxTowerLenComm = maxTowerLenComm;
    }

    public int getCirculationPercent() {
        return circulationPercent;
    }

    public void setCirculationPercent(int circulationPercent) {
        this.circulationPercent = circulationPercent;
    }

    public int getGroundLevelHeight() {
        return groundLevelHeight;
    }

    public void setGroundLevelHeight(int groundLevelHeight) {
        this.groundLevelHeight = groundLevelHeight;
    }

    public int getBaseLevelHeight() {
        return baseLevelHeight;
    }

    public void setBaseLevelHeight(int baseLevelHeight) {
        this.baseLevelHeight = baseLevelHeight;
    }

    public int getTowerLevelHeight() {
        return towerLevelHeight;
    }

    public void setTowerLevelHeight(int towerLevelHeight) {
        this.towerLevelHeight = towerLevelHeight;
    }

    public int getParkingLevelHeight() {
        return parkingLevelHeight;
    }

    public void setParkingLevelHeight(int parkingLevelHeight) {
        this.parkingLevelHeight = parkingLevelHeight;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public int getBuildingId() {
        return buildingId;
    }

    public void setBuildingId(int buildingId) {
        this.buildingId = buildingId;
    }

    public boolean isScoutLotArea() {
        return scoutLotArea;
    }

    public void setScoutLotArea(boolean scoutLotArea) {
        this.scoutLotArea = scoutLotArea;
    }

    public int getParkingSlope() {
        return parkingSlope;
    }

    public void setParkingSlope(int parkingSlope) {
        this.parkingSlope = parkingSlope;
    }

    @Override
    public String toString() {
        return "BuildingParameter{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", isDefault=" + isDefault +
                ", createdOn='" + createdOn + '\'' +
                ", modifiedOn='" + modifiedOn + '\'' +
                ", towersParallel=" + towersParallel +
                ", parallelPkgLen=" + parallelPkgLen +
                ", headInPkgLen=" + headInPkgLen +
                ", diagonalPkgLen=" + diagonalPkgLen +
                ", areaPkgSurface=" + areaPkgSurface +
                ", areaPkgStructure=" + areaPkgStructure +
                ", pkgStructureType=" + pkgStructureType +
                ", minimumPkgSpacesFloor=" + minimumPkgSpacesFloor +
                ", linerDepth=" + linerDepth +
                ", minTowerLen=" + minTowerLen +
                ", maxTowerDep=" + maxTowerDep +
                ", maxTowerLenRes=" + maxTowerLenRes +
                ", maxTowerLenComm=" + maxTowerLenComm +
                ", circulationPercent=" + circulationPercent +
                ", groundLevelHeight=" + groundLevelHeight +
                ", baseLevelHeight=" + baseLevelHeight +
                ", towerLevelHeight=" + towerLevelHeight +
                ", parkingLevelHeight=" + parkingLevelHeight +
                ", userId=" + userId +
                ", buildingId=" + buildingId +
                ", scoutLotArea=" + scoutLotArea +
                ", parkingSlope=" + parkingSlope +
                '}';
    }
}
