package com.example.russell.swap4;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    //private ImageButton imageButtonCreateJob;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //initizalizeBtn();
        final ImageButton imageButtonCreateJob = findViewById(R.id.imageButtonCreateJob);

        System.out.println(imageButtonCreateJob);
        imageButtonCreateJob.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                Intent intent = new Intent(MainActivity.this, JobCreate.class);
                startActivity(intent);
                //whatever to do
            }
        });


        final Button testSignupViewBtn = findViewById(R.id.testSignupView);
        testSignupViewBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                setContentView(R.layout.signup);
            }
        });
    }



    public void initizalizeBtn(){
        String buttonID = "imageButtonCreateJob";
        int resourceID = getResources().getIdentifier(buttonID, "id", getPackageName());
        ImageButton b = ((ImageButton) findViewById(resourceID));
    }

}
