package com.app.customizedalertdialog

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
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
                "Yes", "cancel", false, object : CustomizedAlertDialogCallback<String> {
                    override fun alertDialogCallback(callback: String) {
                        if (callback == "1") {
                            //Yes Clicked
                        } else {
                            //Cancel Clicked
                        }
                    }
                })
        }

        button2.setOnClickListener {
            CustomizedAlertDialog.callAlertDialog(this@MainActivity, "Alert!",
                "Are you sure you want to change test the alert dialog?", R.mipmap.ic_launcher,
                "Yes", "cancel",
                false, false, "Dismiss", true, object : CustomizedAlertDialogCallback<String> {
                    override fun alertDialogCallback(callback: String) {
                        if (callback == "1") {
                            //Yes Clicked
                            Toast.makeText(this@MainActivity, "Yes", Toast.LENGTH_SHORT).show()
                        } else if (callback == "2") {
                            Toast.makeText(this@MainActivity, "Dismiss", Toast.LENGTH_SHORT).show()
                        } else {
                            //Cancel Clicked
                            Toast.makeText(this@MainActivity, "Cancel", Toast.LENGTH_SHORT).show()


                        }
                    }
                })
        }


    }
}

