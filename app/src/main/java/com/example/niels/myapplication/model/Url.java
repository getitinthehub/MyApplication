package com.example.niels.myapplication.model;

import org.json.JSONException;
import org.json.JSONObject;

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

public class Url {
    private String shortUrl, displayUrl;
    
    public String toJson() {
        JSONObject jsonObject = new JSONObject();
        try
        {
            jsonObject.put("shortUrl", shortUrl);
            jsonObject.put("displayUrl", displayUrl);
            return jsonObject.toString();
        }
        catch (JSONException e)
        {
            e.printStackTrace();
        }
        return null;
    }
}
