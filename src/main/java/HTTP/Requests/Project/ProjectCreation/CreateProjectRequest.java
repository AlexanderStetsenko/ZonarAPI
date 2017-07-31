package HTTP.Requests.Project.ProjectCreation;

import HTTP.RequestBase;


public class CreateProjectRequest extends RequestBase{


    private String requestUrl = "api/project/createProject";
    String body = "{\"createMode\":1,\"projectName\":\"Project 1\",\"addressIdList\":[%s],\"isAssamblege\":true,\"statusId\":1}";

    public String sendCreateProjectRequest(int shapeId){
        return sendRequest(requestUrl, String.format(body, shapeId)).getBody();
    }
}
