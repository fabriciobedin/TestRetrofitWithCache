package io.github.fabriciobedin.testretrofitwithcache.api;

import java.util.List;

import io.github.fabriciobedin.testretrofitwithcache.model.PressaoSanguineaModel;
import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Path;

/**
 * Created by fabricio on 07/02/2017.
 */

public interface PressaoSanguineaAPI {
    @GET("webresources/br.com.lifestyle.entity.pressaosanguinea/{id}")
    Call<PressaoSanguineaModel> getPressaoSanguinea(@Path("id") int id);

    @FormUrlEncoded
    @POST("webresources/br.com.lifestyle.entity.pressaosanguinea/{id}")
    Call<PressaoSanguineaModel> getOnePressaoSanguinea(@Field("id") int id);

    @FormUrlEncoded
    @POST("webresources/br.com.lifestyle.entity.pressaosanguinea/{id}")
    Call<List<PressaoSanguineaModel>> getManyPressaoSanguinea(@Field("id") int id);

}
