package com.example.fragementation;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.widget.FrameLayout;

import com.example.fragementation.demo1.Fragmentone;

public class MainActivity extends AppCompatActivity {

    FrameLayout framelayout_one;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        framelayout_one=(FrameLayout) findViewById(R.id.framelayout_one);
        FragmentManager fm=getSupportFragmentManager();
        FragmentTransaction fragmentTransaction=FragmentManager.beginTransaction();
        fragmentTransation.add(R.id.framelayout_one,new Fragmentone());
        fragmentTransaction.commit();
    }
}