package com.aysenurgokce.ikiekranlacalsma

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.aysenurgokce.ikiekranlacalsma.databinding.ActivityEkran2Binding
import com.aysenurgokce.ikiekranlacalsma.databinding.ActivityMainBinding

class ekran2 : AppCompatActivity() {
    private lateinit var binding: ActivityEkran2Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityEkran2Binding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        val gelenDeger= intent//getIntent
        val name = gelenDeger.getStringExtra("name")
        val deneme = gelenDeger.getIntExtra("deneme",-1)
        println(deneme)
        binding.nameText.text="Gelen değer : ${name}"
    }

    fun geriButton(view:View){
        val intent = Intent(this@ekran2,ekran1::class.java)
        startActivity(intent

        )
    }
}