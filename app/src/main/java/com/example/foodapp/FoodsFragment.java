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


public class FoodsFragment extends Fragment {

    RecyclerView food_recycler;
    FoodAdapter foodAdapter;
    List<FoodModel> list;


    public FoodsFragment() {
        // Required empty public constructor
    }



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_foods, container, false);

        list = new ArrayList<>();
        list.add(new FoodModel(R.drawable.momos,"momos", "Rs.120"));
        list.add(new FoodModel(R.drawable.img1,"chowmein", "Rs.110"));
        list.add(new FoodModel(R.drawable.img2,"sausage", "Rs.40"));
        list.add(new FoodModel(R.drawable.img3,"fry rice", "Rs.120"));
        list.add(new FoodModel(R.drawable.img4,"chicken", "Rs.230"));

        food_recycler = view.findViewById(R.id.food_recycler);
        foodAdapter = new FoodAdapter(list, getActivity().getApplicationContext());
        LinearLayoutManager manager = new LinearLayoutManager(getActivity().getApplicationContext(), RecyclerView.HORIZONTAL, false);
        food_recycler.setLayoutManager(manager);
        food_recycler.setHasFixedSize(true);
        food_recycler.setAdapter(foodAdapter);

        return view;
    }

}
