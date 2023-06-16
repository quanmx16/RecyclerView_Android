package com.example.lab5_maixuanquan;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.ContentResolver;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

import com.example.lab5_maixuanquan.ex2.News;
import com.example.lab5_maixuanquan.ex2.NewsViewAdapter;
import com.google.android.material.floatingactionbutton.FloatingActionButton;

import java.util.ArrayList;

public class MainActivity2 extends AppCompatActivity {
    private RecyclerView newsRecyclerView;
    private ArrayList<News> news;
    private FloatingActionButton btnChangeView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        newsRecyclerView = findViewById(R.id.rcNewsList);
        btnChangeView = findViewById(R.id.btnChangeView);
        btnChangeView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity2.this, MainActivity.class);
                startActivity(intent);
            }
        });
        initializeData();
        NewsViewAdapter adapter = new NewsViewAdapter(news);
        newsRecyclerView.setAdapter(adapter);
        newsRecyclerView.setLayoutManager(new LinearLayoutManager(this));
        newsRecyclerView.addItemDecoration(new DividerItemDecoration(this, DividerItemDecoration.HORIZONTAL));
    }

    private void initializeData() {
        news = new ArrayList<>();
        Uri imageUri = (new Uri.Builder())
                .scheme(ContentResolver.SCHEME_ANDROID_RESOURCE)
                .authority(getResources().getResourcePackageName(R.drawable.samsungs23))
                .appendPath(getResources().getResourceTypeName(R.drawable.samsungs23))
                .appendPath(getResources().getResourceEntryName(R.drawable.samsungs23))
                .build();
        News samsung = new News(imageUri, "Samsung Galaxy S23 Ultra 256GB", "Factory Unlocked Android Smartphone, 256GB, 200MP Camera, Night Mode, Long Battery Life, S Pen, US Version, 2023, Phantom Black", "Android");
        imageUri = (new Uri.Builder())
                .scheme(ContentResolver.SCHEME_ANDROID_RESOURCE)
                .authority(getResources().getResourcePackageName(R.drawable.iphone14))
                .appendPath(getResources().getResourceTypeName(R.drawable.iphone14))
                .appendPath(getResources().getResourceEntryName(R.drawable.iphone14))
                .build();
        News iphone = new News(imageUri, "Apple iPhone 14, 256GB", "The iPhone 14 models come in blue, purple, midnight, starlight, and (PRODUCT)RED, plus Apple added a new yellow color that was recently released in March", "iOS");
        news.add(samsung);
        news.add(iphone);
    }
}