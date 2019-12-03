package caruaru.pe.Weather.transactions;

import android.util.Log;

import caruaru.pe.Weather.models.Clima;
import caruaru.pe.Weather.request.ClimaRequest;
import caruaru.pe.Weather.request.RetrofitClient;

import java.io.IOException;

import retrofit2.Call;
import retrofit2.Response;


public class GetClimaTransaction implements Transaction {


    private String endereco,endereco2;
    private ClimaRequest apiService;
    private GetClimaView view;
    private Clima clima;
    private Clima clima2;



    public GetClimaTransaction(GetClimaView view, String endereco){
        this.view = view;
        this.endereco = endereco;
        this.apiService =
                RetrofitClient.getClient().create(ClimaRequest.class);

    }


    public void execute(){
        Call<Clima> call = this.apiService.getClima(this.endereco,"metric");

        try {
            Response<Clima> response = call.execute();

            if (response.body() != null) {

                this.clima = response.body();
            }
        }catch (IOException ex){
            ex.printStackTrace();
            Log.d("Bug", ex.getMessage());
        }
    }



    public void executee(){
        Call<Clima> call = this.apiService.getClima(this.endereco2,"metric");

        try {
            Response<Clima> response = call.execute();

            if (response.body() != null) {

                this.clima2 = response.body();
            }
        }catch (IOException ex){
            ex.printStackTrace();
            Log.d("Bug", ex.getMessage());
        }
    }


    public void updateView() {

        this.view.setClima(this.clima);

        this.view.setClima2(this.clima);


    }


}
