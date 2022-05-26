package dev.lavyne.picturebook

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class FloridaActivity : AppCompatActivity() {
    lateinit var btnFloridaPrevious: Button
    lateinit var btnFloridaHome: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_florida)
        btnFloridaHome = findViewById(R.id.btnFloridaHome)
        btnFloridaPrevious = findViewById(R.id.btnFloridaPrevious)

        btnFloridaPrevious.setOnClickListener {
            val intent = Intent(this, MaldivsActivity::class.java)
            startActivity(intent)
        }
        btnFloridaHome.setOnClickListener {
            val intent=Intent(this,MainActivity::class.java)
            startActivity(intent)
        }
    }
}