package com.example.administrator.myapplication.Modle.activits

import android.content.Intent
import android.graphics.Color
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v4.app.Fragment
import android.util.Log
import android.view.View
import android.widget.RadioButton
import android.widget.RadioGroup
import android.widget.Toast
import com.example.administrator.myapplication.R
import com.example.administrator.myapplication.view.fragments.FragmentA
import com.example.administrator.myapplication.view.fragments.FragmentB
import com.example.administrator.myapplication.view.fragments.FragmentC
import kotlinx.android.synthetic.main.activity_mainfragment.*

class MainActivity : BaseActivity(), RadioGroup.OnCheckedChangeListener {
    override fun finishAct() {

    }

    override fun initTitle() {
        title.text = "MainActivity"
//        title.setBackgroundColor(Color.RED)
        text_right.visibility = View.GONE
        text_left.visibility = View.GONE
    }



    override fun initData() {
        fragments.add(FragmentA())
        fragments.add(FragmentB())
        fragments.add(FragmentC())

        rgParent.setOnCheckedChangeListener(this)
        (rgParent.getChildAt(0) as RadioButton).isChecked = true
        replaceFragmet(1)
    }

    override fun getLayout(): Int {

        return R.layout.activity_mainfragment
    }

    val Tag = MainActivity::class.java.simpleName

    var fragments = ArrayList<Fragment>()

    override fun onCheckedChanged(group: RadioGroup?, checkedId: Int) {

        val checkedRadioButtonId = group?.checkedRadioButtonId
        Log.d(Tag, "checkId====$checkedId---------,chekcoutbuid$checkedRadioButtonId")

        group?.apply {

            val view:View? = getChildAt(checkedId)
            (view as? RadioButton)?.isChecked ?: true
            replaceFragmet(checkedId)
        }

    }

    private fun replaceFragmet(checkit:Int) {
        val transaction = supportFragmentManager.beginTransaction()
        transaction.replace(R.id.basecontainer,fragments[checkit-1])
        transaction.commit()
    }



    override fun onBackPressed() {

        Toast.makeText(this,"show",Toast.LENGTH_SHORT).show()
    }
}
