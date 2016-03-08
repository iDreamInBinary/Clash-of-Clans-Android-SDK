package com.honycomb.cocsdk.coc.models;

/**
 * Created by anthonylipscomb on 2/18/16.
 */
public class LeagueItem {
    private long id;
    private String name;
    private IconURLsItem iconUrls;

    public IconURLsItem getIconUrls() {
        return iconUrls;
    }

    public String getName() {
        return name;
    }

    public long getId() {
        return id;
    }
}

/**
 {
 "id": 29000000,
 "name": "Unranked",
 "iconUrls": {
 "small": "https://api-assets.clashofclans.com/leagues/72/e--YMyIexEQQhE4imLoJcwhYn6Uy8KqlgyY3_kFV6t4.png",
 "tiny": "https://api-assets.clashofclans.com/leagues/36/e--YMyIexEQQhE4imLoJcwhYn6Uy8KqlgyY3_kFV6t4.png"
 }
 },
 */