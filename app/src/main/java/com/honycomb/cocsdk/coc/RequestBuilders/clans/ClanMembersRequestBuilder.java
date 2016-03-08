package com.honycomb.cocsdk.coc.RequestBuilders.clans;

import com.honycomb.cocsdk.coc.RequestBuilders.ClashOfClansBaseRequestBuilder;
import com.honycomb.cocsdk.coc.models.ClanMembersResponseItem;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.Dictionary;

/**
 * Created by anthonylipscomb on 2/17/16.
 */
public class ClanMembersRequestBuilder extends ClashOfClansBaseRequestBuilder<ClanMembersResponseItem> {

    private String mClanTag;

    public ClanMembersRequestBuilder(String clanTag) {
        this.mClanTag = clanTag;
    }

    @Override
    protected String getPath() {
        try {
            return String.format("/clans/%s/members", URLEncoder.encode(mClanTag, "UTF8"));
        } catch (UnsupportedEncodingException e) {
            return String.format("/clans/%s/members", URLEncoder.encode(mClanTag));
        }
    }

    @Override
    protected Class<ClanMembersResponseItem> getType() {
        return ClanMembersResponseItem.class;
    }

    @Override
    protected Dictionary<String, String> getQueryParameters() {
        return null;
    }
}
