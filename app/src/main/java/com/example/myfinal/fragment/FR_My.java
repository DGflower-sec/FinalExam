package com.example.myfinal.fragment;
import android.content.Intent;
import android.os.Bundle;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import com.example.myfinal.R;



public class FR_My extends Fragment {

    private TextView tv_username;
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View  view = inflater.inflate(R.layout.fragment_my, container,false);
        Bundle bundle = getArguments();
        String name = bundle.getString("username");
        tv_username = view.findViewById(R.id.tv_myusername);
        tv_username.setText(name);
        return view;

    }


}