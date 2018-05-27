package com.example.russell.swap4;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

public class SignupActivity extends AppCompatActivity {
    private Spinner genders;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.signup);

        loadGenders();

    }

    private void loadGenders() {
        genders = findViewById(R.id.genderSpinner);

        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(
                this, R.array.genders, android.R.layout.simple_spinner_item
        );

        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        genders.setAdapter(adapter);
    }
}
