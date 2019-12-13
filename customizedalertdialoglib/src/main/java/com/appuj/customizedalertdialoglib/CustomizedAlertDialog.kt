package com.appuj.customizedalertdialoglib

import android.app.AlertDialog
import android.content.Context
import android.content.DialogInterface


/**
 * @author Umesh Jangid
 * @param As Given
 * Date : 12-12-18
 * */

class CustomizedAlertDialog {
    companion object {
        @JvmStatic
        public fun callAlertDialog(context: Context, title: String, message: String, positiveButtonText: String?, negativeButtonText: String?, showOnlyOneButton: Boolean, callback: CustomizedAlertDialogCallback<String>) {
            val alert = AlertDialog.Builder(context)
            alert.setTitle(title)
            alert.setIcon(R.drawable.ic_error_outline_black_24dp)
            alert.setMessage(message)
            alert.setPositiveButton(
                positiveButtonText ?: "Ok"
            ) { dialog, whichButton -> callback.alertDialogCallback("1") }
            if (!showOnlyOneButton) {
                alert.setNegativeButton(
                    negativeButtonText ?: "Cancel"
                ) { dialog, whichButton ->
                    // Canceled.
                    callback.alertDialogCallback("0")
                }
            }
            alert.setCancelable(false)
            alert.show()
        }
    }
}