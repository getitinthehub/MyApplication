package com.example.niels.myapplication.model;

import java.util.Date;

/**
 * Created for MyApplication
 * <p>
 * Started on 16-5-2017<br>
 * Last changes made on 16-5-2017
 *
 * @author Thomas
 * @author Niels
 * @version 1.0
 */

public class Status {
    private String text, inReplyToStatusId, inReplyToUserId;
    private int retweetCount, favoriteCount;
    private boolean retweeted, favorited;
    private Date date;
    private User user;
}
