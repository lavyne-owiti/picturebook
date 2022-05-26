package dev.lavyne.picturebook

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class HawaiActivity : AppCompatActivity() {
    lateinit var btnHawaiPreviuos:Button
    lateinit var btnHawaiNext :Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_hawai)

        btnHawaiPreviuos=findViewById(R.id.btnHawaiPrevious)
        btnHawaiNext=findViewById(R.id.btnHawaiNext)

        btnHawaiPreviuos.setOnClickListener {
            val intent = Intent(this, ParisActivity::class.java)
            startActivity(intent)
        }

        btnHawaiNext.setOnClickListener {
            val intent = Intent(this, MaldivsActivity::class.java)
            startActivity(intent)
        }

    }
}