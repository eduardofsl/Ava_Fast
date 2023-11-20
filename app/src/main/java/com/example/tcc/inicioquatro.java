package com.example.tcc;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class inicioquatro extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_inicioquatro);

        // Find the "Go to Next Page" button
        Button btnNext = findViewById(R.id.btn_4);

        // Set a click listener for the "Go to Next Page" button
        btnNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Create an Intent with the destination activity set to NextActivity.class
                Intent intent = new Intent(inicioquatro.this, welcome.class);

                // Call the startActivity() method to start the NextActivity
                startActivity(intent);
            }
        });

        // Find the "Go Back" button
        Button btnBack = findViewById(R.id.back3);

        // Set a click listener for the "Go Back" button
        btnBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Finish the current activity to go back to the previous page
                finish();
            }
        });
    }
}
