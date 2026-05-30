package com.example.mycardviewapp;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerView;
    CourseAdapter adapter;
    List<CourseModel> courseList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.recyclerView);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        courseList = new ArrayList<>();
        courseList.add(new CourseModel("Web Development", "Learn HTML, CSS, JavaScript from scratch!", "4.9", R.drawable.web));
        courseList.add(new CourseModel("AI & Machine Learning", "Master neural networks and deep learning!", "4.8", R.drawable.ai));
        courseList.add(new CourseModel("Cyber Security", "Ethical hacking and network protection!", "4.7", R.drawable.cyber));
        courseList.add(new CourseModel("Data Science", "Analyze data with Python and visualization!", "4.8", R.drawable.data));
        courseList.add(new CourseModel("Cloud Computing", "AWS, Azure and Google Cloud mastery!", "4.6", R.drawable.cloud));
        courseList.add(new CourseModel("Blockchain", "Build decentralized apps and smart contracts!", "4.5", R.drawable.blockchain));

        adapter = new CourseAdapter(this, courseList);
        recyclerView.setAdapter(adapter);
    }
}