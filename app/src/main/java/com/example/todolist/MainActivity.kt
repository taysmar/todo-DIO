package com.example.todolist

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import com.example.todolist.databinding.ActivityMainBinding
import com.example.todolist.ui.AddTaskActivity

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(LayoutInflater())
        setContentView(binding.root)

        insertListeners()

    }

    private fun insertListeners() {
    binding.fab.setOnClickListener{
        startActivity(Intent(this, AddTaskActivity::class.java))
    }
        }

}