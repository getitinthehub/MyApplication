package com.example.niels.myapplication.model;

import org.json.JSONException;
import org.json.JSONObject;

/**
 * @author Thomas
 * @author Niels
 */

public class User {
    private String id, name, screenName, location, description, backgroundColor, backgroundImageUrl, profileImageUrl, profileBannerUrl, language;
    private Boolean isProtected, following, followRequestSend, isQuoteStatus;
    private int followersCount, friendsCount, listedCount, statusesCount, retweetCount, favoriteCount;

    public String toJson(){
        try {
            JSONObject jsonObject = new JSONObject();
            jsonObject.put("screenName", screenName);
            jsonObject.put("name", name);
            jsonObject.put("id", id);
            jsonObject.put("location", location);
            jsonObject.put("description", description);
            jsonObject.put("backgroundColor", backgroundColor);
            jsonObject.put("backgroundImageUrl", backgroundImageUrl);
            jsonObject.put("profileImageUrl", profileImageUrl);
            jsonObject.put("profileBannerUrl", profileBannerUrl);
            jsonObject.put("language", language);
            jsonObject.put("isProtected", isProtected);
            jsonObject.put("following", following);
            jsonObject.put("followRequestSend", followRequestSend);
            jsonObject.put("isQuoteStatus", isQuoteStatus);
            jsonObject.put("followersCount", followersCount);
            jsonObject.put("friendsCount", friendsCount);
            jsonObject.put("listedCount", listedCount);
            jsonObject.put("statusesCount", statusesCount);
            jsonObject.put("retweetCount", retweetCount);
            jsonObject.put("favoriteCount", favoriteCount);

            return jsonObject.toString();

        }catch (JSONException jsone){
            jsone.printStackTrace();
        }
        return null;
    }
}
