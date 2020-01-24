package com.example.myapplication;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private Spinner select1, select2, select3, select4, select5, select6;
    //カウント用変数
    private int a1, b1, c1, d1, e1, f1, a2, b2, c2, d2, e2, f2, a3, b3, c3, d3, e3, f3, a4, b4, c4, d4, e4, f4, a5, b5, c5, d5, e5, f5, a6, b6, c6, d6, e6, f6, a7, b7, c7, d7, e7, f7;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ArrayAdapter adapter = ArrayAdapter.createFromResource(this, R.array.list, R.layout.spinner_item);

        // android.R.Layout.simple_spinner_dropdown_itemをR.layout.spinner_dropdown_itemに変更
        adapter.setDropDownViewResource(R.layout.spinner_dropdown_item);

            select1 = findViewById(R.id.spinner1);
            select3 = findViewById(R.id.spinner2);
            select4 = findViewById(R.id.spinner3);
            select5 = findViewById(R.id.spinner4);
            select6 = findViewById(R.id.spinner5);
            select2 = findViewById(R.id.spinner6);
            select1.setAdapter(adapter);
            select2.setAdapter(adapter);
            select3.setAdapter(adapter);
            select4.setAdapter(adapter);
            select5.setAdapter(adapter);
            select6.setAdapter(adapter);
            select1.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                @Override
                public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                    // ここにスピナー内のアイテムを選択した際の処理を書く
                }

                @Override
                public void onNothingSelected(AdapterView<?> parent) {
                }
            });
            select2.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                @Override
                public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                    // ここにスピナー内のアイテムを選択した際の処理を書く
                }

                @Override
                public void onNothingSelected(AdapterView<?> parent) {
                }
            });
            select3.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                @Override
                public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                    // ここにスピナー内のアイテムを選択した際の処理を書く
                }

                @Override
                public void onNothingSelected(AdapterView<?> parent) {
                }
            });
            select4.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                @Override
                public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                    // ここにスピナー内のアイテムを選択した際の処理を書く
                }

                @Override
                public void onNothingSelected(AdapterView<?> parent) {
                }
            });
            select5.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                @Override
                public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                    // ここにスピナー内のアイテムを選択した際の処理を書く
                }

                @Override
                public void onNothingSelected(AdapterView<?> parent) {
                }
            });
            select6.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                @Override
                public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                    // ここにスピナー内のアイテムを選択した際の処理を書く
                }

                @Override
                public void onNothingSelected(AdapterView<?> parent) {
                }
            });

            final Button hozon = findViewById(R.id.hozon);
            final boolean[] hantei2 = {false};
            Button menu = findViewById(R.id.rescore);
            final Button[] button = {findViewById(R.id.button)};
            final boolean[] hantei = {false};
            final Button plus = findViewById(R.id.plus);
            final TextView text = findViewById(R.id.textView);
            final Button plus2 = findViewById(R.id.plus2);
            final TextView text2 = findViewById(R.id.textView2);
            final Button plus3 = findViewById(R.id.plus3);
            final TextView text3 = findViewById(R.id.textView3);
            final Button plus4 = findViewById(R.id.plus4);
            final TextView text4 = findViewById(R.id.textView4);
            final Button plus5 = findViewById(R.id.plus5);
            final TextView text5 = findViewById(R.id.textView5);
            final Button plus6 = findViewById(R.id.plus6);
            final TextView text6 = findViewById(R.id.textView6);
            final Button plus7 = findViewById(R.id.plus7);
            final TextView text7 = findViewById(R.id.textView7);
            final Button plus8 = findViewById(R.id.plus8);
            final TextView text8 = findViewById(R.id.textView8);
            final Button plus9 = findViewById(R.id.plus9);
            final TextView text9 = findViewById(R.id.textView9);
            final Button plus10 = findViewById(R.id.plus10);
            final TextView text10 = findViewById(R.id.textView10);
            final Button plus11 = findViewById(R.id.plus11);
            final TextView text11 = findViewById(R.id.textView11);
            final Button plus12 = findViewById(R.id.plus12);
            final TextView text12 = findViewById(R.id.textView12);
            final Button plus13 = findViewById(R.id.plus13);
            final TextView text13 = findViewById(R.id.textView13);
            final Button plus14 = findViewById(R.id.plus14);
            final TextView text14 = findViewById(R.id.textView14);
            final Button plus15 = findViewById(R.id.plus15);
            final TextView text15 = findViewById(R.id.textView15);
            final Button plus16 = findViewById(R.id.plus16);
            final TextView text16 = findViewById(R.id.textView16);
            final Button plus17 = findViewById(R.id.plus17);
            final TextView text17 = findViewById(R.id.textView17);
            final Button plus18 = findViewById(R.id.plus18);
            final TextView text18 = findViewById(R.id.textView18);
            final Button plus19 = findViewById(R.id.plus19);
            final TextView text19 = findViewById(R.id.textView19);
            final Button plus20 = findViewById(R.id.plus20);
            final TextView text20 = findViewById(R.id.textView20);
            final Button plus21 = findViewById(R.id.plus21);
            final TextView text21 = findViewById(R.id.textView21);
            final Button plus22 = findViewById(R.id.plus22);
            final TextView text22 = findViewById(R.id.textView22);
            final Button plus23 = findViewById(R.id.plus23);
            final TextView text23 = findViewById(R.id.textView23);
            final Button plus24 = findViewById(R.id.plus24);
            final TextView text24 = findViewById(R.id.textView24);
            final Button plus25 = findViewById(R.id.plus25);
            final TextView text25 = findViewById(R.id.textView25);
            final Button plus26 = findViewById(R.id.plus26);
            final TextView text26 = findViewById(R.id.textView26);
            final Button plus27 = findViewById(R.id.plus27);
            final TextView text27 = findViewById(R.id.textView27);
            final Button plus28 = findViewById(R.id.plus28);
            final TextView text28 = findViewById(R.id.textView28);
            final Button plus29 = findViewById(R.id.plus29);
            final TextView text29 = findViewById(R.id.textView29);
            final Button plus30 = findViewById(R.id.plus30);
            final TextView text30 = findViewById(R.id.textView30);
            final Button plus31 = findViewById(R.id.plus31);
            final TextView text31 = findViewById(R.id.textView31);
            final Button plus32 = findViewById(R.id.plus32);
            final TextView text32 = findViewById(R.id.textView32);
            final Button plus33 = findViewById(R.id.plus33);
            final TextView text33 = findViewById(R.id.textView33);
            final Button plus34 = findViewById(R.id.plus34);
            final TextView text34 = findViewById(R.id.textView34);
            final Button plus35 = findViewById(R.id.plus35);
            final TextView text35 = findViewById(R.id.textView35);
            final Button plus36 = findViewById(R.id.plus36);
            final TextView text36 = findViewById(R.id.textView36);
            final Button plus37 = findViewById(R.id.plus37);
            final TextView text37 = findViewById(R.id.textView37);
            final Button plus38 = findViewById(R.id.plus38);
            final TextView text38 = findViewById(R.id.textView38);
            final Button plus39 = findViewById(R.id.plus39);
            final TextView text39 = findViewById(R.id.textView39);
            final Button plus40 = findViewById(R.id.plus40);
            final TextView text40 = findViewById(R.id.textView40);
            final Button plus41 = findViewById(R.id.plus41);
            final TextView text41 = findViewById(R.id.textView41);
            final Button plus42 = findViewById(R.id.plus42);
            final TextView text42 = findViewById(R.id.textView42);
            a1 = 0;
            b1 = 0;
            c1 = 0;
            d1 = 0;
            e1 = 0;
            f1 = 0;
            a2 = 0;
            b2 = 0;
            c2 = 0;
            d2 = 0;
            e2 = 0;
            f2 = 0;

            hozon.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    //hantei[2] = true;
                    Intent intent = new Intent();
                    intent.putExtra("ser1", text.getText().toString());
                    intent.putExtra("serR1", text2.getText().toString());
                    intent.putExtra("sp1", text3.getText().toString());
                    intent.putExtra("bC1", text4.getText().toString());
                    intent.putExtra("b1", text5.getText().toString());
                    intent.putExtra("spR1", text6.getText().toString());
                    intent.putExtra("fC1", text7.getText().toString());
                    intent.putExtra("ser2", text8.getText().toString());
                    intent.putExtra("serR2", text9.getText().toString());
                    intent.putExtra("sp2", text10.getText().toString());
                    intent.putExtra("bC2", text11.getText().toString());
                    intent.putExtra("b2", text12.getText().toString());
                    intent.putExtra("spR2", text13.getText().toString());
                    intent.putExtra("fC2", text14.getText().toString());
                    intent.putExtra("ser3", text15.getText().toString());
                    intent.putExtra("serR3", text16.getText().toString());
                    intent.putExtra("sp3", text17.getText().toString());
                    intent.putExtra("bC3", text18.getText().toString());
                    intent.putExtra("b3", text19.getText().toString());
                    intent.putExtra("spR3", text20.getText().toString());
                    intent.putExtra("fC3", text21.getText().toString());
                    intent.putExtra("ser4", text22.getText().toString());
                    intent.putExtra("serR4", text23.getText().toString());
                    intent.putExtra("sp4", text24.getText().toString());
                    intent.putExtra("bC4", text25.getText().toString());
                    intent.putExtra("b4", text26.getText().toString());
                    intent.putExtra("spR4", text27.getText().toString());
                    intent.putExtra("fC4", text28.getText().toString());
                    intent.putExtra("ser5", text29.getText().toString());
                    intent.putExtra("serR5", text30.getText().toString());
                    intent.putExtra("sp5", text31.getText().toString());
                    intent.putExtra("bC5", text32.getText().toString());
                    intent.putExtra("b5", text33.getText().toString());
                    intent.putExtra("spR5", text34.getText().toString());
                    intent.putExtra("fC5", text35.getText().toString());
                    intent.putExtra("ser6", text36.getText().toString());
                    intent.putExtra("serR6", text37.getText().toString());
                    intent.putExtra("sp6", text38.getText().toString());
                    intent.putExtra("bC6", text39.getText().toString());
                    intent.putExtra("b6", text40.getText().toString());
                    intent.putExtra("spR6", text41.getText().toString());
                    intent.putExtra("fC6", text42.getText().toString());
                        setResult(RESULT_OK, intent);


                    finish();
                }
            });

            button[0].setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    hantei[0] = true;
                    plus.setText("-");
                    plus2.setText("-");
                    plus3.setText("-");
                    plus4.setText("-");
                    plus5.setText("-");
                    plus6.setText("-");
                    plus7.setText("-");
                    plus8.setText("-");
                    plus9.setText("-");
                    plus10.setText("-");
                    plus11.setText("-");
                    plus12.setText("-");
                    plus13.setText("-");
                    plus14.setText("-");
                    plus15.setText("-");
                    plus16.setText("-");
                    plus17.setText("-");
                    plus18.setText("-");
                    plus19.setText("-");
                    plus20.setText("-");
                    plus21.setText("-");
                    plus22.setText("-");
                    plus23.setText("-");
                    plus24.setText("-");
                    plus25.setText("-");
                    plus26.setText("-");
                    plus27.setText("-");
                    plus28.setText("-");
                    plus29.setText("-");
                    plus30.setText("-");
                    plus31.setText("-");
                    plus32.setText("-");
                    plus33.setText("-");
                    plus34.setText("-");
                    plus35.setText("-");
                    plus36.setText("-");
                    plus37.setText("-");
                    plus38.setText("-");
                    plus39.setText("-");
                    plus40.setText("-");
                    plus41.setText("-");
                    plus42.setText("-");
                }
            });

            //サーブ
            //1人目
            //"+"処理
            plus.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    if (!hantei[0]) {
                        a1 = a1 + 1;
                        text.setText(String.valueOf(a1));
                    } else {
                        a1 = a1 - 1;
                        text.setText(String.valueOf(a1));
                        plus.setText("+");
                        plus2.setText("+");
                        plus3.setText("+");
                        plus4.setText("+");
                        plus5.setText("+");
                        plus6.setText("+");
                        plus7.setText("+");
                        plus8.setText("+");
                        plus9.setText("+");
                        plus10.setText("+");
                        plus11.setText("+");
                        plus12.setText("+");
                        plus13.setText("+");
                        plus14.setText("+");
                        plus15.setText("+");
                        plus16.setText("+");
                        plus17.setText("+");
                        plus18.setText("+");
                        plus19.setText("+");
                        plus20.setText("+");
                        plus21.setText("+");
                        plus22.setText("+");
                        plus23.setText("+");
                        plus24.setText("+");
                        plus25.setText("+");
                        plus26.setText("+");
                        plus27.setText("+");
                        plus28.setText("+");
                        plus29.setText("+");
                        plus30.setText("+");
                        plus31.setText("+");
                        plus32.setText("+");
                        plus33.setText("+");
                        plus34.setText("+");
                        plus35.setText("+");
                        plus36.setText("+");
                        plus37.setText("+");
                        plus38.setText("+");
                        plus39.setText("+");
                        plus40.setText("+");
                        plus41.setText("+");
                        plus42.setText("+");
                        hantei[0] = false;
                    }

                }
            });

            //2人目
            //"+"処理
            plus2.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    if (!hantei[0]) {
                        b1 = b1 + 1;
                        text2.setText(String.valueOf(b1));
                    } else {
                        b1 = b1 - 1;
                        text2.setText(String.valueOf(b1));
                        plus.setText("+");
                        plus2.setText("+");
                        plus3.setText("+");
                        plus4.setText("+");
                        plus5.setText("+");
                        plus6.setText("+");
                        plus7.setText("+");
                        plus8.setText("+");
                        plus9.setText("+");
                        plus10.setText("+");
                        plus11.setText("+");
                        plus12.setText("+");
                        plus13.setText("+");
                        plus14.setText("+");
                        plus15.setText("+");
                        plus16.setText("+");
                        plus17.setText("+");
                        plus18.setText("+");
                        plus19.setText("+");
                        plus20.setText("+");
                        plus21.setText("+");
                        plus22.setText("+");
                        plus23.setText("+");
                        plus24.setText("+");
                        plus25.setText("+");
                        plus26.setText("+");
                        plus27.setText("+");
                        plus28.setText("+");
                        plus29.setText("+");
                        plus30.setText("+");
                        plus31.setText("+");
                        plus32.setText("+");
                        plus33.setText("+");
                        plus34.setText("+");
                        plus35.setText("+");
                        plus36.setText("+");
                        plus37.setText("+");
                        plus38.setText("+");
                        plus39.setText("+");
                        plus40.setText("+");
                        plus41.setText("+");
                        plus42.setText("+");
                        hantei[0] = false;
                    }

                }
            });

            //3人目
            //"+"処理
            plus3.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    if (!hantei[0]) {
                        c1 = c1 + 1;
                        text3.setText(String.valueOf(c1));
                    } else {
                        c1 = c1 - 1;
                        text3.setText(String.valueOf(c1));
                        plus.setText("+");
                        plus2.setText("+");
                        plus3.setText("+");
                        plus4.setText("+");
                        plus5.setText("+");
                        plus6.setText("+");
                        plus7.setText("+");
                        plus8.setText("+");
                        plus9.setText("+");
                        plus10.setText("+");
                        plus11.setText("+");
                        plus12.setText("+");
                        plus13.setText("+");
                        plus14.setText("+");
                        plus15.setText("+");
                        plus16.setText("+");
                        plus17.setText("+");
                        plus18.setText("+");
                        plus19.setText("+");
                        plus20.setText("+");
                        plus21.setText("+");
                        plus22.setText("+");
                        plus23.setText("+");
                        plus24.setText("+");
                        plus25.setText("+");
                        plus26.setText("+");
                        plus27.setText("+");
                        plus28.setText("+");
                        plus29.setText("+");
                        plus30.setText("+");
                        plus31.setText("+");
                        plus32.setText("+");
                        plus33.setText("+");
                        plus34.setText("+");
                        plus35.setText("+");
                        plus36.setText("+");
                        plus37.setText("+");
                        plus38.setText("+");
                        plus39.setText("+");
                        plus40.setText("+");
                        plus41.setText("+");
                        plus42.setText("+");
                        hantei[0] = false;
                    }

                }
            });

            //4人目
            //"+"処理
            plus4.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    if (!hantei[0]) {
                        d1 = d1 + 1;
                        text4.setText(String.valueOf(d1));
                    } else {
                        d1 = d1 - 1;
                        text4.setText(String.valueOf(d1));
                        plus.setText("+");
                        plus2.setText("+");
                        plus3.setText("+");
                        plus4.setText("+");
                        plus5.setText("+");
                        plus6.setText("+");
                        plus7.setText("+");
                        plus8.setText("+");
                        plus9.setText("+");
                        plus10.setText("+");
                        plus11.setText("+");
                        plus12.setText("+");
                        plus13.setText("+");
                        plus14.setText("+");
                        plus15.setText("+");
                        plus16.setText("+");
                        plus17.setText("+");
                        plus18.setText("+");
                        plus19.setText("+");
                        plus20.setText("+");
                        plus21.setText("+");
                        plus22.setText("+");
                        plus23.setText("+");
                        plus24.setText("+");
                        plus25.setText("+");
                        plus26.setText("+");
                        plus27.setText("+");
                        plus28.setText("+");
                        plus29.setText("+");
                        plus30.setText("+");
                        plus31.setText("+");
                        plus32.setText("+");
                        plus33.setText("+");
                        plus34.setText("+");
                        plus35.setText("+");
                        plus36.setText("+");
                        plus37.setText("+");
                        plus38.setText("+");
                        plus39.setText("+");
                        plus40.setText("+");
                        plus41.setText("+");
                        plus42.setText("+");
                        hantei[0] = false;
                    }

                }
            });

            //5人目
            //"+"処理
            plus5.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    if (!hantei[0]) {
                        e1 = e1 + 1;
                        text5.setText(String.valueOf(e1));
                    } else {
                        e1 = e1 - 1;
                        text5.setText(String.valueOf(e1));
                        plus.setText("+");
                        plus2.setText("+");
                        plus3.setText("+");
                        plus4.setText("+");
                        plus5.setText("+");
                        plus6.setText("+");
                        plus7.setText("+");
                        plus8.setText("+");
                        plus9.setText("+");
                        plus10.setText("+");
                        plus11.setText("+");
                        plus12.setText("+");
                        plus13.setText("+");
                        plus14.setText("+");
                        plus15.setText("+");
                        plus16.setText("+");
                        plus17.setText("+");
                        plus18.setText("+");
                        plus19.setText("+");
                        plus20.setText("+");
                        plus21.setText("+");
                        plus22.setText("+");
                        plus23.setText("+");
                        plus24.setText("+");
                        plus25.setText("+");
                        plus26.setText("+");
                        plus27.setText("+");
                        plus28.setText("+");
                        plus29.setText("+");
                        plus30.setText("+");
                        plus31.setText("+");
                        plus32.setText("+");
                        plus33.setText("+");
                        plus34.setText("+");
                        plus35.setText("+");
                        plus36.setText("+");
                        plus37.setText("+");
                        plus38.setText("+");
                        plus39.setText("+");
                        plus40.setText("+");
                        plus41.setText("+");
                        plus42.setText("+");
                        hantei[0] = false;
                    }

                }
            });

            //6人目
            //"+"処理
            plus6.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    if (!hantei[0]) {
                        f1 = f1 + 1;
                        text6.setText(String.valueOf(f1));
                    } else {
                        f1 = f1 - 1;
                        text6.setText(String.valueOf(f1));
                        plus.setText("+");
                        plus2.setText("+");
                        plus3.setText("+");
                        plus4.setText("+");
                        plus5.setText("+");
                        plus6.setText("+");
                        plus7.setText("+");
                        plus8.setText("+");
                        plus9.setText("+");
                        plus10.setText("+");
                        plus11.setText("+");
                        plus12.setText("+");
                        plus13.setText("+");
                        plus14.setText("+");
                        plus15.setText("+");
                        plus16.setText("+");
                        plus17.setText("+");
                        plus18.setText("+");
                        plus19.setText("+");
                        plus20.setText("+");
                        plus21.setText("+");
                        plus22.setText("+");
                        plus23.setText("+");
                        plus24.setText("+");
                        plus25.setText("+");
                        plus26.setText("+");
                        plus27.setText("+");
                        plus28.setText("+");
                        plus29.setText("+");
                        plus30.setText("+");
                        plus31.setText("+");
                        plus32.setText("+");
                        plus33.setText("+");
                        plus34.setText("+");
                        plus35.setText("+");
                        plus36.setText("+");
                        plus37.setText("+");
                        plus38.setText("+");
                        plus39.setText("+");
                        plus40.setText("+");
                        plus41.setText("+");
                        plus42.setText("+");
                        hantei[0] = false;
                    }

                }
            });

            //サーブR
            //1人目
            //"+"処理
            plus7.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    if (!hantei[0]) {
                        a2 = a2 + 1;
                        text7.setText(String.valueOf(a2));
                    } else {
                        a2 = a2 - 1;
                        text7.setText(String.valueOf(a2));
                        plus.setText("+");
                        plus2.setText("+");
                        plus3.setText("+");
                        plus4.setText("+");
                        plus5.setText("+");
                        plus6.setText("+");
                        plus7.setText("+");
                        plus8.setText("+");
                        plus9.setText("+");
                        plus10.setText("+");
                        plus11.setText("+");
                        plus12.setText("+");
                        plus13.setText("+");
                        plus14.setText("+");
                        plus15.setText("+");
                        plus16.setText("+");
                        plus17.setText("+");
                        plus18.setText("+");
                        plus19.setText("+");
                        plus20.setText("+");
                        plus21.setText("+");
                        plus22.setText("+");
                        plus23.setText("+");
                        plus24.setText("+");
                        plus25.setText("+");
                        plus26.setText("+");
                        plus27.setText("+");
                        plus28.setText("+");
                        plus29.setText("+");
                        plus30.setText("+");
                        plus31.setText("+");
                        plus32.setText("+");
                        plus33.setText("+");
                        plus34.setText("+");
                        plus35.setText("+");
                        plus36.setText("+");
                        plus37.setText("+");
                        plus38.setText("+");
                        plus39.setText("+");
                        plus40.setText("+");
                        plus41.setText("+");
                        plus42.setText("+");
                        hantei[0] = false;
                    }

                }
            });

            //2人目
            //"+"処理
            plus8.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    if (!hantei[0]) {
                        b2 = b2 + 1;
                        text8.setText(String.valueOf(b2));
                    } else {
                        b2 = b2 - 1;
                        text8.setText(String.valueOf(b2));
                        plus.setText("+");
                        plus2.setText("+");
                        plus3.setText("+");
                        plus4.setText("+");
                        plus5.setText("+");
                        plus6.setText("+");
                        plus7.setText("+");
                        plus8.setText("+");
                        plus9.setText("+");
                        plus10.setText("+");
                        plus11.setText("+");
                        plus12.setText("+");
                        plus13.setText("+");
                        plus14.setText("+");
                        plus15.setText("+");
                        plus16.setText("+");
                        plus17.setText("+");
                        plus18.setText("+");
                        plus19.setText("+");
                        plus20.setText("+");
                        plus21.setText("+");
                        plus22.setText("+");
                        plus23.setText("+");
                        plus24.setText("+");
                        plus25.setText("+");
                        plus26.setText("+");
                        plus27.setText("+");
                        plus28.setText("+");
                        plus29.setText("+");
                        plus30.setText("+");
                        plus31.setText("+");
                        plus32.setText("+");
                        plus33.setText("+");
                        plus34.setText("+");
                        plus35.setText("+");
                        plus36.setText("+");
                        plus37.setText("+");
                        plus38.setText("+");
                        plus39.setText("+");
                        plus40.setText("+");
                        plus41.setText("+");
                        plus42.setText("+");
                        hantei[0] = false;
                    }

                }
            });

            //3人目
            //"+"処理
            plus9.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    if (!hantei[0]) {
                        c2 = c2 + 1;
                        text9.setText(String.valueOf(c2));
                    } else {
                        c2 = c2 - 1;
                        text9.setText(String.valueOf(c2));
                        plus.setText("+");
                        plus2.setText("+");
                        plus3.setText("+");
                        plus4.setText("+");
                        plus5.setText("+");
                        plus6.setText("+");
                        plus7.setText("+");
                        plus8.setText("+");
                        plus9.setText("+");
                        plus10.setText("+");
                        plus11.setText("+");
                        plus12.setText("+");
                        plus13.setText("+");
                        plus14.setText("+");
                        plus15.setText("+");
                        plus16.setText("+");
                        plus17.setText("+");
                        plus18.setText("+");
                        plus19.setText("+");
                        plus20.setText("+");
                        plus21.setText("+");
                        plus22.setText("+");
                        plus23.setText("+");
                        plus24.setText("+");
                        plus25.setText("+");
                        plus26.setText("+");
                        plus27.setText("+");
                        plus28.setText("+");
                        plus29.setText("+");
                        plus30.setText("+");
                        plus31.setText("+");
                        plus32.setText("+");
                        plus33.setText("+");
                        plus34.setText("+");
                        plus35.setText("+");
                        plus36.setText("+");
                        plus37.setText("+");
                        plus38.setText("+");
                        plus39.setText("+");
                        plus40.setText("+");
                        plus41.setText("+");
                        plus42.setText("+");
                        hantei[0] = false;
                    }

                }
            });

            //4人目
            //"+"処理
            plus10.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    if (!hantei[0]) {
                        d2 = d2 + 1;
                        text10.setText(String.valueOf(d2));
                    } else {
                        d2 = d2 - 1;
                        text10.setText(String.valueOf(d2));
                        plus.setText("+");
                        plus2.setText("+");
                        plus3.setText("+");
                        plus4.setText("+");
                        plus5.setText("+");
                        plus6.setText("+");
                        plus7.setText("+");
                        plus8.setText("+");
                        plus9.setText("+");
                        plus10.setText("+");
                        plus11.setText("+");
                        plus12.setText("+");
                        plus13.setText("+");
                        plus14.setText("+");
                        plus15.setText("+");
                        plus16.setText("+");
                        plus17.setText("+");
                        plus18.setText("+");
                        plus19.setText("+");
                        plus20.setText("+");
                        plus21.setText("+");
                        plus22.setText("+");
                        plus23.setText("+");
                        plus24.setText("+");
                        plus25.setText("+");
                        plus26.setText("+");
                        plus27.setText("+");
                        plus28.setText("+");
                        plus29.setText("+");
                        plus30.setText("+");
                        plus31.setText("+");
                        plus32.setText("+");
                        plus33.setText("+");
                        plus34.setText("+");
                        plus35.setText("+");
                        plus36.setText("+");
                        plus37.setText("+");
                        plus38.setText("+");
                        plus39.setText("+");
                        plus40.setText("+");
                        plus41.setText("+");
                        plus42.setText("+");
                        hantei[0] = false;
                    }

                }
            });

            //5人目
            //"+"処理
            plus11.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    if (!hantei[0]) {
                        e2 = e2 + 1;
                        text11.setText(String.valueOf(e2));
                    } else {
                        e2 = e2 - 1;
                        text11.setText(String.valueOf(e2));
                        plus.setText("+");
                        plus2.setText("+");
                        plus3.setText("+");
                        plus4.setText("+");
                        plus5.setText("+");
                        plus6.setText("+");
                        plus7.setText("+");
                        plus8.setText("+");
                        plus9.setText("+");
                        plus10.setText("+");
                        plus11.setText("+");
                        plus12.setText("+");
                        plus13.setText("+");
                        plus14.setText("+");
                        plus15.setText("+");
                        plus16.setText("+");
                        plus17.setText("+");
                        plus18.setText("+");
                        plus19.setText("+");
                        plus20.setText("+");
                        plus21.setText("+");
                        plus22.setText("+");
                        plus23.setText("+");
                        plus24.setText("+");
                        plus25.setText("+");
                        plus26.setText("+");
                        plus27.setText("+");
                        plus28.setText("+");
                        plus29.setText("+");
                        plus30.setText("+");
                        plus31.setText("+");
                        plus32.setText("+");
                        plus33.setText("+");
                        plus34.setText("+");
                        plus35.setText("+");
                        plus36.setText("+");
                        plus37.setText("+");
                        plus38.setText("+");
                        plus39.setText("+");
                        plus40.setText("+");
                        plus41.setText("+");
                        plus42.setText("+");
                        hantei[0] = false;
                    }

                }
            });

            //6人目
            //"+"処理
            plus12.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    if (!hantei[0]) {
                        f2 = f2 + 1;
                        text12.setText(String.valueOf(f2));
                    } else {
                        f2 = f2 - 1;
                        text12.setText(String.valueOf(f2));
                        plus.setText("+");
                        plus2.setText("+");
                        plus3.setText("+");
                        plus4.setText("+");
                        plus5.setText("+");
                        plus6.setText("+");
                        plus7.setText("+");
                        plus8.setText("+");
                        plus9.setText("+");
                        plus10.setText("+");
                        plus11.setText("+");
                        plus12.setText("+");
                        plus13.setText("+");
                        plus14.setText("+");
                        plus15.setText("+");
                        plus16.setText("+");
                        plus17.setText("+");
                        plus18.setText("+");
                        plus19.setText("+");
                        plus20.setText("+");
                        plus21.setText("+");
                        plus22.setText("+");
                        plus23.setText("+");
                        plus24.setText("+");
                        plus25.setText("+");
                        plus26.setText("+");
                        plus27.setText("+");
                        plus28.setText("+");
                        plus29.setText("+");
                        plus30.setText("+");
                        plus31.setText("+");
                        plus32.setText("+");
                        plus33.setText("+");
                        plus34.setText("+");
                        plus35.setText("+");
                        plus36.setText("+");
                        plus37.setText("+");
                        plus38.setText("+");
                        plus39.setText("+");
                        plus40.setText("+");
                        plus41.setText("+");
                        plus42.setText("+");
                        hantei[0] = false;
                    }

                }
            });

            //スパイク
            //1人目
            //"+"処理
            plus13.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    if (!hantei[0]) {
                        a3 = a3 + 1;
                        text13.setText(String.valueOf(a3));
                    } else {
                        a3 = a3 - 1;
                        text13.setText(String.valueOf(a3));
                        plus.setText("+");
                        plus2.setText("+");
                        plus3.setText("+");
                        plus4.setText("+");
                        plus5.setText("+");
                        plus6.setText("+");
                        plus7.setText("+");
                        plus8.setText("+");
                        plus9.setText("+");
                        plus10.setText("+");
                        plus11.setText("+");
                        plus12.setText("+");
                        plus13.setText("+");
                        plus14.setText("+");
                        plus15.setText("+");
                        plus16.setText("+");
                        plus17.setText("+");
                        plus18.setText("+");
                        plus19.setText("+");
                        plus20.setText("+");
                        plus21.setText("+");
                        plus22.setText("+");
                        plus23.setText("+");
                        plus24.setText("+");
                        plus25.setText("+");
                        plus26.setText("+");
                        plus27.setText("+");
                        plus28.setText("+");
                        plus29.setText("+");
                        plus30.setText("+");
                        plus31.setText("+");
                        plus32.setText("+");
                        plus33.setText("+");
                        plus34.setText("+");
                        plus35.setText("+");
                        plus36.setText("+");
                        plus37.setText("+");
                        plus38.setText("+");
                        plus39.setText("+");
                        plus40.setText("+");
                        plus41.setText("+");
                        plus42.setText("+");
                        hantei[0] = false;
                    }

                }
            });

            //2人目
            //"+"処理
            plus14.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    if (!hantei[0]) {
                        b3 = b3 + 1;
                        text14.setText(String.valueOf(b3));
                    } else {
                        b3 = b3 - 1;
                        text14.setText(String.valueOf(b3));
                        plus.setText("+");
                        plus2.setText("+");
                        plus3.setText("+");
                        plus4.setText("+");
                        plus5.setText("+");
                        plus6.setText("+");
                        plus7.setText("+");
                        plus8.setText("+");
                        plus9.setText("+");
                        plus10.setText("+");
                        plus11.setText("+");
                        plus12.setText("+");
                        plus13.setText("+");
                        plus14.setText("+");
                        plus15.setText("+");
                        plus16.setText("+");
                        plus17.setText("+");
                        plus18.setText("+");
                        plus19.setText("+");
                        plus20.setText("+");
                        plus21.setText("+");
                        plus22.setText("+");
                        plus23.setText("+");
                        plus24.setText("+");
                        plus25.setText("+");
                        plus26.setText("+");
                        plus27.setText("+");
                        plus28.setText("+");
                        plus29.setText("+");
                        plus30.setText("+");
                        plus31.setText("+");
                        plus32.setText("+");
                        plus33.setText("+");
                        plus34.setText("+");
                        plus35.setText("+");
                        plus36.setText("+");
                        plus37.setText("+");
                        plus38.setText("+");
                        plus39.setText("+");
                        plus40.setText("+");
                        plus41.setText("+");
                        plus42.setText("+");
                        hantei[0] = false;
                    }

                }
            });

            //3人目
            //"+"処理
            plus15.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    if (!hantei[0]) {
                        c3 = c3 + 1;
                        text15.setText(String.valueOf(c3));
                    } else {
                        c3 = c3 - 1;
                        text15.setText(String.valueOf(c3));
                        plus.setText("+");
                        plus2.setText("+");
                        plus3.setText("+");
                        plus4.setText("+");
                        plus5.setText("+");
                        plus6.setText("+");
                        plus7.setText("+");
                        plus8.setText("+");
                        plus9.setText("+");
                        plus10.setText("+");
                        plus11.setText("+");
                        plus12.setText("+");
                        plus13.setText("+");
                        plus14.setText("+");
                        plus15.setText("+");
                        plus16.setText("+");
                        plus17.setText("+");
                        plus18.setText("+");
                        plus19.setText("+");
                        plus20.setText("+");
                        plus21.setText("+");
                        plus22.setText("+");
                        plus23.setText("+");
                        plus24.setText("+");
                        plus25.setText("+");
                        plus26.setText("+");
                        plus27.setText("+");
                        plus28.setText("+");
                        plus29.setText("+");
                        plus30.setText("+");
                        plus31.setText("+");
                        plus32.setText("+");
                        plus33.setText("+");
                        plus34.setText("+");
                        plus35.setText("+");
                        plus36.setText("+");
                        plus37.setText("+");
                        plus38.setText("+");
                        plus39.setText("+");
                        plus40.setText("+");
                        plus41.setText("+");
                        plus42.setText("+");
                        hantei[0] = false;
                    }

                }
            });

            //4人目
            //"+"処理
            plus16.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    if (!hantei[0]) {
                        d3 = d3 + 1;
                        text16.setText(String.valueOf(d3));
                    } else {
                        d3 = d3 - 1;
                        text16.setText(String.valueOf(d3));
                        plus.setText("+");
                        plus2.setText("+");
                        plus3.setText("+");
                        plus4.setText("+");
                        plus5.setText("+");
                        plus6.setText("+");
                        plus7.setText("+");
                        plus8.setText("+");
                        plus9.setText("+");
                        plus10.setText("+");
                        plus11.setText("+");
                        plus12.setText("+");
                        plus13.setText("+");
                        plus14.setText("+");
                        plus15.setText("+");
                        plus16.setText("+");
                        plus17.setText("+");
                        plus18.setText("+");
                        plus19.setText("+");
                        plus20.setText("+");
                        plus21.setText("+");
                        plus22.setText("+");
                        plus23.setText("+");
                        plus24.setText("+");
                        plus25.setText("+");
                        plus26.setText("+");
                        plus27.setText("+");
                        plus28.setText("+");
                        plus29.setText("+");
                        plus30.setText("+");
                        plus31.setText("+");
                        plus32.setText("+");
                        plus33.setText("+");
                        plus34.setText("+");
                        plus35.setText("+");
                        plus36.setText("+");
                        plus37.setText("+");
                        plus38.setText("+");
                        plus39.setText("+");
                        plus40.setText("+");
                        plus41.setText("+");
                        plus42.setText("+");
                        hantei[0] = false;
                    }

                }
            });

            //5人目
            //"+"処理
            plus17.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    if (!hantei[0]) {
                        e3 = e3 + 1;
                        text17.setText(String.valueOf(e3));
                    } else {
                        e3 = e3 - 1;
                        text17.setText(String.valueOf(e3));
                        plus.setText("+");
                        plus2.setText("+");
                        plus3.setText("+");
                        plus4.setText("+");
                        plus5.setText("+");
                        plus6.setText("+");
                        plus7.setText("+");
                        plus8.setText("+");
                        plus9.setText("+");
                        plus10.setText("+");
                        plus11.setText("+");
                        plus12.setText("+");
                        plus13.setText("+");
                        plus14.setText("+");
                        plus15.setText("+");
                        plus16.setText("+");
                        plus17.setText("+");
                        plus18.setText("+");
                        plus19.setText("+");
                        plus20.setText("+");
                        plus21.setText("+");
                        plus22.setText("+");
                        plus23.setText("+");
                        plus24.setText("+");
                        plus25.setText("+");
                        plus26.setText("+");
                        plus27.setText("+");
                        plus28.setText("+");
                        plus29.setText("+");
                        plus30.setText("+");
                        plus31.setText("+");
                        plus32.setText("+");
                        plus33.setText("+");
                        plus34.setText("+");
                        plus35.setText("+");
                        plus36.setText("+");
                        plus37.setText("+");
                        plus38.setText("+");
                        plus39.setText("+");
                        plus40.setText("+");
                        plus41.setText("+");
                        plus42.setText("+");
                        hantei[0] = false;
                    }

                }
            });

            //6人目
            //"+"処理
            plus18.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    if (!hantei[0]) {
                        f3 = f3 + 1;
                        text18.setText(String.valueOf(f3));
                    } else {
                        f3 = f3 - 1;
                        text18.setText(String.valueOf(f3));
                        plus.setText("+");
                        plus2.setText("+");
                        plus3.setText("+");
                        plus4.setText("+");
                        plus5.setText("+");
                        plus6.setText("+");
                        plus7.setText("+");
                        plus8.setText("+");
                        plus9.setText("+");
                        plus10.setText("+");
                        plus11.setText("+");
                        plus12.setText("+");
                        plus13.setText("+");
                        plus14.setText("+");
                        plus15.setText("+");
                        plus16.setText("+");
                        plus17.setText("+");
                        plus18.setText("+");
                        plus19.setText("+");
                        plus20.setText("+");
                        plus21.setText("+");
                        plus22.setText("+");
                        plus23.setText("+");
                        plus24.setText("+");
                        plus25.setText("+");
                        plus26.setText("+");
                        plus27.setText("+");
                        plus28.setText("+");
                        plus29.setText("+");
                        plus30.setText("+");
                        plus31.setText("+");
                        plus32.setText("+");
                        plus33.setText("+");
                        plus34.setText("+");
                        plus35.setText("+");
                        plus36.setText("+");
                        plus37.setText("+");
                        plus38.setText("+");
                        plus39.setText("+");
                        plus40.setText("+");
                        plus41.setText("+");
                        plus42.setText("+");
                        hantei[0] = false;
                    }

                }
            });

            //Bカバー
            //1人目
            //"+"処理
            plus19.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    if (!hantei[0]) {
                        a4 = a4 + 1;
                        text19.setText(String.valueOf(a4));
                    } else {
                        a4 = a4 - 1;
                        text19.setText(String.valueOf(a4));
                        plus.setText("+");
                        plus2.setText("+");
                        plus3.setText("+");
                        plus4.setText("+");
                        plus5.setText("+");
                        plus6.setText("+");
                        plus7.setText("+");
                        plus8.setText("+");
                        plus9.setText("+");
                        plus10.setText("+");
                        plus11.setText("+");
                        plus12.setText("+");
                        plus13.setText("+");
                        plus14.setText("+");
                        plus15.setText("+");
                        plus16.setText("+");
                        plus17.setText("+");
                        plus18.setText("+");
                        plus19.setText("+");
                        plus20.setText("+");
                        plus21.setText("+");
                        plus22.setText("+");
                        plus23.setText("+");
                        plus24.setText("+");
                        plus25.setText("+");
                        plus26.setText("+");
                        plus27.setText("+");
                        plus28.setText("+");
                        plus29.setText("+");
                        plus30.setText("+");
                        plus31.setText("+");
                        plus32.setText("+");
                        plus33.setText("+");
                        plus34.setText("+");
                        plus35.setText("+");
                        plus36.setText("+");
                        plus37.setText("+");
                        plus38.setText("+");
                        plus39.setText("+");
                        plus40.setText("+");
                        plus41.setText("+");
                        plus42.setText("+");
                        hantei[0] = false;
                    }

                }
            });

            //2人目
            //"+"処理
            plus20.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    if (!hantei[0]) {
                        b4 = b4 + 1;
                        text20.setText(String.valueOf(b4));
                    } else {
                        b4 = b4 - 1;
                        text20.setText(String.valueOf(b4));
                        plus.setText("+");
                        plus2.setText("+");
                        plus3.setText("+");
                        plus4.setText("+");
                        plus5.setText("+");
                        plus6.setText("+");
                        plus7.setText("+");
                        plus8.setText("+");
                        plus9.setText("+");
                        plus10.setText("+");
                        plus11.setText("+");
                        plus12.setText("+");
                        plus13.setText("+");
                        plus14.setText("+");
                        plus15.setText("+");
                        plus16.setText("+");
                        plus17.setText("+");
                        plus18.setText("+");
                        plus19.setText("+");
                        plus20.setText("+");
                        plus21.setText("+");
                        plus22.setText("+");
                        plus23.setText("+");
                        plus24.setText("+");
                        plus25.setText("+");
                        plus26.setText("+");
                        plus27.setText("+");
                        plus28.setText("+");
                        plus29.setText("+");
                        plus30.setText("+");
                        plus31.setText("+");
                        plus32.setText("+");
                        plus33.setText("+");
                        plus34.setText("+");
                        plus35.setText("+");
                        plus36.setText("+");
                        plus37.setText("+");
                        plus38.setText("+");
                        plus39.setText("+");
                        plus40.setText("+");
                        plus41.setText("+");
                        plus42.setText("+");
                        hantei[0] = false;
                    }

                }
            });

            //3人目
            //"+"処理
            plus21.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    if (!hantei[0]) {
                        c4 = c4 + 1;
                        text21.setText(String.valueOf(c4));
                    } else {
                        c4 = c4 - 1;
                        text21.setText(String.valueOf(c4));
                        plus.setText("+");
                        plus2.setText("+");
                        plus3.setText("+");
                        plus4.setText("+");
                        plus5.setText("+");
                        plus6.setText("+");
                        plus7.setText("+");
                        plus8.setText("+");
                        plus9.setText("+");
                        plus10.setText("+");
                        plus11.setText("+");
                        plus12.setText("+");
                        plus13.setText("+");
                        plus14.setText("+");
                        plus15.setText("+");
                        plus16.setText("+");
                        plus17.setText("+");
                        plus18.setText("+");
                        plus19.setText("+");
                        plus20.setText("+");
                        plus21.setText("+");
                        plus22.setText("+");
                        plus23.setText("+");
                        plus24.setText("+");
                        plus25.setText("+");
                        plus26.setText("+");
                        plus27.setText("+");
                        plus28.setText("+");
                        plus29.setText("+");
                        plus30.setText("+");
                        plus31.setText("+");
                        plus32.setText("+");
                        plus33.setText("+");
                        plus34.setText("+");
                        plus35.setText("+");
                        plus36.setText("+");
                        plus37.setText("+");
                        plus38.setText("+");
                        plus39.setText("+");
                        plus40.setText("+");
                        plus41.setText("+");
                        plus42.setText("+");
                        hantei[0] = false;
                    }

                }
            });

            //4人目
            //"+"処理
            plus22.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    if (!hantei[0]) {
                        d4 = d4 + 1;
                        text22.setText(String.valueOf(d4));
                    } else {
                        d4 = d4 - 1;
                        text22.setText(String.valueOf(d4));
                        plus.setText("+");
                        plus2.setText("+");
                        plus3.setText("+");
                        plus4.setText("+");
                        plus5.setText("+");
                        plus6.setText("+");
                        plus7.setText("+");
                        plus8.setText("+");
                        plus9.setText("+");
                        plus10.setText("+");
                        plus11.setText("+");
                        plus12.setText("+");
                        plus13.setText("+");
                        plus14.setText("+");
                        plus15.setText("+");
                        plus16.setText("+");
                        plus17.setText("+");
                        plus18.setText("+");
                        plus19.setText("+");
                        plus20.setText("+");
                        plus21.setText("+");
                        plus22.setText("+");
                        plus23.setText("+");
                        plus24.setText("+");
                        plus25.setText("+");
                        plus26.setText("+");
                        plus27.setText("+");
                        plus28.setText("+");
                        plus29.setText("+");
                        plus30.setText("+");
                        plus31.setText("+");
                        plus32.setText("+");
                        plus33.setText("+");
                        plus34.setText("+");
                        plus35.setText("+");
                        plus36.setText("+");
                        plus37.setText("+");
                        plus38.setText("+");
                        plus39.setText("+");
                        plus40.setText("+");
                        plus41.setText("+");
                        plus42.setText("+");
                        hantei[0] = false;
                    }

                }
            });

            //5人目
            //"+"処理
            plus23.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    if (!hantei[0]) {
                        e4 = e4 + 1;
                        text23.setText(String.valueOf(e4));
                    } else {
                        e4 = e4 - 1;
                        text23.setText(String.valueOf(e4));
                        plus.setText("+");
                        plus2.setText("+");
                        plus3.setText("+");
                        plus4.setText("+");
                        plus5.setText("+");
                        plus6.setText("+");
                        plus7.setText("+");
                        plus8.setText("+");
                        plus9.setText("+");
                        plus10.setText("+");
                        plus11.setText("+");
                        plus12.setText("+");
                        plus13.setText("+");
                        plus14.setText("+");
                        plus15.setText("+");
                        plus16.setText("+");
                        plus17.setText("+");
                        plus18.setText("+");
                        plus19.setText("+");
                        plus20.setText("+");
                        plus21.setText("+");
                        plus22.setText("+");
                        plus23.setText("+");
                        plus24.setText("+");
                        plus25.setText("+");
                        plus26.setText("+");
                        plus27.setText("+");
                        plus28.setText("+");
                        plus29.setText("+");
                        plus30.setText("+");
                        plus31.setText("+");
                        plus32.setText("+");
                        plus33.setText("+");
                        plus34.setText("+");
                        plus35.setText("+");
                        plus36.setText("+");
                        plus37.setText("+");
                        plus38.setText("+");
                        plus39.setText("+");
                        plus40.setText("+");
                        plus41.setText("+");
                        plus42.setText("+");
                        hantei[0] = false;
                    }

                }
            });

            //6人目
            //"+"処理
            plus24.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    if (!hantei[0]) {
                        f4 = f4 + 1;
                        text24.setText(String.valueOf(f4));
                    } else {
                        f4 = f4 - 1;
                        text24.setText(String.valueOf(f4));
                        plus.setText("+");
                        plus2.setText("+");
                        plus3.setText("+");
                        plus4.setText("+");
                        plus5.setText("+");
                        plus6.setText("+");
                        plus7.setText("+");
                        plus8.setText("+");
                        plus9.setText("+");
                        plus10.setText("+");
                        plus11.setText("+");
                        plus12.setText("+");
                        plus13.setText("+");
                        plus14.setText("+");
                        plus15.setText("+");
                        plus16.setText("+");
                        plus17.setText("+");
                        plus18.setText("+");
                        plus19.setText("+");
                        plus20.setText("+");
                        plus21.setText("+");
                        plus22.setText("+");
                        plus23.setText("+");
                        plus24.setText("+");
                        plus25.setText("+");
                        plus26.setText("+");
                        plus27.setText("+");
                        plus28.setText("+");
                        plus29.setText("+");
                        plus30.setText("+");
                        plus31.setText("+");
                        plus32.setText("+");
                        plus33.setText("+");
                        plus34.setText("+");
                        plus35.setText("+");
                        plus36.setText("+");
                        plus37.setText("+");
                        plus38.setText("+");
                        plus39.setText("+");
                        plus40.setText("+");
                        plus41.setText("+");
                        plus42.setText("+");
                        hantei[0] = false;
                    }

                }
            });

            //B
            //1人目
            //"+"処理
            plus25.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    if (!hantei[0]) {
                        a5 = a5 + 1;
                        text25.setText(String.valueOf(a5));
                    } else {
                        a5 = a5 - 1;
                        text25.setText(String.valueOf(a5));
                        plus.setText("+");
                        plus2.setText("+");
                        plus3.setText("+");
                        plus4.setText("+");
                        plus5.setText("+");
                        plus6.setText("+");
                        plus7.setText("+");
                        plus8.setText("+");
                        plus9.setText("+");
                        plus10.setText("+");
                        plus11.setText("+");
                        plus12.setText("+");
                        plus13.setText("+");
                        plus14.setText("+");
                        plus15.setText("+");
                        plus16.setText("+");
                        plus17.setText("+");
                        plus18.setText("+");
                        plus19.setText("+");
                        plus20.setText("+");
                        plus21.setText("+");
                        plus22.setText("+");
                        plus23.setText("+");
                        plus24.setText("+");
                        plus25.setText("+");
                        plus26.setText("+");
                        plus27.setText("+");
                        plus28.setText("+");
                        plus29.setText("+");
                        plus30.setText("+");
                        plus31.setText("+");
                        plus32.setText("+");
                        plus33.setText("+");
                        plus34.setText("+");
                        plus35.setText("+");
                        plus36.setText("+");
                        plus37.setText("+");
                        plus38.setText("+");
                        plus39.setText("+");
                        plus40.setText("+");
                        plus41.setText("+");
                        plus42.setText("+");
                        hantei[0] = false;
                    }

                }
            });

            //2人目
            //"+"処理
            plus26.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    if (!hantei[0]) {
                        b5 = b5 + 1;
                        text26.setText(String.valueOf(b5));
                    } else {
                        b5 = b5 - 1;
                        text26.setText(String.valueOf(b5));
                        plus.setText("+");
                        plus2.setText("+");
                        plus3.setText("+");
                        plus4.setText("+");
                        plus5.setText("+");
                        plus6.setText("+");
                        plus7.setText("+");
                        plus8.setText("+");
                        plus9.setText("+");
                        plus10.setText("+");
                        plus11.setText("+");
                        plus12.setText("+");
                        plus13.setText("+");
                        plus14.setText("+");
                        plus15.setText("+");
                        plus16.setText("+");
                        plus17.setText("+");
                        plus18.setText("+");
                        plus19.setText("+");
                        plus20.setText("+");
                        plus21.setText("+");
                        plus22.setText("+");
                        plus23.setText("+");
                        plus24.setText("+");
                        plus25.setText("+");
                        plus26.setText("+");
                        plus27.setText("+");
                        plus28.setText("+");
                        plus29.setText("+");
                        plus30.setText("+");
                        plus31.setText("+");
                        plus32.setText("+");
                        plus33.setText("+");
                        plus34.setText("+");
                        plus35.setText("+");
                        plus36.setText("+");
                        plus37.setText("+");
                        plus38.setText("+");
                        plus39.setText("+");
                        plus40.setText("+");
                        plus41.setText("+");
                        plus42.setText("+");
                        hantei[0] = false;
                    }

                }
            });

            //3人目
            //"+"処理
            plus27.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    if (!hantei[0]) {
                        c5 = c5 + 1;
                        text27.setText(String.valueOf(c5));
                    } else {
                        c5 = c5 - 1;
                        text27.setText(String.valueOf(c5));
                        plus.setText("+");
                        plus2.setText("+");
                        plus3.setText("+");
                        plus4.setText("+");
                        plus5.setText("+");
                        plus6.setText("+");
                        plus7.setText("+");
                        plus8.setText("+");
                        plus9.setText("+");
                        plus10.setText("+");
                        plus11.setText("+");
                        plus12.setText("+");
                        plus13.setText("+");
                        plus14.setText("+");
                        plus15.setText("+");
                        plus16.setText("+");
                        plus17.setText("+");
                        plus18.setText("+");
                        plus19.setText("+");
                        plus20.setText("+");
                        plus21.setText("+");
                        plus22.setText("+");
                        plus23.setText("+");
                        plus24.setText("+");
                        plus25.setText("+");
                        plus26.setText("+");
                        plus27.setText("+");
                        plus28.setText("+");
                        plus29.setText("+");
                        plus30.setText("+");
                        plus31.setText("+");
                        plus32.setText("+");
                        plus33.setText("+");
                        plus34.setText("+");
                        plus35.setText("+");
                        plus36.setText("+");
                        plus37.setText("+");
                        plus38.setText("+");
                        plus39.setText("+");
                        plus40.setText("+");
                        plus41.setText("+");
                        plus42.setText("+");
                        hantei[0] = false;
                    }

                }
            });

            //4人目
            //"+"処理
            plus28.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    if (!hantei[0]) {
                        d5 = d5 + 1;
                        text28.setText(String.valueOf(d5));
                    } else {
                        d5 = d5 - 1;
                        text28.setText(String.valueOf(d5));
                        plus.setText("+");
                        plus2.setText("+");
                        plus3.setText("+");
                        plus4.setText("+");
                        plus5.setText("+");
                        plus6.setText("+");
                        plus7.setText("+");
                        plus8.setText("+");
                        plus9.setText("+");
                        plus10.setText("+");
                        plus11.setText("+");
                        plus12.setText("+");
                        plus13.setText("+");
                        plus14.setText("+");
                        plus15.setText("+");
                        plus16.setText("+");
                        plus17.setText("+");
                        plus18.setText("+");
                        plus19.setText("+");
                        plus20.setText("+");
                        plus21.setText("+");
                        plus22.setText("+");
                        plus23.setText("+");
                        plus24.setText("+");
                        plus25.setText("+");
                        plus26.setText("+");
                        plus27.setText("+");
                        plus28.setText("+");
                        plus29.setText("+");
                        plus30.setText("+");
                        plus31.setText("+");
                        plus32.setText("+");
                        plus33.setText("+");
                        plus34.setText("+");
                        plus35.setText("+");
                        plus36.setText("+");
                        plus37.setText("+");
                        plus38.setText("+");
                        plus39.setText("+");
                        plus40.setText("+");
                        plus41.setText("+");
                        plus42.setText("+");
                        hantei[0] = false;
                    }

                }
            });

            //5人目
            //"+"処理
            plus29.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    if (!hantei[0]) {
                        e5 = e5 + 1;
                        text29.setText(String.valueOf(e5));
                    } else {
                        e5 = e5 - 1;
                        text29.setText(String.valueOf(e5));
                        plus.setText("+");
                        plus2.setText("+");
                        plus3.setText("+");
                        plus4.setText("+");
                        plus5.setText("+");
                        plus6.setText("+");
                        plus7.setText("+");
                        plus8.setText("+");
                        plus9.setText("+");
                        plus10.setText("+");
                        plus11.setText("+");
                        plus12.setText("+");
                        plus13.setText("+");
                        plus14.setText("+");
                        plus15.setText("+");
                        plus16.setText("+");
                        plus17.setText("+");
                        plus18.setText("+");
                        plus19.setText("+");
                        plus20.setText("+");
                        plus21.setText("+");
                        plus22.setText("+");
                        plus23.setText("+");
                        plus24.setText("+");
                        plus25.setText("+");
                        plus26.setText("+");
                        plus27.setText("+");
                        plus28.setText("+");
                        plus29.setText("+");
                        plus30.setText("+");
                        plus31.setText("+");
                        plus32.setText("+");
                        plus33.setText("+");
                        plus34.setText("+");
                        plus35.setText("+");
                        plus36.setText("+");
                        plus37.setText("+");
                        plus38.setText("+");
                        plus39.setText("+");
                        plus40.setText("+");
                        plus41.setText("+");
                        plus42.setText("+");
                        hantei[0] = false;
                    }

                }
            });

            //6人目
            //"+"処理
            plus30.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    if (!hantei[0]) {
                        f5 = f5 + 1;
                        text30.setText(String.valueOf(f5));
                    } else {
                        f5 = f5 - 1;
                        text30.setText(String.valueOf(f5));
                        plus.setText("+");
                        plus2.setText("+");
                        plus3.setText("+");
                        plus4.setText("+");
                        plus5.setText("+");
                        plus6.setText("+");
                        plus7.setText("+");
                        plus8.setText("+");
                        plus9.setText("+");
                        plus10.setText("+");
                        plus11.setText("+");
                        plus12.setText("+");
                        plus13.setText("+");
                        plus14.setText("+");
                        plus15.setText("+");
                        plus16.setText("+");
                        plus17.setText("+");
                        plus18.setText("+");
                        plus19.setText("+");
                        plus20.setText("+");
                        plus21.setText("+");
                        plus22.setText("+");
                        plus23.setText("+");
                        plus24.setText("+");
                        plus25.setText("+");
                        plus26.setText("+");
                        plus27.setText("+");
                        plus28.setText("+");
                        plus29.setText("+");
                        plus30.setText("+");
                        plus31.setText("+");
                        plus32.setText("+");
                        plus33.setText("+");
                        plus34.setText("+");
                        plus35.setText("+");
                        plus36.setText("+");
                        plus37.setText("+");
                        plus38.setText("+");
                        plus39.setText("+");
                        plus40.setText("+");
                        plus41.setText("+");
                        plus42.setText("+");
                        hantei[0] = false;
                    }

                }
            });

            //スパイクR
            //1人目
            //"+"処理
            plus31.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    if (!hantei[0]) {
                        a6 = a6 + 1;
                        text31.setText(String.valueOf(a6));
                    } else {
                        a6 = a6 - 1;
                        text31.setText(String.valueOf(a6));
                        plus.setText("+");
                        plus2.setText("+");
                        plus3.setText("+");
                        plus4.setText("+");
                        plus5.setText("+");
                        plus6.setText("+");
                        plus7.setText("+");
                        plus8.setText("+");
                        plus9.setText("+");
                        plus10.setText("+");
                        plus11.setText("+");
                        plus12.setText("+");
                        plus13.setText("+");
                        plus14.setText("+");
                        plus15.setText("+");
                        plus16.setText("+");
                        plus17.setText("+");
                        plus18.setText("+");
                        plus19.setText("+");
                        plus20.setText("+");
                        plus21.setText("+");
                        plus22.setText("+");
                        plus23.setText("+");
                        plus24.setText("+");
                        plus25.setText("+");
                        plus26.setText("+");
                        plus27.setText("+");
                        plus28.setText("+");
                        plus29.setText("+");
                        plus30.setText("+");
                        plus31.setText("+");
                        plus32.setText("+");
                        plus33.setText("+");
                        plus34.setText("+");
                        plus35.setText("+");
                        plus36.setText("+");
                        plus37.setText("+");
                        plus38.setText("+");
                        plus39.setText("+");
                        plus40.setText("+");
                        plus41.setText("+");
                        plus42.setText("+");
                        hantei[0] = false;
                    }

                }
            });

            //2人目
            //"+"処理
            plus32.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    if (!hantei[0]) {
                        b6 = b6 + 1;
                        text32.setText(String.valueOf(b6));
                    } else {
                        b6 = b6 - 1;
                        text32.setText(String.valueOf(b6));
                        plus.setText("+");
                        plus2.setText("+");
                        plus3.setText("+");
                        plus4.setText("+");
                        plus5.setText("+");
                        plus6.setText("+");
                        plus7.setText("+");
                        plus8.setText("+");
                        plus9.setText("+");
                        plus10.setText("+");
                        plus11.setText("+");
                        plus12.setText("+");
                        plus13.setText("+");
                        plus14.setText("+");
                        plus15.setText("+");
                        plus16.setText("+");
                        plus17.setText("+");
                        plus18.setText("+");
                        plus19.setText("+");
                        plus20.setText("+");
                        plus21.setText("+");
                        plus22.setText("+");
                        plus23.setText("+");
                        plus24.setText("+");
                        plus25.setText("+");
                        plus26.setText("+");
                        plus27.setText("+");
                        plus28.setText("+");
                        plus29.setText("+");
                        plus30.setText("+");
                        plus31.setText("+");
                        plus32.setText("+");
                        plus33.setText("+");
                        plus34.setText("+");
                        plus35.setText("+");
                        plus36.setText("+");
                        plus37.setText("+");
                        plus38.setText("+");
                        plus39.setText("+");
                        plus40.setText("+");
                        plus41.setText("+");
                        plus42.setText("+");
                        hantei[0] = false;
                    }

                }
            });

            //3人目
            //"+"処理
            plus33.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    if (!hantei[0]) {
                        c6 = c6 + 1;
                        text33.setText(String.valueOf(c6));
                    } else {
                        c6 = c6 - 1;
                        text33.setText(String.valueOf(c6));
                        plus.setText("+");
                        plus2.setText("+");
                        plus3.setText("+");
                        plus4.setText("+");
                        plus5.setText("+");
                        plus6.setText("+");
                        plus7.setText("+");
                        plus8.setText("+");
                        plus9.setText("+");
                        plus10.setText("+");
                        plus11.setText("+");
                        plus12.setText("+");
                        plus13.setText("+");
                        plus14.setText("+");
                        plus15.setText("+");
                        plus16.setText("+");
                        plus17.setText("+");
                        plus18.setText("+");
                        plus19.setText("+");
                        plus20.setText("+");
                        plus21.setText("+");
                        plus22.setText("+");
                        plus23.setText("+");
                        plus24.setText("+");
                        plus25.setText("+");
                        plus26.setText("+");
                        plus27.setText("+");
                        plus28.setText("+");
                        plus29.setText("+");
                        plus30.setText("+");
                        plus31.setText("+");
                        plus32.setText("+");
                        plus33.setText("+");
                        plus34.setText("+");
                        plus35.setText("+");
                        plus36.setText("+");
                        plus37.setText("+");
                        plus38.setText("+");
                        plus39.setText("+");
                        plus40.setText("+");
                        plus41.setText("+");
                        plus42.setText("+");
                        hantei[0] = false;
                    }

                }
            });

            //4人目
            //"+"処理
            plus34.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    if (!hantei[0]) {
                        d6 = d6 + 1;
                        text34.setText(String.valueOf(d6));
                    } else {
                        d6 = d6 - 1;
                        text34.setText(String.valueOf(d6));
                        plus.setText("+");
                        plus2.setText("+");
                        plus3.setText("+");
                        plus4.setText("+");
                        plus5.setText("+");
                        plus6.setText("+");
                        plus7.setText("+");
                        plus8.setText("+");
                        plus9.setText("+");
                        plus10.setText("+");
                        plus11.setText("+");
                        plus12.setText("+");
                        plus13.setText("+");
                        plus14.setText("+");
                        plus15.setText("+");
                        plus16.setText("+");
                        plus17.setText("+");
                        plus18.setText("+");
                        plus19.setText("+");
                        plus20.setText("+");
                        plus21.setText("+");
                        plus22.setText("+");
                        plus23.setText("+");
                        plus24.setText("+");
                        plus25.setText("+");
                        plus26.setText("+");
                        plus27.setText("+");
                        plus28.setText("+");
                        plus29.setText("+");
                        plus30.setText("+");
                        plus31.setText("+");
                        plus32.setText("+");
                        plus33.setText("+");
                        plus34.setText("+");
                        plus35.setText("+");
                        plus36.setText("+");
                        plus37.setText("+");
                        plus38.setText("+");
                        plus39.setText("+");
                        plus40.setText("+");
                        plus41.setText("+");
                        plus42.setText("+");
                        hantei[0] = false;
                    }

                }
            });

            //5人目
            //"+"処理
            plus35.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    if (!hantei[0]) {
                        e6 = e6 + 1;
                        text35.setText(String.valueOf(e6));
                    } else {
                        e6 = e6 - 1;
                        text35.setText(String.valueOf(e6));
                        plus.setText("+");
                        plus2.setText("+");
                        plus3.setText("+");
                        plus4.setText("+");
                        plus5.setText("+");
                        plus6.setText("+");
                        plus7.setText("+");
                        plus8.setText("+");
                        plus9.setText("+");
                        plus10.setText("+");
                        plus11.setText("+");
                        plus12.setText("+");
                        plus13.setText("+");
                        plus14.setText("+");
                        plus15.setText("+");
                        plus16.setText("+");
                        plus17.setText("+");
                        plus18.setText("+");
                        plus19.setText("+");
                        plus20.setText("+");
                        plus21.setText("+");
                        plus22.setText("+");
                        plus23.setText("+");
                        plus24.setText("+");
                        plus25.setText("+");
                        plus26.setText("+");
                        plus27.setText("+");
                        plus28.setText("+");
                        plus29.setText("+");
                        plus30.setText("+");
                        plus31.setText("+");
                        plus32.setText("+");
                        plus33.setText("+");
                        plus34.setText("+");
                        plus35.setText("+");
                        plus36.setText("+");
                        plus37.setText("+");
                        plus38.setText("+");
                        plus39.setText("+");
                        plus40.setText("+");
                        plus41.setText("+");
                        plus42.setText("+");
                        hantei[0] = false;
                    }

                }
            });

            //6人目
            //"+"処理
            plus36.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    if (!hantei[0]) {
                        f6 = f6 + 1;
                        text36.setText(String.valueOf(f6));
                    } else {
                        f6 = f6 - 1;
                        text36.setText(String.valueOf(f6));
                        plus.setText("+");
                        plus2.setText("+");
                        plus3.setText("+");
                        plus4.setText("+");
                        plus5.setText("+");
                        plus6.setText("+");
                        plus7.setText("+");
                        plus8.setText("+");
                        plus9.setText("+");
                        plus10.setText("+");
                        plus11.setText("+");
                        plus12.setText("+");
                        plus13.setText("+");
                        plus14.setText("+");
                        plus15.setText("+");
                        plus16.setText("+");
                        plus17.setText("+");
                        plus18.setText("+");
                        plus19.setText("+");
                        plus20.setText("+");
                        plus21.setText("+");
                        plus22.setText("+");
                        plus23.setText("+");
                        plus24.setText("+");
                        plus25.setText("+");
                        plus26.setText("+");
                        plus27.setText("+");
                        plus28.setText("+");
                        plus29.setText("+");
                        plus30.setText("+");
                        plus31.setText("+");
                        plus32.setText("+");
                        plus33.setText("+");
                        plus34.setText("+");
                        plus35.setText("+");
                        plus36.setText("+");
                        plus37.setText("+");
                        plus38.setText("+");
                        plus39.setText("+");
                        plus40.setText("+");
                        plus41.setText("+");
                        plus42.setText("+");
                        hantei[0] = false;
                    }

                }
            });

            //Fカバー
            //1人目
            //"+"処理
            plus37.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    if (!hantei[0]) {
                        a7 = a7 + 1;
                        text37.setText(String.valueOf(a7));
                    } else {
                        a7 = a7 - 1;
                        text37.setText(String.valueOf(a7));
                        plus.setText("+");
                        plus2.setText("+");
                        plus3.setText("+");
                        plus4.setText("+");
                        plus5.setText("+");
                        plus6.setText("+");
                        plus7.setText("+");
                        plus8.setText("+");
                        plus9.setText("+");
                        plus10.setText("+");
                        plus11.setText("+");
                        plus12.setText("+");
                        plus13.setText("+");
                        plus14.setText("+");
                        plus15.setText("+");
                        plus16.setText("+");
                        plus17.setText("+");
                        plus18.setText("+");
                        plus19.setText("+");
                        plus20.setText("+");
                        plus21.setText("+");
                        plus22.setText("+");
                        plus23.setText("+");
                        plus24.setText("+");
                        plus25.setText("+");
                        plus26.setText("+");
                        plus27.setText("+");
                        plus28.setText("+");
                        plus29.setText("+");
                        plus30.setText("+");
                        plus31.setText("+");
                        plus32.setText("+");
                        plus33.setText("+");
                        plus34.setText("+");
                        plus35.setText("+");
                        plus36.setText("+");
                        plus37.setText("+");
                        plus38.setText("+");
                        plus39.setText("+");
                        plus40.setText("+");
                        plus41.setText("+");
                        plus42.setText("+");
                        hantei[0] = false;
                    }

                }
            });

            //2人目
            //"+"処理
            plus38.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    if (!hantei[0]) {
                        b7 = b7 + 1;
                        text38.setText(String.valueOf(b7));
                    } else {
                        b7 = b7 - 1;
                        text38.setText(String.valueOf(b7));
                        plus.setText("+");
                        plus2.setText("+");
                        plus3.setText("+");
                        plus4.setText("+");
                        plus5.setText("+");
                        plus6.setText("+");
                        plus7.setText("+");
                        plus8.setText("+");
                        plus9.setText("+");
                        plus10.setText("+");
                        plus11.setText("+");
                        plus12.setText("+");
                        plus13.setText("+");
                        plus14.setText("+");
                        plus15.setText("+");
                        plus16.setText("+");
                        plus17.setText("+");
                        plus18.setText("+");
                        plus19.setText("+");
                        plus20.setText("+");
                        plus21.setText("+");
                        plus22.setText("+");
                        plus23.setText("+");
                        plus24.setText("+");
                        plus25.setText("+");
                        plus26.setText("+");
                        plus27.setText("+");
                        plus28.setText("+");
                        plus29.setText("+");
                        plus30.setText("+");
                        plus31.setText("+");
                        plus32.setText("+");
                        plus33.setText("+");
                        plus34.setText("+");
                        plus35.setText("+");
                        plus36.setText("+");
                        plus37.setText("+");
                        plus38.setText("+");
                        plus39.setText("+");
                        plus40.setText("+");
                        plus41.setText("+");
                        plus42.setText("+");
                        hantei[0] = false;
                    }

                }
            });

            //3人目
            //"+"処理
            plus39.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    if (!hantei[0]) {
                        c7 = c7 + 1;
                        text39.setText(String.valueOf(c7));
                    } else {
                        c7 = c7 - 1;
                        text39.setText(String.valueOf(c7));
                        plus.setText("+");
                        plus2.setText("+");
                        plus3.setText("+");
                        plus4.setText("+");
                        plus5.setText("+");
                        plus6.setText("+");
                        plus7.setText("+");
                        plus8.setText("+");
                        plus9.setText("+");
                        plus10.setText("+");
                        plus11.setText("+");
                        plus12.setText("+");
                        plus13.setText("+");
                        plus14.setText("+");
                        plus15.setText("+");
                        plus16.setText("+");
                        plus17.setText("+");
                        plus18.setText("+");
                        plus19.setText("+");
                        plus20.setText("+");
                        plus21.setText("+");
                        plus22.setText("+");
                        plus23.setText("+");
                        plus24.setText("+");
                        plus25.setText("+");
                        plus26.setText("+");
                        plus27.setText("+");
                        plus28.setText("+");
                        plus29.setText("+");
                        plus30.setText("+");
                        plus31.setText("+");
                        plus32.setText("+");
                        plus33.setText("+");
                        plus34.setText("+");
                        plus35.setText("+");
                        plus36.setText("+");
                        plus37.setText("+");
                        plus38.setText("+");
                        plus39.setText("+");
                        plus40.setText("+");
                        plus41.setText("+");
                        plus42.setText("+");
                        hantei[0] = false;
                    }

                }
            });

            //4人目
            //"+"処理
            plus40.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    if (!hantei[0]) {
                        d7 = d7 + 1;
                        text40.setText(String.valueOf(d7));
                    } else {
                        d7 = d7 - 1;
                        text40.setText(String.valueOf(d7));
                        plus.setText("+");
                        plus2.setText("+");
                        plus3.setText("+");
                        plus4.setText("+");
                        plus5.setText("+");
                        plus6.setText("+");
                        plus7.setText("+");
                        plus8.setText("+");
                        plus9.setText("+");
                        plus10.setText("+");
                        plus11.setText("+");
                        plus12.setText("+");
                        plus13.setText("+");
                        plus14.setText("+");
                        plus15.setText("+");
                        plus16.setText("+");
                        plus17.setText("+");
                        plus18.setText("+");
                        plus19.setText("+");
                        plus20.setText("+");
                        plus21.setText("+");
                        plus22.setText("+");
                        plus23.setText("+");
                        plus24.setText("+");
                        plus25.setText("+");
                        plus26.setText("+");
                        plus27.setText("+");
                        plus28.setText("+");
                        plus29.setText("+");
                        plus30.setText("+");
                        plus31.setText("+");
                        plus32.setText("+");
                        plus33.setText("+");
                        plus34.setText("+");
                        plus35.setText("+");
                        plus36.setText("+");
                        plus37.setText("+");
                        plus38.setText("+");
                        plus39.setText("+");
                        plus40.setText("+");
                        plus41.setText("+");
                        plus42.setText("+");
                        hantei[0] = false;
                    }

                }
            });

            //5人目
            //"+"処理
            plus41.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    if (!hantei[0]) {
                        e7 = e7 + 1;
                        text41.setText(String.valueOf(e7));
                    } else {
                        e7 = e7 - 1;
                        text41.setText(String.valueOf(e7));
                        plus.setText("+");
                        plus2.setText("+");
                        plus3.setText("+");
                        plus4.setText("+");
                        plus5.setText("+");
                        plus6.setText("+");
                        plus7.setText("+");
                        plus8.setText("+");
                        plus9.setText("+");
                        plus10.setText("+");
                        plus11.setText("+");
                        plus12.setText("+");
                        plus13.setText("+");
                        plus14.setText("+");
                        plus15.setText("+");
                        plus16.setText("+");
                        plus17.setText("+");
                        plus18.setText("+");
                        plus19.setText("+");
                        plus20.setText("+");
                        plus21.setText("+");
                        plus22.setText("+");
                        plus23.setText("+");
                        plus24.setText("+");
                        plus25.setText("+");
                        plus26.setText("+");
                        plus27.setText("+");
                        plus28.setText("+");
                        plus29.setText("+");
                        plus30.setText("+");
                        plus31.setText("+");
                        plus32.setText("+");
                        plus33.setText("+");
                        plus34.setText("+");
                        plus35.setText("+");
                        plus36.setText("+");
                        plus37.setText("+");
                        plus38.setText("+");
                        plus39.setText("+");
                        plus40.setText("+");
                        plus41.setText("+");
                        plus42.setText("+");
                        hantei[0] = false;
                    }

                }
            });

            //6人目
            //"+"処理
            plus42.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    if (!hantei[0]) {
                        f7 = f7 + 1;
                        text42.setText(String.valueOf(f7));
                    } else {
                        f7 = f7 - 1;
                        text42.setText(String.valueOf(f7));
                        plus.setText("+");
                        plus2.setText("+");
                        plus3.setText("+");
                        plus4.setText("+");
                        plus5.setText("+");
                        plus6.setText("+");
                        plus7.setText("+");
                        plus8.setText("+");
                        plus9.setText("+");
                        plus10.setText("+");
                        plus11.setText("+");
                        plus12.setText("+");
                        plus13.setText("+");
                        plus14.setText("+");
                        plus15.setText("+");
                        plus16.setText("+");
                        plus17.setText("+");
                        plus18.setText("+");
                        plus19.setText("+");
                        plus20.setText("+");
                        plus21.setText("+");
                        plus22.setText("+");
                        plus23.setText("+");
                        plus24.setText("+");
                        plus25.setText("+");
                        plus26.setText("+");
                        plus27.setText("+");
                        plus28.setText("+");
                        plus29.setText("+");
                        plus30.setText("+");
                        plus31.setText("+");
                        plus32.setText("+");
                        plus33.setText("+");
                        plus34.setText("+");
                        plus35.setText("+");
                        plus36.setText("+");
                        plus37.setText("+");
                        plus38.setText("+");
                        plus39.setText("+");
                        plus40.setText("+");
                        plus41.setText("+");
                        plus42.setText("+");
                        hantei[0] = false;
                    }

                }
            });

        //dataStore = getSharedPreferences("DataStore", MODE_PRIVATE);
        //myApp = (MyApp)this.getApplication();

            menu.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    if (hantei2[0]) {
                        /*String a1 = text.getText().toString();
                        String a2 = text7.getText().toString();
                        String a3 = text13.getText().toString();
                        String a4 = text19.getText().toString();
                        String a5 = text25.getText().toString();
                        String a6 = text31.getText().toString();
                        String a7 = text37.getText().toString();


                        myApp.setTestString(a1);
                        myApp.setTestString(a2);
                        myApp.setTestString(a3);
                        myApp.setTestString(a4);
                        myApp.setTestString(a5);
                        myApp.setTestString(a6);
                        myApp.setTestString(a7);*/

                        /*Intent intent = new Intent();
                        intent.putExtra("ser1", text.getText().toString());
                        intent.putExtra("serR1", text7.getText().toString());
                        intent.putExtra("sp1", text13.getText().toString());
                        intent.putExtra("bC1", text19.getText().toString());
                        intent.putExtra("b1", text25.getText().toString());
                        intent.putExtra("spR1", text31.getText().toString());
                        intent.putExtra("fC1", text37.getText().toString());
                        intent.putExtra("ser2", text2.getText().toString());
                        intent.putExtra("serR2", text8.getText().toString());
                        intent.putExtra("sp2", text14.getText().toString());
                        intent.putExtra("bC2", text20.getText().toString());
                        intent.putExtra("b2", text26.getText().toString());
                        intent.putExtra("spR2", text32.getText().toString());
                        intent.putExtra("fC2", text38.getText().toString());
                        setResult(RESULT_OK, intent);*/

                    }
                    finish();
                }
            });


    }
}