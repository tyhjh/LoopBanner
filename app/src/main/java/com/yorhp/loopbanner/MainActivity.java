package com.yorhp.loopbanner;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.yorhp.loopbanner.view.LoopBannerView;

public class MainActivity extends AppCompatActivity {

    LoopBannerView lb_view;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        lb_view= (LoopBannerView) findViewById(R.id.lb_view);
        lb_view.startLoop();
    }
}
