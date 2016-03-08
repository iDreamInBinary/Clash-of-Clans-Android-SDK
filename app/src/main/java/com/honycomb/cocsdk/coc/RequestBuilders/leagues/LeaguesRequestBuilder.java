package com.honycomb.cocsdk.coc.RequestBuilders.leagues;

import com.honycomb.cocsdk.coc.RequestBuilders.ClashOfClansBaseRequestBuilder;
import com.honycomb.cocsdk.coc.models.LeagueResponseItem;

import java.util.Dictionary;

/**
 * Created by anthonylipscomb on 2/18/16.
 */
public class LeaguesRequestBuilder extends ClashOfClansBaseRequestBuilder<LeagueResponseItem> {
    @Override
    protected String getPath() {
        return "/leagues";
    }

    @Override
    protected Class<LeagueResponseItem> getType() {
        return LeagueResponseItem.class;
    }

    @Override
    protected Dictionary<String, String> getQueryParameters() {
        return null;
    }
}
