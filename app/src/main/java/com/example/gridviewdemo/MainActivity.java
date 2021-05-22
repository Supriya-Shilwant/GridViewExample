package com.example.gridviewdemo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.GridView;

public class MainActivity extends AppCompatActivity {
    GridView gridView;
    int icons[] = {R.drawable.html, R.drawable.java, R.drawable.jsp,
            R.drawable.php, R.drawable.python, R.drawable.sql,
            R.drawable.android, R.drawable.android, R.drawable.cpp};
    String names[] = {"HTML", "JAVA", "JSP", "PHP", "PYTHON", "SQL", "ANDROID", "ANGULAR", "C++"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setTitle("GridView Demo");

        gridView = (GridView) findViewById(R.id.data_grid);
        gridAdapter obj = new gridAdapter(this, names, icons);
        gridView.setAdapter(obj);
    }
}