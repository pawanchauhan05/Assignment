package com.pawan.assignment.core;

import android.util.Log;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import okhttp3.Interceptor;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.logging.HttpLoggingInterceptor;
import retrofit2.Retrofit;
import retrofit2.adapter.rxjava.RxJavaCallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by Pawan Singh Chauhan on 4/11/2017.
 */
public class Application extends android.app.Application {
    public Retrofit retrofit;

    @Override
    public void onCreate() {
        super.onCreate();
        init();
    }

    private void init() {
        final OkHttpClient okHttpClient = new OkHttpClient.Builder()
                .readTimeout(60, TimeUnit.SECONDS)
                .connectTimeout(60, TimeUnit.SECONDS)
                .addInterceptor(new HttpLoggingInterceptor().setLevel(HttpLoggingInterceptor.Level.BODY))
                .addInterceptor(new Interceptor() {
                    @Override
                    public Response intercept(Chain chain) throws IOException {
                        Request original = chain.request();
                        Response response = chain.proceed(chain.request());
                        Log.e("Retrofit@Response", response.body().string());
                        /*if (!token.isEmpty())
                            return chain.proceed(original.newBuilder()
                                    .header("X-Auth-Token", token)
                                    .method(original.method(), original.body())
                                    .build());*/
                        return chain.proceed(original);
                    }
                })
                .build();

        retrofit = new Retrofit.Builder()
                .baseUrl(Constants.BASE_URL)
                .addCallAdapterFactory(RxJavaCallAdapterFactory.create())
                .addConverterFactory(GsonConverterFactory.create())
                .client(okHttpClient)
                .build();
    }

}
