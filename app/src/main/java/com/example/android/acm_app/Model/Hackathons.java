package com.example.android.acm_app.Model;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class Hackathons {
    @SerializedName("array")
    List<Event> events;

    public List<Event> getEvents() {
        return events;
    }

}
