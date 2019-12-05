package com.example.icon_switch_button

import androidx.appcompat.app.AppCompatActivity

import android.os.Bundle
import android.widget.Toast

import com.polyak.iconswitch.IconSwitch

class MainActivity : AppCompatActivity() {

    // implementation 'com.polyak:icon-switch:1.0.0'
    //add above dependency in build.gradle file

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val iconSwitch = findViewById<IconSwitch>(R.id.icon_switch)
        iconSwitch.setCheckedChangeListener { current ->
            when (current) {
                IconSwitch.Checked.LEFT -> Toast.makeText(this@MainActivity, "Left", Toast.LENGTH_SHORT).show()
                IconSwitch.Checked.RIGHT -> Toast.makeText(this@MainActivity, "Right", Toast.LENGTH_SHORT).show()
            }
        }

    }
}
