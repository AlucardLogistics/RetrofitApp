package com.example.sadic.retrofitapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import com.example.sadic.retrofitapp.model.Weather;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {
    private static final String TAG = "MainActivity";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        Log.d(TAG, "onCreate: started");
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//        ApiService apiServiceCity = RetrofitInstance.getRetrofitInstanceTraveler()
//                .create(ApiService.class);

//        Call<Seat> seatCall = apiServiceCity.getSeats(102);
//        seatCall.enqueue(new Callback<Seat>() {
//            @Override
//            public void onResponse(Call<Seat> call, Response<Seat> response) {
//                Log.d(TAG, "onResponse: seats: " + response.body().getSeatinformation());
//            }
//
//            @Override
//            public void onFailure(Call<Seat> call, Throwable t) {
//                Log.d(TAG, "onFailure: FAIL: " + t.getMessage());
//
//            }
//        });

        ApiService apiServiceWeather = RetrofitInstance.getRetrofitWeatherInstance()
                .create(ApiService.class);

        Call<Weather> weatherCall = apiServiceWeather
                .getWeatherInfo("Chicago", "bb72d2c2b6850337b36813263b0d37ee");
        weatherCall.enqueue(new Callback<Weather>() {
            @Override
            public void onResponse(Call<Weather> call, Response<Weather> response) {
                Log.d(TAG, "onResponse: weatherMiracle: " + response.body());
            }

            @Override
            public void onFailure(Call<Weather> call, Throwable t) {
                Log.d(TAG, "onFailure: FAIL: " + t.getMessage());

            }
        });

//        Call<City> cityCall = apiServiceCity.getCity();
//        Log.d(TAG, "onCreate: cityCall");
//        cityCall.enqueue(new Callback<City>() {
//            @Override
//            public void onResponse(Call<City> call, Response<City> response) {
//                Log.d(TAG, "onResponse: city: " + response.body().getCity());
//            }
//
//            @Override
//            public void onFailure(Call<City> call, Throwable t) {
//                Log.d(TAG, "onFailure: FAIL: " + t.getMessage());
//
//            }
//        });


//        ApiService apiService = RetrofitInstance.getRetrofitInstance()
//                .create(ApiService.class);
//
//       Call<UserPage> call = apiService.getBook(1);
//       call.enqueue(new Callback<UserPage>() {
//           @Override
//           public void onResponse(Call<UserPage> call, Response<UserPage> response) {
//               Log.d(TAG, "onResponse: UserPage data: " + response.body().toString());
//               UserPage userPage = response.body();
//               List<DataItem> dataItem = userPage.getData();
//               Log.d(TAG, "onResponse: USERPAGE total Pages: " + userPage.getTotalPages());
//               for(DataItem data : userPage.getData()){
//                   Log.d(TAG, "onResponse: data items: " + data);
//               }
//
//           }
//
//           @Override
//           public void onFailure(Call<UserPage> call, Throwable t) {
//               Log.d(TAG, "onFailure: " + t.getMessage());
//           }
//       });
//
//        ApiService apiServiceOne = RetrofitInstance.getRetrofitInstanceOne()
//                .create(ApiService.class);
//
//        Log.d(TAG, "onCreate: ***********************************************array URL");
        
        //BASE_URL based
//        Call<List<Album>> listAlbumCall = apiServiceOne.getPhotos();
//        listAlbumCall.enqueue(new Callback<List<Album>>() {
//            @Override
//            public void onResponse(Call<List<Album>> call, Response<List<Album>> response) {
//                Log.d(TAG, "onResponse: " + response.body().toString());
//            }
//
//            @Override
//            public void onFailure(Call<List<Album>> call, Throwable t) {
//                Log.d(TAG, "onFailure: " + t.getMessage());
//            }
//        });

    }
}
