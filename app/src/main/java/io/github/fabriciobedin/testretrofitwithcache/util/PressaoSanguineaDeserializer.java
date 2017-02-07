package io.github.fabriciobedin.testretrofitwithcache.util;

import com.google.gson.Gson;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonParseException;

import java.lang.reflect.Type;

import io.github.fabriciobedin.testretrofitwithcache.model.PressaoSanguineaModel;

/**
 * Created by fabricio on 07/02/2017.
 */

public class PressaoSanguineaDeserializer implements JsonDeserializer<Object>{
    @Override
    public Object deserialize(JsonElement json, Type typeOfT, JsonDeserializationContext context) throws JsonParseException {

        JsonElement pressaoSanguinea = json.getAsJsonObject();

        if(json.getAsJsonObject().get("PressaoSanguinea") != null){
            pressaoSanguinea = json.getAsJsonObject().get("PressaoSanguinea");
        }

        return (new Gson().fromJson(pressaoSanguinea, PressaoSanguineaModel.class));
    }
}
