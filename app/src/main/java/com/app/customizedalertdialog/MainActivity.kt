package com.app.customizedalertdialog

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.appuj.customizedalertdialoglib.CustomizedAlertDialog
import com.appuj.customizedalertdialoglib.CustomizedAlertDialogCallback
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        button.setOnClickListener {
            CustomizedAlertDialog.callAlertDialog(this@MainActivity, "Alert!",
                "Are you sure you want to change test the alert dialog?",
                "Yes", "cancel", false
                , object : CustomizedAlertDialogCallback<String> {
                    override fun alertDialogCallback(callback: String) {
                      if(callback=="1"){
                          //Yes Clicked
                      }
                        else{
                          //Cancel Clicked
                      }
                    }
                })
        }


    }
}

