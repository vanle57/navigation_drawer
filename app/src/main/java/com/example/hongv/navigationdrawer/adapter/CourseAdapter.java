package com.example.hongv.navigationdrawer.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.example.hongv.navigationdrawer.R;
import com.example.hongv.navigationdrawer.model.Course;

import java.util.ArrayList;

/**
 * Created by hongv on 4/25/2018.
 */

public class CourseAdapter extends BaseAdapter{
    ArrayList<Course> listData;
    LayoutInflater inflater;
    TextView txtCourse, txtCourseContent;
    public CourseAdapter (ArrayList<Course> listData, Context context){
        this.listData = listData;
        inflater = (LayoutInflater) context.getSystemService(context.LAYOUT_INFLATER_SERVICE);

    }

    public ArrayList<Course> getListData(){
        return listData;
    }

    private void setListData(ArrayList<Course> listData){
        this.listData = listData;
    }


    @Override
    public int getCount(){
        return listData.size();
    }

    @Override
    public Course getItem(int position){
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
        txtCourse = (TextView) convertView.findViewById(R.id.txtCourse);
        txtCourseContent = (TextView)convertView.findViewById(R.id.txtCourseContent);

        Course course = getItem(position);
        txtCourse.setText(course.getNameCourse());
        txtCourseContent.setText(course.getInformation());

        return convertView;

    }
}
