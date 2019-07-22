package com.nikunjpc.appdemo.LoginSignup;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.nikunjpc.appdemo.R;
//import androidx.appcompat.app.AppCompatActivity;
public class SignUpActivity extends AppCompatActivity {

    EditText UserName;
    EditText Name;
    EditText Email;
    EditText Password;
    EditText Phone;
    CheckBox Checkbox;
    Button ESignUp;
    Button BLogin;
    TextView Confirm;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);

        UserName = (EditText) findViewById(R.id.etEUserName);
        Name = (EditText) findViewById(R.id.etEName);
        Email = (EditText) findViewById(R.id.etEEmail);
        Password = (EditText) findViewById(R.id.etEPassword);
        Phone = (EditText) findViewById(R.id.etEPhone);
        Checkbox = (CheckBox) findViewById(R.id.Checkbox);
        ESignUp = (Button) findViewById(R.id.bESignUp);
        BLogin = (Button) findViewById(R.id.bBLogin);
        Confirm = (TextView) findViewById(R.id.tvConfirm);

        // onClick of button perform this simplest code.

        BLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(SignUpActivity.this, LoginActivity.class);
                startActivity(intent);
            }
        });

        ESignUp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int c=0;
                if (!android.util.Patterns.EMAIL_ADDRESS.matcher(Email.getText().toString()).matches() &&
                        android.util.Patterns.PHONE.matcher(Phone.getText().toString()).matches())
                {
                    Toast.makeText(getApplicationContext(),"Invalid email address", Toast.LENGTH_SHORT).show();
                    c=1;
                }

                else if(android.util.Patterns.EMAIL_ADDRESS.matcher(Email.getText().toString()).matches() &&
                        !(android.util.Patterns.PHONE.matcher(Phone.getText().toString()).matches()))
                {
                    Toast.makeText(getApplicationContext(),"Invalid mobile no.", Toast.LENGTH_SHORT).show();
                    c=1;
                }

                else if(!android.util.Patterns.EMAIL_ADDRESS.matcher(Email.getText().toString()).matches() &&
                        !android.util.Patterns.PHONE.matcher(Phone.getText().toString()).matches())
                {
                    Toast.makeText(getApplicationContext(),"Invalid mobile no. and email address", Toast.LENGTH_SHORT).show();
                    c=1;
                }

                if (!Name.getText().toString().isEmpty() && !UserName.getText().toString().isEmpty() && !Email.getText().toString().isEmpty()
                        && !Password.getText().toString().isEmpty() && !Phone.getText().toString().isEmpty() && c==0) {
                    if (Checkbox.isChecked()) {
                        Confirm.setText("* Successfully Sign-Up *");

                        new Handler().postDelayed(new Runnable() {
                            @Override
                            public void run() {
                                //Do delay 10 sec.
                            }
                        }, 10000);

                        Intent intent = new Intent(SignUpActivity.this, LoginActivity.class);
                        startActivity(intent);
                    } else {
                        Confirm.setText("Tick The Checkbox Also");
                    }
                }
                else {
                    Confirm.setText(" Complete All Details First ");
                }
            }
        });
    }
}
