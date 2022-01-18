package com.architecture.keyboardworld.ui.keyboard;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.architecture.keyboardworld.R;

import java.util.ArrayList;

public class KeyboardAdapter extends RecyclerView.Adapter<KeyboardAdapter.ViewHolder> {
    private ArrayList<String> keyboardData = null;

    public class ViewHolder extends RecyclerView.ViewHolder {
        TextView keyboardName;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            keyboardName = itemView.findViewById(R.id.text);
        }
    }

    KeyboardAdapter(ArrayList<String> list){
        keyboardData = list;
    }

    @NonNull
    @Override
    public KeyboardAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        Context context = parent.getContext();
        LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);

        View view = inflater.inflate(R.layout.item_thumbnail, parent, false);
        KeyboardAdapter.ViewHolder vh = new KeyboardAdapter.ViewHolder(view);

        return vh;
    }

    @Override
    public void onBindViewHolder(@NonNull KeyboardAdapter.ViewHolder holder, int position) {
        String text = keyboardData.get(position);
        holder.keyboardName.setText(text);
    }

    @Override
    public int getItemCount() {
        return keyboardData.size();
    }
}