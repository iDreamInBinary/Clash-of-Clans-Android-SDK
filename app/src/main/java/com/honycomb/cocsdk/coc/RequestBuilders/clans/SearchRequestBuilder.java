package com.honycomb.cocsdk.coc.RequestBuilders.clans;

import com.honycomb.cocsdk.coc.Constants;
import com.honycomb.cocsdk.coc.RequestBuilders.ClashOfClansBaseRequestBuilder;
import com.honycomb.cocsdk.coc.models.SearchResponseItem;

import java.util.Dictionary;
import java.util.Hashtable;

/**
 * Created by anthonylipscomb on 2/17/16.
 */
public class SearchRequestBuilder extends ClashOfClansBaseRequestBuilder<SearchResponseItem> {

    private Hashtable<String, String> mParams;

    public enum WarFrequency {
        ALWAYS("always"),
        MORE_THAN_ONCE_PER_WEEK("moreThanOncePerWeek"),
        ONCE_PER_WEEK("oncePerWeek"),
        LESS_THAN_ONCE_PER_WEEK("lessThanOncePerWeek"),
        NEVER("never"),
        UNKNOWN("unknown");

        private String warFrequency;

        WarFrequency(String frequency) {
            warFrequency = frequency;
        }

        String getWarFrequency() {
            return warFrequency;
        }
    }

    public SearchRequestBuilder() {
        mParams = new Hashtable<>();
    }

    private void addParam(String key, String value) {
        mParams.put(key, value);
    }

    public SearchRequestBuilder withName(String name) {
        addParam(Constants.NAME_KEY, name);
        return this;
    }

    public SearchRequestBuilder withWarFrequency(WarFrequency frequency) {
        addParam(Constants.WAR_FREQUENCY_KEY, frequency.getWarFrequency());
        return this;
    }

    public SearchRequestBuilder locationId(int id) {
        addParam(Constants.LOCATION_ID_KEY, String.valueOf(id));
        return this;
    }

    public SearchRequestBuilder minMembers(int min) {
        addParam(Constants.MIN_MEMBERS_KEY, String.valueOf(min));
        return this;
    }

    public SearchRequestBuilder maxMembers(int max) {
        addParam(Constants.MAX_MEMBERS_KEY, String.valueOf(max));
        return this;
    }

    public SearchRequestBuilder minClanPoints(int min) {
        addParam(Constants.MIN_CLAN_POINTS_KEY, String.valueOf(min));
        return this;
    }

    public SearchRequestBuilder minClanLevel(int min) {
        addParam(Constants.MIN_CLAN_LEVEL_KEY, String.valueOf(min));
        return this;
    }

    public SearchRequestBuilder limt(int limit) {
        addParam(Constants.LIMIT_KEY, String.valueOf(limit));
        return this;
    }

    public SearchRequestBuilder after(int afterIndex) {
        addParam(Constants.AFTER_KEY, String.valueOf(afterIndex));
        return this;
    }

    public SearchRequestBuilder before(int beforeIndex) {
        addParam(Constants.BEFORE_KEY, String.valueOf(beforeIndex));
        return this;
    }

    @Override
    protected String getPath() {
        return "/clans";
    }

    @Override
    protected Class<SearchResponseItem> getType() {
        return SearchResponseItem.class;
    }

    @Override
    protected Dictionary<String, String> getQueryParameters() {
        return mParams;
    }
}
