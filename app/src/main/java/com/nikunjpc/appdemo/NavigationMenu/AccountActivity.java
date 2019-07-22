package com.nikunjpc.appdemo.NavigationMenu;

import android.content.Intent;
//import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

//import com.firebase.ui.auth.AuthUI;
//import com.firebase.ui.auth.IdpResponse;
//import com.google.android.gms.tasks.OnCompleteListener;
//import com.google.android.gms.tasks.OnFailureListener;
//import com.google.android.gms.tasks.Task;
//import com.google.firebase.auth.FirebaseAuth;
//import com.google.firebase.auth.FirebaseUser;
import com.nikunjpc.appdemo.MainActivity;
import com.nikunjpc.appdemo.R;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
//import androidx.appcompat.app.AppCompatActivity;
public class AccountActivity extends AppCompatActivity {

    //private static final int MY_REQUEST_CODE = 7117;
    //List<AuthUI.IdpConfig> providers;
    //Button Asignin, Bsignin;
    //TextView tvAsignin, tvBsignin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
         setContentView(R.layout.activity_account);

//         tvAsignin = (TextView) findViewById( R.id.tvAsignin );
//         tvBsignin = (TextView) findViewById( R.id.tvBsignin );
//         Asignin = (Button) findViewById( R.id.Asignin );
//         Bsignin = (Button) findViewById( R.id.Bsignin ) ;

//        Bsignin.setOnClickListener( new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                AuthUI.getInstance().signOut( AccountActivity.this )
//                        .addOnCompleteListener( new OnCompleteListener<Void>() {
//                            @Override
//                            public void onComplete(@NonNull Task<Void> task) {
//                                Bsignin.setEnabled( false );
//                                //tvBsignin.setEnabled( false );
//                                //Bsignin.setVisibility( View.GONE );
//                                //tvBsignin.setVisibility( View.GONE );
//                                showSignInOptions();
//
//                            }
//                        } ).addOnFailureListener( new OnFailureListener() {
//                    @Override
//                    public void onFailure(@NonNull Exception e) {
//                        Toast.makeText( AccountActivity.this, ""+ e.getMessage(), Toast.LENGTH_SHORT ).show();
//                    }
//                } );
//            }
//        } );
//
//        Asignin.setOnClickListener( new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Intent intent = new Intent(AccountActivity.this, MainActivity.class);
//                startActivity( intent );
//            }
//        } );
//
//        //Init Provider
//        providers = Collections.singletonList(
//                new AuthUI.IdpConfig.EmailBuilder().build()
//                //new AuthUI.IdpConfig.PhoneBuilder().build(),
//                //new AuthUI.IdpConfig.GoogleBuilder().build()
//                //new AuthUI.IdpConfig.FacebookBuilder().build()
//        );
//
//
//        showSignInOptions();
//
//    }
//
//    private void showSignInOptions() {
//        startActivityForResult(
//                AuthUI.getInstance().createSignInIntentBuilder().setAvailableProviders( providers )
//                        .setTheme( R.style.MyTheme )
//                        .build(), MY_REQUEST_CODE
//        );
//    }
//
//    protected void onActivityResult(int requestCode, int resultCode, Intent data)
//    {
//        super.onActivityResult( requestCode, resultCode, data);
//
//        if(requestCode == MY_REQUEST_CODE)
//        {
//            IdpResponse response =IdpResponse.fromResultIntent( data );
//
//            if(resultCode == RESULT_OK)
//            {
//                //Get User
//                FirebaseUser user = FirebaseAuth.getInstance().getCurrentUser();
//
//                //Show email on Taost
//                Toast.makeText( this, ""+user.getEmail(), Toast.LENGTH_SHORT  ).show();
//
//                //Set Button signout
//                //Bsignin.setVisibility( View.GONE );
//                //tvBsignin.setVisibility( View.GONE );
//                //Bsignin.setEnabled( false );
//                //tvAsignin.setVisibility( View.VISIBLE );
//                //Asignin.setVisibility( View.VISIBLE );
//                Asignin.setEnabled( true );
//            }
//            else
//            {
//                Toast.makeText( this, ""+response.getError().getMessage(), Toast.LENGTH_SHORT ).show();
//            }
//        }
    }
}
