package Entyties.Project;

import Entyties.Project.Development.DevelopmentsWrappers;
import Entyties.Project.ProjectZoningCodes.ProjectZoningCodes;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

/**
 * Created by Александр on 30.06.2017.
 */
public class Project
{
    @JsonProperty("_isReady")
    boolean isReady;

    @JsonProperty("Project")
    ProjectInfo projectInfo;

    @JsonProperty("collectionName")
    String collectionName;

    @JsonProperty("type")
    int type;

    @JsonProperty("userId")
    int userId;

    @JsonProperty("DevelopmentsWrappers")
    List<DevelopmentsWrappers> developmentsWrapper;

    @JsonProperty("projectZoningCodes")
    List<ProjectZoningCodes> projectZoningCodes;


    public boolean isReady() {
        return isReady;
    }

    public void setReady(boolean ready) {
        isReady = ready;
    }

    public ProjectInfo getProjectInfo() {
        return projectInfo;
    }

    public void setProjectInfo(ProjectInfo projectInfo) {
        this.projectInfo = projectInfo;
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

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
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
                ", collectionName='" + collectionName + '\'' +
                ", type=" + type +
                ", userId=" + userId +
                ", developmentsWrapper=" + developmentsWrapper +
                ", projectZoningCodes=" + projectZoningCodes +
                '}';
    }
}
