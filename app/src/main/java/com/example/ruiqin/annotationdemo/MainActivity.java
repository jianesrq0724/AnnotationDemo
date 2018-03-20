package com.example.ruiqin.annotationdemo;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import com.ruiqin.annotation.Test;

@Test()
public class MainActivity extends AppCompatActivity {

    //    @BindView(id = R.id.test_tv, click = false)
    TextView mTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }


}
