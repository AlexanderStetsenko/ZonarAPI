package Entyties;

/**
 * Created by Александр on 14.06.2017.
 */
public class Entity {

    private static String userToken;



    public static String getUserToken() {
        return userToken;
    }
    public static void setUserToken(String userToken) {
        Entity.userToken = userToken;
    }
}
