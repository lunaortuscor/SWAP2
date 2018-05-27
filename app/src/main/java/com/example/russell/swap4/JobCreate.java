package com.example.russell.swap4;

import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
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
    private Button friendButon;
    private Button careButton;
    private EditText dateText;
    private EditText startTimeText;
    private EditText endTimeText;
    private EditText raceText;
    private EditText ageText;
    private EditText addressText;

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.create_job);

        final Button friendButton = findViewById(R.id.friendButton);
        final Button careButton = findViewById(R.id.careButton);
        friendButton.setOnClickListener(new View.OnClickListener(){
           public void onClick(View v){
               ColorDrawable btnColor = (ColorDrawable) friendButton.getBackground();
               int colorID = btnColor.getColor();
               if(colorID == 0xffaaaaaa){
                   friendButton.setBackgroundColor(0xffffff00);
               } else {
                   friendButton.setBackgroundColor(0xffaaaaaa);
               }

           }
        });

        careButton.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                ColorDrawable btnColor = (ColorDrawable) careButton.getBackground();
                int colorID = btnColor.getColor();
                if(colorID == 0xffaaaaaa){
                    careButton.setBackgroundColor(0xffffff00);
                } else {
                    careButton.setBackgroundColor(0xffaaaaaa);
                }
            }
        });

        save.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });
    }
}
