package com.example.leonjobs.qzbleonapp;

import android.provider.Settings;
import android.support.annotation.IdRes;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private Button loginButton;
    private Button loginButton2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        loginButton = (Button) findViewById(R.id.button);
        loginButton2 = (Button) findViewById(R.id.button2);

//        loginButton.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//
//                //TODO OnClick function;
        //TODO This is class extends by MyOnClickListner
//                System.out.println("I have be touched.");
//            }
//        });
        loginButton.setOnClickListener(new MyOnClickListener(){
            @Override
            public void onClick(View v){
                super.onClick(v);
                Toast.makeText(MainActivity.this,"bt1要执行的逻辑",1 ).show();
            }
        });
        loginButton2.setOnClickListener(new MyOnClickListener(){
            @Override
            public void onClick(View v){
                super.onClick(v);
                Toast.makeText(MainActivity.this,"Button2要执行的逻辑",1).show();
            }
        });

    }
}
class MyOnClickListener implements View.OnClickListener {
    @Override
    public void onClick(View v){
        Log.i("tag","父类的OnClick事件");
        v.setAlpha(0.3f);
        // TODO 以后所有按钮可以加共同特效
        // TODO 外部类减少了冗余代码
    }
}
