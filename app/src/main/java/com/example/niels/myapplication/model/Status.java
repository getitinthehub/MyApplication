package com.example.niels.myapplication.model;

import org.json.JSONException;
import org.json.JSONObject;

import java.util.Date;

/**
 * Created for MyApplication
 * <p>
 * Started on 16-5-2017
 *
 * @author Thomas
 * @author Niels
 */

public class Status
{
    private String text, inReplyToStatusId, inReplyToUserId;
    private int retweetCount, favoriteCount;
    private boolean retweeted, favorited;
    private Date date;
    private User user;
    
    public String getText()
    {
        return text;
    }
    
    public int getRetweetCount()
    {
        return retweetCount;
    }
    
    public int getFavoriteCount()
    {
        return favoriteCount;
    }
    
    public boolean isRetweeted()
    {
        return retweeted;
    }
    
    public boolean isFavorited()
    {
        return favorited;
    }
    
    public Date getDate()
    {
        return date;
    }
    
    public User getUser()
    {
        return user;
    }
    
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
            return jsonObject.toString();
        }
        catch (JSONException e)
        {
            e.printStackTrace();
        }
        return null;
    }
}
