package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class DataActivity extends AppCompatActivity {

    String[] a = new String[7];
    String[] b = new String[7];

    TextView text1 = findViewById(R.id.textView1);
    /*TextView text2 = findViewById(R.id.textView2);
    TextView text3 = findViewById(R.id.textView3);
    TextView text4 = findViewById(R.id.textView4);
    TextView text5 = findViewById(R.id.textView5);
    TextView text6 = findViewById(R.id.textView6);
    TextView text7 = findViewById(R.id.textView7);
    TextView text8 = findViewById(R.id.textView8);
    TextView text9 = findViewById(R.id.textView9);
    TextView text10 = findViewById(R.id.textView10);
    TextView text11 = findViewById(R.id.textView11);
    TextView text12 = findViewById(R.id.textView12);
    TextView text13 = findViewById(R.id.textView13);
    TextView text14 = findViewById(R.id.textView14);*/

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_data);
        //initSpinners();

        MyApp myApp = (MyApp)this.getApplication();
        String str = myApp.getTestString();

        /*Intent intent = getIntent();
        a[1] = intent.getStringExtra("ser1");
        a[2] = intent.getStringExtra("serR1");
        a[3] = intent.getStringExtra("sp1");
        a[4] = intent.getStringExtra("b1");
        a[5] = intent.getStringExtra("bC1");
        a[6] = intent.getStringExtra("spR1");
        a[7] = intent.getStringExtra("fC1");
        b[1] = intent.getStringExtra("ser2");
        b[2] = intent.getStringExtra("serR2");
        b[3] = intent.getStringExtra("sp2");
        b[4] = intent.getStringExtra("b2");
        b[5] = intent.getStringExtra("bC2");
        b[6] = intent.getStringExtra("spR2");
        b[7] = intent.getStringExtra("fC2");*/

        /*TextView text1 = findViewById(R.id.textView1);
        TextView text2 = findViewById(R.id.textView2);
        TextView text3 = findViewById(R.id.textView3);
        TextView text4 = findViewById(R.id.textView4);
        TextView text5 = findViewById(R.id.textView5);
        TextView text6 = findViewById(R.id.textView6);
        TextView text7 = findViewById(R.id.textView7);
        */

        text1.setText(str);
        /*text2.setText(a[2]);
        text3.setText(a[3]);
        text4.setText(a[4]);
        text5.setText(a[5]);
        text6.setText(a[6]);
        text7.setText(a[7]);
        text8.setText(b[1]);
        text9.setText(b[2]);
        text10.setText(b[3]);
        text11.setText(b[4]);
        text12.setText(b[5]);
        text13.setText(b[6]);
        text14.setText(b[7]);*/

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
