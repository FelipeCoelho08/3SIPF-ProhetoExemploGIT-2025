package com.example.geradordesenha

import android.app.ActivityOptions
import android.content.Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.geradordesenha.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val binding = ActivityMainBinding .inflate(layoutInflater)

        setContentView( binding.root)
        binding.btIniciar.setOnClickListener {
            val nextScreen = Intent(this, SecondActivity::class.java)
            startActivity(nextScreen)
        }
        binding.btIniciar.setOnClickListener {
            val secondActivityIntent = Intent(this, SecondActivity ::class.java)
            val options = ActivityOptions.makeCustomAnimation(
                this,
                R.anim.slide_in_right,
                R.anim.slide_out_left
            )
            startActivity( secondActivityIntent , options.toBundle())
        }

    }
}
