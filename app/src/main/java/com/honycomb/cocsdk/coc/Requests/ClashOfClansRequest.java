package com.honycomb.cocsdk.coc.Requests;

/**
 * Created by anthonylipscomb on 2/17/16.
 */
public class ClashOfClansRequest<T> extends ClashOfClansBaseRequest<T> {
    public ClashOfClansRequest(Class<T> type, String url) {
        super(url, type);
    }
}