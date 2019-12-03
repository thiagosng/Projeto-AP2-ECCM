package caruaru.pe.Weather.request;

import caruaru.pe.Weather.models.Clima;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;


public interface ClimaRequest {

    @GET("weather?appid="+RetrofitClient.API_KEY)
    Call<Clima> getClima(@Query("q") String q , @Query("units") String units);
}