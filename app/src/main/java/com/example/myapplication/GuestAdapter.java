package com.example.myapplication;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class GuestAdapter  extends  RecyclerView.Adapter<GuestViewHolder> {

    List<Guest> Guests;

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
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.activity_main,parent,false);
        GuestViewHolder viewHolder = new GuestViewHolder(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull GuestViewHolder holder, int position) {
        Guest guest = Guests.get(position);
        holder.GuestImage.setImageResource(guest.GuestImage);
        holder.Name.setText(guest.Name);
        holder.Age.setText(guest.Age);
        holder.Sex.setText(guest.Sex);


    }

    @Override
    public int getItemCount() {
        return Guests.size();
    }

}