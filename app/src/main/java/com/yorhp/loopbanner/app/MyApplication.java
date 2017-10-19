package com.yorhp.loopbanner.app;

import android.app.Application;

import com.squareup.picasso.LruCache;
import com.squareup.picasso.Picasso;

/**
 * Created by Tyhj on 2017/10/18.
 */

public class MyApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        initPicasso();
    }

    //Picasso初始化
    private void initPicasso() {
        Picasso picasso = new Picasso.Builder(this)
                .memoryCache(new LruCache(10 << 20))//设置内存缓存大小10M
                //.indicatorsEnabled(false) //设置左上角标记，主要用于测试
                .build();
        Picasso.setSingletonInstance(picasso);
    }

}
