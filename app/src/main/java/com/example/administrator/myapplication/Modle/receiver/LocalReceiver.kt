package com.example.administrator.myapplication.Modle.receiver

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import android.util.Log

class LocalReceiver:BroadcastReceiver() {

    val TAG = LocalReceiver::class.java.simpleName
    /*
    *
    *  <action android:name="android.intent.action.SCREEN_OFF"/>
                <action android:name="android.intent.action.SCREEN_ON"/>
    * */
    override fun onReceive(context: Context?, intent: Intent?) {

        var action = intent?.action

        when(action){
           Intent.ACTION_SCREEN_ON -> Log.d(TAG,"Screen ON")
           Intent.ACTION_SCREEN_OFF -> Log.d(TAG,"Screen OFF")
        }
    }
}