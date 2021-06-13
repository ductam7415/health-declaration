package com.example.healthdeclaration

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import com.example.healthdeclaration.databinding.ActivityMainBinding

class DIsplayActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_display)

        val binding: ActivityMainBinding = DataBindingUtil.setContentView(
            this, R.layout.activity_display
        )
        val bundle: Bundle? = intent.extras
        val name = bundle!!.getString("name")
        val namsinh = bundle.getString("namsinh")
        val gioitinh = bundle.getString("gioitinh")
        val cmt = bundle.getString("cmt")
        val lichtrinh = bundle.getString("lichtrinh")
        val tiepxuc = bundle.getString("tiepxuc")

        val hoten = findViewById<TextView>(R.id.hoten)
        val socmt = findViewById<TextView>(R.id.socmt)
        val nam = findViewById<TextView>(R.id.nam)
        val namnu = findViewById<TextView>(R.id.namnu)
        val quatrinh = findViewById<TextView>(R.id.lichtrinh)
        val batgap = findViewById<TextView>(R.id.tiepxuc)

        hoten.text = name
        socmt.text = cmt
        nam.text = namsinh
        namnu.text = gioitinh
        quatrinh.text = lichtrinh
        batgap.text = tiepxuc

        val trolai = findViewById<Button>(R.id.back)
        trolai.setOnClickListener() {
            val intent: Intent = Intent(this, DIsplayActivity::class.java)
            startActivity(intent)
            finish()
        }
    }
}
