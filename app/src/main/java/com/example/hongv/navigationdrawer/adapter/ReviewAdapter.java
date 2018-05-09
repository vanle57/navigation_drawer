package com.example.hongv.navigationdrawer.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.hongv.navigationdrawer.R;
import com.example.hongv.navigationdrawer.model.Review;

import java.util.ArrayList;

/**
 * Created by hongv on 4/19/2018.
 */

public class ReviewAdapter extends BaseAdapter {
    ArrayList<Review> listData;
    LayoutInflater inflater;
    ImageView imgAvatar;
    TextView txtUserName, txtCommentContent, txtDanhgia;
    public ReviewAdapter (ArrayList<Review> listData, Context context){
        this.listData = listData;
        inflater = (LayoutInflater) context.getSystemService(context.LAYOUT_INFLATER_SERVICE);

    }

    public ArrayList<Review> getListData(){
        return listData;
    }

    private void setListData(ArrayList<Review> listData){
        this.listData = listData;
    }


    @Override
    public int getCount(){
        return listData.size();
    }

    @Override
    public Review getItem(int position){
        return listData.get(position);
    }

    @Override
    public long getItemId(int position){
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent){
        if (convertView == null) {
            convertView = inflater.inflate(R.layout.item_listview_comment,null);
        }
        imgAvatar = (ImageView) convertView.findViewById(R.id.imgAvatar);
        txtUserName = (TextView) convertView.findViewById(R.id.txtUserName);
        txtCommentContent = (TextView)convertView.findViewById(R.id.txtCommentContent);
        txtDanhgia =(TextView) convertView.findViewById(R.id.txtDanhgia);

        Review review = getItem(position);
        txtUserName.setText(String.valueOf(review.getIdUser()));
        txtCommentContent.setText(review.getContent());
        txtDanhgia.setText(String.valueOf(review.getQuanlity()));

        return convertView;

    }
}
