package com.example.minggu2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainLayoutActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_layout);
    }

    public void linear(View view) {
        Intent intent = new Intent(MainLayoutActivity.this, LinearLayout.class);
        startActivity(intent);
    }
    public void Relative(View view) {
        Intent intent = new Intent(MainLayoutActivity.this, RelativeLayout.class);
        startActivity(intent);
    }
    public void Constraint(View view) {
        Intent intent = new Intent(MainLayoutActivity.this, ConstraintLayout.class);
        startActivity(intent);
    }
    public void Frame(View view) {
        Intent intent = new Intent(MainLayoutActivity.this, FrameLayout.class);
        startActivity(intent);
    }
    public void Table(View view) {
        Intent intent = new Intent(MainLayoutActivity.this, TableLayout.class);
        startActivity(intent);
    }
    public void Material(View view) {
        Intent intent = new Intent(MainLayoutActivity.this,MaterialDesign.class);
        startActivity(intent);
    }
    public void ScrollV(View view) {
        Intent intent = new Intent(MainLayoutActivity.this,ScrollView.class);
        startActivity(intent);
    }
    public void ScrollVH(View view) {
        Intent intent = new Intent(MainLayoutActivity.this, ScrollViewHorizontal.class);
        startActivity(intent);
    }
}