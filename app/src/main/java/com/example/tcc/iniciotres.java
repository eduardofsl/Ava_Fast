package com.example.tcc;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class iniciotres extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_iniciotres);

        // Find the "Go to Next Page" button
        Button btnNext = findViewById(R.id.btn_3);

        // Set a click listener for the "Go to Next Page" button
        btnNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Create an Intent with the destination activity set to NextActivity.class
                Intent intent = new Intent(iniciotres.this, inicioquatro.class);

                // Call the startActivity() method to start the NextActivity
                startActivity(intent);
            }
        });

        // Find the "Go Back" button
        Button btnBack = findViewById(R.id.back2);

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
