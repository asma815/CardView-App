package com.example.mycardviewapp;

import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

public class CourseDetailActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_course_detail);

        TextView title = findViewById(R.id.detailTitle);
        TextView desc = findViewById(R.id.detailDesc);
        TextView rating = findViewById(R.id.detailRating);
        ImageView image = findViewById(R.id.detailImage);
        Button enrollBtn = findViewById(R.id.enrollDetailBtn);

        String courseTitle = getIntent().getStringExtra("title");
        String courseDesc = getIntent().getStringExtra("desc");
        String courseRating = getIntent().getStringExtra("rating");
        int courseImage = getIntent().getIntExtra("image", 0);

        title.setText(courseTitle);
        desc.setText(courseDesc);
        rating.setText("⭐ " + courseRating);
        image.setImageResource(courseImage);

        enrollBtn.setOnClickListener(v ->
                Toast.makeText(this, "Enrolled in " + courseTitle + "!", Toast.LENGTH_SHORT).show()
        );
    }
}