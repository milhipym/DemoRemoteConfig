package com.choi.demoremoteconfig;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.Fragment;

import android.os.Bundle;
import android.util.Log;
import android.view.View;

import com.airbnb.lottie.LottieAnimationView;
import com.google.android.material.appbar.AppBarLayout;

public class MainActivity extends AppCompatActivity {
    Fragment fragment1, fragment2;
    final int NUM_PAGES = 2;
    LottieAnimationView lottieBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Toolbar toolbar = findViewById(R.id.toolbar);
        //toolbar.setTitle("RM Demo");
        //setSupportActionBar(toolbar);
        if (getSupportActionBar() != null) {getSupportActionBar().setDisplayHomeAsUpEnabled(true);}

        lottieBtn = findViewById(R.id.lottie_whether);
        lottieBtn.playAnimation();

        AppBarLayout appBarLayout = findViewById(R.id.app_bar_layout);
        appBarLayout.addOnOffsetChangedListener(new AppBarLayout.BaseOnOffsetChangedListener() {
            @Override
            public void onOffsetChanged(AppBarLayout appBarLayout, int verticalOffset) {
                Log.e("YYYM", "onOffsetChanged: " + verticalOffset);
            }
        });
    }
}