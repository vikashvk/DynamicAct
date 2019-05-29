package com.example.application.dynfrag;


import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.FrameLayout;


public class MainActivity extends AppCompatActivity {
    Button b1,b2;
    android.support.v4.app.Fragment f;
    android.support.v4.app.FragmentTransaction ft;
    android.support.v4.app.FragmentManager fm;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button b1 = (Button) findViewById(R.id.b1);
        Button b2 = (Button) findViewById(R.id.b2);


       b1.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               f=new frag1();
               AajaFragment(f);
           }
       });
       b2.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               f=new frag2();
               AajaFragment(f);
           }
       });

        }
        public void AajaFragment (Fragment fragment){
            fm = getSupportFragmentManager();
            ft = fm.beginTransaction();
            ft.replace(R.id.fl, f);
            ft.commit();
        }
    }

