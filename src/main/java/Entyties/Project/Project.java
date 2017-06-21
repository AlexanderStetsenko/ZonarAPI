package Entyties.Project;

import Entyties.Project.Development.DevelopmentsWrappers;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Александр on 21.06.2017.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class Project {
    @JsonProperty("_isReady")
    Boolean isReady;

    @JsonProperty("Project")
    ProjectInfo projectInfo;

    @JsonProperty("DevelopmentsWrappers")
    List<DevelopmentsWrappers> developmentsWrapper =  new ArrayList<DevelopmentsWrappers>();

    @JsonProperty("projectZoningCodes")
    List<ProjectZoningCodes> projectZoningCodes = new ArrayList<ProjectZoningCodes>();

    public Project() {
    }

    public Project(Boolean isReady, ProjectInfo projectInfo, List<DevelopmentsWrappers> developmentsWrapper, List<ProjectZoningCodes> projectZoningCodes) {
        this.isReady = isReady;
        this.projectInfo = projectInfo;
        this.developmentsWrapper = developmentsWrapper;
        this.projectZoningCodes = projectZoningCodes;
    }


    public Boolean getReady() {
        return isReady;
    }

    public void setReady(Boolean ready) {
        isReady = ready;
    }

    public ProjectInfo getProjectInfo() {
        return projectInfo;
    }

    public void setProjectInfo(ProjectInfo projectInfo) {
        this.projectInfo = projectInfo;
    }

    public List<DevelopmentsWrappers> getDevelopmentsWrapper() {
        return developmentsWrapper;
    }

    public void setDevelopmentsWrapper(List<DevelopmentsWrappers> developmentsWrapper) {
        this.developmentsWrapper = developmentsWrapper;
    }

    public List<ProjectZoningCodes> getProjectZoningCodes() {
        return projectZoningCodes;
    }

    public void setProjectZoningCodes(List<ProjectZoningCodes> projectZoningCodes) {
        this.projectZoningCodes = projectZoningCodes;
    }

    @Override
    public String toString() {
        return "Project{" +
                "isReady=" + isReady +
                ", projectInfo=" + projectInfo +
                ", developmentsWrapper=" + developmentsWrapper +
                ", projectZoningCodes=" + projectZoningCodes +
                '}';
    }
}
