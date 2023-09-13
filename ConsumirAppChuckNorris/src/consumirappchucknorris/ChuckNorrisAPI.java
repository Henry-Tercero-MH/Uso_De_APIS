package consumirappchucknorris;

import com.squareup.okhttp.OkHttpClient;
import com.squareup.okhttp.Request;
import com.squareup.okhttp.Response;


public class ChuckNorrisAPI {
    private static final String API_URL = "https://api.chucknorris.io/jokes/random";

    public static String getRandomJoke() throws Exception {
        OkHttpClient client = new OkHttpClient();
        Request request = new Request.Builder()
            .url(API_URL)
            .build();
        
        Response response = client.newCall(request).execute();
        
        if (!response.isSuccessful()) {
            throw new Exception("Error al realizar la solicitud: " + response.code());
        }
        
        return response.body().string();
    }
}
