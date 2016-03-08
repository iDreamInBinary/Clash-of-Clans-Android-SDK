package com.honycomb.cocsdk.coc;

import android.app.Application;

import com.android.volley.RequestQueue;
import com.android.volley.toolbox.Volley;
import com.honycomb.cocsdk.coc.RequestBuilders.clans.ClanDetailsRequestBuilder;
import com.honycomb.cocsdk.coc.RequestBuilders.clans.ClanMembersRequestBuilder;
import com.honycomb.cocsdk.coc.RequestBuilders.clans.SearchRequestBuilder;
import com.honycomb.cocsdk.coc.RequestBuilders.leagues.LeaguesRequestBuilder;
import com.honycomb.cocsdk.coc.RequestBuilders.locations.ClanRankingsRequestBuilder;
import com.honycomb.cocsdk.coc.RequestBuilders.locations.LocationInformationRequestBuilder;
import com.honycomb.cocsdk.coc.RequestBuilders.locations.LocationsRequestBuilder;

/**
 * Created by anthonylipscomb on 2/15/16.
 */
public class ClashOfClansAPI {
    private static final String TAG = ClashOfClansAPI.class.getCanonicalName();
    private static ClashOfClansAPI sCocAPI;

    private static RequestQueue mRequestQueue;
    private static String mApiToken;

    private ClashOfClansAPI(Application application, String token) {
        this.mRequestQueue = Volley.newRequestQueue(application);
        this.mApiToken = token;
    }

    public static void initialize(Application appContext, String apiToken) {
        sCocAPI = new ClashOfClansAPI(appContext, apiToken);
    }

    /**
     * Clans
     */
    public static SearchRequestBuilder searchClans() {
        return new SearchRequestBuilder();
    }

    public static ClanMembersRequestBuilder clanMembers(String clanTag) {
        return new ClanMembersRequestBuilder(clanTag);
    }

    public static ClanDetailsRequestBuilder clanDetails(String clanTag) {
        return new ClanDetailsRequestBuilder(clanTag);
    }

    /**
     * Locations
     */
    public static LocationsRequestBuilder locations() {
        return new LocationsRequestBuilder();
    }

    public static LocationInformationRequestBuilder locationInformation(long locationID) {
        return new LocationInformationRequestBuilder(locationID);
    }

    public static ClanRankingsRequestBuilder rankingsRequestBuilder(long locationID, ClanRankingsRequestBuilder.RankingID rankingID) {
        return new ClanRankingsRequestBuilder(locationID, rankingID);
    }

    /**
     * Leagues
     */

    public static LeaguesRequestBuilder leagues() {
        return new LeaguesRequestBuilder();
    }

    public static RequestQueue getRequestQueue() {
        return mRequestQueue;
    }

    public static String getApiToken() {
        return mApiToken;
    }
}
