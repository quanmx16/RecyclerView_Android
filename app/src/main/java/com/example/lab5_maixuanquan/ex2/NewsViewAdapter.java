package com.example.lab5_maixuanquan.ex2;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.lab5_maixuanquan.R;

import java.util.List;

public class NewsViewAdapter extends RecyclerView.Adapter<NewsViewHolder> {
    private List<News> newsList;

    public NewsViewAdapter(List<News> newsList) {
        this.newsList = newsList;
    }

    @NonNull
    @Override
    public NewsViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View view = inflater.inflate(R.layout.news_item, parent, false);
        return new NewsViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull NewsViewHolder holder, int position) {
        News news = newsList.get(position);
        holder.getImage().setImageURI(news.getImageUri());
        holder.getTvTitle().setText(news.getTitle());
        holder.getTvCategory().setText(news.getCategory());
        String summary = news.getSummary();
        if (summary.length() > 100) {
            summary = summary.substring(0, 97) + "...";
        }
        holder.getTvSummary().setText(summary);
    }

    @Override
    public int getItemCount() {
        return newsList != null ? newsList.size() : 0;
    }
}
