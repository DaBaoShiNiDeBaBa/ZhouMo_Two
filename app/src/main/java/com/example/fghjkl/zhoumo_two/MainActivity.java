package com.example.fghjkl.zhoumo_two;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private Button one;
    private Button dian;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
    }

    private void initView() {
        one = (Button) findViewById(R.id.one);

        one.setOnClickListener(this);
        dian = (Button) findViewById(R.id.dian);
        dian.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.one:

                break;
            case R.id.dian:
                Intent intent = new Intent(this, Main2Activity.class);
                startActivity(intent);
                break;
        }
    }
}
