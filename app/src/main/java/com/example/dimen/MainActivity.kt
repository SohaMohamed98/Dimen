package com.example.dimen

import android.content.res.Configuration
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    private var value=0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

   /* override fun onConfigurationChanged(newConfig: Configuration) {
        super.onConfigurationChanged(newConfig)

        if(newConfig.orientation == Configuration.ORIENTATION_PORTRAIT)
        {
            Toast.makeText(this,"The Portrait Orientation",Toast.LENGTH_LONG).show()
        }else
        {
            Toast.makeText(this,"This Land Orientation",Toast.LENGTH_LONG).show()
        }
    }*/


    fun performClick(v: View?) {

        when (v?.id) {
            R.id.btn1 -> value +=1
            R.id.btn2 -> Toast.makeText(this,"The value is: $value",Toast.LENGTH_LONG).show()

        }
    }

    override fun onSaveInstanceState(outState: Bundle) {
        super.onSaveInstanceState(outState)
        outState?.putInt("save_value",value)
    }

    override fun onRestoreInstanceState(savedInstanceState: Bundle) {
        super.onRestoreInstanceState(savedInstanceState)
       value = savedInstanceState?.getInt("save_value")
    }
}
