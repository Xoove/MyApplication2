package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        String newText = getIntent().getStringExtra("mainActivityText");
        TextView textView = findViewById(R.id.textView2);
        textView.setText(newText);
        Intent resultIntent = new Intent();
        resultIntent.putExtra("resultKey", newText);
        setResult(RESULT_OK, resultIntent);
        finish();
    }
}
