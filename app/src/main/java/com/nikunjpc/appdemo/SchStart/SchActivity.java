package com.nikunjpc.appdemo.SchStart;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.widget.TextView;
//
//import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.nikunjpc.appdemo.R;

//import androidx.annotation.NonNull;
//import androidx.appcompat.app.AppCompatActivity;
public class SchActivity extends AppCompatActivity {

    private TextView mTextMessage;

    private BottomNavigationView.OnNavigationItemSelectedListener mOnNavigationItemSelectedListener
            = new BottomNavigationView.OnNavigationItemSelectedListener() {

        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem item) {
            switch (item.getItemId()) {
                case R.id.navigation_ncert:
                    mTextMessage.setText("NCERT");
                    return true;
                case R.id.navigation_notes:
                    mTextMessage.setText("Notes");
                    return true;
                case R.id.navigation_paper:
                    mTextMessage.setText("Question Paper");
                    return true;
                case R.id.navigation_books:
                    mTextMessage.setText("Books");
                    return true;
                case R.id.navigation_notice:
                {
                    Intent i = new Intent(SchActivity.this, SchNoticeActivity.class);
                    startActivity(i);
                    return true;    }
            }
            return false;
        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sch);

        mTextMessage = (TextView) findViewById(R.id.message);
        BottomNavigationView navigation = (BottomNavigationView) findViewById(R.id.navigation);
        navigation.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener);
    }

}
