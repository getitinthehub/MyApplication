package com.example.niels.myapplication;

import com.example.niels.myapplication.model.User;

import org.json.JSONException;
import org.json.JSONObject;

/**
 * Created by Niels on 16-5-2017.
 */

public class JsonUtil {
    public String toJson(User user){
        try {
            JSONObject jsonObject = new JSONObject();
            jsonObject.put("screen_name", user.getScreenName());
            jsonObject.put("name", user.getName());
            jsonObject.put("id", user.getId());
            //return jsonObject;

        }catch (JSONException jsone){
            System.out.println(jsone.getMessage());
        }
        return null;
    }
}
