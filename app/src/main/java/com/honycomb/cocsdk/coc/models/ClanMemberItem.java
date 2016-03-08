package com.honycomb.cocsdk.coc.models;

/**
 * Created by anthonylipscomb on 2/18/16.
 */
public class ClanMemberItem {
    private String name;
    private String role;
    private int expLevel;
    private LeagueItem league;
    private int trophies;
    private int clanRank;
    private int previousClanRank;
    private int donations;
    private int donationsReceived;

    public int getDonationsReceived() {
        return donationsReceived;
    }

    public int getDonations() {
        return donations;
    }

    public String getName() {
        return name;
    }

    public String getRole() {
        return role;
    }

    public int getExpLevel() {
        return expLevel;
    }

    public LeagueItem getLeague() {
        return league;
    }

    public int getTrophies() {
        return trophies;
    }

    public int getClanRank() {
        return clanRank;
    }

    public int getPreviousClanRank() {
        return previousClanRank;
    }
}
/**
 {
 "name": "tyu",
 "role": "leader",
 "expLevel": 69,
 "league": {
 "id": 29000000,
 "name": "Unranked",
 "iconUrls": {
 "small": "https://api-assets.clashofclans.com/leagues/72/e--YMyIexEQQhE4imLoJcwhYn6Uy8KqlgyY3_kFV6t4.png",
 "tiny": "https://api-assets.clashofclans.com/leagues/36/e--YMyIexEQQhE4imLoJcwhYn6Uy8KqlgyY3_kFV6t4.png"
 }
 },
 "trophies": 1460,
 "clanRank": 1,
 "previousClanRank": 1,
 "donations": 0,
 "donationsReceived": 0
 }
 */