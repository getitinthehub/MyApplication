package com.example.niels.myapplication.model;

/**
 * @author Thomas
 * @author Niels
 */

public class User {
    private String id, name, screenName, location, description, backgroundColor, backgroundImageUrl, profileImageUrl, profileBannerUrl, language;
    private Boolean isProtected, Following, FollowRequestSend, isQuoteStatus;
    private int followersCount, friendsCount, listedCount, statusesCount, retweetCount, favoriteCount;

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getScreenName() {
        return screenName;
    }
}
