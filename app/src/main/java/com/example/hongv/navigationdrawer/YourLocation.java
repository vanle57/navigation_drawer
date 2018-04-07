package com.example.hongv.navigationdrawer;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

/**
 * Created by hongv on 2/27/2018.
 */

public class YourLocation extends Fragment {
    View myView;
    private Spinner your_location_sp;
    private ArrayAdapter<String> location;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        myView = inflater.inflate(R.layout.your_location, container, false);
        return myView;
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        your_location_sp = getView().findViewById(R.id.location_spinner);
        location = new ArrayAdapter<String>(getActivity(), android.R.layout.simple_list_item_1, getResources().getStringArray(R.array.my_location));
        location.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        your_location_sp.setAdapter(location);
    }
}
