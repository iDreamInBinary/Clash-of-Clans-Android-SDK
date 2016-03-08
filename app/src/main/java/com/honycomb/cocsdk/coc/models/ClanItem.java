package com.honycomb.cocsdk.coc.models;

/**
 * Created by anthonylipscomb on 2/17/16.
 */
public class ClanItem {
    private String tag;
    private String name;
    private String type;
    private BadgeURLItem badgeUrls;
    private String warFrequency;
    private LocationItem location;
    private int clanLevel;
    private int warWins;
    private int clanPoints;
    private int requiredTrophies;
    private int members;
    private ClanMemberItem[] memberList;

    public String getTag() {
        return tag;
    }

    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }

    public BadgeURLItem getBadgeUrls() {
        return badgeUrls;
    }

    public String getWarFrequency() {
        return warFrequency;
    }

    public int getClanLevel() {
        return clanLevel;
    }

    public int getWarWins() {
        return warWins;
    }

    public int getClanPoints() {
        return clanPoints;
    }

    public int getRequiredTrophies() {
        return requiredTrophies;
    }

    public int getMembers() {
        return members;
    }

    public LocationItem getLocation() {
        return location;
    }

    public ClanMemberItem[] getMemberList() {
        return memberList;
    }
}


/**

 {
 "tag": "#GPQQQUL",
 "name": "HIM",
 "type": "open",
 "badgeUrls": {
 "small": "https://api-assets.clashofclans.com/badges/70/1KR7anL6Dy9IRzgnZToMUV5OEVhxfQzJPfBOVCQ789E.png",
 "large": "https://api-assets.clashofclans.com/badges/512/1KR7anL6Dy9IRzgnZToMUV5OEVhxfQzJPfBOVCQ789E.png",
 "medium": "https://api-assets.clashofclans.com/badges/200/1KR7anL6Dy9IRzgnZToMUV5OEVhxfQzJPfBOVCQ789E.png"
 },
 "warFrequency": "unknown",
 "clanLevel": 1,
 "warWins": 0,
 "clanPoints": 929,
 "requiredTrophies": 1000,
 "members": 1
 }

 */