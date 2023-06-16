package com.example.lab5_maixuanquan.ex1;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.lab5_maixuanquan.R;

import java.util.List;

public class UserViewAdapter extends RecyclerView.Adapter<UserViewHolder> {

    private List<User> users;

    public UserViewAdapter(List<User> users) {
        this.users = users;
    }

    @NonNull
    @Override
    public UserViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        Context context = parent.getContext();
        LayoutInflater layoutInflater = LayoutInflater.from(context);

        View view = layoutInflater.inflate(R.layout.user_infor, parent, false);
        return new UserViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull UserViewHolder holder, int position) {
        holder.getTvUsername().setText(users.get(position).getUsername());
        holder.getTvFullName().setText(users.get(position).getFullName());
        holder.getTvEmail().setText(users.get(position).getEmail());
    }

    @Override
    public int getItemCount() {
        return users != null ? users.size() : 0;
    }
}
