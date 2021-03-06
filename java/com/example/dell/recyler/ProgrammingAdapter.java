package com.example.dell.recyler;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.RecyclerView.ViewHolder;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

public class ProgrammingAdapter extends RecyclerView.Adapter<ProgrammingAdapter.ProgrammingViewHolder>{

   private String[] data;
    public ProgrammingAdapter(String[] data)
    {
    this.data = data;
    }

    @NonNull
    @Override
    public ProgrammingViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int i) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View view = inflater.inflate(R.layout.list_item_layout, parent, false);
        return new ProgrammingViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ProgrammingViewHolder viewHolder, int i) {
        String title = data[i];
        viewHolder.txt.setText(title);

    }

    @Override
    public int getItemCount() {
        return data.length;
    }
public class ProgrammingViewHolder extends ViewHolder{

        ImageView m;
        TextView txt;

    public ProgrammingViewHolder(@NonNull View itemView) {
        super(itemView);
        m = itemView.findViewById(R.id.ImgIcon);
        txt = itemView.findViewById(R.id.txt);
    }
}
}