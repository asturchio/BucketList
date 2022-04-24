package com.asturchio.bucketlist;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class PlacesAdapter extends RecyclerView.Adapter<PlacesAdapter.PlacesViewHolder> {

    private Place[] places;

    public PlacesAdapter(Place[] places) {

        this.places = places;
    }

    @Override
    public int getItemCount(){

        return places.length;
    }

    @NonNull
    @Override
    public PlacesViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int ViewType) {

        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_places, parent, false);
        return new PlacesViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull PlacesViewHolder holder, int position) {

        holder.bind(places[position],position);

    }

    static class PlacesViewHolder extends RecyclerView.ViewHolder {

        private ImageView appImage;
        private TextView appTitle;
        private TextView appDescription;


        public PlacesViewHolder(@NonNull View itemView) {
            super(itemView);
            appImage = itemView.findViewById(R.id.image_view_places_icon);
            appTitle = itemView.findViewById(R.id.text_view_places_title);
            appDescription = itemView.findViewById(R.id.text_view_places_description);
        }

        public void bind(Place place, int position) {

            appTitle.setText(place.name);
            appDescription.setText(place.description);
            appImage.setImageResource(place.image);


        }
    }
}
