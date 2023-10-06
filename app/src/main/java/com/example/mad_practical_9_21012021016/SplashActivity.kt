package com.example.mad_practical_9_21012021016

import android.graphics.drawable.AnimationDrawable
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.animation.Animation
import android.view.animation.AnimationUtils
import android.widget.ImageView

class SplashActivity : AppCompatActivity() , Animation.AnimationListener{

    lateinit var logoimage : ImageView
    lateinit var logoanimation : Animation


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)



        logoimage=findViewById(R.id.uvpce)
        logoanimation=AnimationUtils.loadAnimation(this,R.anim.twin_animation)
        logoanimation.setAnimationListener(this)


        val uvpcelogo: ImageView = findViewById(R.id.uvpce)
        uvpcelogo.setBackgroundResource(R.drawable.uvpce_logo_animation_list)
        logoanimation = uvpcelogo.background as Animation
    }

    override fun onWindowFocusChanged(hasFocus: Boolean) {
        super.onWindowFocusChanged(hasFocus)
        if (hasFocus) {
            logoanimation.start()
        }
        else {
            logoanimation.stop()
        }
    }

    override fun onAnimationStart(p0: Animation?) {

    }

    override fun onAnimationEnd(p0: Animation?) {

    }

    override fun onAnimationRepeat(p0: Animation?) {
        //intent using mainactivity call karavani 6e
    }
}