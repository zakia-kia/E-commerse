package com.zakia.idn.e_commerse

import android.content.Context
import android.content.SharedPreferences
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_simple_shared_preferences.*

class SimpleSharedPreferences : AppCompatActivity() {

    private var sharedP : SharedPreferences? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_simple_shared_preferences)

        btn_add.setOnClickListener {
            sharedP = getSharedPreferences("addData", Context.MODE_PRIVATE)

            var myEditor = sharedP?.edit()
            myEditor?.putString("product_name", et_name.text.toString())
            myEditor?.commit()
            Toast.makeText(this@SimpleSharedPreferences, "this product is save",
            Toast.LENGTH_SHORT).show()
        }
        btn_get.setOnClickListener {
            tv_getname.text = sharedP?.getString("product_name", "")
        }
    }
}