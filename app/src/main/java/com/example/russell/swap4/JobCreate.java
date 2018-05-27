package com.example.russell.swap4;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.TextView;

public class JobCreate extends AppCompatActivity {
    private Button cancel;
    private Button save;
    private TextView textView1;
    private ImageButton photoButton;
    private EditText descriptionText;
    private EditText languageText;
    private EditText priceText;

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.create_job);
    }
}
