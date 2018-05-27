package com.example.russell.swap4;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

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
            }
        });


        final Button testSignupViewBtn = findViewById(R.id.testSignupView);
        testSignupViewBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent it = new Intent(MainActivity.this, SignupActivity.class);
                startActivity(it);
            }
        });
    }


}
