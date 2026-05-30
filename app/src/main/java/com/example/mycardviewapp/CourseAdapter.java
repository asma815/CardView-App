package com.example.mycardviewapp;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;

public class CourseAdapter extends RecyclerView.Adapter<CourseAdapter.CourseViewHolder> {

    Context context;
    List<CourseModel> courseList;

    public CourseAdapter(Context context, List<CourseModel> courseList) {
        this.context = context;
        this.courseList = courseList;
    }

    @NonNull
    @Override
    public CourseViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.item_course, parent, false);
        return new CourseViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull CourseViewHolder holder, int position) {
        CourseModel course = courseList.get(position);
        holder.title.setText(course.getTitle());
        holder.desc.setText(course.getDescription());
        holder.rating.setText("⭐ " + course.getRating());
        holder.image.setImageResource(course.getImageRes());

        holder.enrollBtn.setOnClickListener(v -> {
            Intent intent = new Intent(context, CourseDetailActivity.class);
            intent.putExtra("title", course.getTitle());
            intent.putExtra("desc", course.getDescription());
            intent.putExtra("rating", course.getRating());
            intent.putExtra("image", course.getImageRes());
            context.startActivity(intent);
        });
    }

    @Override
    public int getItemCount() {
        return courseList.size();
    }

    public static class CourseViewHolder extends RecyclerView.ViewHolder {
        TextView title, desc, rating;
        ImageView image;
        Button enrollBtn;

        public CourseViewHolder(@NonNull View itemView) {
            super(itemView);
            title = itemView.findViewById(R.id.courseTitle);
            desc = itemView.findViewById(R.id.courseDesc);
            rating = itemView.findViewById(R.id.courseRating);
            image = itemView.findViewById(R.id.courseImage);
            enrollBtn = itemView.findViewById(R.id.enrollBtn);
        }
    }
}