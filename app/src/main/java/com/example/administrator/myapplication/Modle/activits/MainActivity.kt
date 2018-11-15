package com.example.administrator.myapplication.Modle.activits

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v4.app.Fragment
import android.util.Log
import android.view.View
import android.widget.RadioButton
import android.widget.RadioGroup
import com.example.administrator.myapplication.R
import com.example.administrator.myapplication.view.fragments.FragmentA
import com.example.administrator.myapplication.view.fragments.FragmentB
import com.example.administrator.myapplication.view.fragments.FragmentC
import kotlinx.android.synthetic.main.activity_mainfragment.*

class MainActivity : AppCompatActivity(), RadioGroup.OnCheckedChangeListener {

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

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_mainfragment)

        fragments.add(FragmentA())
        fragments.add(FragmentB())
        fragments.add(FragmentC())

        rgParent.setOnCheckedChangeListener(this)
        (rgParent.getChildAt(0) as RadioButton).isChecked = true
        replaceFragmet(1)
    }
}
