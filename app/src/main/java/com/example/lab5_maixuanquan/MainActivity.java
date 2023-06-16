package com.example.lab5_maixuanquan;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.lab5_maixuanquan.ex1.User;
import com.example.lab5_maixuanquan.ex1.UserViewAdapter;
import com.google.android.material.floatingactionbutton.FloatingActionButton;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private RecyclerView rcUserInfor;
    private FloatingActionButton btnChangeView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        rcUserInfor = findViewById(R.id.rcUserInfor);
        btnChangeView = findViewById(R.id.btnChangeView);
        btnChangeView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, MainActivity2.class);
                startActivity(intent);
            }
        });
        ArrayList<User> users = new ArrayList<>();

        User user = new User("quanmx", "Mai Xuan Quan", "quanmx@fsoft.com.vn");
        User user2 = new User("quanmxSE160052", "Mai Xuan Quan", "quan@gmail.com");
        User user3 = new User("hungmt", "Mai The Hung", "hungmt@gmail.com");
        User user4 = new User("hiepnh", "Nguyen Hong Hiep", "hiepnh@gmail.com");
        User user5 = new User("sonnt", "Nguyen Tien Son", "sonnt@gmail.com");
        User user6 = new User("ngonc", "Nguyen Cong Ngo", "ngonc@gmail.com");
        users.add(user);
        users.add(user2);
        users.add(user3);
        users.add(user4);
        users.add(user5);
        users.add(user6);
        UserViewAdapter adapter = new UserViewAdapter(users);
        rcUserInfor.setLayoutManager(new LinearLayoutManager(this));
        rcUserInfor.setAdapter(adapter);


    }
}