package com.aysenurgokce.ikiekranlacalsma

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.aysenurgokce.ikiekranlacalsma.databinding.ActivityMainBinding

class ekran1 : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)


        println("onCreate çalıştırıldı.")

    }


    override fun onStart() {
        super.onStart()
        println("onStart çalıştırıldı.")
    }

    override fun onResume() {
        super.onResume()
        println("onResume çalıştırıldı.")
    }

    override fun onPause() {
        super.onPause()
        println("onPause çalıştırıldı.")
    }
    override fun onStop() {
        super.onStop()
        println("onStop çalıştırıldı.")
    }

    override fun onDestroy() {
        super.onDestroy()
        println("onDestroy çalıştırıldı.")
    }



    fun next(view: View){
        //Activityler arası geçişi intent ile yapıyorum
        val intent = Intent(this@ekran1,ekran2::class.java)
        intent.putExtra("name",binding.textView.text.toString())
        // deneme yapalım - int bir değer gönderelim
        intent.putExtra("deneme",10)

        startActivity(intent)
        finish()


    }
}