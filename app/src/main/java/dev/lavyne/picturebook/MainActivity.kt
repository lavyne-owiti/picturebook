package dev.lavyne.picturebook

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    lateinit var btnClickMe:Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        btnClickMe =findViewById(R.id.btnClickMe)
        btnClickMe.setOnClickListener {
            val intent=Intent(this,ParisActivity::class.java)
            startActivity(intent)
        }
    }
}