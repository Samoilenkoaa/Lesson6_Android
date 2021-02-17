package com.example.lesson6_android;

import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


public class DetaileFragment extends Fragment {
    TextView name;
    TextView description;
    TextView date;


    public static DetaileFragment newInstance(String name, String description, String date) {
        DetaileFragment fragment = new DetaileFragment();
        Bundle args = new Bundle();
        args.putString("name", name);
        args.putString("description", description);
        args.putString("date", date);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_detaile, container, false);
        initView(view);
        return view;
    }

    private void initView(View view) {
        name = view.findViewById(R.id.name);
        description = view.findViewById(R.id.description);
        date = view.findViewById(R.id.date);
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        if (getArguments() != null){
            name.setText(getArguments().getString("name"));
            description.setText(getArguments().getString("description"));
            date.setText(getArguments().getString("date"));

        }
    }
}