package com.example.yariapp.utils

import android.content.Context

object SharedPreferencesUtils {

    fun cleanSharedPref(context: Context){
        val sharedPreferences =context.getSharedPreferences("YariApp", Context.MODE_PRIVATE)
        val editor = sharedPreferences.edit()
        editor.clear()
        editor.apply()
    }

    fun clearkey(context: Context, key:String){
        val sharedPreferences = context.getSharedPreferences("YariApp", Context.MODE_PRIVATE)
        val editor = sharedPreferences.edit()
        editor.remove(key)
        editor.apply()

    }
}