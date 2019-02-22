package com.example.ramesh.vimeo;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/**
 * Created by Ramesh on 2/22/2019.
 */

public class Datum {

    @SerializedName("uri")
    @Expose
    private String uri;
    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("link")
    @Expose
    private String link;
    @SerializedName("top_level")
    @Expose
    private Boolean topLevel;
    @SerializedName("pictures")
    @Expose
    private Pictures pictures;

    public String getUri() {
        return uri;
    }

    public void setUri(String uri) {
        this.uri = uri;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }

    public Boolean getTopLevel() {
        return topLevel;
    }

    public void setTopLevel(Boolean topLevel) {
        this.topLevel = topLevel;
    }

    public Pictures getPictures() {
        return pictures;
    }

    public void setPictures(Pictures pictures) {
        this.pictures = pictures;
    }


}
