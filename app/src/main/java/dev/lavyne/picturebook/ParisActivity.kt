package dev.lavyne.picturebook

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class ParisActivity : AppCompatActivity() {
    lateinit var btnParisPreviuos:Button
    lateinit var btnNext:Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_paris)

        btnNext=findViewById(R.id.btnNextParis)
        btnParisPreviuos =findViewById(R.id.btnParisPrevious)

        btnParisPreviuos.setOnClickListener {
            val intent=Intent(this,MainActivity::class.java)
            startActivity(intent)
        }
        btnNext.setOnClickListener {
            val intent=Intent(this,HawaiActivity::class.java)
            startActivity(intent)
        }
    }
}