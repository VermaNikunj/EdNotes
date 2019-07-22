package com.nikunjpc.appdemo.BtechCSESub;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;

import com.nikunjpc.appdemo.ClgStart.ClgActivity;
import com.nikunjpc.appdemo.R;
//import androidx.appcompat.app.AppCompatActivity;
public class BtechCSE8thSub extends AppCompatActivity {

    ImageButton Subject1;
    ImageButton Subject2;
    ImageButton Subject3;
    ImageButton Subject4;
    ImageButton Subject5;
    ImageButton Subject6;
    TextView Name1;
    TextView Name2;
    TextView Name3;
    TextView Name4;
    TextView Name5;
    TextView Name6;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_btech_cse8th_sub);

        Subject1=(ImageButton) findViewById(R.id.imgbt1);
        Subject2=(ImageButton) findViewById(R.id.imgbt2);
        Subject3=(ImageButton) findViewById(R.id.imgbt3);
        Subject4=(ImageButton) findViewById(R.id.imgbt4);
        Subject5=(ImageButton) findViewById(R.id.imgbt5);
        Subject6=(ImageButton) findViewById(R.id.imgbt6);

        Name1 = (TextView) findViewById(R.id.tvsub1);
        Name2 = (TextView) findViewById(R.id.tvsub2);
        Name3 = (TextView) findViewById(R.id.tvsub3);
        Name4 = (TextView) findViewById(R.id.tvsub4);
        Name5 = (TextView) findViewById(R.id.tvsub5);
        Name6 = (TextView) findViewById(R.id.tvsub6);

        Subject1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(BtechCSE8thSub.this, ClgActivity.class);
                startActivity(intent);
            }
        });

        Subject2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(BtechCSE8thSub.this, ClgActivity.class);
                startActivity(intent);
            }
        });

        Subject3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(BtechCSE8thSub.this, ClgActivity.class);
                startActivity(intent);
            }
        });

        Subject4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(BtechCSE8thSub.this, ClgActivity.class);
                startActivity(intent);
            }
        });

        Subject5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(BtechCSE8thSub.this, ClgActivity.class);
                startActivity(intent);
            }
        });

        Subject6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(BtechCSE8thSub.this, ClgActivity.class);
                startActivity(intent);
            }
        });

        Name1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(BtechCSE8thSub.this, ClgActivity.class);
                startActivity(intent);
            }
        });

        Name2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(BtechCSE8thSub.this, ClgActivity.class);
                startActivity(intent);
            }
        });

        Name3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(BtechCSE8thSub.this, ClgActivity.class);
                startActivity(intent);
            }
        });

        Name4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(BtechCSE8thSub.this, ClgActivity.class);
                startActivity(intent);
            }
        });

        Name5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(BtechCSE8thSub.this, ClgActivity.class);
                startActivity(intent);
            }
        });

        Name6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(BtechCSE8thSub.this, ClgActivity.class);
                startActivity(intent);
            }
        });

    }
}
