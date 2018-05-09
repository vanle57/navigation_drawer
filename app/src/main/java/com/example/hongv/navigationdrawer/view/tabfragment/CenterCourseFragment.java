package com.example.hongv.navigationdrawer.view.tabfragment;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;

import com.example.hongv.navigationdrawer.R;
import com.example.hongv.navigationdrawer.adapter.CourseAdapter;
import com.example.hongv.navigationdrawer.model.Course;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 * Activities that contain this fragment must implement the
 * {@link CenterCourseFragment.OnFragmentInteractionListener} interface
 * to handle interaction events.
 * Use the {@link CenterCourseFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class CenterCourseFragment extends Fragment {
    private CourseAdapter mCourseAdapter;
    private ArrayList<Course> mListCourseData;
    private ListView lvData;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_center_course, container, false);
    }

    private  void initView(){
        mCourseAdapter = new CourseAdapter(mListCourseData, getActivity());
        lvData = getView().findViewById(R.id.lv_cmnt);
        lvData.setAdapter(mCourseAdapter);
        mCourseAdapter.notifyDataSetChanged();
        lvData.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                //show dialog here
            }
        });

    }
    public  void  getData(){
        mListCourseData = new ArrayList<>();
        mListCourseData.add(new Course(1, "Khóa Beginner", 1, 1, "Dành cho người mới bắt đầu"));
        mListCourseData.add(new Course(2, "Khóa Communication", 1, 1, "Dành cho giao tiếp thông thường"));

    }
}
