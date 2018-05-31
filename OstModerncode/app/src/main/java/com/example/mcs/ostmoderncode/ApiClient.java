package com.example.mcs.ostmoderncode;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class ApiClient {

    public static final String BASE_URL = "http://feature-code-test.skylark-cms.qa.aws.ostmodern.co.uk:8000/api/sets/?slug=home";
    public static Retrofit retrofit = null;

    public static Retrofit getApiClient(){
        if (retrofit == null){
            retrofit = new Retrofit.Builder().baseUrl(BASE_URL)
                    .addConverterFactory(GsonConverterFactory.create()).build();
        }
        return retrofit;
    }
}
