package com.cheesekimbap.newapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class MainActivity4 : AppCompatActivity() {

    private lateinit var nama:TextView
    private lateinit var username:TextView

    private fun initComp(){
        nama = findViewById(R.id.name)
        username = findViewById(R.id.username)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.home)

        initComp()

        val showName = intent.getStringExtra("nama")
        val showUsername = intent.getStringExtra("username")

        nama.text = resources.getString(R.string.nama, showName)
        username.text = resources.getString(R.string.username, showUsername)


    }
}