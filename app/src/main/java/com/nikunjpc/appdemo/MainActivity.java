package com.nikunjpc.appdemo;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.nikunjpc.appdemo.ClgStart.Clg_Menu;
import com.nikunjpc.appdemo.NavigationMenu.AboutActivity;
import com.nikunjpc.appdemo.NavigationMenu.AccountActivity;
import com.nikunjpc.appdemo.NavigationMenu.ContactActivity;
import com.nikunjpc.appdemo.NavigationMenu.SettingActivity;
import com.nikunjpc.appdemo.NavigationMenu.UploadActivity;
import com.nikunjpc.appdemo.SchStart.Sch_Menu;
import com.smarteist.autoimageslider.DefaultSliderView;
import com.smarteist.autoimageslider.IndicatorAnimations;
import com.smarteist.autoimageslider.SliderLayout;
import com.smarteist.autoimageslider.SliderView;

//import androidx.annotation.NonNull;
//import androidx.appcompat.app.ActionBarDrawerToggle;
//import androidx.appcompat.app.AppCompatActivity;
//import androidx.core.view.GravityCompat;
//import androidx.drawerlayout.widget.DrawerLayout;

public class MainActivity extends AppCompatActivity
{
    private DrawerLayout mdrawer;
    private ActionBarDrawerToggle mt;
    Button btCollege;
    Button btSchool;
    TextView Hello;
    SliderLayout sliderLayout;

    private NavigationView.OnNavigationItemSelectedListener mOnNavigationItemSelectedListener
            = new NavigationView.OnNavigationItemSelectedListener() {
        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem item) {
            switch (item.getItemId()) {
                case R.id.nav_dashboard: {
                    Intent intent = new Intent(MainActivity.this, MainActivity.class);
                    startActivity(intent); break;
                }
                case R.id.nav_college: {
                    Intent intent = new Intent(MainActivity.this, Clg_Menu.class);
                    startActivity(intent); break;
                }
                case R.id.nav_school: {
                    Intent intent = new Intent(MainActivity.this, Sch_Menu.class);
                    startActivity(intent); break;
                }
                case R.id.nav_upload: {
                    Intent intent = new Intent(MainActivity.this, UploadActivity.class);
                    startActivity(intent); break;
                }
                case R.id.nav_account: {
                    Intent intent = new Intent(MainActivity.this, AccountActivity.class);
                    startActivity(intent); break;
                }
                case R.id.nav_settings: {
                    Intent intent = new Intent(MainActivity.this, SettingActivity.class);
                    startActivity(intent); break;
                }
                case R.id.nav_about: {
                    Intent intent = new Intent(MainActivity.this, AboutActivity.class);
                    startActivity(intent); break;
                }
                case R.id.nav_contact: {
                    Intent intent = new Intent(MainActivity.this, ContactActivity.class);
                    startActivity(intent); break;
                }

            }
            return false;
        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btCollege = (Button) findViewById(R.id.btcollege);
        btSchool = (Button) findViewById(R.id.btschool);
        Hello = (TextView) findViewById(R.id.tvHello);

        mdrawer=(DrawerLayout) findViewById(R.id.drawer);
        mt = new ActionBarDrawerToggle(this, mdrawer, R.string.Open, R.string.Close);

        NavigationView nav = (NavigationView) findViewById(R.id.nav);
        nav.setNavigationItemSelectedListener(mOnNavigationItemSelectedListener);

        mdrawer.addDrawerListener(mt);
        mt.syncState();

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        mt.getToolbarNavigationClickListener();

        btCollege.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, Clg_Menu.class);
                startActivity(intent);
            }
        });

        btSchool.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, Sch_Menu.class);
                startActivity(intent);
            }
        });

        sliderLayout = findViewById(R.id.imageSlider);
        sliderLayout.setIndicatorAnimation(IndicatorAnimations.FILL); //set indicator animation by using SliderLayout.Animations. :WORM or THIN_WORM or COLOR or DROP or FILL or NONE or SCALE or SCALE_DOWN or SLIDE and SWAP!!
        sliderLayout.setScrollTimeInSec(1); //set scroll delay in seconds :

        setSliderViews();

    }

    @Override
    public void onBackPressed() {
        if(mdrawer.isDrawerOpen( GravityCompat.START)){
            mdrawer.closeDrawer(GravityCompat.START);
        }
        else {
        super.onBackPressed();
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.nav_demo, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if(mt.onOptionsItemSelected(item))
        {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }

    private void setSliderViews() {

        for (int i = 0; i < 3; i++) {

            DefaultSliderView sliderView = new DefaultSliderView(this);

            switch (i) {
                case 0:
                    sliderView.setImageUrl("https://images.pexels.com/photos/547114/pexels-photo-547114.jpeg?auto=compress&cs=tinysrgb&dpr=2&h=750&w=1260");
                    break;
                case 1:
                    sliderView.setImageUrl("https://images.pexels.com/photos/218983/pexels-photo-218983.jpeg?auto=compress&cs=tinysrgb&dpr=2&h=750&w=1260");
                    break;
                case 2:
                    sliderView.setImageUrl("https://images.pexels.com/photos/747964/pexels-photo-747964.jpeg?auto=compress&cs=tinysrgb&h=750&w=1260");
                    break;
            }

            sliderView.setImageScaleType(ImageView.ScaleType.CENTER_CROP);
            //sliderView.setDescription("setDescription " + (i + 1));
            final int finalI = i;
            sliderView.setOnSliderClickListener(new SliderView.OnSliderClickListener() {
                @Override
                public void onSliderClick(SliderView sliderView) {
                    Toast.makeText(MainActivity.this, "This is slider " + (finalI + 1), Toast.LENGTH_SHORT).show();
                }
            });

            //at last add this view in your layout :
            sliderLayout.addSliderView(sliderView);
        }
    }
}