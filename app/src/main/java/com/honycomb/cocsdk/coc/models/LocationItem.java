package com.honycomb.cocsdk.coc.models;

/**
 * Created by anthonylipscomb on 2/18/16.
 */
public class LocationItem {
    private long id;
    private String name;
    private boolean isCountry;

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public boolean isCountry() {
        return isCountry;
    }
}

/**
 {
 "id": 32000006,
 "name": "International",
 "isCountry": false
 }
 */