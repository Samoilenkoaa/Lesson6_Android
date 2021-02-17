package com.example.lesson6_android;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentTransaction;

import android.content.res.Configuration;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        FragmentTransaction fragmentTr = getSupportFragmentManager().beginTransaction();
        NoteDataClassFragment dataFragment = NoteDataClassFragment.newInstance();
        fragmentTr.replace(R.id.Fr_container, dataFragment);
        fragmentTr.commit();
    }

}