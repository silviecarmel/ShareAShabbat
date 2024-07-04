package com.example.myapplication;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;
import java.util.List;

public class GuestAdapter  extends  RecyclerView.Adapter<GuestAdapter.GuestViewHolder> {

    List<Guest> Guests;

    public static class GuestViewHolder extends RecyclerView.ViewHolder {

        public ImageView GuestImage;
        public TextView Name;
        public TextView Age;
        public TextView Sex;

        public GuestViewHolder(@NotNull View itemView) {
            super(itemView);
            GuestImage = itemView.findViewById(R.id.g_Image);
            Name = itemView.findViewById(R.id.g_Name);
            Age = itemView.findViewById(R.id.g_Age);
            Sex = itemView.findViewById((R.id.g_Sex));
        }
    }

    public GuestAdapter() {
        super();
        Guests = new ArrayList<>();
        Guests.add(new Guest(R.drawable.avatar2,"Contact1",22, "F"));
        Guests.add(new Guest(R.drawable.avatar1,"Contact2",18,"M" ));
        Guests.add(new Guest(R.drawable.avatar6,"Contact3",27,"F" ));
        Guests.add(new Guest(R.drawable.avatar5,"Contact4",25,"M"));
        Guests.add(new Guest(R.drawable.avatar7,"Contact5",22,"M" ));

    }

    @NonNull
    @Override
    public GuestViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.guests,parent,false);
        return new GuestViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull GuestViewHolder holder, int position) {
        Guest guest = Guests.get(position);
        holder.GuestImage.setImageResource(guest.GuestImage);
        holder.Name.setText(guest.Name);
        holder.Age.setText(Integer.toString(guest.Age));
        holder.Sex.setText(guest.Sex);
    }

    @Override
    public int getItemCount() {
        return Guests.size();
    }

}