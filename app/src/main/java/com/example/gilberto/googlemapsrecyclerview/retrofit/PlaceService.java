package com.example.gilberto.googlemapsrecyclerview.retrofit;

import com.example.gilberto.googlemapsrecyclerview.Places;

import retrofit2.Call;
import retrofit2.http.GET;

/**
 * Created by Gilberto on 22/10/2016.
 */

public interface PlaceService {
    @GET("places")
    Call<Places>getPlaces();
}
