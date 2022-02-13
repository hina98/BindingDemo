package com.example.bindingdemo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import com.example.bindingdemo.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding : ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val student = Student("W123", "Ali")

        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)
        binding.myData = student

        //binding.textView.text = student.id
        //binding.textView3.text = student.name

        binding.btnUpdate.setOnClickListener(){
            student.name = "Alex"

            binding.apply {
                invalidateAll()
            }
        }

        //val tv :TextView = findViewById(R.id.tvStudentID)
        //tv.text = student.id

    }
}