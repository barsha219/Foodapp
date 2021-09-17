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


public class FoodsFragment2 extends Fragment {

    RecyclerView food_recycler;
    FoodAdapter foodAdapter;
    List<FoodModel> list;


    public FoodsFragment2() {
        // Required empty public constructor
    }



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_foods2, container, false);

        list = new ArrayList<>();
        list.add(new FoodModel(R.drawable.img5,"Tea", "Rs.40"));
        list.add(new FoodModel(R.drawable.img6,"Coffee", "Rs.70"));
        list.add(new FoodModel(R.drawable.img7,"Smoothie", "Rs.100"));
        list.add(new FoodModel(R.drawable.img8,"Milk shake", "Rs.110"));
        list.add(new FoodModel(R.drawable.img9,"Soft Drinks", "Rs.60"));

        food_recycler = view.findViewById(R.id.food_recycler);
        foodAdapter = new FoodAdapter(list, getActivity().getApplicationContext());
        LinearLayoutManager manager = new LinearLayoutManager(getActivity().getApplicationContext(), RecyclerView.HORIZONTAL, false);
        food_recycler.setLayoutManager(manager);
        food_recycler.setHasFixedSize(true);
        food_recycler.setAdapter(foodAdapter);

        return view;
    }
}