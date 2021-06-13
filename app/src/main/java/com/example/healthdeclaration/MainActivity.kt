package com.example.healthdeclaration

import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import com.example.healthdeclaration.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding: ActivityMainBinding = DataBindingUtil.setContentView(
            this, R.layout.activity_main)
        Toast.makeText(applicationContext, "Chào mừng bạn đã trở lại", Toast.LENGTH_SHORT).show()


        val chuyen = binding.nop
        val ten = binding.name
        val cmt = binding.cmt
        val gioitinh = binding.gioitinh
        val lichtrinh = binding.lichtrinh
        val tiepxuc = binding.tiepxuc
        val namsinh = binding.namsinh

        chuyen.setOnClickListener {
            val intent = Intent(this, DIsplayActivity::class.java)
            val name = ten.text.toString()
            intent.putExtra("ten",name)
            val cccd = cmt.text.toString()
            intent.putExtra("cmt",cccd)
            val gioiting = gioitinh.text.toString()
            intent.putExtra("gioitinh",gioiting)
            val lichtrinh = lichtrinh.text.toString()
            intent.putExtra("lichtrinh",lichtrinh)
            val tiepxuc = tiepxuc.text.toString()
            intent.putExtra("tiepxuc",tiepxuc)
            val namsinh = namsinh.text.toString()
            intent.putExtra("namsinh",namsinh)
            startActivity(intent)
        }
    }
}


