package com.example.foodapp;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.GridLayout;
import android.widget.ImageView;

import java.util.ArrayList;
import java.util.List;

public class Seemore_Fragment extends Fragment {

    List<FoodModel> list;
    RecyclerView rec_view;
    FoodAdapter foodAdapter;
    ImageView back;

    @Override
    public View onCreateView( LayoutInflater inflater,  ViewGroup container, Bundle savedInstanceState) {


        View view = inflater.inflate(R.layout.activity_seemore, container, false);

        back = view.findViewById(R.id.back);
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getActivity(), Dash_Board_Activity.class));
            }
        });

        list =  new ArrayList<>();
        list.add(new FoodModel(R.drawable.momos,"momos", "Rs.120"));
        list.add(new FoodModel(R.drawable.img1,"chowmein", "Rs.110"));
        list.add(new FoodModel(R.drawable.img2,"sausage", "Rs.40"));
        list.add(new FoodModel(R.drawable.img3,"fry rice", "Rs.120"));
        list.add(new FoodModel(R.drawable.img4,"chicken", "Rs.230"));
        list.add(new FoodModel(R.drawable.img5,"Tea", "Rs.40"));
        list.add(new FoodModel(R.drawable.img6,"Coffee", "Rs.70"));
        list.add(new FoodModel(R.drawable.img7,"Smoothie", "Rs.100"));
        list.add(new FoodModel(R.drawable.img8,"Milk shake", "Rs.110"));
        list.add(new FoodModel(R.drawable.img9,"Soft Drinks", "Rs.60"));
        list.add(new FoodModel(R.drawable.snack1,"French fries", "Rs.110"));
        list.add(new FoodModel(R.drawable.snack2,"Cheese balls", "Rs.150"));
        list.add(new FoodModel(R.drawable.snack3,"Chicken chilly", "Rs.175"));
        list.add(new FoodModel(R.drawable.snack4,"Fish finger", "Rs.200"));
        list.add(new FoodModel(R.drawable.snack5,"Fried prawn", "Rs.220"));
        list.add(new FoodModel(R.drawable.bev1,"Tuborg", "Rs.230"));
        list.add(new FoodModel(R.drawable.bev2,"Arna Strong", "Rs.210"));
        list.add(new FoodModel(R.drawable.bev3,"Apple cider", "Rs.100"));
        list.add(new FoodModel(R.drawable.bev4,"Corona", "Rs.220"));
        list.add(new FoodModel(R.drawable.bev5,"Red wine", "Rs.310"));
        list.add(new FoodModel(R.drawable.cbir,"Chicken Biryani", "Rs.400"));
        list.add(new FoodModel(R.drawable.vbir,"veg Biryani", "Rs.350"));
        list.add(new FoodModel(R.drawable.bawarchi,"Paneer Biryani", "Rs.410"));
        list.add(new FoodModel(R.drawable.mbir,"Mutton Biryani", "Rs.450"));
        list.add(new FoodModel(R.drawable.dumbir,"Dum Biryani", "Rs.430"));
        list.add(new FoodModel(R.drawable.chipiz,"Chicken pizza", "Rs.700"));
        list.add(new FoodModel(R.drawable.mupiz,"Mushroom pizza", "Rs.610"));
        list.add(new FoodModel(R.drawable.cheesepiz,"cheese pizza", "Rs.690"));
        list.add(new FoodModel(R.drawable.mpiz,"Margarita pizza", "Rs.750"));
        list.add(new FoodModel(R.drawable.meatpiz,"Meat lovers Pizza", "Rs.890"));


        rec_view = view.findViewById(R.id.rec_view);
        foodAdapter =  new FoodAdapter(list, getActivity().getApplicationContext());
        GridLayoutManager manager = new GridLayoutManager(getActivity().getApplicationContext(), 2);
        rec_view.setLayoutManager(manager);
        rec_view.setAdapter(foodAdapter);
        rec_view.setHasFixedSize(true);


        return view;

    }
}