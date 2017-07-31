package Entyties.Project.Development.BuildingWrapper.AnalyzeData.OriginalFrontages;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import javax.annotation.Generated;

@JsonIgnoreProperties(ignoreUnknown = true) /*Segments isn't added*/

public class OriginalFrontages{

	@JsonProperty("noneFrontageType")
	private int noneFrontageType;

	@JsonProperty("canOverride")
	private boolean canOverride;

	@JsonProperty("longestSegmentLength")
	private double longestSegmentLength;

	@JsonProperty("longestSegmentNum")
	private int longestSegmentNum;

	@JsonProperty("minOverride")
	private int minOverride;

	@JsonProperty("roadIndex")
	private int roadIndex;

	@JsonProperty("segmentsLengthSum")
	private double segmentsLengthSum;

	@JsonProperty("straigthLength")
	private double straigthLength;

	/*Segments isn't added*/


	@JsonProperty("label")
	private String label;

	@JsonProperty("frontageType")
	private int frontageType;

	@JsonProperty("setback")
	private int setback;

	public void setNoneFrontageType(int noneFrontageType){
		this.noneFrontageType = noneFrontageType;
	}

	public int getNoneFrontageType(){
		return noneFrontageType;
	}

	public void setCanOverride(boolean canOverride){
		this.canOverride = canOverride;
	}

	public boolean isCanOverride(){
		return canOverride;
	}

	public void setLongestSegmentLength(double longestSegmentLength){
		this.longestSegmentLength = longestSegmentLength;
	}

	public double getLongestSegmentLength(){
		return longestSegmentLength;
	}

	public void setLongestSegmentNum(int longestSegmentNum){
		this.longestSegmentNum = longestSegmentNum;
	}

	public int getLongestSegmentNum(){
		return longestSegmentNum;
	}

	public void setMinOverride(int minOverride){
		this.minOverride = minOverride;
	}

	public int getMinOverride(){
		return minOverride;
	}

	public void setRoadIndex(int roadIndex){
		this.roadIndex = roadIndex;
	}

	public int getRoadIndex(){
		return roadIndex;
	}

	public void setSegmentsLengthSum(double segmentsLengthSum){
		this.segmentsLengthSum = segmentsLengthSum;
	}

	public double getSegmentsLengthSum(){
		return segmentsLengthSum;
	}

	public void setStraigthLength(double straigthLength){
		this.straigthLength = straigthLength;
	}

	public double getStraigthLength(){
		return straigthLength;
	}

	public void setLabel(String label){
		this.label = label;
	}

	public String getLabel(){
		return label;
	}

	public void setFrontageType(int frontageType){
		this.frontageType = frontageType;
	}

	public int getFrontageType(){
		return frontageType;
	}

	public void setSetback(int setback){
		this.setback = setback;
	}

	public int getSetback(){
		return setback;
	}

	@Override
 	public String toString(){
		return 
			"OriginalFrontages{" + 
			"noneFrontageType = '" + noneFrontageType + '\'' + 
			",canOverride = '" + canOverride + '\'' + 
			",longestSegmentLength = '" + longestSegmentLength + '\'' + 
			",longestSegmentNum = '" + longestSegmentNum + '\'' + 
			",minOverride = '" + minOverride + '\'' + 
			",roadIndex = '" + roadIndex + '\'' + 
			",segmentsLengthSum = '" + segmentsLengthSum + '\'' + 
			",straigthLength = '" + straigthLength + '\'' + 
			",label = '" + label + '\'' + 
			",frontageType = '" + frontageType + '\'' + 
			",setback = '" + setback + '\'' + 
			"}";
		}
}