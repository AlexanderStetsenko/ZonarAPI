
package Entyties.Project.Development.BuildingWrapper.BuildingObject.Variances;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Override {

    @JsonProperty("VarianceId")
    private int VarianceId;
    @JsonProperty("VarianceName")
    private String VarianceName;
    @JsonProperty("Priority")
    private int Priority;
    @JsonProperty("VarianceTypeId")
    private int VarianceTypeId;
    @JsonProperty("VarianceTypeName")
    private String VarianceTypeName;
    @JsonProperty("Field")
    private String Field;
    @JsonProperty("FieldType")
    private String FieldType;
    @JsonProperty("FieldTypeId")
    private int FieldTypeId;
    @JsonProperty("SchemaName")
    private String SchemaName;
    @JsonProperty("MinValue")
    private int MinValue;
    @JsonProperty("MaxValue")
    private int MaxValue;
    @JsonProperty("OutputTypeId")
    private int OutputTypeId;
    @JsonProperty("ZoneId")
    private int ZoneId;
    @JsonProperty("SubZoneId")
    private int SubZoneId;
    @JsonProperty("ZoneTypeId")
    private int ZoneTypeId;
    @JsonProperty("FixedValue")
    private Object FixedValue;
    @JsonProperty("OverrideId")
    private int OverrideId;
    @JsonProperty("Hide")
    private boolean Hide;
    @JsonProperty("FieldSection")
    private Object FieldSection;
    @JsonProperty("IsActive")
    private Object IsActive;
    @JsonProperty("ApplyTypeId")
    private int ApplyTypeId;


    @JsonProperty("VarianceId")
    public int getVarianceId() {
        return VarianceId;
    }


    @JsonProperty("VarianceId")
    public void setVarianceId(int VarianceId) {
        this.VarianceId = VarianceId;
    }


    @JsonProperty("VarianceName")
    public String getVarianceName() {
        return VarianceName;
    }


    @JsonProperty("VarianceName")
    public void setVarianceName(String VarianceName) {
        this.VarianceName = VarianceName;
    }


    @JsonProperty("Priority")
    public int getPriority() {
        return Priority;
    }


    @JsonProperty("Priority")
    public void setPriority(int Priority) {
        this.Priority = Priority;
    }


    @JsonProperty("VarianceTypeId")
    public int getVarianceTypeId() {
        return VarianceTypeId;
    }


    @JsonProperty("VarianceTypeId")
    public void setVarianceTypeId(int VarianceTypeId) {
        this.VarianceTypeId = VarianceTypeId;
    }


    @JsonProperty("VarianceTypeName")
    public String getVarianceTypeName() {
        return VarianceTypeName;
    }


    @JsonProperty("VarianceTypeName")
    public void setVarianceTypeName(String VarianceTypeName) {
        this.VarianceTypeName = VarianceTypeName;
    }


    @JsonProperty("Field")
    public String getField() {
        return Field;
    }


    @JsonProperty("Field")
    public void setField(String Field) {
        this.Field = Field;
    }


    @JsonProperty("FieldType")
    public String getFieldType() {
        return FieldType;
    }


    @JsonProperty("FieldType")
    public void setFieldType(String FieldType) {
        this.FieldType = FieldType;
    }


    @JsonProperty("FieldTypeId")
    public int getFieldTypeId() {
        return FieldTypeId;
    }


    @JsonProperty("FieldTypeId")
    public void setFieldTypeId(int FieldTypeId) {
        this.FieldTypeId = FieldTypeId;
    }


    @JsonProperty("SchemaName")
    public String getSchemaName() {
        return SchemaName;
    }


    @JsonProperty("SchemaName")
    public void setSchemaName(String SchemaName) {
        this.SchemaName = SchemaName;
    }


    @JsonProperty("MinValue")
    public int getMinValue() {
        return MinValue;
    }


    @JsonProperty("MinValue")
    public void setMinValue(int MinValue) {
        this.MinValue = MinValue;
    }


    @JsonProperty("MaxValue")
    public int getMaxValue() {
        return MaxValue;
    }


    @JsonProperty("MaxValue")
    public void setMaxValue(int MaxValue) {
        this.MaxValue = MaxValue;
    }


    @JsonProperty("OutputTypeId")
    public int getOutputTypeId() {
        return OutputTypeId;
    }


    @JsonProperty("OutputTypeId")
    public void setOutputTypeId(int OutputTypeId) {
        this.OutputTypeId = OutputTypeId;
    }


    @JsonProperty("ZoneId")
    public int getZoneId() {
        return ZoneId;
    }


    @JsonProperty("ZoneId")
    public void setZoneId(int ZoneId) {
        this.ZoneId = ZoneId;
    }


    @JsonProperty("SubZoneId")
    public int getSubZoneId() {
        return SubZoneId;
    }


    @JsonProperty("SubZoneId")
    public void setSubZoneId(int SubZoneId) {
        this.SubZoneId = SubZoneId;
    }


    @JsonProperty("ZoneTypeId")
    public int getZoneTypeId() {
        return ZoneTypeId;
    }


    @JsonProperty("ZoneTypeId")
    public void setZoneTypeId(int ZoneTypeId) {
        this.ZoneTypeId = ZoneTypeId;
    }


    @JsonProperty("FixedValue")
    public Object getFixedValue() {
        return FixedValue;
    }


    @JsonProperty("FixedValue")
    public void setFixedValue(Object FixedValue) {
        this.FixedValue = FixedValue;
    }


    @JsonProperty("OverrideId")
    public int getOverrideId() {
        return OverrideId;
    }


    @JsonProperty("OverrideId")
    public void setOverrideId(int OverrideId) {
        this.OverrideId = OverrideId;
    }


    @JsonProperty("Hide")
    public boolean isHide() {
        return Hide;
    }


    @JsonProperty("Hide")
    public void setHide(boolean Hide) {
        this.Hide = Hide;
    }


    @JsonProperty("FieldSection")
    public Object getFieldSection() {
        return FieldSection;
    }


    @JsonProperty("FieldSection")
    public void setFieldSection(Object FieldSection) {
        this.FieldSection = FieldSection;
    }


    @JsonProperty("IsActive")
    public Object getIsActive() {
        return IsActive;
    }


    @JsonProperty("IsActive")
    public void setIsActive(Object IsActive) {
        this.IsActive = IsActive;
    }


    @JsonProperty("ApplyTypeId")
    public int getApplyTypeId() {
        return ApplyTypeId;
    }


    @JsonProperty("ApplyTypeId")
    public void setApplyTypeId(int ApplyTypeId) {
        this.ApplyTypeId = ApplyTypeId;
    }


    @java.lang.Override
    public String toString() {
        return "Override{" +
                "VarianceId=" + VarianceId +
                ", VarianceName='" + VarianceName + '\'' +
                ", Priority=" + Priority +
                ", VarianceTypeId=" + VarianceTypeId +
                ", VarianceTypeName='" + VarianceTypeName + '\'' +
                ", Field='" + Field + '\'' +
                ", FieldType='" + FieldType + '\'' +
                ", FieldTypeId=" + FieldTypeId +
                ", SchemaName='" + SchemaName + '\'' +
                ", MinValue=" + MinValue +
                ", MaxValue=" + MaxValue +
                ", OutputTypeId=" + OutputTypeId +
                ", ZoneId=" + ZoneId +
                ", SubZoneId=" + SubZoneId +
                ", ZoneTypeId=" + ZoneTypeId +
                ", FixedValue=" + FixedValue +
                ", OverrideId=" + OverrideId +
                ", Hide=" + Hide +
                ", FieldSection=" + FieldSection +
                ", IsActive=" + IsActive +
                ", ApplyTypeId=" + ApplyTypeId +
                '}';
    }
}
