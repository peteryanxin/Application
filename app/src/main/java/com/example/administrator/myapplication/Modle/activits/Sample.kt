package com.example.administrator.myapplication.Modle.activits

import android.content.ComponentName
import android.content.Context
import android.content.Intent
import android.content.ServiceConnection
import android.os.Bundle
import android.os.IBinder
import android.os.PersistableBundle
import android.support.v7.app.AppCompatActivity
import android.view.View
import com.example.administrator.myapplication.Modle.services.RemoteSerice
import com.example.administrator.myapplication.R
import kotlinx.android.synthetic.main.sample.*

class Sample : AppCompatActivity() {

    val TAG = Sample::class.java.simpleName

    override fun onCreate(savedInstanceState: Bundle?, persistentState: PersistableBundle?) {
        super.onCreate(savedInstanceState, persistentState)

        setContentView(R.layout.sample)

        init()
    }

    lateinit var mintent: Intent
    lateinit var serviceCon: ServiceConnection

    private fun init() {

        mintent = Intent(this, RemoteSerice::class.java)

        start.setOnClickListener {
            startService(mintent)
        }
        stop.setOnClickListener {
            stopService(mintent)
        }

        bind.setOnClickListener {

            if (!::serviceCon.isInitialized){
                serviceCon = object:ServiceConnection{
                    override fun onServiceDisconnected(name: ComponentName?) {

                    }

                    override fun onServiceConnected(name: ComponentName?, service: IBinder?) {

                    }
                }
            }
            bindService(mintent, serviceCon, Context.BIND_AUTO_CREATE)
        }
        unbind.setOnClickListener {
            
        }
    }
}