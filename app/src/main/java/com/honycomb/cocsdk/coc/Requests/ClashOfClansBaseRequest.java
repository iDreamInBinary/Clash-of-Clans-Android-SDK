package com.honycomb.cocsdk.coc.Requests;

import android.support.annotation.NonNull;
import android.util.Log;

import com.android.volley.AuthFailureError;
import com.android.volley.Request;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;
import com.google.gson.Gson;
import com.honycomb.cocsdk.coc.ClashOfClansAPI;
import com.honycomb.cocsdk.coc.interfaces.ICallbackInterface;
import com.honycomb.cocsdk.coc.models.ErrorItem;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by anthonylipscomb on 2/17/16.
 */
public abstract class ClashOfClansBaseRequest<T> {
    public static final String TAG = ClashOfClansBaseRequest.class.getCanonicalName();

    private Class<T> mType;
    private String mURL;

    public ClashOfClansBaseRequest(@NonNull String url, @NonNull Class<T> type) {
        this.mURL = url;
        this.mType = type;
    }

    public void execute(final ICallbackInterface<T> callback) {
        Log.d(TAG, "Sending request = " + mURL);

        // Request a string response from the provided URL.
        StringRequest stringRequest = new StringRequest(Request.Method.GET, mURL,
                new Response.Listener<String>() {
                    @Override
                    public void onResponse(String response) {
                        Gson gson = new Gson();
                        callback.callback(null, gson.fromJson(response, mType));
                    }
                }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {
                String data = new String(error.networkResponse.data);
                ErrorItem errorItem = new Gson().fromJson(data, ErrorItem.class);
                errorItem.setStatus(error.networkResponse.statusCode);

                callback.callback(errorItem, null);
            }
        }) {
            @Override
            public Map<String, String> getHeaders() throws AuthFailureError {
                HashMap<String, String> headers = new HashMap<>();
                headers.putAll(super.getHeaders());
                headers.put("Authorization", "Bearer " + ClashOfClansAPI.getApiToken());

                return headers;
            }
        };

        // Add the request to the RequestQueue.
        ClashOfClansAPI.getRequestQueue().add(stringRequest);
    }
}
