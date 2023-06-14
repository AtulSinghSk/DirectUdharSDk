package com.example.mydemo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.sk.directudharsdk.FirstActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        FirstActivity.ShowToast(this,"Hello First Time Call")

       // MainDirectUdharActivity.SimpleToast(this,"Hello Bhagwan")
    }
}