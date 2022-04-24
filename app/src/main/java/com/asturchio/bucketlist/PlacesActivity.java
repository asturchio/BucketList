package com.asturchio.bucketlist;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

public class PlacesActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_places);
        setupList();

        RecyclerView list = findViewById(R.id.recycler_view_places);

        Place[] places = {
                new Place("Rome","Located in Italy, home of the Pope!", R.drawable.italy),
                new Place("London","Located in England, heard they got a bridge", R.drawable.london),
                new Place("Paris","Located in France, they got towers and art", R.drawable.paris),
                new Place("Tokyo","Located in Japan, I heard they got paper buildings", R.drawable.tokyo),
                new Place("Washington DC","Located in the US, they got memorials and junk", R.drawable.washington)

        };

        PlacesAdapter adapter = new PlacesAdapter(places);

        list.setAdapter(adapter);
    }

    private void setupList() {
    }
}