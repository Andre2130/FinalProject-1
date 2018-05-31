package com.example.mcs.ostmoderncodetest.data.remote;

import com.example.mcs.ostmoderncodetest.data.model.OstmodernResponse;

import retrofit2.Call;
import retrofit2.http.GET;

public interface OstmodernService {

    @GET("http://feature-code-test.skylark-cms.qa.aws.ostmodern.co.uk:8000/api/sets/ ")
    Call<OstmodernResponse> getObjects();
}
