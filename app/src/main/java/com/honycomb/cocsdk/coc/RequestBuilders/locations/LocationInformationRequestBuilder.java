package com.honycomb.cocsdk.coc.RequestBuilders.locations;

import com.honycomb.cocsdk.coc.RequestBuilders.ClashOfClansBaseRequestBuilder;
import com.honycomb.cocsdk.coc.models.LocationItem;

import java.util.Dictionary;

/**
 * Created by anthonylipscomb on 2/18/16.
 */
public class LocationInformationRequestBuilder extends ClashOfClansBaseRequestBuilder<LocationItem> {

    private long mID;

    public LocationInformationRequestBuilder(long id) {
        this.mID = id;
    }

    @Override
    protected Dictionary<String, String> getQueryParameters() {
        return null;
    }

    @Override
    protected Class<LocationItem> getType() {
        return LocationItem.class;
    }

    @Override
    protected String getPath() {
        return String.format("/locations/%s", String.valueOf(mID));
    }
}
