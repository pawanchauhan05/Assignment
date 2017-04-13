package com.pawan.assignment.models;

/**
 * Created by Pawan Singh Chauhan on 4/11/2017.
 */
public class Score {
    private float lifestyle;
    private long lastUpdatedDate;
    private float transit;

    @Override
    public String toString() {
        return "Score{" +
                "lifestyle=" + lifestyle +
                ", lastUpdatedDate=" + lastUpdatedDate +
                ", transit=" + transit +
                '}';
    }
}
