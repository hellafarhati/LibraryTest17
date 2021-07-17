package fr.bilog.customlibrarynav

import android.animation.ArgbEvaluator
import android.animation.ObjectAnimator
import android.graphics.Color
import android.view.View
import android.view.animation.Animation
import android.view.animation.Animation.*


object BlinkEffect {

    fun blink(view : View){
        val anim = ObjectAnimator.ofInt(
            view, "backgroundColor", Color.WHITE, Color.RED,
            Color.WHITE
        )
        anim.duration = 1500
        anim.setEvaluator(ArgbEvaluator())
        anim.repeatMode = REVERSE
        anim.repeatCount = INFINITE
        anim.start()
    }

}