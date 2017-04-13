package com.pawan.assignment.models;

/**
 * Created by Pawan Singh Chauhan on 4/11/2017.
 */
public class ImagesMap {
    private String thumbnail;
    private String original;
    private String medium;
    private String large;

    public String getThumbnail() {
        return thumbnail;
    }

    public void setThumbnail(String thumbnail) {
        this.thumbnail = thumbnail;
    }

    public String getOriginal() {
        return original;
    }

    public void setOriginal(String original) {
        this.original = original;
    }

    public String getMedium() {
        return medium;
    }

    public void setMedium(String medium) {
        this.medium = medium;
    }

    public String getLarge() {
        return large;
    }

    public void setLarge(String large) {
        this.large = large;
    }

    @Override
    public String toString() {
        return "ImagesMap{" +
                "thumbnail='" + thumbnail + '\'' +
                ", original='" + original + '\'' +
                ", medium='" + medium + '\'' +
                ", large='" + large + '\'' +
                '}';
    }
}
