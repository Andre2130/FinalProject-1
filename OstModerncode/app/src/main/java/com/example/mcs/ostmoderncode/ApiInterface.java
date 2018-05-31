package com.example.mcs.ostmoderncode;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.POST;

public interface ApiInterface {

    @POST("http://feature-code-test.skylark-cms.qa.aws.ostmodern.co.uk:8000/api/sets/?slug=home")
    Call<List<Show>> getShows();
}
