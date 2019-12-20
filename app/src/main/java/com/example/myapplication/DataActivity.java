package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class DataActivity extends AppCompatActivity {

    String a1="0",a2="0",a3="0",a4="0",a5="0",a6="0",a7="0";
    String b1="0",b2="0",b3="0",b4="0",b5="0",b6="0",b7="0";
    String c1="0",c2="0",c3="0",c4="0",c5="0",c6="0",c7="0";
    String d1="0",d2="0",d3="0",d4="0",d5="0",d6="0",d7="0";
    String e1="0",e2="0",e3="0",e4="0",e5="0",e6="0",e7="0";
    String f1="0",f2="0",f3="0",f4="0",f5="0",f6="0",f7="0";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_data);
        //initSpinners();

        MyApp myApp = (MyApp)this.getApplication();
        int str = myApp.getTestString();

        TextView text1 = findViewById(R.id.textView001);
        TextView text2 = findViewById(R.id.textView002);
        TextView text3 = findViewById(R.id.textView003);
        TextView text4 = findViewById(R.id.textView004);
        TextView text5 = findViewById(R.id.textView005);
        TextView text6 = findViewById(R.id.textView006);
        TextView text7 = findViewById(R.id.textView007);
        TextView text8 = findViewById(R.id.textView008);
        TextView text9 = findViewById(R.id.textView009);
        TextView text10 = findViewById(R.id.textView010);
        TextView text11 = findViewById(R.id.textView011);
        TextView text12 = findViewById(R.id.textView012);
        TextView text13 = findViewById(R.id.textView013);
        TextView text14 = findViewById(R.id.textView014);
        TextView text15 = findViewById(R.id.textView015);
        TextView text16 = findViewById(R.id.textView016);
        TextView text17 = findViewById(R.id.textView017);
        TextView text18 = findViewById(R.id.textView018);
        TextView text19 = findViewById(R.id.textView019);
        TextView text20 = findViewById(R.id.textView020);
        TextView text21 = findViewById(R.id.textView021);
        TextView text22 = findViewById(R.id.textView022);
        TextView text23 = findViewById(R.id.textView023);
        TextView text24 = findViewById(R.id.textView024);
        TextView text25 = findViewById(R.id.textView025);
        TextView text26 = findViewById(R.id.textView026);
        TextView text27 = findViewById(R.id.textView027);
        TextView text28 = findViewById(R.id.textView028);
        TextView text29 = findViewById(R.id.textView029);
        TextView text30 = findViewById(R.id.textView030);
        TextView text31 = findViewById(R.id.textView031);
        TextView text32 = findViewById(R.id.textView032);
        TextView text33 = findViewById(R.id.textView033);
        TextView text34 = findViewById(R.id.textView034);
        TextView text35 = findViewById(R.id.textView035);
        TextView text36 = findViewById(R.id.textView036);
        TextView text37 = findViewById(R.id.textView037);
        TextView text38 = findViewById(R.id.textView038);
        TextView text39 = findViewById(R.id.textView039);
        TextView text40 = findViewById(R.id.textView040);
        TextView text41 = findViewById(R.id.textView041);
        TextView text42 = findViewById(R.id.textView042);

        if(str==1){
            Intent intent = getIntent();
            a1 = intent.getStringExtra("ser1");
            a2 = intent.getStringExtra("serR1");
            a3 = intent.getStringExtra("sp1");
            a4 = intent.getStringExtra("b1");
            a5 = intent.getStringExtra("bC1");
            a6 = intent.getStringExtra("spR1");
            a7 = intent.getStringExtra("fC1");
            b1 = intent.getStringExtra("ser2");
            b2 = intent.getStringExtra("serR2");
            b3 = intent.getStringExtra("sp2");
            b4 = intent.getStringExtra("b2");
            b5 = intent.getStringExtra("bC2");
            b6 = intent.getStringExtra("spR2");
            b7 = intent.getStringExtra("fC2");
            c1 = intent.getStringExtra("ser3");
            c2 = intent.getStringExtra("serR3");
            c3 = intent.getStringExtra("sp3");
            c4 = intent.getStringExtra("b3");
            c5 = intent.getStringExtra("bC3");
            c6 = intent.getStringExtra("spR3");
            c7 = intent.getStringExtra("fC3");
            d1 = intent.getStringExtra("ser4");
            d2 = intent.getStringExtra("serR4");
            d3 = intent.getStringExtra("sp4");
            d4 = intent.getStringExtra("b4");
            d5 = intent.getStringExtra("bC4");
            d6 = intent.getStringExtra("spR4");
            d7 = intent.getStringExtra("fC4");
            e1 = intent.getStringExtra("ser5");
            e2 = intent.getStringExtra("serR5");
            e3 = intent.getStringExtra("sp5");
            e4 = intent.getStringExtra("b5");
            e5 = intent.getStringExtra("bC5");
            e6 = intent.getStringExtra("spR5");
            e7 = intent.getStringExtra("fC5");
            f1 = intent.getStringExtra("ser6");
            f2 = intent.getStringExtra("serR6");
            f3 = intent.getStringExtra("sp6");
            f4 = intent.getStringExtra("b6");
            f5 = intent.getStringExtra("bC6");
            f6 = intent.getStringExtra("spR6");
            f7 = intent.getStringExtra("fC6");
            text1.setText(a1);
            text2.setText(a2);
            text3.setText(a3);
            text4.setText(a4);
            text5.setText(a5);
            text6.setText(a6);
            text7.setText(a7);
            text8.setText(b1);
            text9.setText(b2);
            text10.setText(b3);
            text11.setText(b4);
            text12.setText(b5);
            text13.setText(b6);
            text14.setText(b7);
            text15.setText(c1);
            text16.setText(c2);
            text17.setText(c3);
            text18.setText(c4);
            text19.setText(c5);
            text20.setText(c6);
            text21.setText(c7);
            text22.setText(d1);
            text23.setText(d2);
            text24.setText(d3);
            text25.setText(d4);
            text26.setText(d5);
            text27.setText(d6);
            text28.setText(d7);
            text29.setText(e1);
            text30.setText(e2);
            text31.setText(e3);
            text32.setText(e4);
            text33.setText(e5);
            text34.setText(e6);
            text35.setText(e7);
            text36.setText(f1);
            text37.setText(f2);
            text38.setText(f3);
            text39.setText(f4);
            text40.setText(f5);
            text41.setText(f6);
            text42.setText(f7);
        }

        /*Intent intent = getIntent();
        a1 = intent.getStringExtra("ser1");
        a2 = intent.getStringExtra("serR1");
        a3 = intent.getStringExtra("sp1");
        a4 = intent.getStringExtra("b1");
        a5 = intent.getStringExtra("bC1");
        a6 = intent.getStringExtra("spR1");
        a7 = intent.getStringExtra("fC1");
        b[1] = intent.getStringExtra("ser2");
        b[2] = intent.getStringExtra("serR2");
        b[3] = intent.getStringExtra("sp2");
        b[4] = intent.getStringExtra("b2");
        b[5] = intent.getStringExtra("bC2");
        b[6] = intent.getStringExtra("spR2");
        b[7] = intent.getStringExtra("fC2");*/

        Button menu = findViewById(R.id.redata);
        menu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });
    }

    /*private void initSpinners() {
        Spinner spinner1 = (Spinner)findViewById(R.id.spinner1);
        String[] labels = getResources().getStringArray(R.array.list);
        ArrayAdapter<String> adapter
                = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, labels);
        spinner1.setAdapter(adapter);

        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
    }*/

    /*public void onClick_button2(View view){
        Spinner spinner1 = (Spinner)findViewById(R.id.spinner1);
        TextView text1 = findViewById(R.id.textView1);
        TextView text2 = findViewById(R.id.textView2);
        TextView text3 = findViewById(R.id.textView3);
        TextView text4 = findViewById(R.id.textView4);
        TextView text5 = findViewById(R.id.textView5);
        TextView text6 = findViewById(R.id.textView6);
        TextView text7 = findViewById(R.id.textView7);

        String str = spinner1.getSelectedItem().toString();
        int s = Integer.parseInt(str);
        if (s == 1) {
            text1.setText(a[1]);
            text2.setText(a[2]);
            text3.setText(a[3]);
            text4.setText(a[4]);
            text5.setText(a[5]);
            text6.setText(a[6]);
            text7.setText(a[7]);
        }
        else if(s==2) {
            text1.setText(b[1]);
            text2.setText(b[2]);
            text3.setText(b[3]);
            text4.setText(b[4]);
            text5.setText(b[5]);
            text6.setText(b[6]);
            text7.setText(b[7]);
        }

    }*/
}
