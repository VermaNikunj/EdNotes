package com.nikunjpc.appdemo;
//
//import android.content.Intent;
//import android.support.annotation.NonNull;
//import android.support.v7.app.AppCompatActivity;
//import android.os.Bundle;
//import android.view.View;
//import android.widget.Button;
//import android.widget.ImageView;
//import android.widget.LinearLayout;
//import android.widget.TextView;
//import android.widget.Toast;
//
//import com.bumptech.glide.Glide;
//import com.google.android.gms.auth.api.Auth;
//import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
//import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
//import com.google.android.gms.auth.api.signin.GoogleSignInResult;
//import com.google.android.gms.common.ConnectionResult;
//import com.google.android.gms.common.SignInButton;
//import com.google.android.gms.common.api.GoogleApiClient;
//
//public class GoogleSignIn extends AppCompatActivity implements View.OnClickListener, GoogleApiClient.OnConnectionFailedListener {
//
//    LinearLayout ProfSection;
//    TextView UserName, Email;
//    ImageView ProfPic;
//    SignInButton GSignIn;
//    GoogleApiClient googleApiClient;
//    Button SignedIn;
//    static final int REQ_CODE =9001;
//
//    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate( savedInstanceState );
//        setContentView( R.layout.activity_google_sign_in );
//
//        ProfSection = (LinearLayout) findViewById( R.id.prof_section );
//        UserName = (TextView) findViewById( R.id.Username );
//        Email = (TextView) findViewById( R.id.Useremail );
//        ProfPic = (ImageView) findViewById( R.id.prog_pic );
//        SignedIn = (Button) findViewById(R.id.SignedIn );
//        GSignIn = (SignInButton) findViewById( R.id.btGoogleSignIn );
//        GSignIn.setOnClickListener(this);
//        ProfSection.setVisibility( View.GONE );
//        SignedIn.setVisibility( View.GONE );
//
//        GoogleSignInOptions signInOptions = new GoogleSignInOptions.Builder( GoogleSignInOptions.DEFAULT_SIGN_IN )
//                .requestEmail()
//                .build();
//
//        googleApiClient = new GoogleApiClient.Builder( this)
//                .enableAutoManage( this, this )
//                .addApi( Auth.GOOGLE_SIGN_IN_API, signInOptions )
//                .build();
//
//    }
//
//    @Override
//    public void onClick(View view) {
//
//        switch(view.getId())
//        {
//            case R.id.btGoogleSignIn:
//                signIn();
//                break;
//        }
//    }
//
//    @Override
//    public void onConnectionFailed(@NonNull ConnectionResult connectionResult) {
//
//    }
//
//    public void signIn()
//    {
//        Intent intent = Auth.GoogleSignInApi.getSignInIntent( googleApiClient);
//        startActivityForResult( intent,REQ_CODE);
//    }
//
//    private void handleResult(GoogleSignInResult result)
//    {
//        if(result.isSuccess())
//        {
//            GoogleSignInAccount account = result.getSignInAccount();
//            String name= account.getDisplayName();
//            String email= account.getEmail();
//            String img_url=  account.getPhotoUrl().toString();
//            UserName.setText(name);
//            Email.setText( email );
//            Glide.with(this).load(img_url).into(ProfPic);
//            UpdateUI(true);
//        }
//        else {
//            {
//                Toast.makeText( getApplicationContext(),"Sign In : Failed", Toast.LENGTH_SHORT ).show();
//                UpdateUI( false );
//            }
//        }
//
//    }
//
//    public void UpdateUI(boolean isLogin)
//    {
//
//        if(isLogin)
//        {
//            ProfSection.setVisibility( View.VISIBLE );
//            SignedIn.setVisibility( View.VISIBLE );
//            GSignIn.setVisibility( View.GONE );
//            Toast.makeText( getApplicationContext(),"Sign In : Successful", Toast.LENGTH_SHORT ).show();
//
//            SignedIn.setOnClickListener(new View.OnClickListener() {
//                @Override
//                public void onClick(View view) {
//                    Intent intent = new Intent(GoogleSignIn.this, MainActivity.class);
//                    startActivity(intent);
//                }
//            });
//        }
//
//    }
//    protected void onActivityResult(int requestCode, int resultCode, Intent data)
//    {
//        super.onActivityResult(requestCode, resultCode, data);
//
//        if(requestCode == REQ_CODE)
//        {
//            GoogleSignInResult result = Auth.GoogleSignInApi.getSignInResultFromIntent( data );
//            handleResult( result );
//        }
//    }
//}
