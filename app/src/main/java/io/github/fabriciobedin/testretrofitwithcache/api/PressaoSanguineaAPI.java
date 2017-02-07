package io.github.fabriciobedin.testretrofitwithcache.api;

import io.github.fabriciobedin.testretrofitwithcache.model.PressaoSanguineaModel;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

/**
 * Created by fabricio on 07/02/2017.
 */

public interface PressaoSanguineaAPI {
    @GET("webresources/br.com.lifestyle.entity.pressaosanguinea/{id}")
    Call<PressaoSanguineaModel> getPressaoSanguinea(@Path("id") int id);

}
