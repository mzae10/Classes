package com.tsofen.pcp.classes;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

/**
 * Created by Pcp on 06/01/2017.
 */

public class LessonsAdapter extends RecyclerView.Adapter<LessonsAdapter.MyViewHolder>
{


    private List<Lessons> lessonsList;

    public class MyViewHolder extends RecyclerView.ViewHolder {
        public TextView lecturer, subject, date;

        public MyViewHolder(View view) {
            super(view);
            lecturer = (TextView) view.findViewById(R.id.lecturer);
            subject = (TextView) view.findViewById(R.id.subject);
        }
    }


    public LessonsAdapter(List<Lessons> lessonsList) {
        this.lessonsList = lessonsList;
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.lesson_list_row, parent, false);

        return new MyViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {
        Lessons lesson = lessonsList.get(position);
        holder.lecturer.setText(lesson.getLecturer());
        holder.subject.setText(lesson.getSubject());

    }

    @Override
    public int getItemCount() {
        return lessonsList.size();
    }
}

