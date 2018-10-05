package com.example.sadic.retrofitapp;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class RetrofitInstance {

    //"https://jsonplaceholder.typicode.com/photos"
    //https://www.reqres.in/api/users?page=1

    final static String BASE_URL = "https://jsonplaceholder.typicode.com";
    final static String BASE_URL_TWO = "https://www.reqres.in/api/";
    final static String BASE_URL_TRAVELER = "http://rjtmobile.com/aamir/otr/android-app/";
    private static final String BASE_URL_WEATHER = "http://api.openweathermap.org/data/2.5/";




    static Retrofit retrofit;

    public static Retrofit getRetrofitWeatherInstance() {

        if (retrofit == null)
            retrofit = new retrofit2.Retrofit.Builder()
                    .baseUrl(BASE_URL_WEATHER)
                    .addConverterFactory(GsonConverterFactory.create())
                    .build();

        return retrofit;

    }

    public static Retrofit getRetrofitInstance() {

        if (retrofit == null)
            retrofit = new retrofit2.Retrofit.Builder()
                    .baseUrl(BASE_URL_TWO)
                    .addConverterFactory(GsonConverterFactory.create())
                    .build();

            return retrofit;

    }

    public static Retrofit getRetrofitInstanceOne() {

        if (retrofit == null)
            retrofit = new retrofit2.Retrofit.Builder()
                    .baseUrl(BASE_URL)
                    .addConverterFactory(GsonConverterFactory.create())
                    .build();

        return retrofit;

    }

    //http://rjtmobile.com/aamir/otr/android-app/
    public static  Retrofit getRetrofitInstanceTraveler() {
        if(retrofit == null) {
            retrofit = new retrofit2.Retrofit.Builder()
                    .baseUrl(BASE_URL_TRAVELER)
                    .addConverterFactory(GsonConverterFactory.create())
                    .build();
        }
        return retrofit;
    }
}
