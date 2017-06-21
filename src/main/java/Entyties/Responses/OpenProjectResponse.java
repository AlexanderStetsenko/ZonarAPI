package Entyties.Responses;

import Entyties.Entity;
import Entyties.Project.Project;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;



public class OpenProjectResponse extends Entity {

    @JsonProperty("Project")
    private Project project;

    public OpenProjectResponse() {
    }

    public OpenProjectResponse(Project project) {
        this.project = project;
        System.out.println("HEllo");
    }

    public Project getProject() {
        return project;
    }

    public void setProject(Project project) {
        this.project = project;
    }

    @Override
    public String toString() {
        return "OpenProjectResponse{" +
                "project=" + project +
                '}';
    }
}
