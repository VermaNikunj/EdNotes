package com.nikunjpc.appdemo.NavigationMenu;

import android.Manifest;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Message;
import android.support.v4.app.ActivityCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.nikunjpc.appdemo.R;
//import androidx.appcompat.app.AppCompatActivity;
//import androidx.core.app.ActivityCompat;

public class ContactActivity extends AppCompatActivity {
    EditText Subject;
    EditText Message;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_contact );

        Subject = (EditText) findViewById( R.id.subject );
        Message = (EditText) findViewById( R.id.msg );

        Button bt = (Button) findViewById( R.id.send );
        bt.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                sendMail();
            }
        } );

        Button bt1 = (Button) findViewById( R.id.btCall );
        bt1.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent iCall = new Intent( Intent.ACTION_CALL );
                iCall.setData( Uri.parse( "tel:" + "1299" ) );

                if (ActivityCompat.checkSelfPermission( getApplicationContext(), Manifest.permission.CALL_PHONE ) != PackageManager.PERMISSION_GRANTED) {
                    Toast.makeText( ContactActivity.this, "Please Grant Permission", Toast.LENGTH_SHORT ).show();
                    requestionPermission();
                } else {
                    startActivity( iCall );
                }
            }
        } );
    }

    private void sendMail() {
        String subject = "Issue: " + Subject.getText().toString();
        String message = Message.getText().toString();

        Intent i = new Intent( Intent.ACTION_SEND );
        i.putExtra( Intent.EXTRA_EMAIL, new String[]{"abc123@gmail.com"} );
        i.putExtra( Intent.EXTRA_SUBJECT, subject );
        i.putExtra( Intent.EXTRA_TEXT, message );

        i.setType( "message/rfc822" );
        startActivity( Intent.createChooser( i, "Choose an email client" ) );

    }


    private void requestionPermission() {
        ActivityCompat.requestPermissions( ContactActivity.this, new String[]{Manifest.permission.CALL_PHONE}, 1 );
    }
}
