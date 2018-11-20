package com.example.administrator.myapplication.Modle.activits

import android.content.ComponentName
import android.content.Context
import android.content.Intent
import android.content.ServiceConnection
import android.os.Bundle
import android.os.IBinder
import android.os.PersistableBundle
import android.support.v7.app.AppCompatActivity
import android.util.Log
import android.view.View
import com.example.administrator.myapplication.Modle.services.RemoteSerice
import com.example.administrator.myapplication.R
import com.example.administrator.myapplication.controller.bean.EventMessage
import kotlinx.android.synthetic.main.sample.*
import org.greenrobot.eventbus.Subscribe
import org.greenrobot.eventbus.ThreadMode

class Sample : BaseActivity() {

    override fun finishAct() {
        this.finish()
        Log.d(TAG, "finsh")
    }

    override fun initTitle() {
        title.text = "Sample"
        text_left.setOnClickListener {

            this.finish()

        }
        text_right.setOnClickListener {
            startActivity(Intent(this@Sample,DataEncryptionAcvitiy::class.java))
        }
    }

    override fun initData() {
        init()
    }

    override fun getLayout(): Int {
       return R.layout.sample
    }

    val TAG = Sample::class.java.simpleName


    lateinit var mintent: Intent
    lateinit var serviceCon: ServiceConnection
   lateinit var binder : RemoteSerice.MyBinder

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
                            binder = service as RemoteSerice.MyBinder
                    }
                }
            }
            bindService(mintent, serviceCon, Context.BIND_AUTO_CREATE)
        }
        unbind.setOnClickListener {
            if (::serviceCon.isInitialized){
                serviceCon?.apply {
                    unbindService(serviceCon)

                }
            }
        }

    }

    @Subscribe(threadMode = ThreadMode.MAIN)
    fun eventBus(msg: EventMessage){
        if ("event1" == msg.msg) {
            finish()
        }
    }
}