package consumirappchucknorris;


import com.google.gson.Gson;
import consumirappchucknorris.ChuckNorrisJoke;

public class ChuckNorrisAPIParse {
    private static final Gson gson = new Gson();

    public static ChuckNorrisJoke parseJoke(String json) {
        return gson.fromJson(json, ChuckNorrisJoke.class);
        
    }}