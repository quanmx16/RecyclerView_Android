package com.example.lab5_maixuanquan.ex2;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.lab5_maixuanquan.R;

public class NewsViewHolder extends RecyclerView.ViewHolder {
    private ImageView image;
    private TextView tvTitle;
    private TextView tvSummary;
    private TextView tvCategory;

    public NewsViewHolder(@NonNull View itemView) {
        super(itemView);
        image = itemView.findViewById(R.id.ivImage);
        tvTitle = itemView.findViewById(R.id.tvTitle);
        tvSummary = itemView.findViewById(R.id.tvSummary);
        tvCategory = itemView.findViewById(R.id.tvCategory);
    }

    public ImageView getImage() {
        return image;
    }

    public void setImage(ImageView image) {
        this.image = image;
    }

    public TextView getTvTitle() {
        return tvTitle;
    }

    public void setTvTitle(TextView tvTitle) {
        this.tvTitle = tvTitle;
    }

    public TextView getTvSummary() {
        return tvSummary;
    }

    public void setTvSummary(TextView tvSummary) {
        this.tvSummary = tvSummary;
    }

    public TextView getTvCategory() {
        return tvCategory;
    }

    public void setTvCategory(TextView tvCategory) {
        this.tvCategory = tvCategory;
    }
}
