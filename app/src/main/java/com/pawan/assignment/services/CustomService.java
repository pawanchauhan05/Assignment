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

    @GET(Constants.Get_DATA)
    Observable<Response> getDataFromServer();

    @GET("api/v1/property/filter/region/ChIJLfyY2E4UrjsRVq4AjI7zgRY/")
    Observable<Response> getDataServer(
            @QueryMap Map<String, Object> options
    );

    @GET("api/v1/property/filter/region/ChIJLfyY2E4UrjsRVq4AjI7zgRY/")
    Observable<Response> getFilterDataFromServer(
            @QueryMap Map<String, Object> options
    );
}
