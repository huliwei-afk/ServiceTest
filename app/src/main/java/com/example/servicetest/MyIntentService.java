package com.example.servicetest;

import android.app.IntentService;
import android.content.Intent;
import android.util.Log;

import androidx.annotation.Nullable;

public class MyIntentService extends IntentService {

    public MyIntentService(){
        super("MyIntentService");//调用父类有参构造
    }

    @Override
    protected void onHandleIntent(@Nullable Intent intent) {
        //打印当前线程id
        Log.d("MyIntentService","Thread is " + Thread.currentThread().getId());
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        Log.d("MyIntentService", "onDestroy executed");
    }
}
