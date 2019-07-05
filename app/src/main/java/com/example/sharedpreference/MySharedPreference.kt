package com.example.sharedpreference

import android.content.Context
import com.example.sharedpreference.MySharedPreference.Companion.PREFERENCE_NAME

class MySharedPreference(context: Context) {
    private val sharedPreference = context.getSharedPreferences(PREFERENCE_NAME, Context.MODE_PRIVATE)

    companion object {
        const val PREFERENCE_NAME = "SharedPreference"
        const val USERNAME = "username"
        const val PHONE_NUMBER = "phonenumber"


    private var instance: MySharedPreference? = null

    fun getInstance(context: Context): MySharedPreference {
        if (instance == null) {
            instance = MySharedPreference (context)
        }
    return instance as MySharedPreference
}}
    fun saveUserName(userName:String)
   {
       sharedPreference.edit().putString(USERNAME,userName).apply()
   }
     fun getUserName():String?
    {
        return sharedPreference.getString(USERNAME,null)
    }
    fun savePhoneNumber(phoneNumber:String)
    {
        sharedPreference.edit().putString(PHONE_NUMBER,phoneNumber).apply()
    }
     fun getPhoneNumber():String?
    {
        return sharedPreference.getString(PHONE_NUMBER,null)
    }


}