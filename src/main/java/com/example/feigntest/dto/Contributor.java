package com.example.feigntest.dto;

import com.google.gson.JsonArray;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class Contributor {
    private JsonArray data;

    public JsonArray getData(){
        return data;
    }

    public void setData(JsonArray data){
        this.data = data;
    }

}
