package com.nikunjpc.appdemo.LoginSignup;

import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.TextView;

import com.google.android.gms.auth.api.Auth;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.GoogleSignInClient;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.auth.api.signin.GoogleSignInResult;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.SignInButton;
import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.common.api.GoogleApiClient;
//import com.nikunjpc.appdemo.GoogleSignIn;
import com.nikunjpc.appdemo.MainActivity;
import com.nikunjpc.appdemo.NavigationMenu.AccountActivity;
import com.nikunjpc.appdemo.R;
//import androidx.appcompat.app.AppCompatActivity;
public class LoginActivity extends AppCompatActivity  {

    TextView Title;
    EditText UserName;
    EditText Password;
    TextView Chances;
    TextView Error;
    Button Login;
    Button SignUp;
    ImageButton Google;
    Button Skip;
    int counter = 5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        UserName = (EditText) findViewById(R.id.etUserName);
        Password = (EditText) findViewById(R.id.etPassword);
        Chances = (TextView) findViewById(R.id.tvChances);
        Login = (Button) findViewById(R.id.bLogin);
        SignUp = (Button) findViewById(R.id.bSignUp);
        Skip = (Button) findViewById(R.id.bSkip);
        Error = (TextView) findViewById(R.id.tvError);
        Title = (TextView) findViewById(R.id.tvTitle);
        Google = (ImageButton) findViewById( R.id.btsignin );

        Chances.setText("No. of Login Chances Left : 5");

        Login.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {
                if ( UserName.getText().toString().equals("admin") && Password.getText().toString().equals("1234") )
                {
                    Intent intent = new Intent(LoginActivity.this, MainActivity.class);
                    startActivity(intent);
                }
                else {
                    counter--;
                    Chances.setText("No. of Login Chances Left: " + String.valueOf(counter));

                    if ( UserName.getText().toString().isEmpty() && Password.getText().toString().isEmpty())
                    {
                        Error.setText(" Enter Name and Password First ");
                    }
                    else
                        {
                        if (UserName.getText().toString().isEmpty() && !Password.getText().toString().isEmpty())
                        {
                            Error.setText(" Enter Name First ");
                        }
                        else
                            {
                            if (!UserName.getText().toString().isEmpty() && Password.getText().toString().isEmpty())
                            {
                                Error.setText(" Enter Password First ");
                            }
                            else
                                {
                                if (UserName.getText().toString().equals("admin") && !Password.getText().toString().equals("1234"))
                                {
                                    Error.setText(" Invalid Password ");
                                }
                                else
                                    {
                                    if (!UserName.getText().toString().equals("admin") && Password.getText().toString().equals("1234"))
                                    {
                                        Error.setText(" Invalid Name ");
                                    }
                                    else
                                        {
                                        Error.setText(" Invalid Name And Password Both, Try Again");
                                        }
                                    }
                                }
                            }
                        }
                    }

                    if (counter == 0)
                    {
                        Login.setEnabled(false);
                    }
                }
        });

        SignUp.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(LoginActivity.this, SignUpActivity.class);
                startActivity(intent);
            }
        });

        Skip.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(LoginActivity.this, MainActivity.class);
                startActivity(intent);
            }
        });

        Google.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(LoginActivity.this, AccountActivity.class);
                startActivity(intent);
            }
        });

    }
}
