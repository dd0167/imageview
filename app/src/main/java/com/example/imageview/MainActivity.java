package com.example.imageview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    Button btn;
    ImageView imv;
    int t1;
    int t2;
    int t3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn=(Button) findViewById(R.id.btn);
        imv=(ImageView) findViewById(R.id.imv);
        t1=R.drawable.one;
        t2=R.drawable.two;
        t3=R.drawable.three;

    }

    public void click(View view) {

        int r= (int) (Math.random()*(3-1+1)+1);
        if(r==1)
        {
            btn.setText("1");
            imv.setImageResource(t1);
        }
        if(r==2)
        {
            btn.setText("2");
            imv.setImageResource(t2);
        }
        if(r==3)
        {
            btn.setText("3");
            imv.setImageResource(t3);
        }
    }
}
