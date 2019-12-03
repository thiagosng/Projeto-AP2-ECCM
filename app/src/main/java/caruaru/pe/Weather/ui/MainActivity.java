package caruaru.pe.Weather.ui;
//import android.R;
//import caruaru.pe.clima.R;
//import android.support.v7.app.AppCompatActivity;


import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import caruaru.pe.Weather.R;
import caruaru.pe.Weather.transactions.GetClimaTransaction;
import caruaru.pe.Weather.transactions.GetClimaView;
import caruaru.pe.Weather.transactions.TransactionTask;
import caruaru.pe.Weather.models.Clima;




public class MainActivity extends AppCompatActivity implements GetClimaView {

    TextView txtClima,txtClima2,txtClima3,txtClima4,txtClima5,txtClima6;
    EditText edtEndereco,edtEndereco2,edtEndereco3,edtEndereco4,edtEndereco5,edtEndereco6;
    Button btBuscar,btBuscar2,btBuscar3,btBuscar4,btBuscar5,btBuscar6;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        this.txtClima = findViewById(R.id.txtClima);
        this.edtEndereco = findViewById(R.id.edtEndereco);
        this.btBuscar = findViewById(R.id.btBuscar);

        this.btBuscar.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                buscar(edtEndereco.getText().toString());
            }

        });

        this.txtClima2 = findViewById(R.id.txtClima2);
        this.btBuscar2 = findViewById(R.id.btBuscar2);
        this.edtEndereco2 = findViewById(R.id.edtEndereco2);

        this.btBuscar2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                buscar2(edtEndereco2.getText().toString());
            }
        });

        this.txtClima3 = findViewById(R.id.txtClima3);
        this.btBuscar3 = findViewById(R.id.btBuscar3);
        this.edtEndereco3 = findViewById(R.id.edtEndereco3);

        this.btBuscar3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                buscar3(edtEndereco3.getText().toString());
            }
        });

        this.txtClima4 = findViewById(R.id.txtClima4);
        this.btBuscar4 = findViewById(R.id.btBuscar4);
        this.edtEndereco4 = findViewById(R.id.edtEndereco4);

        this.btBuscar4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                buscar4(edtEndereco2.getText().toString());
            }
        });

        this.txtClima5 = findViewById(R.id.txtClima5);
        this.btBuscar5 = findViewById(R.id.btBuscar5);
        this.edtEndereco5 = findViewById(R.id.edtEndereco5);

        this.btBuscar5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                buscar5(edtEndereco5.getText().toString());
            }
        });

        this.txtClima6 = findViewById(R.id.txtClima6);
        this.btBuscar6 = findViewById(R.id.btBuscar6);
        this.edtEndereco6 = findViewById(R.id.edtEndereco6);

        this.btBuscar6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                buscar6(edtEndereco2.getText().toString());
            }
        });

    }

    public void buscar(String endereco){
        new TransactionTask(this,
                new GetClimaTransaction(this,endereco),R.string.aguarde).execute(new Void[0]);
    }

    public void buscar2(String endereco2){
        new TransactionTask(this,
                new GetClimaTransaction(this,endereco2),R.string.aguarde).execute(new Void[0]);
    }

    public void buscar3(String endereco3){
        new TransactionTask(this,
                new GetClimaTransaction(this,endereco3),R.string.aguarde).execute(new Void[0]);
    }

    public void buscar4(String endereco4){
        new TransactionTask(this,
                new GetClimaTransaction(this,endereco4),R.string.aguarde).execute(new Void[0]);
    }

    public void buscar5(String endereco5){
        new TransactionTask(this,
                new GetClimaTransaction(this,endereco5),R.string.aguarde).execute(new Void[0]);
    }

    public void buscar6(String endereco6){
        new TransactionTask(this,
                new GetClimaTransaction(this,endereco6),R.string.aguarde).execute(new Void[0]);
    }

    @Override
    public void setClima(Clima clima) {

        if(clima!=null) {
            this.txtClima.setText( " Cidade :  " + clima.getCidade() +"  Temperatura: " + clima.getTemperatura());
            this.txtClima3.setText( " Cidade :  " + clima.getCidade() +"  Temperatura: " + clima.getTemperatura());
            this.txtClima4.setText( " Cidade :  " + clima.getCidade() +"  Temperatura: " + clima.getTemperatura());
            this.txtClima5.setText( " Cidade :  " + clima.getCidade() +"  Temperatura: " + clima.getTemperatura());
            this.txtClima6.setText( " Cidade :  " + clima.getCidade() +"  Temperatura: " + clima.getTemperatura());
        }else{
            Toast.makeText(this,"Nenhum resultado encontrado", Toast.LENGTH_SHORT).show();
        }
    }
    @Override
    public void setClima2(Clima clima2) {

        if(clima2!=null) {

            this.txtClima2.setText( " Cidade :  " + clima2.getCidade() +"  Temperatura: " + clima2.getTemperatura());
        }else{
            Toast.makeText(this,"Nenhum resultado encontrado", Toast.LENGTH_SHORT).show();
        }
    }






}
