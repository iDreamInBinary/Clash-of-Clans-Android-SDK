package com.honycomb.cocsdk.coc.models;

/**
 * Created by anthonylipscomb on 2/17/16.
 */
public class SearchResponseItem {
    private ClanItem[] items;
    private PagingItem paging;

    public ClanItem[] getItems() {
        return items;
    }

    public PagingItem getPaging() {
        return paging;
    }
}
