package com.bamboy.viewflipperdemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ViewFlipper;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initViewFlipper(R.id.vf_1);
        initViewFlipper(R.id.vf_2);
        initViewFlipper(R.id.vf_3);
        initViewFlipper(R.id.vf_4);
        initViewFlipper(R.id.vf_5);
        initViewFlipper(R.id.vf_6);
        initViewFlipper(R.id.vf_7);
    }


    private void initViewFlipper(int id) {
        ViewFlipper vf = findViewById(id);

        View item1 = View.inflate(this, R.layout.item, null);
        View item2 = View.inflate(this, R.layout.item, null);
        View item3 = View.inflate(this, R.layout.item, null);

        vf.addView(item1);
        vf.addView(item2);
        vf.addView(item3);
    }

}
