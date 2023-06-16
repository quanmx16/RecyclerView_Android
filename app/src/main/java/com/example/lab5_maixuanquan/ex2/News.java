package com.example.lab5_maixuanquan.ex2;

import android.net.Uri;

public class News {
    private Uri imageUri;
    private String title;
    private String summary;
    private String Category;

    public News() {
    }

    public News(Uri imageUri, String title, String summary, String category) {
        this.imageUri = imageUri;
        this.title = title;
        this.summary = summary;
        Category = category;
    }

    public Uri getImageUri() {
        return imageUri;
    }

    public void setImageUri(Uri imageUri) {
        this.imageUri = imageUri;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getSummary() {
        return summary;
    }

    public void setSummary(String summary) {
        this.summary = summary;
    }

    public String getCategory() {
        return Category;
    }

    public void setCategory(String category) {
        Category = category;
    }
}
