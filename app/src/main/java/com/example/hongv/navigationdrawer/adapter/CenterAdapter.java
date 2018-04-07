package com.example.hongv.navigationdrawer.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;


import com.example.hongv.navigationdrawer.R;
import com.example.hongv.navigationdrawer.model.Center;

import java.util.ArrayList;

/**
 * Created by Administrator on 03/03/2018.
 */

public class CenterAdapter extends BaseAdapter{
    ArrayList<Center> listData;
    LayoutInflater inflater;
    ImageView imgAvatar;
    TextView txtNameCenter, txtAddressCenter, txtPhoneCenter, txtQuality;
    public CenterAdapter (ArrayList<Center> listData, Context context){
        this.listData = listData;
        inflater = (LayoutInflater) context.getSystemService(context.LAYOUT_INFLATER_SERVICE);

    }

    public ArrayList<Center>  getListData(){
        return listData;
    }

    private void setListData(ArrayList<Center> listData){
        this.listData = listData;
    }


    @Override
    public int getCount(){
        return listData.size();
    }

    @Override
    public Center getItem(int position){
        return listData.get(position);
    }

    @Override
    public long getItemId(int position){
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent){
        if (convertView == null) {
            convertView = inflater.inflate(R.layout.item_listview,null);
        }
        imgAvatar = (ImageView) convertView.findViewById(R.id.imgAvatar);
        txtNameCenter = (TextView) convertView.findViewById(R.id.txtCenTerName);
        txtAddressCenter = (TextView) convertView.findViewById(R.id.txtCenterAddress);
        txtPhoneCenter= (TextView) convertView.findViewById(R.id.txtCenterPhone);
        txtQuality =(TextView) convertView.findViewById(R.id.txtCenTerName);

        Center center = getItem(position);
//        imgAvatar.setImageResource(R.drawable.ezienghlish);????
        txtNameCenter.setText(center.getNameCenter().toString());
        txtAddressCenter.setText(center.getAddress().toString());
        txtPhoneCenter.setText(center.getPhone().toString());

        return convertView;

    }


}
