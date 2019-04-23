package com.example.android.acm_app;


import com.example.android.acm_app.Model.Event;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface MLHInterface {
    @GET("na-2019")
    Call<List<Event>> getEvents();
}
