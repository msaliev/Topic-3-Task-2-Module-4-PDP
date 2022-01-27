package com.example.a3rdppt2ndtask4thmoduleandroidpdp.activities

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.example.a3rdppt2ndtask4thmoduleandroidpdp.R


class MainActivity : AppCompatActivity() {
    lateinit var btnOpenSecondActivity:Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        btnOpenSecondActivity = findViewById(R.id.btnOpenSecondactivity)
        initViews()
    }

   fun  initViews(){
       btnOpenSecondActivity.setOnClickListener {
           openSecondActivity()
       }


   }

    fun openSecondActivity(){
        val intent = Intent(this, SecondActivity::class.java)
        startActivity(intent)
    }



}