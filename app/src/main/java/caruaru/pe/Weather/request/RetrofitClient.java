package caruaru.pe.Weather.request;


import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import caruaru.pe.Weather.models.Clima;
//import google.gson.Gson;
//import google.gson.GsonBuilder;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;


public class RetrofitClient {

    public static final String HOST_MAIN = "https://api.openweathermap.org/data/2.5/";
    public static final String API_KEY = "f0472b9d3186d8fa223376f0520910c3";
    private static Retrofit retrofit = null;


    public static Retrofit getClient() {
        if (retrofit==null) {
            GsonBuilder builder = new GsonBuilder();
            builder.registerTypeAdapter(Clima.class, new ClimaDeserializer());
            Gson gson = builder.create();

            retrofit = new Retrofit.Builder()
                    .baseUrl(HOST_MAIN)
                    .addConverterFactory(GsonConverterFactory.create(gson))
                    .build();
        }
        return retrofit;
    }
}
