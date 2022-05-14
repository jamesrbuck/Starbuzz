package com.prog272.starbuzz;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;


public class FoodActivity extends Activity {
    public static final String EXTRA_FoodID = "foodId";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_food);


//Get the Food from the intent

        int FoodId = (Integer)getIntent().getExtras().get(EXTRA_FoodID);
        Food food = Food.foods[FoodId];


//Populate the Food name

        TextView name = (TextView)findViewById(R.id.name);
        name.setText(food.getName());


//Populate the Food description

        TextView description = (TextView)findViewById(R.id.description);
        description.setText(food.getDescription());


//Populate the Food image

        ImageView photo = (ImageView)findViewById(R.id.photo);
        photo.setImageResource(food.getImageResourceId());
        photo.setContentDescription(food.getName());
    }
}