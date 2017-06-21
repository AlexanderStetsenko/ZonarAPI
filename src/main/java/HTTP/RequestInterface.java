package HTTP;

import com.mashape.unirest.http.HttpResponse;


/**
 * Created by Александр on 16.06.2017.
 */
public interface RequestInterface  {

    HttpResponse<String> sendRequest(Object n);
}
