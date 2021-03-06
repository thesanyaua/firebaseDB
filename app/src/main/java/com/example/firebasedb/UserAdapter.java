package com.example.firebasedb;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.firebase.ui.database.FirebaseRecyclerAdapter;
import com.firebase.ui.database.FirebaseRecyclerOptions;

import java.util.List;
import java.util.zip.Inflater;


public class UserAdapter extends FirebaseRecyclerAdapter<User,UserAdapter.myviewholder>
{
    public UserAdapter(@NonNull FirebaseRecyclerOptions<User> options) {
        super(options);
    }

    @Override
    protected void onBindViewHolder(@NonNull myviewholder holder, int position, @NonNull User user)
    {
        holder.nameView.setText("Nмя: " + user.getName());
        holder.surnameView.setText("Фамилия: " + user.getSacname());
        holder.emailView.setText("Email: " + user.getEmail());

    }

    @NonNull
    @Override
    public myviewholder onCreateViewHolder(@NonNull ViewGroup parent, int viewType)
    {
        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.list_item,parent,false);
        return new myviewholder(view);
    }

    class myviewholder extends RecyclerView.ViewHolder
    {

        TextView nameView,surnameView,emailView;
        public myviewholder(@NonNull View itemView)
        {
            super(itemView);
            nameView=itemView.findViewById(R.id.name1);
            surnameView=itemView.findViewById(R.id.sacname1);
            emailView=itemView.findViewById(R.id.email1);
        }
    }
}
