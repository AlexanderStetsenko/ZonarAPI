package Entyties;

public class Entity {

    private static String userToken;
    private static String projectId;

    public static String getUserToken() {
        return userToken;
    }
    public static void setUserToken(String userToken) {
        Entity.userToken = userToken;
    }
    public static String getProjectId() {
        return projectId;
    }
    public static void setProjectId(String projectId) {
        Entity.projectId = projectId;
    }


}
