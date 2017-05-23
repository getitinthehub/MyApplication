package com.example.niels.myapplication.activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.FrameLayout;
import android.widget.ListView;

import com.example.niels.myapplication.R;
import com.example.niels.myapplication.fragment.TweetListFragment;
import com.example.niels.myapplication.model.Status;
import com.example.niels.myapplication.view.TweetAdapter;

import org.json.JSONException;
import org.json.JSONObject;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity
{
    
    private FrameLayout flTweets;
    private ListView lvTweets;
    
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        flTweets = (FrameLayout) findViewById(R.id.fl_tweets);
        TweetListFragment list = new TweetListFragment();
        
        getFragmentManager().beginTransaction()
                            .add(R.id.fl_tweets, list)
                            .commit();
        TweetAdapter adapter = new TweetAdapter(this, new ArrayList<Status>());
        list.setListAdapter(adapter);
    }
    
}
