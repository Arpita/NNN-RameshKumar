package com.example.ramesh.vimeo;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/**
 * Created by Ramesh on 2/22/2019.
 */

public class Size {

    @SerializedName("width")
    @Expose
    private Integer width;
    @SerializedName("height")
    @Expose
    private Integer height;
    @SerializedName("link")
    @Expose
    private String link;
    @SerializedName("link_with_play_button")
    @Expose
    private String linkWithPlayButton;

    public Integer getWidth() {
        return width;
    }

    public void setWidth(Integer width) {
        this.width = width;
    }

    public Integer getHeight() {
        return height;
    }

    public void setHeight(Integer height) {
        this.height = height;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }

    public String getLinkWithPlayButton() {
        return linkWithPlayButton;
    }

    public void setLinkWithPlayButton(String linkWithPlayButton) {
        this.linkWithPlayButton = linkWithPlayButton;
    }

}
