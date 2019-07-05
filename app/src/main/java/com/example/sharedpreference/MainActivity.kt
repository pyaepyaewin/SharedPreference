package com.example.sharedpreference

import android.content.SharedPreferences
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val preference = MySharedPreference.getInstance(this)
        btnSave.setOnClickListener{
            preference.saveUserName(editTextUserName.text.toString())
            preference.savePhoneNumber(editTextPhNo.text.toString())
        }
        btnClear.setOnClickListener{
            editTextUserName.setText("")
            editTextPhNo.setText("")
        }
        btnRetrieve.setOnClickListener{
            editTextUserName.setText(preference.getUserName())
            editTextPhNo.setText(preference.getPhoneNumber())
        }

    }
}
