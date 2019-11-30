package com.example.sho_sakai.aisatsuapp

import android.app.TimePickerDialog
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import com.example.sho_sakai.aisatsuapp.R
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(), View.OnClickListener {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        button1.setOnClickListener(this)

        textView.text = toString()
    }

    override fun onClick(showTimePickerDialog: View) {

    }


    private fun showTimePickerDialog() {
        val timePickerDialog = TimePickerDialog(
                this,
                TimePickerDialog.OnTimeSetListener { view, hour, minute ->
                    Log.d("UI_PARTS", "$hour:$minute")
                    when (hour){
                        2 -> textView.text="おはよう"
                        10 -> textView.text="こんにちは"
                        else -> textView.text="こんばんは"
                    }
                },
                13, 0, true)
        timePickerDialog.show()
    }
}






