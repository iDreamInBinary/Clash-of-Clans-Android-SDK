package com.honycomb.cocsdk.coc.RequestBuilders.locations;

import com.honycomb.cocsdk.coc.RequestBuilders.ClashOfClansBaseRequestBuilder;
import com.honycomb.cocsdk.coc.models.LocationsResponseItem;

import java.util.Dictionary;

/**
 * Created by anthonylipscomb on 2/18/16.
 */
public class LocationsRequestBuilder extends ClashOfClansBaseRequestBuilder<LocationsResponseItem> {
    @Override
    protected String getPath() {
        return "/locations";
    }

    @Override
    protected Class<LocationsResponseItem> getType() {
        return LocationsResponseItem.class;
    }

    @Override
    protected Dictionary<String, String> getQueryParameters() {
        return null;
    }
}
