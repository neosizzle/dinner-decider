package com.example.dinnerdecider

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.activity_calories.*
import kotlinx.android.synthetic.main.activity_food_info.*

class FoodInfoActivity: AppCompatActivity(){


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_food_info)
        setTitle("Food Info")

        val foodName = intent.getStringExtra("FoodName")
        val calories = intent.getIntExtra("FoodCalories" , 0)
        val foodDesc = intent.getStringExtra("FoodDesc")

        nameView.setText(foodName).toString()
        calorieView.setText("Calories per serving:" + calories).toString()
        descView.setText(foodDesc).toString()




    }

}
