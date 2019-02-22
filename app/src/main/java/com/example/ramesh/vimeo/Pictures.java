package com.example.ramesh.vimeo;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * Created by Ramesh on 2/22/2019.
 */

public class Pictures {

    @SerializedName("uri")
    @Expose
    private String uri;
    @SerializedName("active")
    @Expose
    private Boolean active;
    @SerializedName("type")
    @Expose
    private String type;
    @SerializedName("sizes")
    @Expose
    private List<Size> sizes = null;

    public String getUri() {
        return uri;
    }

    public void setUri(String uri) {
        this.uri = uri;
    }

    public Boolean getActive() {
        return active;
    }

    public void setActive(Boolean active) {
        this.active = active;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public List<Size> getSizes() {
        return sizes;
    }

    public void setSizes(List<Size> sizes) {
        this.sizes = sizes;
    }

}
