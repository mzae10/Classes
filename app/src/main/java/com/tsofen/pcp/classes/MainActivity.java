package com.tsofen.pcp.classes;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private List<Lessons> lessonsList = new ArrayList<>();
    private RecyclerView recyclerView;
    private LessonsAdapter lAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        //  setSupportActionBar(toolbar);

        recyclerView = (RecyclerView) findViewById(R.id.ReView);

        lAdapter = new LessonsAdapter(lessonsList);

        recyclerView.setHasFixedSize(true);
        RecyclerView.LayoutManager mLayoutManager = new LinearLayoutManager(getApplicationContext());
        recyclerView.setLayoutManager(mLayoutManager);
        recyclerView.addItemDecoration(new DividerItemDecoration(this, LinearLayoutManager.VERTICAL));
        recyclerView.setItemAnimator(new DefaultItemAnimator());
        recyclerView.setAdapter(lAdapter);

        recyclerView.addOnItemTouchListener(new RecyclerTouchListener(getApplicationContext(), recyclerView, new ClickListener() {
            @Override
            public void onClick(View view, int position) {
                Lessons lesson = lessonsList.get(position);
                Toast.makeText(getApplicationContext(), lesson.getLecturer() + " is selected!", Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onLongClick(View view, int position) {

            }
        }));

        prepareLessons();
    }

    private void prepareLessons() {
        Lessons lesson = new Lessons("Or Essl", "Android");
        lessonsList.add(lesson);

        lesson = new Lessons("Elan", "HTML");
        lessonsList.add(lesson);

        lesson = new Lessons("Elena", "Design Pattern");
        lessonsList.add(lesson);

        lesson = new Lessons("Or Essel", "Git");
        lessonsList.add(lesson);

        lesson = new Lessons("Or Essel", "Introduction to android studio");
        lessonsList.add(lesson);

        lesson = new Lessons("Elena", "Data Structeurs");
        lessonsList.add(lesson);

        lesson = new Lessons("Elan", "Java-Script");
        lessonsList.add(lesson);

        lesson = new Lessons("Elan", "CSS");
        lessonsList.add(lesson);

        lesson = new Lessons("Elena", "System I/O");
        lessonsList.add(lesson);

        lesson = new Lessons("Elan", "J-Query");
        lessonsList.add(lesson);

        lesson = new Lessons("Islam", "CV");
        lessonsList.add(lesson);

        lesson = new Lessons("Elena", "Multi-Threading");
        lessonsList.add(lesson);

        lesson = new Lessons("Or Essel", "Navigation Between Layouts");
        lessonsList.add(lesson);

        lesson = new Lessons("Elena", "Nested Classes");
        lessonsList.add(lesson);

        lesson = new Lessons("Elan", "Introduction to web programming");
        lessonsList.add(lesson);
        lesson = new Lessons("Islam", "CV");
        lessonsList.add(lesson);

        lesson = new Lessons("Elena", "Multi-Threading");
        lessonsList.add(lesson);

        lesson = new Lessons("Or Essel", "Navigation Between Layouts");
        lessonsList.add(lesson);

        lesson = new Lessons("Elena", "Nested Classes");
        lessonsList.add(lesson);

        lesson = new Lessons("Elan", "Introduction to web programming");
        lessonsList.add(lesson);
    }

}