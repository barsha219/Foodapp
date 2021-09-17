package com.example.foodapp;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager.widget.PagerAdapter;

import java.util.List;
import java.util.zip.Inflater;

public class FoodAdapter extends RecyclerView.Adapter<FoodAdapter.FoodViewHolder> {

    List<FoodModel> list;
    Context context;

    public FoodAdapter(List<FoodModel> list, Context context) {
        this.list = list;
        this.context = context;
    }

    @NonNull
    @Override
    public FoodViewHolder onCreateViewHolder(@NonNull  ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View view = inflater.inflate(R.layout.food_item_layout, parent, false);
        return new FoodViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull  FoodViewHolder holder, int position) {

        holder.food_image.setImageResource(list.get(position).food_image);
        holder.food_name.setText(list.get(position).food_name);
        holder.food_price.setText(list.get(position).food_price);
        holder.view.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(context, Food_detail_activity.class);
                intent.putExtra("food_name", list.get(position).getFood_name());
                intent.putExtra("food_price", list.get(position).getFood_price());
                intent.putExtra("food_image", list.get(position).getFood_image());
                intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                context.startActivity(intent);

            }
        });
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class FoodViewHolder extends RecyclerView.ViewHolder{

        ImageView food_image;
        TextView food_price, food_name;

        View view;

        public FoodViewHolder(View itemV) {
            super(itemV);
            view = itemV;

            food_image = itemV.findViewById(R.id.food_image);
            food_price = itemV.findViewById(R.id.food_price);
            food_name = itemV.findViewById(R.id.food_name);

        }
    }


}
