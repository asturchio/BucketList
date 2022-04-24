package com.asturchio.bucketlist;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setupClickListeners();


    }

    private void setupClickListeners() {
        CardView placesCard = findViewById(R.id.card_view_places);
        CardView thingsCard = findViewById(R.id.card_view_things);

        placesCard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent placesActivityIntent = new Intent(MainActivity.this, PlacesActivity.class);
                startActivity(placesActivityIntent);
            }
        });

        thingsCard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent thingsActivityIntent = new Intent(MainActivity.this, ThingsActivity.class);
                startActivity(thingsActivityIntent);
            }
        });
    }
}