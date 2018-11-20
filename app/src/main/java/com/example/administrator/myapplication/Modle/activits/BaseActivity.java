package com.example.administrator.myapplication.Modle.activits;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.example.administrator.myapplication.R;
import com.example.administrator.myapplication.controller.bean.EventMessage;
import org.greenrobot.eventbus.EventBus;
import org.greenrobot.eventbus.Subscribe;
import org.greenrobot.eventbus.ThreadMode;

public abstract class BaseActivity extends AppCompatActivity {

    protected TextView title;
    protected TextView text_left;
    protected TextView text_right;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_base);

        title = findViewById(R.id.title_bart_tv_middle);
        text_left = findViewById(R.id.title_bart_tv_left);
        text_right = findViewById(R.id.title_bart_tv_right);

        FrameLayout view = findViewById(R.id.fl_container);

        View v = LayoutInflater.from(this).inflate(getLayout(), null);
        view.addView(v);

        EventBus.getDefault().register(this);

        initTitle();

        initData();
    }

    protected abstract void initTitle();

    protected abstract void initData();

    protected abstract int getLayout();

    protected abstract void finishAct();

    @Override
    public void onBackPressed() {
//        finishAct();
//        startActivity(new Intent(this,MainActivity.class));

        EventMessage message = new EventMessage();
        message.setMsg("event1");
        EventBus.getDefault().post(message);
    }

    @Subscribe(threadMode = ThreadMode.MAIN)
    public void eventBuss(EventMessage msg){}

    @Override
    protected void onDestroy() {
        super.onDestroy();
        EventBus.getDefault().unregister(this);
    }
}
