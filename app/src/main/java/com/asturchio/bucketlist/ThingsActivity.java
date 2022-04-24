package com.asturchio.bucketlist;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

public class ThingsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_things);

        RecyclerView list = findViewById(R.id.recycler_view_things);

        Thing[] things = {
                new Thing("Juggle","Throw things in the air and not drop them", R.drawable.juggle),
                new Thing("Fly","Any method of flight is acceptable", R.drawable.fly),
                new Thing("Code","Trying to become a world class coder", R.drawable.code),
                new Thing("Run","Get in shape enough to run", R.drawable.run)

        };

        ThingsAdapter adapter = new ThingsAdapter(things);

        list.setAdapter(adapter);
    }
}