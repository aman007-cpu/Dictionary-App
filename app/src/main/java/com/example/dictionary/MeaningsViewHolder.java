package com.example.dictionary;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class MeaningsViewHolder extends RecyclerView.ViewHolder {

   public TextView textView_partsofspeech;
     public RecyclerView recycler_definitions;
    public MeaningsViewHolder(@NonNull View itemView) {
        super(itemView);
        textView_partsofspeech = itemView.findViewById(R.id.textView_partsofSpeech);
        recycler_definitions = itemView.findViewById(R.id.recycler_definitions);
    }
}
