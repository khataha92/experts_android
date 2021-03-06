package com.example.android.resto.Interfaces;

import com.example.android.resto.Models.PopularCitiesResponse;
import com.example.android.resto.Models.Restaurant;
import com.example.android.resto.Models.RestaurantsResponse;

import retrofit2.Call;
import retrofit2.http.GET;

/**
 * Created by android on 10/10/2017.
 */

public interface Request {

    @GET("getPopularCities")
    Call<PopularCitiesResponse> getPopularCities();
    @GET("getRestaurantList")
    Call<RestaurantsResponse> getRestaurantList();

    @GET("getRestaurantDetails")
    Call<Restaurant> getRestaurantDetails();
}
