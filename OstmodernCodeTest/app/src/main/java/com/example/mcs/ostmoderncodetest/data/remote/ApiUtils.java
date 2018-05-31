package com.example.mcs.ostmoderncodetest.data.remote;

public class ApiUtils {
    public static final String BASE_URL = "http://feature-code-test.skylark-cms.qa.aws.ostmodern.co.uk:8000/";

    public static OstmodernService getOsternService(){
        return RetrofitClient.getClient(BASE_URL).create(OstmodernService.class);
    }
}
