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


public class FoodsFragment4 extends Fragment {
    RecyclerView food_recycler;
    FoodAdapter foodAdapter;
    List<FoodModel> list;

    public FoodsFragment4() {
        // Required empty public constructor
    }



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_foods4, container, false);

        list = new ArrayList<>();
        list.add(new FoodModel(R.drawable.bev1,"Tuborg", "Rs.230"));
        list.add(new FoodModel(R.drawable.bev2,"Arna Strong", "Rs.210"));
        list.add(new FoodModel(R.drawable.bev3,"Apple cider", "Rs.100"));
        list.add(new FoodModel(R.drawable.bev4,"Corona", "Rs.220"));
        list.add(new FoodModel(R.drawable.bev5,"Red wine", "Rs.310"));

        food_recycler = view.findViewById(R.id.food_recycler);
        foodAdapter = new FoodAdapter(list, getActivity().getApplicationContext());
        LinearLayoutManager manager = new LinearLayoutManager(getActivity().getApplicationContext(), RecyclerView.HORIZONTAL, false);
        food_recycler.setLayoutManager(manager);
        food_recycler.setHasFixedSize(true);
        food_recycler.setAdapter(foodAdapter);
        return view;

    }
}