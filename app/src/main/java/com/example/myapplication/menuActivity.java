package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Intent;
import android.view.View;
import android.widget.Button;

public class menuActivity extends AppCompatActivity{

    //int sub = 1001;
    //String a1, a2, a3, a4, a5, a6, a7, b1, b2, b3, b4, b5, b6, b7;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

        Button score = findViewById(R.id.score);
        Button data = findViewById(R.id.data);

        score.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplication(), MainActivity.class);
                //startActivityForResult(intent, sub);
                startActivity(intent);
            }
        });

        data.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplication(), DataActivity.class);
                /*intent.putExtra("ser1",  a1);
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
                intent.putExtra("fC2",   b7);*/
                startActivity(intent);
            }
        });
    }

    /*
    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        if(requestCode == sub){
            if(resultCode == RESULT_OK){
                a1 = (String) data.getCharSequenceExtra("ser1");
                a2 = (String) data.getCharSequenceExtra("serR1");
                a3 = (String) data.getCharSequenceExtra("sp1");
                a4 = (String) data.getCharSequenceExtra("bC1");
                a5 = (String) data.getCharSequenceExtra("b1");
                a6 = (String) data.getCharSequenceExtra("spR1");
                a7 = (String) data.getCharSequenceExtra("fC1");
                b1 = (String) data.getCharSequenceExtra("ser2");
                b2 = (String) data.getCharSequenceExtra("serR2");
                b3 = (String) data.getCharSequenceExtra("sp2");
                b4 = (String) data.getCharSequenceExtra("bC2");
                b5 = (String) data.getCharSequenceExtra("b2");
                b6 = (String) data.getCharSequenceExtra("spR2");
                b7 = (String) data.getCharSequenceExtra("fC2");
            }
        }
    }*/
}