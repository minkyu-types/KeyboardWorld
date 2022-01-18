package com.architecture.keyboardworld.ui.artisan;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.architecture.keyboardworld.R;

import java.util.ArrayList;

public class ArtisanAdapter extends RecyclerView.Adapter<ArtisanAdapter.ViewHolder> {
    private ArrayList<String> artisanData = null;

    public class ViewHolder extends RecyclerView.ViewHolder {
        TextView artisanName;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            artisanName = itemView.findViewById(R.id.text);
        }
    }

    ArtisanAdapter(ArrayList<String> list){
        artisanData = list;
    }

    @NonNull
    @Override
    public ArtisanAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        Context context = parent.getContext();
        LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);

        View view = inflater.inflate(R.layout.item_thumbnail, parent, false);
        ArtisanAdapter.ViewHolder vh = new ArtisanAdapter.ViewHolder(view);

        return vh;
    }

    @Override
    public void onBindViewHolder(@NonNull ArtisanAdapter.ViewHolder holder, int position) {
        String text = artisanData.get(position);
        holder.artisanName.setText(text);
    }

    @Override
    public int getItemCount() {
        return artisanData.size();
    }
}
