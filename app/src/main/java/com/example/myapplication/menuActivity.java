package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Intent;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class menuActivity extends AppCompatActivity{

    private MyApp myApp;
    int x=0;
    private static final int REQUEST_CODE = 1000;
    private static int a=0;
    String a1="0", a2="0", a3="0", a4="0", a5="0", a6="0", a7="0";
    String b1="0", b2="0", b3="0", b4="0", b5="0", b6="0", b7="0";
    String c1="0",c2="0",c3="0",c4="0",c5="0",c6="0",c7="0";
    String d1="0",d2="0",d3="0",d4="0",d5="0",d6="0",d7="0";
    String e1="0",e2="0",e3="0",e4="0",e5="0",e6="0",e7="0";
    String f1="0",f2="0",f3="0",f4="0",f5="0",f6="0",f7="0";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

        myApp = (MyApp)this.getApplication();

        Button score = findViewById(R.id.score);
        Button data = findViewById(R.id.data);
        Button kari = findViewById(R.id.button2);

        score.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplication(), MainActivity.class);
                startActivityForResult(intent, REQUEST_CODE);
                //startActivity(intent);
            }
        });

        kari.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplication(), SQLiteTest1Activity.class);
                startActivity(intent);
            }
        });

        data.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplication(), DataActivity.class);
                if(a==1){
                    intent.putExtra("ser1",  a1);
                    intent.putExtra("serR1", a2);
                    intent.putExtra("sp1",   a3);
                    intent.putExtra("b1",    a4);
                    intent.putExtra("bC1",   a5);
                    intent.putExtra("spR1",  a6);
                    intent.putExtra("fC1",   a7);
                    intent.putExtra("ser2",  b1);
                    intent.putExtra("serR2", b2);
                    intent.putExtra("sp2",   b3);
                    intent.putExtra("b2",    b4);
                    intent.putExtra("bC2",   b5);
                    intent.putExtra("spR2",  b6);
                    intent.putExtra("fC2",   b7);
                    intent.putExtra("ser3",  c1);
                    intent.putExtra("serR3", c2);
                    intent.putExtra("sp3",   c3);
                    intent.putExtra("b3",    c4);
                    intent.putExtra("bC3",   c5);
                    intent.putExtra("spR3",  c6);
                    intent.putExtra("fC3",   c7);
                    intent.putExtra("ser4",  d1);
                    intent.putExtra("serR4", d2);
                    intent.putExtra("sp4",   d3);
                    intent.putExtra("b4",    d4);
                    intent.putExtra("bC4",   d5);
                    intent.putExtra("spR4",  d6);
                    intent.putExtra("fC4",   d7);
                    intent.putExtra("ser5",  e1);
                    intent.putExtra("serR5", e2);
                    intent.putExtra("sp5",   e3);
                    intent.putExtra("b5",    e4);
                    intent.putExtra("bC5",   e5);
                    intent.putExtra("spR5",  e6);
                    intent.putExtra("fC5",   e7);
                    intent.putExtra("ser5",  f1);
                    intent.putExtra("serR5", f2);
                    intent.putExtra("sp5",   f3);
                    intent.putExtra("b5",    f4);
                    intent.putExtra("bC5",   f5);
                    intent.putExtra("spR5",  f6);
                    intent.putExtra("fC5",   f7);
                }
                startActivity(intent);
            }
        });
    }

    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        if (requestCode == REQUEST_CODE) {
            if (resultCode == RESULT_OK) {
                a=1;
                x=1;
                myApp.setTestString(x);
                a1 = data.getStringExtra("ser1");
                a2 = data.getStringExtra("serR1");
                a3 = data.getStringExtra("sp1");
                a4 = data.getStringExtra("bC1");
                a5 = data.getStringExtra("b1");
                a6 = data.getStringExtra("spR1");
                a7 = data.getStringExtra("fC1");
                b1 = data.getStringExtra("ser2");
                b2 = data.getStringExtra("serR2");
                b3 = data.getStringExtra("sp2");
                b4 = data.getStringExtra("bC2");
                b5 = data.getStringExtra("b2");
                b6 = data.getStringExtra("spR2");
                b7 = data.getStringExtra("fC2");
                c1 = data.getStringExtra("ser3");
                c2 = data.getStringExtra("serR3");
                c3 = data.getStringExtra("sp3");
                c4 = data.getStringExtra("bC3");
                c5 = data.getStringExtra("b3");
                c6 = data.getStringExtra("spR3");
                c7 = data.getStringExtra("fC3");
                d1 = data.getStringExtra("ser4");
                d2 = data.getStringExtra("serR4");
                d3 = data.getStringExtra("sp4");
                d4 = data.getStringExtra("bC4");
                d5 = data.getStringExtra("b4");
                d6 = data.getStringExtra("spR4");
                d7 = data.getStringExtra("fC4");
                e1 = data.getStringExtra("ser5");
                e2 = data.getStringExtra("serR5");
                e3 = data.getStringExtra("sp5");
                e4 = data.getStringExtra("bC5");
                e5 = data.getStringExtra("b5");
                e6 = data.getStringExtra("spR5");
                e7 = data.getStringExtra("fC5");
                f1 = data.getStringExtra("ser6");
                f2 = data.getStringExtra("serR6");
                f3 = data.getStringExtra("sp6");
                f4 = data.getStringExtra("bC6");
                f5 = data.getStringExtra("b6");
                f6 = data.getStringExtra("spR6");
                f7 = data.getStringExtra("fC6");
                /*TextView text = findViewById(R.id.textView);
                text.setText(a1);*/
            }
        }
        /*if(requestCode == REQUEST_CODE){
            if(resultCode == RESULT_OK){
                a1 = (String) data.getCharSequenceExtra("ser1");
                a2 = (String) data.getCharSequenceExtra("serR1");
                a3 = (String) data.getCharSequenceExtra("sp1");
                a4 = (String) data.getCharSequenceExtra("bC1");
                a5 = (String) data.getCharSequenceExtra("b1");
                a6 = (String) data.getCharSequenceExtra("spR1");
                a7 = (String) data.getCharSequenceExtra("fC1");
                text.setText(a1);
                b1 = (String) data.getCharSequenceExtra("ser2");
                b2 = (String) data.getCharSequenceExtra("serR2");
                b3 = (String) data.getCharSequenceExtra("sp2");
                b4 = (String) data.getCharSequenceExtra("bC2");
                b5 = (String) data.getCharSequenceExtra("b2");
                b6 = (String) data.getCharSequenceExtra("spR2");
                b7 = (String) data.getCharSequenceExtra("fC2");
            }
        }*/
    }
}