package com.example.explore.dashboard.activity

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.os.Handler
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.databinding.DataBindingUtil
import com.bumptech.glide.Glide
import com.example.explore.R
import com.example.explore.databinding.ActivitySplashScreenBinding
import kotlinx.coroutines.Runnable
import kotlinx.coroutines.android.HandlerDispatcher

class SplashScreenActivity : AppCompatActivity() {

     lateinit  var binding:ActivitySplashScreenBinding;

    @SuppressLint("UseCompatLoadingForDrawables")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash_screen)
        binding = DataBindingUtil.setContentView(this,R.layout.activity_splash_screen)
        Glide.with(this).load(R.drawable.logo).into(binding.logo)
        //binding.logo.setBackgroundResource(R.drawable.bg_splash)
        Handler().postDelayed({val mintent = Intent(this@SplashScreenActivity, MainActivity::class.java)
                              startActivity(mintent)
                              finish()},2000)

    }
}