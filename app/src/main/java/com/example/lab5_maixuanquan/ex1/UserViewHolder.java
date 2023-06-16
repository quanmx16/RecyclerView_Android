package com.example.lab5_maixuanquan.ex1;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.lab5_maixuanquan.R;

public class UserViewHolder extends RecyclerView.ViewHolder {
    private TextView tvUsername;
    private TextView tvFullName;
    private TextView tvEmail;

    public UserViewHolder(@NonNull View itemView) {
        super(itemView);
        tvUsername = itemView.findViewById(R.id.tvUsername);
        tvFullName = itemView.findViewById(R.id.tvFullName);
        tvEmail = itemView.findViewById(R.id.tvEmail);
    }

    public TextView getTvUsername() {
        return tvUsername;
    }

    public void setTvUsername(TextView tvUsername) {
        this.tvUsername = tvUsername;
    }

    public TextView getTvFullName() {
        return tvFullName;
    }

    public void setTvFullName(TextView tvFullName) {
        this.tvFullName = tvFullName;
    }

    public TextView getTvEmail() {
        return tvEmail;
    }

    public void setTvEmail(TextView tvEmail) {
        this.tvEmail = tvEmail;
    }
}
