package com.micheis.rxdemo;

import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

//import com.micheis.rxkit.RxTools;

/**
 * ================================================
 *
 * @Description: 描述
 * @Author: wxianing
 * @Date: 2024/6/23 16:51
 * ================================================
 */
public class MainActivity extends AppCompatActivity {

    private TextView tv_text;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tv_text = findViewById(R.id.tv_text);

//        tv_text.setOnClickListener(v -> {
//            RxTools.delayToDo(3000, () -> {
//                Toast.makeText(RxTools.getContext(), "你点击了按钮", Toast.LENGTH_LONG).show();
//            });
//        });
    }
}