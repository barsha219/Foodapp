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

public class FoodsFragment6 extends Fragment {

    RecyclerView food_recycler;
    FoodAdapter foodAdapter;
    List<FoodModel> list;

    public FoodsFragment6() {
        // Required empty public constructor
    }



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        View view = inflater.inflate(R.layout.fragment_foods5, container, false);

        list = new ArrayList<>();
        list.add(new FoodModel(R.drawable.chipiz,"Chicken pizza", "Rs.700"));
        list.add(new FoodModel(R.drawable.mupiz,"Mushroom pizza", "Rs.610"));
        list.add(new FoodModel(R.drawable.cheesepiz,"cheese pizza", "Rs.690"));
        list.add(new FoodModel(R.drawable.mpiz,"Margarita pizza", "Rs.750"));
        list.add(new FoodModel(R.drawable.meatpiz,"Meat lovers Pizza", "Rs.890"));

        food_recycler = view.findViewById(R.id.food_recycler);
        foodAdapter = new FoodAdapter(list, getActivity().getApplicationContext());
        LinearLayoutManager manager = new LinearLayoutManager(getActivity().getApplicationContext(), RecyclerView.HORIZONTAL, false);
        food_recycler.setLayoutManager(manager);
        food_recycler.setHasFixedSize(true);
        food_recycler.setAdapter(foodAdapter);
        return view;
    }
}