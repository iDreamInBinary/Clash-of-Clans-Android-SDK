package com.honycomb.cocsdk.coc.RequestBuilders.clans;

import com.honycomb.cocsdk.coc.RequestBuilders.ClashOfClansBaseRequestBuilder;
import com.honycomb.cocsdk.coc.models.ClanItem;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.Dictionary;

/**
 * Created by anthonylipscomb on 2/17/16.
 */
public class ClanDetailsRequestBuilder extends ClashOfClansBaseRequestBuilder<ClanItem> {

    private String mClanTag;

    public ClanDetailsRequestBuilder(String clanTag) {
        mClanTag = clanTag;
    }

    @Override
    protected String getPath() {
        try {
            return String.format("/clans/%s", URLEncoder.encode(mClanTag, "UTF8"));
        } catch (UnsupportedEncodingException e) {
            return String.format("/clans/%s", URLEncoder.encode(mClanTag));
        }
    }

    @Override
    protected Class<ClanItem> getType() {
        return ClanItem.class;
    }

    @Override
    protected Dictionary<String, String> getQueryParameters() {
        return null;
    }
}
