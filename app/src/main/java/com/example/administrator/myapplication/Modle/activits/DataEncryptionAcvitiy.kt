package com.example.administrator.myapplication.Modle.activits

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.util.Log
import android.view.View
import android.widget.Toast
import com.example.administrator.myapplication.R
import com.example.administrator.myapplication.controller.bean.EventMessage
import com.example.administrator.myapplication.controller.utils.MD5
import kotlinx.android.synthetic.main.activity_dataencrypt.*
import org.greenrobot.eventbus.EventBus
import org.greenrobot.eventbus.Subscribe
import org.greenrobot.eventbus.ThreadMode

class DataEncryptionAcvitiy : BaseActivity() {

    val TAG = DataEncryptionAcvitiy::class.java.simpleName

    override fun finishAct() {
        this.finish()
        Log.d(TAG, "finsh")
    }

    override fun initTitle() {
        title.text = "MD5转换"
       /* text_left.setOnClickListener {

            this.finish()

        }*/
        text_left.visibility = View.INVISIBLE
        text_right.setOnClickListener {
            startActivity(Intent(this@DataEncryptionAcvitiy,HttpActivity::class.java))
        }
    }

    override fun initData() {
        init()
    }

    override fun getLayout(): Int {
        return R.layout.activity_dataencrypt
    }

    private fun init() {

        encode.setOnClickListener {

            var etContent = et_content.text.toString().trim()
            if ("".equals(etContent) || etContent == null ){
                Toast.makeText(this@DataEncryptionAcvitiy,"input value should not null",Toast.LENGTH_SHORT).show()
                return@setOnClickListener
            }

            val md  = MD5.convertMD5(etContent)

            // 这个是md5加密
//            val md  = MD5.string2MD5(etContent)
            tomd5.text = md
        }

        decode.setOnClickListener {

            var tomd = tomd5.text.toString().trim()
            if ("".equals(tomd) || tomd == null ){
                Toast.makeText(this@DataEncryptionAcvitiy,"tomd value is null",Toast.LENGTH_SHORT).show()
                return@setOnClickListener
            }

            val md = MD5.convertMD5(tomd)
            frommd5.text = md
        }
    }

    @Subscribe(threadMode = ThreadMode.MAIN)
    fun eventBus(msg:EventMessage){
        if ("event1" == msg.msg) {
            finish()
        }
    }
}
