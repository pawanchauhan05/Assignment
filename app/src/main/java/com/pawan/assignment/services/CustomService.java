package com.pawan.assignment.services;

import com.pawan.assignment.core.Constants;
import com.pawan.assignment.models.Response;

import java.util.Map;

import retrofit2.http.GET;
import retrofit2.http.QueryMap;
import rx.Observable;

/**
 * Created by Pawan Singh Chauhan on 4/11/2017.
 */
public interface CustomService {


    @GET(Constants.GET_DATA_FROM_SERVER)
    Observable<Response> getDataFromServer(
            @QueryMap Map<String, Object> options
    );

    @GET(Constants.GET_DATA_FROM_SERVER)
    Observable<Response> getFilterDataFromServer(
            @QueryMap Map<String, Object> options
    );
}
