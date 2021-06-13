package com.example.healthdeclaration

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

class DisplayActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_display2)
        Toast.makeText(applicationContext, "anh chắc chưa ", Toast.LENGTH_SHORT).show()

        val bundle: Bundle? = intent.extras
        val name = bundle!!.getString("ten")
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

        hoten.text = "Họ và tên: " + name
        socmt.text = "Số CMT/CCCD/Hộ chiếu: " + cmt
        nam.text = "Năm sinh: " + namsinh
        namnu.text = "Gioi tinh: " + gioitinh
        quatrinh.text = "Lịch trình: " + lichtrinh
        batgap.text = "Tiếp xúc: " + tiepxuc

        val trolai = findViewById<Button>(R.id.back)
        trolai.setOnClickListener() {
            val intent: Intent = Intent(this, DIsplayActivity::class.java)
            startActivity(intent)
            finish()
        }
    }
}