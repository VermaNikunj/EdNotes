package com.nikunjpc.appdemo.SchStart;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;

//import com.nikunjpc.appdemo.GoogleAds;
import com.nikunjpc.appdemo.R;

import java.util.ArrayList;
import java.util.List;
//import androidx.appcompat.app.AppCompatActivity;
public class Sch_Menu extends AppCompatActivity {

    Spinner Class;
    Spinner Subject;
    Spinner Content;
    Button Submit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sch__menu);

        Class = (Spinner) findViewById(R.id.SpClass);
        Subject = (Spinner) findViewById(R.id.SpSubject);
        Content = (Spinner) findViewById(R.id.SpContent);
        Submit = (Button) findViewById(R.id.BtSubmit);

        List<String> ClList = new ArrayList<String>();
        ClList.add("Select Class");
        ClList.add("6th Class");
        ClList.add("7th Class");
        ClList.add("8th Class");
        ClList.add("9th Class");
        ClList.add("10th Class");
        ClList.add("11th Class");
        ClList.add("12th Class");

        ArrayAdapter<String> Cl = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item,ClList);
        Cl.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        Class.setAdapter(Cl);
        Class.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                Class.setSelection(i);
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });


        List<String> SList = new ArrayList<String>();
        SList.add("Select Subject");
        SList.add("Physics");
        SList.add("Mathematics");
        SList.add("Chemistry");
        SList.add("C++ Programming");
        SList.add("English");
        SList.add("Science");
        SList.add("Social Science");

        ArrayAdapter<String> Sjt = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item,SList);
        Sjt.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        Subject.setAdapter(Sjt);
        Subject.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                Subject.setSelection(i);
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });


        List<String> CList = new ArrayList<String>();
        CList.add("Select Content");
        CList.add("Books");
        CList.add("Notes");
        CList.add("NCERT");
        CList.add("Question Paper");
        CList.add("Notice/Discuss");

        ArrayAdapter<String> Con = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item,CList);
        Con.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        Content.setAdapter(Con);
        Content.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                Content.setSelection(i);
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });

        Submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(Sch_Menu.this, SchActivity.class);
                startActivity(intent);
            }
        });

    }
}
