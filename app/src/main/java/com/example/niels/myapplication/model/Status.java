package com.example.niels.myapplication.model;

import java.util.Date;

/**
 * Status class
 *
 * @author Thomas
 * @author Niels
 */

public class Status {
    private String text, inReplyToStatusId, inReplyToUserId;
    private int retweetCount, favoriteCount;
    private boolean retweeted, favorited;
    private Date date;
    private User user;
}
