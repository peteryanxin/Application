package com.example.administrator.myapplication.Modle.activits;

import android.content.Intent;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Toast;
import com.example.administrator.myapplication.R;
import com.example.administrator.myapplication.controller.bean.EventMessage;
import okhttp3.*;
import org.greenrobot.eventbus.EventBus;
import org.greenrobot.eventbus.Subscribe;
import org.greenrobot.eventbus.ThreadMode;

import java.io.IOException;

public class HttpActivity extends BaseActivity {

    private static final String TAG = HttpActivity.class.getSimpleName();
    String url = "http://www.baidu.com";

    @Override
    protected void initTitle() {
        title.setText("HttpActivity");

        text_left.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                HttpActivity.this.finish();
            }
        });
        text_right.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(HttpActivity.this,Sample.class));
            }
        });

    }

    @Override
    protected void initData() {
        initOkHttp();
    }

    @Override
    protected int getLayout() {
        return R.layout.http_activity;
    }

    @Override
    protected void finishAct() {
      this. finish();
       Log.d(TAG,"finsh");
    }

    private void initOkHttp() {

//        String url = "http://www.baidu.com";
        OkHttpClient client = new OkHttpClient();
        Request request = new Request.Builder().url(url).get().build();
        Call call = client.newCall(request);

    }


    // get
    public void get(View view){
//        String url = "http://www.baidu.com";
        OkHttpClient client = new OkHttpClient();
        Request request = new Request.Builder().url(url).get().build();
        Log.d(TAG,request.toString());

        final Call call = client.newCall(request);

        // Sync
        new Thread(new Runnable() {
            @Override
            public void run() {
                try {

                    Response response = call.execute();
                    Log.d(TAG,response.toString());
                    Log.d(TAG,response.body().string());
                    Log.d(TAG,response.protocol().toString());
                    Log.d(TAG,response.isSuccessful()+"");

                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }).start();
        Toast.makeText(this,"get",Toast.LENGTH_SHORT).show();
    }

    // post
    public void post(View view){

        OkHttpClient client = new OkHttpClient() ;
        Request request = new Request.Builder().url(url).get().build();
        Call call = client.newCall(request);

        // Async
        call.enqueue(new Callback() {
            @Override
            public void onFailure(Call call, IOException e) {

            }

            @Override
            public void onResponse(Call call, Response response) throws IOException {
                Log.d(TAG,response.toString());
                Log.d(TAG,response.body().string());
                Log.d(TAG,response.protocol().toString());
                Log.d(TAG,response.isSuccessful()+"");

            }
        });
    }
    //loadimg
    public void loadimg(View view){

    }
    //upload
    public void upload(View view){

    }

    @Subscribe(threadMode = ThreadMode.MAIN)
    public void event(EventMessage msg){
        if ("event1".equals(msg.getMsg())){
            finish();
        }
    }
}
