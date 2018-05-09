package com.example.hongv.navigationdrawer.view.navfragment;

import android.app.Fragment;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.ListView;

import com.example.hongv.navigationdrawer.CenterActivity;
import com.example.hongv.navigationdrawer.R;
import com.example.hongv.navigationdrawer.adapter.CenterAdapter;
import com.example.hongv.navigationdrawer.model.Center;

import java.util.ArrayList;

/**
 * Created by hongv on 4/25/2018.
 */

public class CategoryFragment extends Fragment {
    View myView;

    private CenterAdapter mCenterAdapter;
    private ArrayList<Center> mlistCenterData;
    private ListView lvData;
    private ImageView imageAddCenter;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        myView = inflater.inflate(R.layout.fragment_nav_category, container, false);
        return myView;
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        getData();
        initView();
    }

    private  void initView(){
        mCenterAdapter = new CenterAdapter(mlistCenterData, getActivity());
        lvData = getView().findViewById(R.id.lvData);
        lvData.setAdapter(mCenterAdapter);
        mCenterAdapter.notifyDataSetChanged();
        lvData.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent intent = new Intent(getActivity(), CenterActivity.class);
                startActivity(intent);
            }
        });

    }

    private void getData(){
        mlistCenterData = new ArrayList<>();
        mlistCenterData.add(new Center(0,"EziEnghlish", "Anh văn giao tiếp","DaNang", "0123456789", R.drawable.ezienghlish, 5));
        mlistCenterData.add(new Center(1,"Galazy", "Anh văn giao tiếp","DaNang", "0123456789", R.drawable.galaxy, 5));
        mlistCenterData.add(new Center(2,"Geos", "Anh văn giao tiếp","DaNang", "0123456789", R.drawable.geos, 5));
        mlistCenterData.add(new Center(3,"Thái Bình Dương", "Anh văn giao tiếp","DaNang", "0123456789", R.drawable.tbd, 5));
        mlistCenterData.add(new Center(4,"World Win ", "Anh văn giao tiếp","DaNang", "0123456789", R.drawable.workdwin, 5));
        mlistCenterData.add(new Center(5,"EziEnghlish", "Anh văn giao tiếp","DaNang", "0123456789", R.drawable.ezienghlish, 5));
        mlistCenterData.add(new Center(6,"Galazy", "Anh văn giao tiếp","DaNang", "0123456789", R.drawable.galaxy, 5));
        mlistCenterData.add(new Center(7,"Geos", "Anh văn giao tiếp","DaNang", "0123456789", R.drawable.geos, 5));
        mlistCenterData.add(new Center(8,"Thái Bình Dương", "Anh văn giao tiếp","DaNang", "0123456789", R.drawable.tbd, 5));
        mlistCenterData.add(new Center(9,"World Win ", "Anh văn giao tiếp","DaNang", "0123456789", R.drawable.workdwin, 5));
    }
}
