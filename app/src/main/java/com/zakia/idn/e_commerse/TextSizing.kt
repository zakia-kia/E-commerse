package com.zakia.idn.e_commerse

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_text_sizing.*

class TextSizing : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_text_sizing)

        radio_large.setOnClickListener{
            tv_name.textSize = 70f
        }
        radio_medium.setOnClickListener {
            tv_name.textSize = 50f
        }
        radio_short.setOnClickListener {
            tv_name.textSize = 20f
        }
    }
}