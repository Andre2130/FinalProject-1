package com.example.mcs.ostmodern.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class OObjectResponse {
    @SerializedName("objects")
    @Expose
    private List<Object> objects = null;

    public List<Object> getObjects() {
        return objects;
    }

    public void setObjects(List<Object> objects) {
        this.objects = objects;
    }
}
