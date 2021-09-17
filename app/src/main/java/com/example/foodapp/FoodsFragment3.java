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


public class FoodsFragment3 extends Fragment {

    RecyclerView food_recycler;
    FoodAdapter foodAdapter;
    List<FoodModel> list;

    public FoodsFragment3() {
        // Required empty public constructor
    }




    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_foods3, container, false);

        list = new ArrayList<>();
        list.add(new FoodModel(R.drawable.snack1,"French fries", "Rs.110"));
        list.add(new FoodModel(R.drawable.snack2,"Cheese balls", "Rs.150"));
        list.add(new FoodModel(R.drawable.snack3,"Chicken chilly", "Rs.175"));
        list.add(new FoodModel(R.drawable.snack4,"Fish finger", "Rs.200"));
        list.add(new FoodModel(R.drawable.snack5,"Fried prawn", "Rs.220"));

        food_recycler = view.findViewById(R.id.food_recycler);
        foodAdapter = new FoodAdapter(list, getActivity().getApplicationContext());
        LinearLayoutManager manager = new LinearLayoutManager(getActivity().getApplicationContext(), RecyclerView.HORIZONTAL, false);
        food_recycler.setLayoutManager(manager);
        food_recycler.setHasFixedSize(true);
        food_recycler.setAdapter(foodAdapter);
        return view;
    }
}