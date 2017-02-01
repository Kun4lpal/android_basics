package com.example.kupal.myapp;

import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.widget.SeekBar;
import android.widget.TextView;

public class Task_4 extends AppCompatActivity {
    ViewPager viewPager;
    movies adaptar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {


        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_task_4);

        viewPager = (ViewPager) findViewById(R.id.view_pager);
        adaptar = new movies(this);
        viewPager.setAdapter(adaptar);


    }
}