package com.example.applaut

import android.content.Intent
import android.content.IntentSender.OnFinished
import android.os.Bundle
import android.os.CountDownTimer
import android.view.View
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class LaunchActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_launch)
            val timer = object:CountDownTimer(3000,1000){
                override  fun onTick(millisUntilFinished: Long){

                }

                override fun onFinish() {
                   val  intent=Intent(this@LaunchActivity,MainActivity::class.java)

                    startActivity(intent)
                    finish()
                }
            }
        timer.start()

    }

}