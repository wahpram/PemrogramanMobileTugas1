package com.cheesekimbap.newapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class MainActivity3 : AppCompatActivity() {

    private lateinit var textt: EditText
    private lateinit var textt2: EditText
    private lateinit var button: Button

    private fun initComp(){
        textt = findViewById(R.id.textEdit3)
        textt2 = findViewById(R.id.textEdit4)
        button = findViewById(R.id.button4)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.page3)

        initComp()

        button.setOnClickListener{
            startActivity(Intent(this, MainActivity4::class.java)
                .putExtra("nama", textt2.text.toString())
                .putExtra("username", textt.text.toString()))
        }
    }
}