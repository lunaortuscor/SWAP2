package com.example.russell.swap4;

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
    private ImageButton imageButtonCreateJob;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initizalizeBtn();

        imageButtonCreateJob.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                //whatever to do
            }
        });
    }



    public void initizalizeBtn(){
        String buttonID = "imageButtonCreateJob";
        int resourceID = getResources().getIdentifier(buttonID, "id", getPackageName());
        ImageButton b = ((ImageButton) findViewById(resourceID));
    }

}
