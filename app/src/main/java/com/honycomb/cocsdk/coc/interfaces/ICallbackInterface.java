package com.honycomb.cocsdk.coc.interfaces;

import com.honycomb.cocsdk.coc.models.ErrorItem;

/**
 * Created by anthonylipscomb on 2/17/16.
 */
public interface ICallbackInterface<T> {
    void callback(ErrorItem error, T data);
}
