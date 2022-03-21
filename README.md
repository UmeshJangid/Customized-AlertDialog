# Customized-AlertDialog
This is simple library in Kotlin to show alert dialog box as per your requirement with callback functionality.

# Usage In Code
```
 button.setOnClickListener {
            CustomizedAlertDialog.callAlertDialog(this@MainActivity, "Alert!",
                "Are you sure you want to  test the alert dialog?",
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


```
# Project Gradle File

```
allprojects {
		repositories {
			...
			maven { url 'https://jitpack.io' }
		}
	}
  
  ```
  
# Implementation
```
	dependencies {
	        implementation 'com.github.UmeshJangid:Customized-AlertDialog:1.0.0'
	}
	
```
