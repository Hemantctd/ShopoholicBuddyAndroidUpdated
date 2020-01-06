package com.shopoholicbuddy.fragments;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.shopoholicbuddy.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class CancelledChequeFragment extends Fragment {


    public CancelledChequeFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v= inflater.inflate(R.layout.fragment_cancelled_cheque, container, false);
        return v;
    }

}
