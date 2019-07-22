package com.nikunjpc.appdemo.ClgStart;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;

import com.nikunjpc.appdemo.BtechCSESub.BtechCSE1stSub;
import com.nikunjpc.appdemo.BtechCSESub.BtechCSE2ndSub;
import com.nikunjpc.appdemo.BtechCSESub.BtechCSE3rdSub;
import com.nikunjpc.appdemo.BtechCSESub.BtechCSE4thSub;
import com.nikunjpc.appdemo.BtechCSESub.BtechCSE5thSub;
import com.nikunjpc.appdemo.BtechCSESub.BtechCSE6thSub;
import com.nikunjpc.appdemo.BtechCSESub.BtechCSE7thSub;
import com.nikunjpc.appdemo.BtechCSESub.BtechCSE8thSub;
import com.nikunjpc.appdemo.NavigationMenu.UploadActivity;
import com.nikunjpc.appdemo.R;

import java.util.ArrayList;
import java.util.List;
//import com.google.android.gms.ads.MobileAds;
//import com.google.android.gms.ads.InterstitialAd;
//import com.google.android.gms.ads.AdRequest;
//import androidx.appcompat.app.AppCompatActivity;

public class Clg_Menu extends AppCompatActivity {

    Spinner Course;
    Spinner Branch;
    Spinner Semester;
    Button Submit;
    int s,b;

  //  private InterstitialAd mInterstitialAd;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_clg__menu);

        Course = (Spinner) findViewById(R.id.SpCourse);
        Branch = (Spinner) findViewById(R.id.SpBranch);
        Semester = (Spinner) findViewById(R.id.SpSemester);
        Submit = (Button) findViewById(R.id.BtSubmit);

//
//        // Sample AdMob app ID: ca-app-pub-3940256099942544~3347511713
//        MobileAds.initialize(this, "ca-app-pub-9260995232201266~6191229091");
//
//        mInterstitialAd = new InterstitialAd(this);
//        mInterstitialAd.setAdUnitId("ca-app-pub-9260995232201266/9555759038");
//        mInterstitialAd.loadAd(new AdRequest.Builder().build());


        List<String> CourseList = new ArrayList<String>();
        CourseList.add("Select Course");
        CourseList.add("B.Tech.");
        CourseList.add("BCA (Coming Soon)");
        CourseList.add("BBA (Coming Soon)");

        ArrayAdapter<String> Cr = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item,CourseList);
        Cr.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        Course.setAdapter(Cr);
        Course.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                Course.setSelection(i);
            }
            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });

        List<String> BrList = new ArrayList<String>();
        BrList.add("Select Branch");
        BrList.add("CSE");
        BrList.add("IT");
        BrList.add("ECE");
        BrList.add("MAE");
        BrList.add("ICE");

        ArrayAdapter<String> Br = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item,BrList);
        Br.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        Branch.setAdapter(Br);
        Branch.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                Branch.setSelection(i);     b=i;
                }
            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });

        List<String> SemList = new ArrayList<String>();
        SemList.add("Select Semester");
        SemList.add("1st Semester");
        SemList.add("2nd Semester");
        SemList.add("3rd Semester");
        SemList.add("4th Semester");
        SemList.add("5th Semester");
        SemList.add("6th Semester");
        SemList.add("7th Semester");
        SemList.add("8th Semester");

        ArrayAdapter<String> Sem = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item,SemList);
        Sem.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        Semester.setAdapter(Sem);
        Semester.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                Semester.setSelection(i);       s=i;
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });


        /*List<String> SubList = new ArrayList<String>();
        SubList.add("Select Subject");
        SubList.add("Engineering Physics - I");
        SubList.add("Engineering Physics - II");
        SubList.add("Applied Mathematics - I");
        SubList.add("Applied Mathematics - II");
        SubList.add("Applied Mathematics - III");
        SubList.add("Applied Mathematics - IV");
        SubList.add("Applied Chemistry");
        SubList.add("Communication System");
        SubList.add("Software Engineering");
        SubList.add("JAVA Programming");
        SubList.add("Control And System");
        SubList.add("Digital Communication");
        SubList.add("Data Structure");
        SubList.add("Electrical Technology");
        SubList.add("C.O.A.");
        SubList.add("F.O.C.");
        SubList.add("S.T.L.D.");
        SubList.add("A.D.A.");
        SubList.add("M.P.");
        SubList.add("I.P.");
        SubList.add("H.V.P.E.");
        SubList.add("O.O.P.S.");

        ArrayAdapter<String> Sub = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item,SubList);
        Sub.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        Subject.setAdapter(Sub);
        Subject.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                Subject.setSelection(i);
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });


        List<String> ConList = new ArrayList<String>();
        ConList.add("Select Content");
        ConList.add("Tutorial");
        ConList.add("Notes");
        ConList.add("Practical File");
        ConList.add("Question Paper");
        ConList.add("Notice/Discuss");

        ArrayAdapter<String> Con = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item,ConList);
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
        });*/


//        Submit.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                if (mInterstitialAd.isLoaded()) {
//                    mInterstitialAd.show();
//                } else {
//                    Log.d("TAG", "The interstitial wasn't loaded yet.");
//                }
//            }
//        });

        Submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if ( (b==1 || b==2 || b==3 || b==4 || b==5) && s==1 ) {
                    Intent intent = new Intent(Clg_Menu.this, BtechCSE1stSub.class);
                    startActivity(intent); }
                else if ( (b==1 || b==2 || b==3 || b==4 || b==5) && s==2 ) {
                    Intent intent = new Intent(Clg_Menu.this, BtechCSE2ndSub.class);
                    startActivity(intent); }
                else if ( (b==1 || b==2) && s==3 ) {
                    Intent intent = new Intent(Clg_Menu.this, BtechCSE3rdSub.class);
                    startActivity(intent); }
                else if ( (b==1 || b==2) && s==4 ) {
                    Intent intent = new Intent(Clg_Menu.this, BtechCSE4thSub.class);
                    startActivity(intent); }
                else if ( (b==1 || b==2) && s==5 ) {
                    Intent intent = new Intent(Clg_Menu.this, BtechCSE5thSub.class);
                    startActivity(intent); }
                else if ( (b==1 || b==2) && s==6 ) {
                    Intent intent = new Intent(Clg_Menu.this, BtechCSE6thSub.class);
                    startActivity(intent); }
                else if ( (b==1 || b==2) && s==7 ) {
                    Intent intent = new Intent(Clg_Menu.this, BtechCSE7thSub.class);
                    startActivity(intent); }
                else if ( (b==1 || b==2) && s==8 ) {
                    Intent intent = new Intent(Clg_Menu.this, BtechCSE8thSub.class);
                    startActivity(intent); }
                else if ( b==3 && s==3 ) {
                    Intent intent = new Intent(Clg_Menu.this, UploadActivity.class);
                    startActivity(intent); }
                else if ( b==3 && s==4 ) {
                    Intent intent = new Intent(Clg_Menu.this, UploadActivity.class);
                    startActivity(intent); }
                else if ( b==3 && s==5 ) {
                    Intent intent = new Intent(Clg_Menu.this, UploadActivity.class);
                    startActivity(intent); }
                else if ( b==3 && s==6 ) {
                    Intent intent = new Intent(Clg_Menu.this, UploadActivity.class);
                    startActivity(intent); }
                else if ( b==3 && s==7 ) {
                    Intent intent = new Intent(Clg_Menu.this, UploadActivity.class);
                    startActivity(intent); }
                else if ( b==3 && s==8 ) {
                    Intent intent = new Intent(Clg_Menu.this, UploadActivity.class);
                    startActivity(intent); }
                else if ( b==4 && s==3 ) {
                    Intent intent = new Intent(Clg_Menu.this, UploadActivity.class);
                    startActivity(intent); }
                else if ( b==4 && s==4 ) {
                    Intent intent = new Intent(Clg_Menu.this, UploadActivity.class);
                    startActivity(intent); }
                else if ( b==4 && s==5 ) {
                    Intent intent = new Intent(Clg_Menu.this, UploadActivity.class);
                    startActivity(intent); }
                else if ( b==4 && s==6 ) {
                    Intent intent = new Intent(Clg_Menu.this, UploadActivity.class);
                    startActivity(intent); }
                else if ( b==4 && s==7 ) {
                    Intent intent = new Intent(Clg_Menu.this, UploadActivity.class);
                    startActivity(intent); }
                else if ( b==4 && s==8 ) {
                    Intent intent = new Intent(Clg_Menu.this, UploadActivity.class);
                    startActivity(intent); }
                else if ( b==5 && s==3 ) {
                    Intent intent = new Intent(Clg_Menu.this, UploadActivity.class);
                    startActivity(intent); }
                else if ( b==5 && s==4 ) {
                    Intent intent = new Intent(Clg_Menu.this, UploadActivity.class);
                    startActivity(intent); }
                else if ( b==5 && s==5 ) {
                    Intent intent = new Intent(Clg_Menu.this, UploadActivity.class);
                    startActivity(intent); }
                else if ( b==5 && s==6 ) {
                    Intent intent = new Intent(Clg_Menu.this, UploadActivity.class);
                    startActivity(intent); }
                else if ( b==5 && s==7 ) {
                    Intent intent = new Intent(Clg_Menu.this, UploadActivity.class);
                    startActivity(intent); }
                else if ( b==5 && s==8 ) {
                    Intent intent = new Intent(Clg_Menu.this, UploadActivity.class);
                    startActivity(intent); }
            }
        });
    }
}
