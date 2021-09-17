package com.example.foodapp;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;


public class FoodsFragment5 extends Fragment {
    RecyclerView food_recycler;
    FoodAdapter foodAdapter;
    List<FoodModel> list;


    public FoodsFragment5() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_foods5, container, false);

        list = new ArrayList<>();
        list.add(new FoodModel(R.drawable.cbir,"Chicken Biryani", "Rs.400"));
        list.add(new FoodModel(R.drawable.vbir,"veg Biryani", "Rs.350"));
        list.add(new FoodModel(R.drawable.bawarchi,"Paneer Biryani", "Rs.410"));
        list.add(new FoodModel(R.drawable.mbir,"Mutton Biryani", "Rs.450"));
        list.add(new FoodModel(R.drawable.dumbir,"Dum Biryani", "Rs.430"));

        food_recycler = view.findViewById(R.id.food_recycler);
        foodAdapter = new FoodAdapter(list, getActivity().getApplicationContext());
        LinearLayoutManager manager = new LinearLayoutManager(getActivity().getApplicationContext(), RecyclerView.HORIZONTAL, false);
        food_recycler.setLayoutManager(manager);
        food_recycler.setHasFixedSize(true);
        food_recycler.setAdapter(foodAdapter);

        return view;
    }
}