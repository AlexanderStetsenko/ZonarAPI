package Entyties.Project.Development.BuildingWrapper.BuildingObject.ZoningAllowances;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;


@JsonIgnoreProperties(ignoreUnknown = true)
public class ZoningAllowances {

    @JsonProperty("Id")
    private int id;
    @JsonProperty("ZoningCodeId")
    private int zoningCodeId;
    @JsonProperty("ZoneId")
    private int zoneId;
    @JsonProperty("ZoneTypeId")
    private int zoneTypeId;
    @JsonProperty("VariancesIds")
    private String variancesIds;
    @JsonProperty("SubZoneId")
    private int subZoneId;
    @JsonProperty("Irregular")
    private boolean irregular;
    @JsonProperty("Width")
    private int width;
    @JsonProperty("Depth")
    private int depth;
    @JsonProperty("IrregularFrontage")
    private int irregularFrontage;
    @JsonProperty("IrregularArea")
    private int irregularArea;
    @JsonProperty("PrimaryFrontageA")
    private boolean primaryFrontageA;
    @JsonProperty("PrimaryFrontageAValue")
    private int primaryFrontageAValue;
    @JsonProperty("MoreOneFrontage")
    private boolean moreOneFrontage;
    @JsonProperty("FrontageB")
    private boolean frontageB;
    @JsonProperty("FrontageBValue")
    private int frontageBValue;
    @JsonProperty("FrontageBType")
    private int frontageBType;
    @JsonProperty("FrontageC")
    private boolean frontageC;
    @JsonProperty("FrontageCValue")
    private int frontageCValue;
    @JsonProperty("FrontageCType")
    private int frontageCType;
    @JsonProperty("FrontageD")
    private boolean frontageD;
    @JsonProperty("FrontageDValue")
    private int frontageDValue;
    @JsonProperty("FrontageDType")
    private int frontageDType;
    @JsonProperty("StreetParking")
    private boolean streetParking;
    @JsonProperty("StreetParkingValue")
    private String streetParkingValue;
    @JsonProperty("PropertyFacingCivicSpace")
    private String propertyFacingCivicSpace;
    @JsonProperty("TOD")
    private boolean tod;
    @JsonProperty("TODValue")
    private String todValue;
    @JsonProperty("TransitCorridor")
    private boolean transitCorridor;
    @JsonProperty("TransitCorridorValue")
    private String transitCorridorValue;
    @JsonProperty("ClosestT3Zone")
    private String closestT3Zone;
    @JsonProperty("densityIncrease")
    private boolean densityIncrease;
    @JsonProperty("densityIncreaseValue")
    private int densityIncreaseValue;
    @JsonProperty("setbackA")
    private boolean setbackA;
    @JsonProperty("setbackAValue")
    private int setbackAValue;
    @JsonProperty("setbackB")
    private boolean setbackB;
    @JsonProperty("setbackBValue")
    private int setbackBValue;
    @JsonProperty("setbackC")
    private boolean setbackC;
    @JsonProperty("setbackCValue")
    private int setbackCValue;
    @JsonProperty("setbackD")
    private boolean setbackD;
    @JsonProperty("setbackDValue")
    private int setbackDValue;
    @JsonProperty("HeightLimit")
    private boolean heightLimit;
    @JsonProperty("HeightLimitValue")
    private int heightLimitValue;
    @JsonProperty("LEED")
    private boolean lEED;
    @JsonProperty("LEEDValue")
    private String lEEDValue;
    @JsonProperty("incentivesBrownFieldRedevelopment")
    private boolean incentivesBrownFieldRedevelopment;
    @JsonProperty("incentivesAHPBenefitProgramTrustFund")
    private boolean incentivesAHPBenefitProgramTrustFund;
    @JsonProperty("incentivesAHPBenefitProgramOnSite")
    private boolean incentivesAHPBenefitProgramOnSite;
    @JsonProperty("incentivesAHPBenefitProgramOffSite")
    private boolean incentivesAHPBenefitProgramOffSite;
    @JsonProperty("incentivesWillDonate")
    private boolean incentivesWillDonate;
    @JsonProperty("incentivesPPBenefitProgramTrustFund")
    private boolean incentivesPPBenefitProgramTrustFund;
    @JsonProperty("incentivesPPBenefitProgramTrustFundValue")
    private int incentivesPPBenefitProgramTrustFundValue;
    @JsonProperty("incentivesPPBenefitProgramOnSite")
    private boolean incentivesPPBenefitProgramOnSite;
    @JsonProperty("incentivesPPBenefitProgramOnSiteValue")
    private int incentivesPPBenefitProgramOnSiteValue;
    @JsonProperty("incentivesPPBenefitProgramOffSite")
    private boolean incentivesPPBenefitProgramOffSite;
    @JsonProperty("incentivesPPBenefitProgramOffSiteValue")
    private int incentivesPPBenefitProgramOffSiteValue;
    @JsonProperty("incentivesWillDonateCivic")
    private boolean incentivesWillDonateCivic;
    @JsonProperty("incentivesWillDonateCivicValue")
    private int incentivesWillDonateCivicValue;
    @JsonProperty("OverlayIds")
    private String overlayIds;
    @JsonProperty("abuttingAbuts")
    private boolean abuttingAbuts;
    @JsonProperty("abuttingZone1Id")
    private int abuttingZone1Id;
    @JsonProperty("abuttingZone2Id")
    private int abuttingZone2Id;
    @JsonProperty("abuttingZone3Id")
    private int abuttingZone3Id;
    @JsonProperty("abuttingSubZone1Id")
    private int abuttingSubZone1Id;
    @JsonProperty("abuttingSubZone2Id")
    private int abuttingSubZone2Id;
    @JsonProperty("abuttingSubZone3Id")
    private int abuttingSubZone3Id;
    @JsonProperty("abuttingZoneType1Id")
    private int abuttingZoneType1Id;
    @JsonProperty("abuttingZoneType2Id")
    private int abuttingZoneType2Id;
    @JsonProperty("abuttingZoneType3Id")
    private int abuttingZoneType3Id;
    @JsonProperty("FrontageOverrides")
    private Object frontageOverrides;
    @JsonProperty("BuildingTypologyId")
    private Object buildingTypologyId;
    @JsonProperty("modules")
    private Modules modules;


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

    public int getZoneId() {
        return zoneId;
    }

    public void setZoneId(int zoneId) {
        this.zoneId = zoneId;
    }

    public int getZoneTypeId() {
        return zoneTypeId;
    }

    public void setZoneTypeId(int zoneTypeId) {
        this.zoneTypeId = zoneTypeId;
    }

    public String getVariancesIds() {
        return variancesIds;
    }

    public void setVariancesIds(String variancesIds) {
        this.variancesIds = variancesIds;
    }

    public int getSubZoneId() {
        return subZoneId;
    }

    public void setSubZoneId(int subZoneId) {
        this.subZoneId = subZoneId;
    }

    public boolean isIrregular() {
        return irregular;
    }

    public void setIrregular(boolean irregular) {
        this.irregular = irregular;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getDepth() {
        return depth;
    }

    public void setDepth(int depth) {
        this.depth = depth;
    }

    public int getIrregularFrontage() {
        return irregularFrontage;
    }

    public void setIrregularFrontage(int irregularFrontage) {
        this.irregularFrontage = irregularFrontage;
    }

    public int getIrregularArea() {
        return irregularArea;
    }

    public void setIrregularArea(int irregularArea) {
        this.irregularArea = irregularArea;
    }

    public boolean isPrimaryFrontageA() {
        return primaryFrontageA;
    }

    public void setPrimaryFrontageA(boolean primaryFrontageA) {
        this.primaryFrontageA = primaryFrontageA;
    }

    public int getPrimaryFrontageAValue() {
        return primaryFrontageAValue;
    }

    public void setPrimaryFrontageAValue(int primaryFrontageAValue) {
        this.primaryFrontageAValue = primaryFrontageAValue;
    }

    public boolean isMoreOneFrontage() {
        return moreOneFrontage;
    }

    public void setMoreOneFrontage(boolean moreOneFrontage) {
        this.moreOneFrontage = moreOneFrontage;
    }

    public boolean isFrontageB() {
        return frontageB;
    }

    public void setFrontageB(boolean frontageB) {
        this.frontageB = frontageB;
    }

    public int getFrontageBValue() {
        return frontageBValue;
    }

    public void setFrontageBValue(int frontageBValue) {
        this.frontageBValue = frontageBValue;
    }

    public int getFrontageBType() {
        return frontageBType;
    }

    public void setFrontageBType(int frontageBType) {
        this.frontageBType = frontageBType;
    }

    public boolean isFrontageC() {
        return frontageC;
    }

    public void setFrontageC(boolean frontageC) {
        this.frontageC = frontageC;
    }

    public int getFrontageCValue() {
        return frontageCValue;
    }

    public void setFrontageCValue(int frontageCValue) {
        this.frontageCValue = frontageCValue;
    }

    public int getFrontageCType() {
        return frontageCType;
    }

    public void setFrontageCType(int frontageCType) {
        this.frontageCType = frontageCType;
    }

    public boolean isFrontageD() {
        return frontageD;
    }

    public void setFrontageD(boolean frontageD) {
        this.frontageD = frontageD;
    }

    public int getFrontageDValue() {
        return frontageDValue;
    }

    public void setFrontageDValue(int frontageDValue) {
        this.frontageDValue = frontageDValue;
    }

    public int getFrontageDType() {
        return frontageDType;
    }

    public void setFrontageDType(int frontageDType) {
        this.frontageDType = frontageDType;
    }

    public boolean isStreetParking() {
        return streetParking;
    }

    public void setStreetParking(boolean streetParking) {
        this.streetParking = streetParking;
    }

    public String getStreetParkingValue() {
        return streetParkingValue;
    }

    public void setStreetParkingValue(String streetParkingValue) {
        this.streetParkingValue = streetParkingValue;
    }

    public String getPropertyFacingCivicSpace() {
        return propertyFacingCivicSpace;
    }

    public void setPropertyFacingCivicSpace(String propertyFacingCivicSpace) {
        this.propertyFacingCivicSpace = propertyFacingCivicSpace;
    }

    public boolean isTod() {
        return tod;
    }

    public void setTod(boolean tod) {
        this.tod = tod;
    }

    public String getTodValue() {
        return todValue;
    }

    public void setTodValue(String todValue) {
        this.todValue = todValue;
    }

    public boolean isTransitCorridor() {
        return transitCorridor;
    }

    public void setTransitCorridor(boolean transitCorridor) {
        this.transitCorridor = transitCorridor;
    }

    public String getTransitCorridorValue() {
        return transitCorridorValue;
    }

    public void setTransitCorridorValue(String transitCorridorValue) {
        this.transitCorridorValue = transitCorridorValue;
    }

    public String getClosestT3Zone() {
        return closestT3Zone;
    }

    public void setClosestT3Zone(String closestT3Zone) {
        this.closestT3Zone = closestT3Zone;
    }

    public boolean isDensityIncrease() {
        return densityIncrease;
    }

    public void setDensityIncrease(boolean densityIncrease) {
        this.densityIncrease = densityIncrease;
    }

    public int getDensityIncreaseValue() {
        return densityIncreaseValue;
    }

    public void setDensityIncreaseValue(int densityIncreaseValue) {
        this.densityIncreaseValue = densityIncreaseValue;
    }

    public boolean isSetbackA() {
        return setbackA;
    }

    public void setSetbackA(boolean setbackA) {
        this.setbackA = setbackA;
    }

    public int getSetbackAValue() {
        return setbackAValue;
    }

    public void setSetbackAValue(int setbackAValue) {
        this.setbackAValue = setbackAValue;
    }

    public boolean isSetbackB() {
        return setbackB;
    }

    public void setSetbackB(boolean setbackB) {
        this.setbackB = setbackB;
    }

    public int getSetbackBValue() {
        return setbackBValue;
    }

    public void setSetbackBValue(int setbackBValue) {
        this.setbackBValue = setbackBValue;
    }

    public boolean isSetbackC() {
        return setbackC;
    }

    public void setSetbackC(boolean setbackC) {
        this.setbackC = setbackC;
    }

    public int getSetbackCValue() {
        return setbackCValue;
    }

    public void setSetbackCValue(int setbackCValue) {
        this.setbackCValue = setbackCValue;
    }

    public boolean isSetbackD() {
        return setbackD;
    }

    public void setSetbackD(boolean setbackD) {
        this.setbackD = setbackD;
    }

    public int getSetbackDValue() {
        return setbackDValue;
    }

    public void setSetbackDValue(int setbackDValue) {
        this.setbackDValue = setbackDValue;
    }

    public boolean isHeightLimit() {
        return heightLimit;
    }

    public void setHeightLimit(boolean heightLimit) {
        this.heightLimit = heightLimit;
    }

    public int getHeightLimitValue() {
        return heightLimitValue;
    }

    public void setHeightLimitValue(int heightLimitValue) {
        this.heightLimitValue = heightLimitValue;
    }

    public boolean islEED() {
        return lEED;
    }

    public void setlEED(boolean lEED) {
        this.lEED = lEED;
    }

    public String getlEEDValue() {
        return lEEDValue;
    }

    public void setlEEDValue(String lEEDValue) {
        this.lEEDValue = lEEDValue;
    }

    public boolean isIncentivesBrownFieldRedevelopment() {
        return incentivesBrownFieldRedevelopment;
    }

    public void setIncentivesBrownFieldRedevelopment(boolean incentivesBrownFieldRedevelopment) {
        this.incentivesBrownFieldRedevelopment = incentivesBrownFieldRedevelopment;
    }

    public boolean isIncentivesAHPBenefitProgramTrustFund() {
        return incentivesAHPBenefitProgramTrustFund;
    }

    public void setIncentivesAHPBenefitProgramTrustFund(boolean incentivesAHPBenefitProgramTrustFund) {
        this.incentivesAHPBenefitProgramTrustFund = incentivesAHPBenefitProgramTrustFund;
    }

    public boolean isIncentivesAHPBenefitProgramOnSite() {
        return incentivesAHPBenefitProgramOnSite;
    }

    public void setIncentivesAHPBenefitProgramOnSite(boolean incentivesAHPBenefitProgramOnSite) {
        this.incentivesAHPBenefitProgramOnSite = incentivesAHPBenefitProgramOnSite;
    }

    public boolean isIncentivesAHPBenefitProgramOffSite() {
        return incentivesAHPBenefitProgramOffSite;
    }

    public void setIncentivesAHPBenefitProgramOffSite(boolean incentivesAHPBenefitProgramOffSite) {
        this.incentivesAHPBenefitProgramOffSite = incentivesAHPBenefitProgramOffSite;
    }

    public boolean isIncentivesWillDonate() {
        return incentivesWillDonate;
    }

    public void setIncentivesWillDonate(boolean incentivesWillDonate) {
        this.incentivesWillDonate = incentivesWillDonate;
    }

    public boolean isIncentivesPPBenefitProgramTrustFund() {
        return incentivesPPBenefitProgramTrustFund;
    }

    public void setIncentivesPPBenefitProgramTrustFund(boolean incentivesPPBenefitProgramTrustFund) {
        this.incentivesPPBenefitProgramTrustFund = incentivesPPBenefitProgramTrustFund;
    }

    public int getIncentivesPPBenefitProgramTrustFundValue() {
        return incentivesPPBenefitProgramTrustFundValue;
    }

    public void setIncentivesPPBenefitProgramTrustFundValue(int incentivesPPBenefitProgramTrustFundValue) {
        this.incentivesPPBenefitProgramTrustFundValue = incentivesPPBenefitProgramTrustFundValue;
    }

    public boolean isIncentivesPPBenefitProgramOnSite() {
        return incentivesPPBenefitProgramOnSite;
    }

    public void setIncentivesPPBenefitProgramOnSite(boolean incentivesPPBenefitProgramOnSite) {
        this.incentivesPPBenefitProgramOnSite = incentivesPPBenefitProgramOnSite;
    }

    public int getIncentivesPPBenefitProgramOnSiteValue() {
        return incentivesPPBenefitProgramOnSiteValue;
    }

    public void setIncentivesPPBenefitProgramOnSiteValue(int incentivesPPBenefitProgramOnSiteValue) {
        this.incentivesPPBenefitProgramOnSiteValue = incentivesPPBenefitProgramOnSiteValue;
    }

    public boolean isIncentivesPPBenefitProgramOffSite() {
        return incentivesPPBenefitProgramOffSite;
    }

    public void setIncentivesPPBenefitProgramOffSite(boolean incentivesPPBenefitProgramOffSite) {
        this.incentivesPPBenefitProgramOffSite = incentivesPPBenefitProgramOffSite;
    }

    public int getIncentivesPPBenefitProgramOffSiteValue() {
        return incentivesPPBenefitProgramOffSiteValue;
    }

    public void setIncentivesPPBenefitProgramOffSiteValue(int incentivesPPBenefitProgramOffSiteValue) {
        this.incentivesPPBenefitProgramOffSiteValue = incentivesPPBenefitProgramOffSiteValue;
    }

    public boolean isIncentivesWillDonateCivic() {
        return incentivesWillDonateCivic;
    }

    public void setIncentivesWillDonateCivic(boolean incentivesWillDonateCivic) {
        this.incentivesWillDonateCivic = incentivesWillDonateCivic;
    }

    public int getIncentivesWillDonateCivicValue() {
        return incentivesWillDonateCivicValue;
    }

    public void setIncentivesWillDonateCivicValue(int incentivesWillDonateCivicValue) {
        this.incentivesWillDonateCivicValue = incentivesWillDonateCivicValue;
    }

    public String getOverlayIds() {
        return overlayIds;
    }

    public void setOverlayIds(String overlayIds) {
        this.overlayIds = overlayIds;
    }

    public boolean isAbuttingAbuts() {
        return abuttingAbuts;
    }

    public void setAbuttingAbuts(boolean abuttingAbuts) {
        this.abuttingAbuts = abuttingAbuts;
    }

    public int getAbuttingZone1Id() {
        return abuttingZone1Id;
    }

    public void setAbuttingZone1Id(int abuttingZone1Id) {
        this.abuttingZone1Id = abuttingZone1Id;
    }

    public int getAbuttingZone2Id() {
        return abuttingZone2Id;
    }

    public void setAbuttingZone2Id(int abuttingZone2Id) {
        this.abuttingZone2Id = abuttingZone2Id;
    }

    public int getAbuttingZone3Id() {
        return abuttingZone3Id;
    }

    public void setAbuttingZone3Id(int abuttingZone3Id) {
        this.abuttingZone3Id = abuttingZone3Id;
    }

    public int getAbuttingSubZone1Id() {
        return abuttingSubZone1Id;
    }

    public void setAbuttingSubZone1Id(int abuttingSubZone1Id) {
        this.abuttingSubZone1Id = abuttingSubZone1Id;
    }

    public int getAbuttingSubZone2Id() {
        return abuttingSubZone2Id;
    }

    public void setAbuttingSubZone2Id(int abuttingSubZone2Id) {
        this.abuttingSubZone2Id = abuttingSubZone2Id;
    }

    public int getAbuttingSubZone3Id() {
        return abuttingSubZone3Id;
    }

    public void setAbuttingSubZone3Id(int abuttingSubZone3Id) {
        this.abuttingSubZone3Id = abuttingSubZone3Id;
    }

    public int getAbuttingZoneType1Id() {
        return abuttingZoneType1Id;
    }

    public void setAbuttingZoneType1Id(int abuttingZoneType1Id) {
        this.abuttingZoneType1Id = abuttingZoneType1Id;
    }

    public int getAbuttingZoneType2Id() {
        return abuttingZoneType2Id;
    }

    public void setAbuttingZoneType2Id(int abuttingZoneType2Id) {
        this.abuttingZoneType2Id = abuttingZoneType2Id;
    }

    public int getAbuttingZoneType3Id() {
        return abuttingZoneType3Id;
    }

    public void setAbuttingZoneType3Id(int abuttingZoneType3Id) {
        this.abuttingZoneType3Id = abuttingZoneType3Id;
    }

    public Object getFrontageOverrides() {
        return frontageOverrides;
    }

    public void setFrontageOverrides(Object frontageOverrides) {
        this.frontageOverrides = frontageOverrides;
    }

    public Object getBuildingTypologyId() {
        return buildingTypologyId;
    }

    public void setBuildingTypologyId(Object buildingTypologyId) {
        this.buildingTypologyId = buildingTypologyId;
    }

    public Modules getModules() {
        return modules;
    }

    public void setModules(Modules modules) {
        this.modules = modules;
    }

    @Override
    public String toString() {
        return "ZoningAllowances{" +
                "id=" + id +
                ", zoningCodeId=" + zoningCodeId +
                ", zoneId=" + zoneId +
                ", zoneTypeId=" + zoneTypeId +
                ", variancesIds='" + variancesIds + '\'' +
                ", subZoneId=" + subZoneId +
                ", irregular=" + irregular +
                ", width=" + width +
                ", depth=" + depth +
                ", irregularFrontage=" + irregularFrontage +
                ", irregularArea=" + irregularArea +
                ", primaryFrontageA=" + primaryFrontageA +
                ", primaryFrontageAValue=" + primaryFrontageAValue +
                ", moreOneFrontage=" + moreOneFrontage +
                ", frontageB=" + frontageB +
                ", frontageBValue=" + frontageBValue +
                ", frontageBType=" + frontageBType +
                ", frontageC=" + frontageC +
                ", frontageCValue=" + frontageCValue +
                ", frontageCType=" + frontageCType +
                ", frontageD=" + frontageD +
                ", frontageDValue=" + frontageDValue +
                ", frontageDType=" + frontageDType +
                ", streetParking=" + streetParking +
                ", streetParkingValue='" + streetParkingValue + '\'' +
                ", propertyFacingCivicSpace='" + propertyFacingCivicSpace + '\'' +
                ", tod=" + tod +
                ", todValue='" + todValue + '\'' +
                ", transitCorridor=" + transitCorridor +
                ", transitCorridorValue='" + transitCorridorValue + '\'' +
                ", closestT3Zone='" + closestT3Zone + '\'' +
                ", densityIncrease=" + densityIncrease +
                ", densityIncreaseValue=" + densityIncreaseValue +
                ", setbackA=" + setbackA +
                ", setbackAValue=" + setbackAValue +
                ", setbackB=" + setbackB +
                ", setbackBValue=" + setbackBValue +
                ", setbackC=" + setbackC +
                ", setbackCValue=" + setbackCValue +
                ", setbackD=" + setbackD +
                ", setbackDValue=" + setbackDValue +
                ", heightLimit=" + heightLimit +
                ", heightLimitValue=" + heightLimitValue +
                ", lEED=" + lEED +
                ", lEEDValue='" + lEEDValue + '\'' +
                ", incentivesBrownFieldRedevelopment=" + incentivesBrownFieldRedevelopment +
                ", incentivesAHPBenefitProgramTrustFund=" + incentivesAHPBenefitProgramTrustFund +
                ", incentivesAHPBenefitProgramOnSite=" + incentivesAHPBenefitProgramOnSite +
                ", incentivesAHPBenefitProgramOffSite=" + incentivesAHPBenefitProgramOffSite +
                ", incentivesWillDonate=" + incentivesWillDonate +
                ", incentivesPPBenefitProgramTrustFund=" + incentivesPPBenefitProgramTrustFund +
                ", incentivesPPBenefitProgramTrustFundValue=" + incentivesPPBenefitProgramTrustFundValue +
                ", incentivesPPBenefitProgramOnSite=" + incentivesPPBenefitProgramOnSite +
                ", incentivesPPBenefitProgramOnSiteValue=" + incentivesPPBenefitProgramOnSiteValue +
                ", incentivesPPBenefitProgramOffSite=" + incentivesPPBenefitProgramOffSite +
                ", incentivesPPBenefitProgramOffSiteValue=" + incentivesPPBenefitProgramOffSiteValue +
                ", incentivesWillDonateCivic=" + incentivesWillDonateCivic +
                ", incentivesWillDonateCivicValue=" + incentivesWillDonateCivicValue +
                ", overlayIds='" + overlayIds + '\'' +
                ", abuttingAbuts=" + abuttingAbuts +
                ", abuttingZone1Id=" + abuttingZone1Id +
                ", abuttingZone2Id=" + abuttingZone2Id +
                ", abuttingZone3Id=" + abuttingZone3Id +
                ", abuttingSubZone1Id=" + abuttingSubZone1Id +
                ", abuttingSubZone2Id=" + abuttingSubZone2Id +
                ", abuttingSubZone3Id=" + abuttingSubZone3Id +
                ", abuttingZoneType1Id=" + abuttingZoneType1Id +
                ", abuttingZoneType2Id=" + abuttingZoneType2Id +
                ", abuttingZoneType3Id=" + abuttingZoneType3Id +
                ", frontageOverrides=" + frontageOverrides +
                ", buildingTypologyId=" + buildingTypologyId +
                ", modules=" + modules +
                '}';
    }
}
