package com.example.mylist

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.ListView
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    private  lateinit var  myList :ListView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        myList = findViewById(R.id.mylist)
        val arraylist = resources.getStringArray(R.array.Name)
        val arrayAdapter = ArrayAdapter(this,android.R.layout.simple_list_item_1,arraylist)
        myList.adapter = arrayAdapter


myList.setOnItemClickListener{parent,view
    ,position,id->

    id.toString()
    view.setBackgroundColor(Color.GREEN)
  val name :String =  parent.getItemAtPosition(position).toString()
    Toast.makeText(applicationContext,"You selected $name",Toast.LENGTH_SHORT).show()

}







    }
}