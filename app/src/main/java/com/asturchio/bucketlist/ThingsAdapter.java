package com.asturchio.bucketlist;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class ThingsAdapter extends RecyclerView.Adapter<ThingsAdapter.ThingsViewHolder>{

    private Thing[] things;

    public ThingsAdapter(Thing[] things) {
        this.things = things;
    }

    @Override
    public int getItemCount(){
        return things.length;
    }

    @NonNull
    @Override
    public ThingsViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int ViewType) {

        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_things, parent, false);
        return new ThingsAdapter.ThingsViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ThingsViewHolder holder, int position) {

        holder.bind(things[position],position);
    }

    static class ThingsViewHolder extends RecyclerView.ViewHolder {

        private ImageView appImage;
        private TextView appTitle;
        private TextView appDescription;


        public ThingsViewHolder(@NonNull View itemView) {
            super(itemView);
            appImage = itemView.findViewById(R.id.image_view_things_icon);
            appTitle = itemView.findViewById(R.id.text_view_things_title);
            appDescription = itemView.findViewById(R.id.text_view_things_description);
        }

        public void bind(Thing thing, int position) {



            appTitle.setText(thing.name);
            appDescription.setText(thing.description);
            appImage.setImageResource(thing.image);


        }
    }
}
