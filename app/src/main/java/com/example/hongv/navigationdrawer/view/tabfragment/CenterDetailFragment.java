package com.example.hongv.navigationdrawer.view.tabfragment;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.example.hongv.navigationdrawer.R;
import com.example.hongv.navigationdrawer.ReviewActivity;


public class CenterDetailFragment extends Fragment {
    Button btnComment;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_center_detail, container, false);
    }

    public void initView () {
        btnComment = getView().findViewById(R.id.btn_comment);
        btnComment.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), ReviewActivity.class);
                startActivity(intent);
            }
        });
    }
}
