package com.appuj.customizedalertdialoglib

import android.app.AlertDialog
import android.content.Context
import android.content.DialogInterface


/**
 * @author Umesh Jangid
 * @param As Given
 * Date : 12-12-18
 * Modified: 21-03-2022
 * */

class CustomizedAlertDialog {
    companion object {
        @JvmStatic
        fun callAlertDialog(
            context: Context,
            title: String,
            message: String,
            positiveButtonText: String?,
            negativeButtonText: String?,
            showOnlyOneButton: Boolean,
            callback: CustomizedAlertDialogCallback<String>
        ) {
            val alert = AlertDialog.Builder(context)
            if (title.isNullOrEmpty()) {
                alert.setTitle("Alert")
            } else {
                alert.setTitle(title)
            }
            if (message.isNullOrEmpty()) {
                alert.setMessage("Your message should be visible here.")
            } else {
                alert.setMessage(message)
            }
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


        /**
         * Method with more params.
         * */
        @JvmStatic
        fun callAlertDialog(
            context: Context,
            title: String?,
            message: String?,
            icon: Int?,
            positiveButtonText: String?,
            negativeButtonText: String?,
            showOnlyOneButton: Boolean,
            isDialogCancelable: Boolean,
            neutralButtonText: String?,
            showNeutralButton: Boolean,
            callback: CustomizedAlertDialogCallback<String>
        ) {
            val alert = AlertDialog.Builder(context)
            if (title.isNullOrEmpty()) {
                alert.setTitle("Alert")
            } else {
                alert.setTitle(title)
            }
            if (icon != null && icon > 0) {
                alert.setIcon(icon)
            } else {
                alert.setIcon(R.drawable.ic_error_outline_black_24dp)
            }

            if (message.isNullOrEmpty()) {
                alert.setMessage("Your message should be visible here.")
            } else {
                alert.setMessage(message)
            }
            alert.setPositiveButton(
                positiveButtonText ?: "Ok"
            ) { dialog, whichButton -> callback.alertDialogCallback("1") }
            if (!showOnlyOneButton) { // false
                alert.setNegativeButton(
                    negativeButtonText ?: "Cancel"
                ) { dialog, whichButton ->
                    // Canceled.
                    callback.alertDialogCallback("0")
                }
                if (showNeutralButton) {
                    alert.setNeutralButton(
                        neutralButtonText ?: "Dismiss"
                    ) { dialog, whichButton -> callback.alertDialogCallback("2") }
                }
            }
            alert.setCancelable(isDialogCancelable)
            alert.show()
        }

    }
}