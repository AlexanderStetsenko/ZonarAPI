package Entyties.Project.Development.BuildingWrapper.AnalyzeData;

import Entyties.Project.Development.BuildingWrapper.AnalyzeData.OriginalFrontages.OriginalFrontages;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import javax.annotation.Generated;
import java.util.List;



@JsonIgnoreProperties(ignoreUnknown = true)
@Generated("com.robohorse.robopojogenerator")
public class AnalyzeData{

	@JsonProperty("originalFrontages")
	List<OriginalFrontages> originalFrontages;

	public List<OriginalFrontages> getOriginalFrontages() {
		return originalFrontages;
	}

	public void setOriginalFrontages(List<OriginalFrontages> originalFrontages) {
		this.originalFrontages = originalFrontages;
	}

	@Override
	public String toString() {
		return "AnalyzeData{" +
				"originalFrontages=" + originalFrontages +
				'}';
	}
}