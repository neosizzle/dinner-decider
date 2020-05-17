package com.example.dinnerdecider

import android.os.Bundle
import android.view.Menu
import android.view.MenuInflater
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.activity_calories.*
import android.content.Context.SEARCH_SERVICE
import androidx.core.content.ContextCompat.getSystemService
import android.app.SearchManager
import android.content.Context
import androidx.core.view.MenuItemCompat.getActionView
import android.R.menu
import android.graphics.Color
import android.widget.EditText
import android.widget.SearchView
import android.text.Editable
import android.text.TextWatcher
import android.view.Window


class CaloriesActivity : AppCompatActivity(){

    //Hiding the title bar
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        try {
            this.supportActionBar!!.hide()
        } catch (e: NullPointerException) {
        }
    //Setting the layout
        setContentView(R.layout.activity_calories)
        val layoutManager = LinearLayoutManager(this)
        layoutManager.orientation = RecyclerView.VERTICAL //this might be wrong
        recyclerView.layoutManager = layoutManager

    //Filter function for Searchbar
        fun filter(text : String){
            val filteredList = mutableListOf<Food>()//creates a new list of foods
            for(food:Food in Supplier.foods){ //loops through every item in the food database
                if(food.name.toLowerCase().contains(text.toLowerCase())){
                    filteredList.add(food)//if the entered text has similar characters to the name of the food, it is added into the new list (filteredList)

                }
            }
            recyclerView.adapter = CaloriesAdapter(this,filteredList)//change the RecyclerView adapter to only display the searched foods
        }

        //Searchbar setup
        val search = findViewById<EditText>(R.id.search)//retreive from xml
        search.addTextChangedListener(object : TextWatcher {//extends this to detect changed in the searchbar
            override fun beforeTextChanged(s: CharSequence, start: Int, count: Int, after: Int) {//abstract method, before typing

            }

            override fun onTextChanged(s: CharSequence, start: Int, before: Int, count: Int) {//abstract method, when typing
                search.setTextColor(Color.parseColor("#000000"))//when typing, text colour changes to black
                search.setHint("").toString()//the hint disappears

            }

            override fun afterTextChanged(s: Editable) {//abstract method, when enter is hit OR when typing stops
                filter(s.toString())//execute filter algorithm
                search.setHint("Search food").toString()//resets the hint
            }
        })


        //RecyclerView setup
        val adapter = CaloriesAdapter(this, Supplier.foods)//default adapter
        recyclerView.adapter = adapter



    }

 }