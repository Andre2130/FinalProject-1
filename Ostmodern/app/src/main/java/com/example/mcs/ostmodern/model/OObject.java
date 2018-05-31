package com.example.mcs.ostmodern.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class OObject {

    @SerializedName("uid")
    @Expose
    private String uid;
    @SerializedName("schedule_urls")
    @Expose
    private List<String> scheduleUrls = null;
    @SerializedName("publish_on")
    @Expose
    private String publishOn;
    @SerializedName("quoter")
    @Expose
    private String quoter;
    @SerializedName("featured")
    @Expose
    private Boolean featured;
    @SerializedName("language_modified_by")
    @Expose
    private java.lang.Object languageModifiedBy;
    @SerializedName("plans")
    @Expose
    private List<java.lang.Object> plans = null;
    @SerializedName("cached_film_count")
    @Expose
    private Integer cachedFilmCount;
    @SerializedName("modified_by")
    @Expose
    private java.lang.Object modifiedBy;
    @SerializedName("temp_id")
    @Expose
    private Integer tempId;
    @SerializedName("title")
    @Expose
    private String title;
    @SerializedName("self")
    @Expose
    private String self;
    @SerializedName("created_by")
    @Expose
    private java.lang.Object createdBy;
    @SerializedName("language_publish_on")
    @Expose
    private String languagePublishOn;
    @SerializedName("language_modified")
    @Expose
    private String languageModified;
    @SerializedName("has_price")
    @Expose
    private Boolean hasPrice;
    @SerializedName("set_type_url")
    @Expose
    private java.lang.Object setTypeUrl;
    @SerializedName("temp_image")
    @Expose
    private String tempImage;
    @SerializedName("film_count")
    @Expose
    private Integer filmCount;
    @SerializedName("body")
    @Expose
    private String body;
    @SerializedName("language_version_url")
    @Expose
    private String languageVersionUrl;
    @SerializedName("quote")
    @Expose
    private String quote;
    @SerializedName("lowest_amount")
    @Expose
    private java.lang.Object lowestAmount;
    @SerializedName("formatted_body")
    @Expose
    private String formattedBody;
    @SerializedName("image_urls")
    @Expose
    private List<String> imageUrls = null;
    @SerializedName("hierarchy_url")
    @Expose
    private java.lang.Object hierarchyUrl;
    @SerializedName("schedule_url")
    @Expose
    private String scheduleUrl;
    @SerializedName("active")
    @Expose
    private Boolean active;
    @SerializedName("slug")
    @Expose
    private String slug;
    @SerializedName("version_number")
    @Expose
    private Integer versionNumber;
    @SerializedName("language_ends_on")
    @Expose
    private String languageEndsOn;
    @SerializedName("created")
    @Expose
    private String created;
    @SerializedName("items")
    @Expose
    private List<java.lang.Object> items = null;
    @SerializedName("language_version_number")
    @Expose
    private Integer languageVersionNumber;
    @SerializedName("modified")
    @Expose
    private String modified;
    @SerializedName("summary")
    @Expose
    private String summary;
    @SerializedName("ends_on")
    @Expose
    private String endsOn;
    @SerializedName("version_url")
    @Expose
    private String versionUrl;
    @SerializedName("set_type_slug")
    @Expose
    private String setTypeSlug;

    public String getUid() {
        return uid;
    }

    public void setUid(String uid) {
        this.uid = uid;
    }

    public List<String> getScheduleUrls() {
        return scheduleUrls;
    }

    public void setScheduleUrls(List<String> scheduleUrls) {
        this.scheduleUrls = scheduleUrls;
    }

    public String getPublishOn() {
        return publishOn;
    }

    public void setPublishOn(String publishOn) {
        this.publishOn = publishOn;
    }

    public String getQuoter() {
        return quoter;
    }

    public void setQuoter(String quoter) {
        this.quoter = quoter;
    }

    public Boolean getFeatured() {
        return featured;
    }

    public void setFeatured(Boolean featured) {
        this.featured = featured;
    }

    public java.lang.Object getLanguageModifiedBy() {
        return languageModifiedBy;
    }

    public void setLanguageModifiedBy(java.lang.Object languageModifiedBy) {
        this.languageModifiedBy = languageModifiedBy;
    }

    public List<java.lang.Object> getPlans() {
        return plans;
    }
}