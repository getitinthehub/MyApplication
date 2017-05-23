package com.example.niels.myapplication.fragment;

import android.app.ListFragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.niels.myapplication.R;

/**
 * Created for MyApplication
 * <p>
 * Started on 23-5-2017<br>
 * Last changes made on 23-5-2017
 *
 * @author Thomas
 * @version 1.0
 */

public class TweetListFragment extends ListFragment
{
    public TweetListFragment() {}
    
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState)
    {
        View rootView = inflater.inflate(R.layout.fragment_list_tweets, container, false);
        return rootView;
    }
}
