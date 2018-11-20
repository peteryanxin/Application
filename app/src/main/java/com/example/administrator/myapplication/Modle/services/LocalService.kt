package com.example.administrator.myapplication.Modle.services

import android.app.Service
import android.content.Intent
import android.os.Binder
import android.os.IBinder
import android.util.Log

class LocalService:Service() {

    val TAG = RemoteSerice::class.java.simpleName

    override fun onBind(intent: Intent?): IBinder? {

        Log.d(TAG,"onbind")
        return null
    }

    override fun onStartCommand(intent: Intent?, flags: Int, startId: Int): Int {
        Log.d(TAG,"onStartCommand")
        return super.onStartCommand(intent, flags, startId)
    }

    override fun onCreate() {
        Log.d(TAG,"onCreate")
        super.onCreate()
    }

    override fun onUnbind(intent: Intent?): Boolean {
        Log.d(TAG,"onUnbind")
        return super.onUnbind(intent)
    }

    override fun onDestroy() {
        Log.d(TAG,"onDestroy")
        super.onDestroy()
    }

    class MyBinder : Binder(){
        fun getMethod(){

        }
    }
}