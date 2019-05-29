package com.example.application.dynfrag;


import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;

public class frag1 extends android.support.v4.app.Fragment {
    ImageView imageView;


    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.frag1,container,false);
        imageView=(ImageView)view.findViewById(R.id.ronal);
        imageView.setImageResource(R.drawable.cris);

        return view;
    }

}

