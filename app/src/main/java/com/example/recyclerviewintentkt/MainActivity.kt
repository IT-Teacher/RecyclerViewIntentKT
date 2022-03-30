package com.example.recyclerviewintentkt

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.recyclerviewintentkt.adapter.RecyclerAdapter


class MainActivity : AppCompatActivity() {

    private lateinit var recyclerView: RecyclerView
    private lateinit var context: Context

    var users: ArrayList<User> = ArrayList<User>()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        initViews()
    }
    fun initViews() {
        context = this
        recyclerView = findViewById(R.id.recyc)
        recyclerView.layoutManager = GridLayoutManager(context, 3)

        users.add(User("Aliyev Ali", R.drawable.img1))
        users.add(User("Qodirova Ra'no", R.drawable.img2))
        users.add(User("Toxirov Alisher", R.drawable.img3))
        users.add(User("Azizov Salim", R.drawable.img4))
        users.add(User("Komolov Umid", R.drawable.img5))
        users.add(User("Usmonov Rustam", R.drawable.img6))
        users.add(User("Zoitov Shavkat", R.drawable.img7))
        users.add(User("Aliyeva Umida", R.drawable.img8))
        users.add(User("Shokirova Xadicha", R.drawable.img9))
        users.add(User("Jumayev Doniyor", R.drawable.img1))
        users.add(User("Qodirova Ra'no", R.drawable.img2))
        users.add(User("Toxirov Alisher", R.drawable.img3))
        users.add(User("Azizov Salim", R.drawable.img4))

        refreshAdapter(users)
    }
    fun refreshAdapter(users: ArrayList<User>) {
        val adapter = RecyclerAdapter(this,users)
        recyclerView.adapter = adapter
    }

    fun openItemDetalis(user: User?) {
        val intent = Intent(this@MainActivity, SecondActivity::class.java)
        intent.putExtra("user", user)
        startActivity(intent)
    }
}