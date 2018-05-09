package com.example.hongv.navigationdrawer.view.tabfragment;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;

import com.example.hongv.navigationdrawer.R;
import com.example.hongv.navigationdrawer.adapter.ReviewAdapter;
import com.example.hongv.navigationdrawer.model.Review;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 * Activities that contain this fragment must implement the
 * {@link CenterCommentFragment.OnFragmentInteractionListener} interface
 * to handle interaction events.
 * Use the {@link CenterCommentFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class CenterCommentFragment extends Fragment {
    private ReviewAdapter mReviewAdapter;
    private ArrayList<Review> mlistReviewData;
    private ListView lvData;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_center_course, container, false);
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        getData();
        initView();
    }

    private  void initView(){
        mReviewAdapter = new ReviewAdapter(mlistReviewData, getActivity());
        lvData = getView().findViewById(R.id.lv_cmnt);
        lvData.setAdapter(mReviewAdapter);
        mReviewAdapter.notifyDataSetChanged();
        lvData.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                //show dialog here
            }
        });

    }
    public  void  getData(){
        mlistReviewData = new ArrayList<>();
        mlistReviewData.add(new Review(1,1,1,"Tôi rất thích trung tâm", "12/12/2000",3));
        mlistReviewData.add(new Review(1,1,1,"Tôi rất thích trung tâm", "12/12/2000",3));
        mlistReviewData.add(new Review(1,1,1,"Tôi rất thích trung tâm", "12/12/2000",3));
        mlistReviewData.add(new Review(1,1,1,"Tôi rất thích trung tâm", "12/12/2000",3));

    }
}
