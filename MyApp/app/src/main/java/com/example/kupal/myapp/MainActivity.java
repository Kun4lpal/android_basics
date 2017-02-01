package com.example.kupal.myapp;

import android.content.Intent;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


    Toolbar toolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        toolbar = (Toolbar) findViewById(R.id.tool_bar);
        setSupportActionBar(toolbar);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater menuInflater = getMenuInflater();
        menuInflater.inflate(R.menu.menu_main,menu);
        return  true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int res_id = item.getItemId();
        if(res_id == R.id.task3){
            Intent int4 = new Intent(this,third.class);
            startActivity(int4);
            Toast.makeText(getApplicationContext(), "You selected Task 3", Toast.LENGTH_SHORT).show();
        }else if (res_id == R.id.task4){
            Intent intsearch = new Intent(this,Task_4.class);
            startActivity(intsearch);
            Toast.makeText(getApplicationContext(), "You selected Task 4 ", Toast.LENGTH_SHORT).show();
        }else if(res_id == R.id.task2){
            Intent int2 = new Intent(this,second.class);
            startActivity(int2);
            Toast.makeText(getApplicationContext(),"You selected Task 2",Toast.LENGTH_SHORT).show();
        }else if(res_id == R.id.task1) {
            Intent int1 = new Intent(this, MainActivity.class);
            startActivity(int1);
            Toast.makeText(getApplicationContext(), "You selected Task 1", Toast.LENGTH_SHORT).show();
        }

        return super.onOptionsItemSelected(item);
    }
}
