package com.honycomb.cocsdk.coc.models;

/**
 * Created by anthonylipscomb on 2/17/16.
 */
public class ErrorItem {
    private int status;
    private String reason;
    private String message;

    public int getStatus() {
        return status;
    }

    public String getReason() {
        return reason;
    }

    public String getMessage() {
        return message;
    }

    public void setStatus(int statusCode) {
        this.status = statusCode;
    }
}
