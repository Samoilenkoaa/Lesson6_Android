package com.example.lesson6_android;

import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.lesson6_android.dummy.DummyContent.DummyItem;

import java.util.ArrayList;
import java.util.List;

/**
 * {@link RecyclerView.Adapter} that can display a {@link DummyItem}.
 * TODO: Replace the implementation with code for your data type.
 */
public class MyNoteDataClassRecyclerViewAdapter extends RecyclerView.Adapter<MyNoteDataClassRecyclerViewAdapter.ViewHolder> {

    private ArrayList<NoteDataClass> mValues;
    NoteDataClassFragment fragment;

    public MyNoteDataClassRecyclerViewAdapter(ArrayList<NoteDataClass> items, NoteDataClassFragment fragment) {
        this.fragment = fragment;
        mValues = items;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.fragment_item, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(final ViewHolder holder, int position) {
        holder.name.setText(mValues.get(position).name);
        holder.date.setText(mValues.get(position).date);
        holder.itemView.setOnClickListener(v -> {
            fragment.onClickListItem(position);
        });
    }

    @Override
    public int getItemCount() {
        return mValues.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        TextView name;
        TextView date;

        public ViewHolder(View view) {
            super(view);
            name = view.findViewById(R.id.item_name);
            date = view.findViewById(R.id.item_date);

        }

    }
}