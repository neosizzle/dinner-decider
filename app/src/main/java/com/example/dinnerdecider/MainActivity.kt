package com.example.dinnerdecider

import android.content.Intent
import android.content.res.ColorStateList
import android.graphics.Color
import android.graphics.PorterDuff
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import android.util.Log
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*
import java.lang.IllegalArgumentException
import kotlin.random.Random

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //declaring components
        val display = findViewById<TextView>(R.id.selectedFoodText)

        //Array declaration for string added restaurant
        var restaurantList = mutableListOf<String>()
        var addedRestaurant : String

        //setting hint and text styles for userinput


        inputText.addTextChangedListener(object : TextWatcher{
            override fun afterTextChanged(p0: Editable?) {//after typing
                inputText.setHint("Enter a restaurant").toString()
            }

            override fun beforeTextChanged(p0: CharSequence?, p1: Int, p2: Int, p3: Int) {//before typing

            }

            override fun onTextChanged(p0: CharSequence?, p1: Int, p2: Int, p3: Int) {//during typing
                inputText.setTextColor(Color.parseColor("#000000"))//when typing, text colour changes to black
                inputText.setHint("").toString()//the hint disappears
            }

        })

        addButton.setOnClickListener{
            addedRestaurant = inputText.getText().toString()

            if(addedRestaurant == "" || addedRestaurant ==" "){//to check if the user had input anything
                var addToast = Toast.makeText(this, "Please enter a restaurant name", Toast.LENGTH_SHORT)
                addToast.show()
            }
            else {
                restaurantList.add(addedRestaurant)
            }

        }

        //when clicked, displays random restaurant from an array of restaurant inputs
        decideButton.setOnClickListener{
            try {
                val randomInt = Random.nextInt(0, restaurantList.size)
                display.setText(restaurantList[randomInt]).toString()
            }catch(e:IllegalArgumentException){

            var decideToast = Toast.makeText(this,"Please enter some restaurants/food to select from",Toast.LENGTH_SHORT)
                decideToast.show()
        }

        }

        CalorieButton.setOnClickListener {

                val intent = Intent(this, CaloriesActivity::class.java)
                startActivity(intent)

        }

        clearBtn.setOnClickListener {
            val clearToast = Toast.makeText(this, "Restaurants cleared", Toast.LENGTH_SHORT)
            clearToast.show()

            restaurantList.clear()
        }





    }
}
