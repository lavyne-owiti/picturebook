package dev.lavyne.picturebook

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MaldivsActivity : AppCompatActivity() {
    lateinit var btnMaldivsPrevious:Button
    lateinit var btnMaldivsNext:Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_maldivs)

        btnMaldivsNext=findViewById(R.id.btnMaldivsNext)
        btnMaldivsPrevious=findViewById(R.id.btnMaldivsPrevious)

        btnMaldivsPrevious.setOnClickListener {
            val intent=Intent(this,HawaiActivity::class.java)
            startActivity(intent)
        }
        btnMaldivsNext.setOnClickListener {
            val intent=Intent(this,FloridaActivity::class.java)
            startActivity(intent)
        }
    }
}