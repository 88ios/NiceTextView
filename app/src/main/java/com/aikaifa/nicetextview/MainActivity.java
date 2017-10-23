package com.aikaifa.nicetextview;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Toast;
/**
 * 作者：hsp on 2017/10/23 09:41
 * 微信公众号： aikaifa
 * QQ 交流群: 154950206
 */
public class MainActivity extends AppCompatActivity {

    NiceTextView tv_login;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
    }

    private void initView() {
        tv_login = (NiceTextView) findViewById(R.id.tv_login);
        tv_login.setOnNiceTextViewClickListener(new NiceTextView.OnNiceTextViewClickListener() {
            @Override
            public void onNiceTextViewClick() {
                startActivity(new Intent(MainActivity.this, MineActivity.class));
            }

            @Override
            public void onLeftTopClick() {
                Toast.makeText(getApplicationContext(), "onLeftTopClick",
                        Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onLeftBottomClick() {
                Toast.makeText(getApplicationContext(), "onLeftBottomClick",
                        Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onLeftBottomClickTwo() {

            }
        });
    }

}
