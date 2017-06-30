package HTTP.Requests.Project.ProjectCreation;

import HTTP.RequestBase;

import static java.lang.String.format;

/**
 * Created by Александр on 16.06.2017.
 */
public class CreateProjectRequest extends RequestBase{


    private String requestUrl = "api/project/createProject";
    String body = "{\"createMode\":1,\"projectName\":\"Project 1\",\"addressIdList\":[858778],\"isAssamblege\":true}";




    public String sendCreateProjectRequest(int shapeId){

        return sendRequest
                ("/api/project/createProject",
                format("{\"createMode\":1,\"projectName\":\"Project 1\",\"addressIdList\":[%s],\"isAssamblege\":true}", shapeId))
                .getBody();

//        try {
//            response = Unirest.post("https://dev1-zonarservice.gridics.com/api/project/createProject")
//                    .headers(getHeaders())
//                    .body("{\"createMode\":1,\"projectName\":\"Project 1\",\"addressIdList\":[858778],\"isAssamblege\":true}")
//                    .asString();
//        } catch (UnirestException e) {
//            e.printStackTrace();
//        }
//        return response.getBody();
    }




}
