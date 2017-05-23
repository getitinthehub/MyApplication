package com.example.niels.myapplication.view;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.TextView;

import com.example.niels.myapplication.R;
import com.example.niels.myapplication.model.Status;

import java.util.List;

/**
 * Created for MyApplication
 * <p>
 * Started on 23-5-2017
 *
 * @author Thomas
 */

public class TweetAdapter extends ArrayAdapter<Status>
{
    
    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent)
    {
        if (convertView == null)
        {
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.list_item_tweet, parent, false);
        }
        
        Status status = getItem(position);
        
        TextView tvUserName = (TextView) convertView.findViewById(R.id.tv_username);
        TextView tvDate = (TextView) convertView.findViewById(R.id.tv_date);
        TextView tvContent = (TextView) convertView.findViewById(R.id.tv_content);
        Button btnFavCount = (Button) convertView.findViewById(R.id.btn_fav);
        Button btnRetweets = (Button) convertView.findViewById(R.id.btn_retweets);
        
        tvUserName.setText(status.getUser().getScreenName());
        tvDate.setText(status.getDate().toString());
        tvContent.setText(status.getText());
        btnFavCount.setText(status.getFavoriteCount());
        btnRetweets.setText(status.getRetweetCount());
        
        return convertView;
    }
    
    public TweetAdapter(@NonNull Context context, @NonNull List<Status> objects)
    {
        super(context, -1, objects);
    }
}
