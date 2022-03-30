package com.example.recyclerviewintentkt

import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class SecondActivity:AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        val name = findViewById<TextView>(R.id.name)
        val selectedImage = findViewById<ImageView>(R.id.selectedImage)
        val user = intent.getSerializableExtra("user") as User
        name.setText(user.username)
        selectedImage.setImageResource(user.img)


    }
}
