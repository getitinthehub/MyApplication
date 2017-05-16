package com.example.niels.myapplication;

import java.util.Date;

/**
 * Created by Niels on 9-5-2017.
 */

public class Status {
    private String text, inReplyToStatusId, inReplyToUserId;
    private int retweetCount, favoriteCount;
    private boolean retweeted, favorited;
    private Date date;
    private User user;
}
