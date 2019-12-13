# Customized-AlertDialog
This is simple library in Kotlin to show alert dialog box as per your requirement with basic callback functionality.

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
