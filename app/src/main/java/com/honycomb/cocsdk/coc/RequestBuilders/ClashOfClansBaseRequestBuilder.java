package com.honycomb.cocsdk.coc.RequestBuilders;

import com.honycomb.cocsdk.coc.Constants;
import com.honycomb.cocsdk.coc.Requests.ClashOfClansRequest;

import java.util.Dictionary;
import java.util.Enumeration;

/**
 * Created by anthonylipscomb on 2/17/16.
 */
public abstract class ClashOfClansBaseRequestBuilder<T> {

    protected abstract String getPath();
    protected abstract Class<T> getType();
    protected abstract Dictionary<String, String> getQueryParameters();

    public ClashOfClansRequest<T> build() {
        StringBuilder url = new StringBuilder(Constants.BASE_URL);
        url.append(getPath());

        if(getQueryParameters() != null && getQueryParameters().size() > 0) {
            url.append("?");

            Enumeration<String> keys = getQueryParameters().keys();

            while(keys.hasMoreElements()) {
                String key = keys.nextElement();
                url.append(key);
                url.append("=");
                url.append(getQueryParameters().get(key));

                if (keys.hasMoreElements()) {
                    url.append("&");
                }
            }
        }

        return new ClashOfClansRequest<>(getType(), url.toString());
    }
}
