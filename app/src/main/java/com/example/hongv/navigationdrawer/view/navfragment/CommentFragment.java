package com.example.hongv.navigationdrawer.view.navfragment;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.hongv.navigationdrawer.R;

/**
 * Created by hongv on 4/25/2018.
 */

public class CommentFragment extends Fragment {
    View myView;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        myView = inflater.inflate(R.layout.fragment_nav_comment, container, false);
        return myView;
    }
}
