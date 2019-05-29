package com.example.application.dynfrag;


import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.RatingBar;
import android.widget.TextView;
import android.widget.Toast;

public class frag2 extends android.support.v4.app.Fragment {
        RatingBar r;
        Button t;
        TextView rated;

        @Nullable
        @Override
        public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
            View view = inflater.inflate(R.layout.frag2, container, false);
            rated = (TextView) view.findViewById(R.id.tx);
            r = (RatingBar) view.findViewById(R.id.rb);
            t = (Button) view.findViewById(R.id.tv);
            addonClick();
            ratingchange();
            return view;
        }

        public void addonClick() {
            r.setOnRatingBarChangeListener(new RatingBar.OnRatingBarChangeListener() {
                @Override
                public void onRatingChanged(RatingBar ratingBar, float rating, boolean fromUser) {
                    rated.setText(String.valueOf(rating));
                }
            });
        }

        public void ratingchange() {
            t.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Toast.makeText(getActivity(), String.valueOf(r.getRating()), Toast.LENGTH_SHORT).show();
                }
            });

    }
}
