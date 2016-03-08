package com.honycomb.cocsdk.coc.RequestBuilders.locations;

import com.honycomb.cocsdk.coc.RequestBuilders.ClashOfClansBaseRequestBuilder;
import com.honycomb.cocsdk.coc.models.SearchResponseItem;

import java.util.Dictionary;

/**
 * Created by anthonylipscomb on 2/18/16.
 */
public class ClanRankingsRequestBuilder extends ClashOfClansBaseRequestBuilder<SearchResponseItem> {

    private long mID;
    private RankingID mRanking;

    public enum RankingID {
        CLAN("clan"),
        PLAYERS("players");

        private String ranking;

        private RankingID(String ranking) {
            this.ranking = ranking;
        }

        public String getRanking() {
            return ranking;
        }
    }

    public ClanRankingsRequestBuilder(long locationId, RankingID ranking) {
        this.mID = locationId;
        this.mRanking = ranking;
    }

    @Override
    protected String getPath() {
        return String.format("/locations/%s/rankings/%s", String.valueOf(mID), mRanking.getRanking());
    }

    @Override
    protected Class<SearchResponseItem> getType() {
        return SearchResponseItem.class;
    }

    @Override
    protected Dictionary<String, String> getQueryParameters() {
        return null;
    }
}
