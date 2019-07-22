package com.nikunjpc.appdemo.ClgStart;

import android.app.DownloadManager;
import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.webkit.DownloadListener;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.TextView;
import android.widget.Toast;

//import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
//import com.google.android.material.bottomnavigation.BottomNavigationView;
//import com.google.android.material.navigation.NavigationView;
import com.nikunjpc.appdemo.MainActivity;
import com.nikunjpc.appdemo.NavigationMenu.AboutActivity;
import com.nikunjpc.appdemo.NavigationMenu.AccountActivity;
import com.nikunjpc.appdemo.NavigationMenu.ContactActivity;
import com.nikunjpc.appdemo.NavigationMenu.SettingActivity;
import com.nikunjpc.appdemo.NavigationMenu.UploadActivity;
import com.nikunjpc.appdemo.R;
import com.nikunjpc.appdemo.SchStart.Sch_Menu;

//import androidx.annotation.NonNull;
//import androidx.appcompat.app.ActionBarDrawerToggle;
//import androidx.appcompat.app.AppCompatActivity;
//import androidx.core.view.GravityCompat;
//import androidx.drawerlayout.widget.DrawerLayout;

public class ClgActivity extends AppCompatActivity{

    long BackPressedTime;
    DrawerLayout mdrawer;
    ActionBarDrawerToggle mt;
    WebView wv;
    int i=0;


    private NavigationView.OnNavigationItemSelectedListener mOnNavigationItemSelectedListener
            = new NavigationView.OnNavigationItemSelectedListener() {
        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem item) {
            switch (item.getItemId()) {
                case R.id.nav_dashboard: {
                    Intent intent = new Intent(ClgActivity.this, MainActivity.class);
                    startActivity(intent); break;
                }
                case R.id.nav_college: {
                    Intent intent = new Intent(ClgActivity.this, Clg_Menu.class);
                    startActivity(intent); break;
                }
                case R.id.nav_school: {
                    Intent intent = new Intent(ClgActivity.this, Sch_Menu.class);
                    startActivity(intent); break;
                }
                case R.id.nav_upload: {
                    Intent intent = new Intent(ClgActivity.this, UploadActivity.class);
                    startActivity(intent); break;
                }
                case R.id.nav_account: {
                    Intent intent = new Intent(ClgActivity.this, AccountActivity.class);
                    startActivity(intent); break;
                }
                case R.id.nav_settings: {
                    Intent intent = new Intent(ClgActivity.this, SettingActivity.class);
                    startActivity(intent); break;
                }
                case R.id.nav_about: {
                    Intent intent = new Intent(ClgActivity.this, AboutActivity.class);
                    startActivity(intent); break;
                }
                case R.id.nav_contact: {
                    Intent intent = new Intent(ClgActivity.this, ContactActivity.class);
                    startActivity(intent); break;
                }
            }
            return false;
        }
    };

//    private BottomNavigationView.OnNavigationItemSelectedListener mOnBottomNavigationItemSelectedListener
//            = new BottomNavigationView.OnNavigationItemSelectedListener() {
//        @Override
//        public boolean onNavigationItemSelected(@NonNull MenuItem item) {
//            switch (item.getItemId()) {
//
//                case R.id.notes_clg: {
//                    final WebView webview;
//                    webview=(WebView) findViewById(R.id.webview1);
//                    webview.getSettings().setJavaScriptEnabled(true);
//                    webview.loadUrl("https://drive.google.com/drive/folders/1Ggf9qYaFVXzLD4RqedZ7iohlQqlkNR3_?ogsrc=32");
//                    return true;    }
//                case R.id.paper_clg: {
//                    final WebView webview;
//                    webview =(WebView) findViewById(R.id.webview1);
//                    webview.loadUrl("https://drive.google.com/drive/folders/1Ggf9qYaFVXzLD4RqedZ7iohlQqlkNR3_?usp=sharing");
//                    return true;    }
//
//                case R.id.books_clg: {
//                    final WebView webview;
//                    webview=(WebView) findViewById(R.id.webview1);
//                    webview.getSettings().setJavaScriptEnabled(true);
//                    webview.loadUrl("https://drive.google.com/drive/folders/1ZV-l8RaMRsHBhDL1KCQwTX5ZCPrmwCkp?usp=sharing");
//                    return true;
//                }
//                case R.id.notice_clg: {   Intent i = new Intent(ClgActivity.this, ClgNoticeActivity.class);
//                    startActivity(i);      return true;    }
//
//                case R.id.tut_clg:{ Intent i = new Intent(ClgActivity.this, ClgActivity.class);
//                    startActivity(i);   return true;   }
//            }
//            return false;
//        }
//    };

    public BottomNavigationView.OnNavigationItemSelectedListener mOnBottomNavigationItemSelectedListener
            = new BottomNavigationView.OnNavigationItemSelectedListener() {
        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem item) {
            switch (item.getItemId()) {

                case R.id.notes_clg: { wv = (WebView) findViewById( R.id.webview1 );
                        wv.loadUrl( "https://drive.google.com/drive/folders/1ZV-l8RaMRsHBhDL1KCQwTX5ZCPrmwCkp" );
                    wv.setWebViewClient( new client() );
                    WebSettings ws = wv.getSettings();
                    ws.setJavaScriptEnabled( true );
                    wv.getSettings().setJavaScriptCanOpenWindowsAutomatically( true );
                    wv.clearCache( true );
                    wv.clearHistory();
                    return true;    }
                case R.id.paper_clg: { wv = (WebView) findViewById( R.id.webview1 );
                    wv.loadUrl( "https://drive.google.com/drive/folders/1Ggf9qYaFVXzLD4RqedZ7iohlQqlkNR3_" );
                    wv.setWebViewClient( new client() );
                    WebSettings ws = wv.getSettings();
                    ws.setJavaScriptEnabled( true );
                    wv.getSettings().setJavaScriptCanOpenWindowsAutomatically( true );
                    wv.clearCache( true );
                    wv.clearHistory();

                    return true;    }

                case R.id.books_clg: { wv = (WebView) findViewById( R.id.webview1 );
                wv.loadUrl( "https://drive.google.com/drive/folders/1ZV-l8RaMRsHBhDL1KCQwTX5ZCPrmwCkp" );
                wv.setWebViewClient( new client() );
                    WebSettings ws = wv.getSettings();
                    ws.setJavaScriptEnabled( true );
                    wv.getSettings().setJavaScriptCanOpenWindowsAutomatically( true );
                    wv.clearCache( true );
                    wv.clearHistory();

                    return true;
                }
                case R.id.notice_clg: {   Intent i = new Intent(ClgActivity.this, ClgNoticeActivity.class);
                    startActivity(i);      return true;    }

                case R.id.tut_clg:{ wv = (WebView) findViewById( R.id.webview1 );
                wv.loadUrl( "https://drive.google.com/drive/folders/1Ggf9qYaFVXzLD4RqedZ7iohlQqlkNR3_" );
                    wv.setWebViewClient( new client() );
                    WebSettings ws = wv.getSettings();
                    ws.setJavaScriptEnabled( true );
                    wv.getSettings().setJavaScriptCanOpenWindowsAutomatically( true );
                    wv.clearCache( true );
                    wv.clearHistory();   return true;   }
            }
            return false;
        }
    };


    private class client extends WebViewClient{
        @Override
        public void onPageStarted(WebView view, String url, Bitmap favicon) {
            super.onPageStarted( view, url, favicon );
        }

        @Override
        public boolean shouldOverrideUrlLoading(WebView view, String url) {
            view.loadUrl( url );
            return true;
        }

        @Override
        public void onPageFinished(WebView view, String url) {
            super.onPageFinished( view, url );
        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_clg);

        mdrawer=(DrawerLayout) findViewById(R.id.drawer);
        mt = new ActionBarDrawerToggle(this, mdrawer, R.string.Open, R.string.Close);

        NavigationView nav = (NavigationView) findViewById(R.id.nav);
        nav.setNavigationItemSelectedListener(mOnNavigationItemSelectedListener);

        mdrawer.addDrawerListener(mt);
        mt.syncState();

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        mt.getToolbarNavigationClickListener();

        wv = (WebView) findViewById( R.id.webview1 );
        wv.loadUrl( "https://drive.google.com/drive/folders/1Ggf9qYaFVXzLD4RqedZ7iohlQqlkNR3_" );
        wv.setWebViewClient( new client() );
        WebSettings ws = wv.getSettings();
        ws.setJavaScriptEnabled( true );
        wv.getSettings().setJavaScriptCanOpenWindowsAutomatically( true );
        wv.clearCache( true );
        wv.clearHistory();

        BottomNavigationView b_nav = (BottomNavigationView) findViewById(R.id.nav_clg);
        b_nav.setOnNavigationItemSelectedListener(mOnBottomNavigationItemSelectedListener);

        wv.setDownloadListener( new DownloadListener() {
            @Override
            public void onDownloadStart(String url, String s1, String s2, String s3, long l) {

                DownloadManager.Request req = new DownloadManager.Request( Uri.parse( url ) );
                req.setNotificationVisibility( DownloadManager.Request.VISIBILITY_VISIBLE_NOTIFY_COMPLETED );
                DownloadManager dm=(DownloadManager) getSystemService( DOWNLOAD_SERVICE );
                dm.enqueue( req );
                Toast.makeText( getApplicationContext(), "Downloading Started...", Toast.LENGTH_SHORT ).show();
            }
        } );

    }

    @Override
    public void onBackPressed() {
        if(mdrawer.isDrawerOpen( GravityCompat.START)){
            mdrawer.closeDrawer(GravityCompat.START);
        }
        else {
            super.onBackPressed();
            /*if(BackPressedTime+2000>System.currentTimeMillis())
            {   super.onBackPressed();
                return;
            }
            else{
                Toast.makeText(getBaseContext(),"Press back again to exit", Toast.LENGTH_SHORT).show();
            }
            BackPressedTime=System.currentTimeMillis();*/
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

}
