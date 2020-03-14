package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log.d
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        but.setOnClickListener {
            d("Kallen","pressed")
//            val intent =
            startActivity(Intent(this, AboutMe::class.java))
        }

        button.setOnClickListener{
            startActivity(Intent(this, KK::class.java))
        }
    }

}
