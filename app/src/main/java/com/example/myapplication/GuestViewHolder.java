package com.example.myapplication;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import org.jetbrains.annotations.NotNull;

public class GuestViewHolder extends RecyclerView.ViewHolder {

    public ImageView GuestImage;
    public TextView Name;
    public TextView Age;
    public TextView Sex;



    public GuestViewHolder(@NotNull View itemView) {
        super(itemView);
        GuestImage = itemView.findViewById(R.id.guestimage);
        Name = itemView.findViewById(R.id.g_Name);
        Age = itemView.findViewById(R.id.age);
        Sex = itemView.findViewById((R.id.sex));
    }
}
