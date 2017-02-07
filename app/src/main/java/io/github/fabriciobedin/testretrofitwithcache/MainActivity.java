package io.github.fabriciobedin.testretrofitwithcache;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Html;
import android.util.Log;
import android.widget.TextView;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.IOException;
import java.util.List;

import io.github.fabriciobedin.testretrofitwithcache.api.PressaoSanguineaAPI;
import io.github.fabriciobedin.testretrofitwithcache.model.PressaoSanguineaModel;
import io.github.fabriciobedin.testretrofitwithcache.util.PressaoSanguineaDeserializer;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class MainActivity extends AppCompatActivity {

    public static final String TAG = "LOG";
    public static final String API = "http://www.visionnit.com.br/plifestyle/";
    private TextView teste;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        teste = (TextView) findViewById(R.id.teste);
    }

    @Override
    protected void onResume() {
        super.onResume();

        Gson gson = new GsonBuilder().registerTypeAdapter(PressaoSanguineaModel.class, new PressaoSanguineaDeserializer()).create();

        Retrofit retrofit = new Retrofit
                .Builder()
                .baseUrl(API)
                .addConverterFactory(GsonConverterFactory.create(gson))
                .build();

        PressaoSanguineaAPI pressaoSanguineaAPI = retrofit.create(PressaoSanguineaAPI.class);


        //------------------------------------------------------------------------------------
        Call<PressaoSanguineaModel> call = pressaoSanguineaAPI.getPressaoSanguinea(1);
        call.enqueue(new Callback<PressaoSanguineaModel>() {
            @Override
            public void onResponse(Call<PressaoSanguineaModel> call, Response<PressaoSanguineaModel> response) {
                PressaoSanguineaModel pressao = response.body();
                if(pressao != null){
                    teste.setText(Html.fromHtml("Pressao SIS: "+pressao.getPsaValorsistolica()
                            +"<br>Pressao DIA: "+pressao.getPsaValordiastolica()));
                }
            }

            @Override
            public void onFailure(Call<PressaoSanguineaModel> call, Throwable t) {
                Log.i(TAG, "Erro Especifico"+t.getMessage());
            }
        });

        //one------------------------------------------------------------------------------------
        call = pressaoSanguineaAPI.getOnePressaoSanguinea(1);
        call.enqueue(new Callback<PressaoSanguineaModel>() {
            @Override
            public void onResponse(Call<PressaoSanguineaModel> call, Response<PressaoSanguineaModel> response) {
                PressaoSanguineaModel pressao = response.body();
                if(pressao != null){
                    teste.setText(Html.fromHtml("Pressao SIS: "+pressao.getPsaValorsistolica()
                            +"<br>Pressao DIA: "+pressao.getPsaValordiastolica()));
                }
            }

            @Override
            public void onFailure(Call<PressaoSanguineaModel> call, Throwable t) {
                Log.i(TAG, "erro one: "+t.getMessage());
            }
        });

        //many------------------------------------------------------------------------------------
        final Call<List<PressaoSanguineaModel>> callList = pressaoSanguineaAPI.getManyPressaoSanguinea(1);

        new Thread(){
            @Override
            public void run() {
                super.run();

                try {
                    List<PressaoSanguineaModel> listPressao = callList.execute().body();

                    if(listPressao != null){
                        for( PressaoSanguineaModel p : listPressao){

                        }

                    }

                } catch (IOException e) {
                    e.printStackTrace();
                }


                runOnUiThread(new Runnable() {
                    @Override
                    public void run() {
                        Log.i(TAG, "Iniciou a thread");
                    }
                });
            }
        }.start();


        call.enqueue(new Callback<PressaoSanguineaModel>() {
            @Override
            public void onResponse(Call<PressaoSanguineaModel> call, Response<PressaoSanguineaModel> response) {
                PressaoSanguineaModel pressao = response.body();
                if(pressao != null){
                    teste.setText(Html.fromHtml("Pressao SIS: "+pressao.getPsaValorsistolica()
                            +"<br>Pressao DIA: "+pressao.getPsaValordiastolica()));
                }
            }

            @Override
            public void onFailure(Call<PressaoSanguineaModel> call, Throwable t) {
                Log.i(TAG, "erro many" +t.getMessage());
            }
        });
    }
}
