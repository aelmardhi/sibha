package com.aelmardhi.a.myapplication;

import android.support.constraint.ConstraintLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    Random ran ;
    int count = 0;
    TextView lab ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ran = new Random();
        lab = (TextView)findViewById(R.id.textView);
        Toast.makeText(MainActivity.this,R.string.message,Toast.LENGTH_LONG).show();
        final RelativeLayout btn =((RelativeLayout) findViewById(R.id.all));
        btn.setBackgroundColor(0xff000000);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                change((RelativeLayout) v);
            }
        });
        btn.setOnLongClickListener(new View.OnLongClickListener(){

            @Override
            public boolean onLongClick(View v) {
                count = 0;
                lab.setText(count+"");
                return true;
            }
        });

    }

    void change (RelativeLayout b){
        int i = ran.nextInt(0xffffff);
        b.setBackgroundColor(0xff000000|i);
        count ++;

        lab.setText(count+"");
       // b.setText("");
    }
}
