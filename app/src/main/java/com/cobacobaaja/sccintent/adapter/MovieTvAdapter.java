package com.cobacobaaja.sccintent.adapter;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.cobacobaaja.sccintent.item.MovieTvitems;

import java.util.ArrayList;


public class MovieTvAdapter extends RecyclerView.Adapter<MovieTvAdapter.MovieTvViewHolder> {
    Context mContext;
    ArrayList<MovieTvitems>mMovieTVitems = new ArrayList<>();

    @NonNull
    @Override
    public MovieTvAdapter.MovieTvViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return null;
    }

    @Override
    public void onBindViewHolder(@NonNull MovieTvAdapter.MovieTvViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return mMovieTVitems.size();
    }

    public class MovieTvViewHolder extends RecyclerView.ViewHolder {
        public MovieTvViewHolder(@NonNull View itemView) {
            super(itemView);
        }
    }
}
