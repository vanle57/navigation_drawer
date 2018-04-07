package com.example.hongv.navigationdrawer.tabfragment;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.hongv.navigationdrawer.R;

public class CenterFragmentCourse extends Fragment {

    public CenterFragmentCourse() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_center_fragment_course, container, false);
    }


}
