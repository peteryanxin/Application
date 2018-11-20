package com.example.administrator.myapplication.view.fragments

import android.app.Activity
import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.ContextMenu
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.administrator.myapplication.Modle.activits.HttpActivity
import com.example.administrator.myapplication.Modle.activits.MainActivity
import com.example.administrator.myapplication.Modle.activits.Sample
import com.example.administrator.myapplication.R
import kotlinx.android.synthetic.main.fragmenta.view.*

class FragmentA: Fragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.fragmenta,container,false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        view.sample.setOnClickListener {
            startActivity(Intent(this@FragmentA.context , Sample::class.java))
        }

        view.http.setOnClickListener {
            startActivity(Intent(this@FragmentA.context , HttpActivity::class.java))
        }
    }
}