package com.example.lesson6_android;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;

public class DetaileActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detaile);
        FragmentTransaction fragmentTr = getSupportFragmentManager().beginTransaction();
        DetaileFragment dataFragment = DetaileFragment.newInstance(
                getIntent().getStringExtra("name"),
                getIntent().getStringExtra("description"),
                getIntent().getStringExtra("date")
        );
        fragmentTr.replace(R.id.detaileContainer, dataFragment);
        fragmentTr.commit();
    }
}