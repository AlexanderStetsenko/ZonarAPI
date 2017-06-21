package Entyties.Responses;

import Entyties.Entity;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Created by Александр on 21.06.2017.
 */
public class CreateProjectResponse extends Entity

{

    @JsonProperty("savedProjectID")
    public String savedProjectID;

    public CreateProjectResponse() {
    }

    public CreateProjectResponse(String savedProjectID) {
        this.savedProjectID = savedProjectID;
    }

    public String getSavedProjectID() {
        return savedProjectID;
    }

    public void setSavedProjectID(String savedProjectID) {
        this.savedProjectID = savedProjectID;
    }

    @Override
    public String toString() {
        return "CreateProjectResponse{" +
                "savedProjectID='" + savedProjectID + '\'' +
                '}';
    }
}
