package com.nikunjpc.appdemo.NavigationMenu;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

import com.nikunjpc.appdemo.R;
//import androidx.appcompat.app.AppCompatActivity;
public class UploadActivity extends AppCompatActivity {

    EditText Uploadcourse;
    EditText UploadSemester;
    EditText UploadSubject;
    EditText Uploadnote;
    EditText Uploadname;
    RadioGroup radiofiletype;
    RadioButton radionotes, radiotute, radioques, radiobook, radioother;
    Button submit;

    private int c=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_upload );

        Uploadcourse = (EditText) findViewById( R.id.Uploadcourse );
        UploadSemester = (EditText) findViewById( R.id.Uploadsemester );
        UploadSubject = (EditText) findViewById( R.id.Uploadsubject );
        Uploadnote = (EditText) findViewById( R.id.Uploadnote );
        Uploadname = (EditText) findViewById( R.id.Uploadname );
        radiofiletype = (RadioGroup) findViewById( R.id.radiofiletype );
        radionotes = (RadioButton) findViewById( R.id.radionotes );
        radiotute = (RadioButton) findViewById( R.id.radiotute );
        radioques = (RadioButton) findViewById( R.id.radioques );
        radiobook = (RadioButton) findViewById( R.id.radiobook );
        radioother = (RadioButton) findViewById( R.id.radioother );
        submit = (Button) findViewById( R.id.UploadContinue );

        radiofiletype.setOnCheckedChangeListener( new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                if (i == R.id.radionotes) {
                    Toast.makeText( getApplicationContext(), "Choice: Notes", Toast.LENGTH_SHORT ).show();
                    c = 1;
                } else if (i == R.id.radiotute) {
                    Toast.makeText( getApplicationContext(), "Choice: Tutorial", Toast.LENGTH_SHORT ).show();
                    c = 2;
                } else if (i == R.id.radioques) {
                    Toast.makeText( getApplicationContext(), "Choice: Question Paper", Toast.LENGTH_SHORT ).show();
                    c = 3;
                } else if (i == R.id.radiobook) {
                    Toast.makeText( getApplicationContext(), "Choice: Book", Toast.LENGTH_SHORT ).show();
                    c = 4;
                }
                else if (i == R.id.radioother) {
                    Toast.makeText( getApplicationContext(), "Choice: Other", Toast.LENGTH_SHORT ).show();
                    c = 5;
                }
            }
        } );



        submit.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (Uploadcourse.getText().toString().isEmpty() || UploadSemester.getText().toString().isEmpty()
                        || UploadSubject.getText().toString().isEmpty()) {
                    Toast.makeText( getApplicationContext(), "Please fill atleast Course, Semester and Subject", Toast.LENGTH_SHORT ).show();
                } else {
                    sendMail( c );
                }
            }
        } );

    }
        private void sendMail(int c) {

            String s = "";
            switch (c)
            {
                case 0: s="None"; break;
                case 1: s="Notes"; break;
                case 2: s="Tutorial"; break;
                case 3: s="Question Paper"; break;
                case 4: s="Book"; break;
                case 5: s="Other";
            }

            String name ="";
            if(Uploadname.getText().toString().isEmpty()) {
                name = "ABC";
            } else name = Uploadname.getText().toString();

            String note ="";
            if(Uploadnote.getText().toString().isEmpty()) {
                note = "NA";
            } else note = Uploadnote.getText().toString();

            String subject = "Upload Material";
            String message = "Uploaded By : "+ name +
                    ",\n\nCourse : " + Uploadcourse.getText().toString() + ",\n\nSemester : " + UploadSemester.getText().toString()
                    + ",\n\nSubject : " + UploadSubject.getText().toString() +",\n\nFile Type : " + s
                    + ",\n\nAdditional Note : " + note + "\n\n\nThank You for supporting us...\nEdNotes Team";

            Intent i = new Intent( Intent.ACTION_SEND );
            i.putExtra( Intent.EXTRA_EMAIL, new String[]{"ednotes123upload@gmail.com"} );
            i.putExtra( Intent.EXTRA_SUBJECT, subject );
            i.putExtra( Intent.EXTRA_TEXT, message );

            i.setType( "message/rfc822" );
            startActivity( Intent.createChooser( i, "Choose an email client" ) );
        }


}
