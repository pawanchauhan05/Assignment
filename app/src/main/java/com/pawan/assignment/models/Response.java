package com.pawan.assignment.models;

import com.pawan.assignment.models.Data;
import com.pawan.assignment.models.OtherParams;

/**
 * Created by Pawan Singh Chauhan on 4/11/2017.
 */
public class Response {
    private int status;
    private int statusCode;
    private String message;
    private OtherParams otherParams;
    private Data[] data;

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public int getStatusCode() {
        return statusCode;
    }

    public void setStatusCode(int statusCode) {
        this.statusCode = statusCode;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public OtherParams getOtherParams() {
        return otherParams;
    }

    public void setOtherParams(OtherParams otherParams) {
        this.otherParams = otherParams;
    }

    public Data[] getData() {
        return data;
    }

    public void setData(Data[] data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "Response{" +
                "status=" + status +
                ", statusCode=" + statusCode +
                ", message='" + message + '\'' +
                ", otherParams=" + otherParams +
                ", data=" + data +
                '}';
    }
}