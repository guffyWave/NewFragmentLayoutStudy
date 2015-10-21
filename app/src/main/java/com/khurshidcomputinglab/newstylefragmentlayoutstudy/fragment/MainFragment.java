package com.khurshidcomputinglab.newstylefragmentlayoutstudy.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.khurshidcomputinglab.newstylefragmentlayoutstudy.R;

/**
 * Created by gufran on 10/21/15.
 */
public class MainFragment extends Fragment {


    public static MainFragment newInstance() {
        MainFragment fragment = new MainFragment();
        return fragment;
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        final View mainView
                = inflater.inflate(R.layout.fragment_main, container, false);
        return  mainView;
    }
}
