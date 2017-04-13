package com.pawan.assignment.models;

/**
 * Created by Pawan Singh Chauhan on 4/11/2017.
 */
public class OtherParams {
    private int count;
    private String region_id;
    private String searchToken;
    private String topPropertyId;
    private int total_count;
    private String city;

    @Override
    public String toString() {
        return "OtherParams{" +
                "count=" + count +
                ", region_id='" + region_id + '\'' +
                ", searchToken='" + searchToken + '\'' +
                ", topPropertyId='" + topPropertyId + '\'' +
                ", total_count=" + total_count +
                ", city='" + city + '\'' +
                '}';
    }
}
