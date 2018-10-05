package com.example.sadic.retrofitapp;

import com.example.sadic.retrofitapp.model.Weather;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface ApiService {

    //"https://jsonplaceholder.typicode.com/photos"
    @GET("/photos")
    Call<List<Album>> getPhotos();  //if JSON starts as an array
    //Call<Album> getPhotos(); // if JSON starts as an object

    //https://www.reqres.in/api/users?page=1
    @GET("users")
    Call<UserPage> getBook(@Query("page") int pageNo);

    //http://rjtmobile.com/aamir/otr/android-app/city.php?
    @GET("city.php")
    Call<City> getCity();

    //http://rjtmobile.com/aamir/otr/android-app/seatinfo.php?busid=102
    @GET("seatinfo.php")
    Call<Seat> getSeats(@Query("busid") int busId);

    //http://api.openweathermap.org/data/2.5/weather?q=Chicago&appid=bb72d2c2b6850337b36813263b0d37ee
    @GET("weather")
    Call<Weather> getWeatherInfo(@Query("q") String city, @Query("appid") String appid);



}
