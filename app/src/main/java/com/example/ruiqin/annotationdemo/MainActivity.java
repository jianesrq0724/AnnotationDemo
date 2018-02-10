package com.example.ruiqin.annotationdemo;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import com.example.ruiqin.annotationdemo.findview.BindView;
import com.example.ruiqin.annotationdemo.test1.Subscribe;

public class MainActivity extends AppCompatActivity {

    @BindView(id = R.id.test_tv, click = false)
    TextView mTestTv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Subscribe(value = "ruiqin.shen")
    public void onMessage(String message) {

    }
}
