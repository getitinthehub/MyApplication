package com.example.niels.myapplication.model;

import org.json.JSONException;
import org.json.JSONObject;

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

public class Status
{
    private String text, inReplyToStatusId, inReplyToUserId;
    private int retweetCount, favoriteCount;
    private boolean retweeted, favorited;
    private Date date;
    private User user;
    
    public String toJson()
    {
        JSONObject jsonObject = new JSONObject();
        try
        {
            jsonObject.put("text",text);
            jsonObject.put("inReplyToStatusId", inReplyToStatusId);
            jsonObject.put("inReplyToUserId", inReplyToUserId);
            jsonObject.put("retweetCount", retweetCount);
            jsonObject.put("favoriteCount", favoriteCount);
            jsonObject.put("retweeted", retweeted);
            jsonObject.put("favorited", favorited);
            jsonObject.put("date", date);
            jsonObject.put("user", user);
        }
        catch (JSONException e)
        {
            e.printStackTrace();
        }
        return jsonObject.toString();
    }
}
