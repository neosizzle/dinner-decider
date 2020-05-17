package com.example.dinnerdecider

import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Filter
import android.widget.Filterable
import androidx.core.content.ContextCompat.startActivity
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.list_item.view.*

class CaloriesAdapter(val context : Context,val foodList : List<Food>) : RecyclerView.Adapter<CaloriesAdapter.MyViewHolder>() {
//anything related to the recyclerview and its data should be processed here.


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {//inflate the cardview into the recyclerview
        val view = LayoutInflater.from(context).inflate(R.layout.list_item, parent, false)
        return MyViewHolder(view)
    }

    override fun getItemCount(): Int {//abstract method, get number of items
        return foodList.size
    }



    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {//abstract method, sets data to cardView(will iretate on its own)
        val food = foodList[position]
        holder.setData(food,position)

    }


    inner class MyViewHolder(itemView : View) : RecyclerView.ViewHolder(itemView){//ViewHolders are needed for the recyclerview to hold the cardview

        var currentFood : Food? = null
        var currentPos : Int = 0

        init{//upon initiation, execute the codes below
            itemView.setOnClickListener {//when the cardview is clicked, a new activity containing the food info is opened
                val intent = Intent(context, FoodInfoActivity::class.java)
                intent.putExtra("FoodName" , currentFood!!.name)
                intent.putExtra("FoodCalories" , currentFood!!.calories)
                intent.putExtra("FoodDesc" , currentFood!!.desc)
                context.startActivity(intent)
            }
        }

        fun setData(food : Food?, pos : Int){//sets the text on the cardview to the foods name its its own position
            itemView.txvTitle.text = food!!.name

            this.currentFood = food
            this.currentPos = pos
        }


        }

    }


