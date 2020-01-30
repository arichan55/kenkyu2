package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.DialogInterface;
import android.database.Cursor;
import android.os.Bundle;
import android.content.Intent;
import android.text.InputType;
import android.view.ContextMenu;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import android.content.Context;
import android.view.ContextMenu;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.ViewGroup;
import android.view.ContextMenu.ContextMenuInfo;
import android.view.View.OnClickListener;
import android.view.View.OnCreateContextMenuListener;
import android.view.View.OnLongClickListener;
import android.widget.AdapterView;
import android.widget.BaseAdapter;

public class menuActivity extends AppCompatActivity{

    static final String TAG = "SQLiteTest1";
    static final int MENUITEM_ID_DELETE = 1;
    ListView itemListView;
    EditText noteEditText;
    Button  saveButton;
    static DBAdapter dbAdapter;
    static SQLiteTest1Activity.NoteListAdapter listAdapter;
    static List<Note> noteList = new ArrayList<Note>();

    AlertDialog mAlertDlg;
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

    private EditText editText1;
    private EditText editText2;
    private String   sBefLogin;
    private String   sBefPswd;

    private final static int WC=LinearLayout.LayoutParams.WRAP_CONTENT;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

        final Button score = findViewById(R.id.score);
        final Button data = findViewById(R.id.data);
        final Button kari = findViewById(R.id.button2);
        final EditText nitiji = new EditText(this);
        final EditText aite = new EditText(this);
/*
        //レイアウトの生成
        LinearLayout layout=new LinearLayout(this);
        //上から下にオブジェクトを配置するよう設定
        layout.setOrientation(LinearLayout.VERTICAL);
        //画面表示の設定
        setContentView(layout);
        //ボタンを画面に追加する
        layout.addView(makeButton("ダイアログ", 0));*/

        final AlertDialog.Builder builder = new AlertDialog.Builder(this);
        final AlertDialog.Builder builder2 = new AlertDialog.Builder(this);
        // ダイアログタイトル、表示メッセージ、ボタンを設定
        builder.setTitle(R.string.dlg_title);
        builder.setMessage(R.string.dlg_msg1);
        builder.setView(nitiji);
        builder2.setMessage(R.string.dlg_msg2);
        builder2.setView(aite);
        builder.setPositiveButton("OK", new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialog, int which) {
                // OK ボタンクリック処理
                final String text1  = nitiji.getText().toString();
                final String text2 = aite.getText().toString();
                String text = text1 + text2;
                try{
                    String str = "";
                    FileOutputStream out = openFileOutput(text,MODE_PRIVATE);
                    out.write(str.getBytes());
                }catch(IOException e) {
                    e.printStackTrace();
                }
                //saveItem();
                Intent intent = new Intent(getApplication(), MainActivity.class);
                startActivityForResult(intent, REQUEST_CODE);
            }
                });
        builder.setNegativeButton("Cancel", new DialogInterface.OnClickListener() {
                public void onClick(DialogInterface dialog, int which) {
                    // Cancel ボタンクリック処理
                    Toast.makeText(menuActivity.this,
                            "Cancel Click", Toast.LENGTH_SHORT).show();
                }
            });
        mAlertDlg = builder.create();



        score.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Intent intent = new Intent(getApplication(), MainActivity.class);
                //startActivityForResult(intent, REQUEST_CODE);
                mAlertDlg.show();
                //showDialog(0);
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

    protected void findViews(){
        itemListView = (ListView)findViewById(R.id.itemListView);
        noteEditText = (EditText)findViewById(R.id.memoEditText);
        saveButton = (Button)findViewById(R.id.saveButton);
    }

    protected void loadNote(){
        noteList.clear();

        // Read
        dbAdapter.open();
        Cursor c = dbAdapter.getAllNotes();

        startManagingCursor(c);

        if(c.moveToFirst()){
            do {
                Note note = new Note(
                        c.getInt(c.getColumnIndex(DBAdapter.COL_ID)),
                        c.getString(c.getColumnIndex(DBAdapter.COL_NOTE)),
                        c.getString(c.getColumnIndex(DBAdapter.COL_LASTUPDATE))
                );
                noteList.add(note);
            } while(c.moveToNext());
        }

        stopManagingCursor(c);
        dbAdapter.close();

        listAdapter.notifyDataSetChanged();
    }
    protected void saveItem(){
        dbAdapter.open();
        dbAdapter.saveNote(noteEditText.getText().toString());
        dbAdapter.close();
        noteEditText.setText("");
        loadNote();
    }
    protected void setListeners(){
        saveButton.setOnClickListener((View.OnClickListener) this);

        itemListView.setOnCreateContextMenuListener(
                new View.OnCreateContextMenuListener(){
                    @Override
                    public void onCreateContextMenu(
                            ContextMenu menu,
                            View v,
                            ContextMenu.ContextMenuInfo menuInfo) {
                        menu.add(0, MENUITEM_ID_DELETE, 0, "Delete");
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

    /*
    @Override
    protected Dialog onCreateDialog(int id) {
        AlertDialog.Builder dialog = new AlertDialog.Builder(this);
        switch (id) {
            case 0:
                //エディットテキストの生成
                editText1 = new EditText(getApplicationContext());
                editText2 = new EditText(getApplicationContext());

                //外枠とパーツの作成
                LinearLayout layout = new LinearLayout(getApplicationContext());
                //上から下にパーツを組み込む設定
                layout.setOrientation(LinearLayout.VERTICAL);

                //外枠にパーツを組み込む
                layout.addView(make_TextView("ログイン"), new LinearLayout.LayoutParams( 300, 40));
                layout.addView(editText1, new LinearLayout.LayoutParams( 300,70));
                layout.addView(make_TextView("パスワード"), new LinearLayout.LayoutParams( 300, 40));
                layout.addView(editText2, new LinearLayout.LayoutParams( 300,70));

                //レイアウトをダイアログに設定
                dialog.setView(layout);

                //タイトルの設定
                dialog.setTitle("タイトル");

                //エディットボックスの入力タイプの設定
                editText1.setInputType( InputType.TYPE_CLASS_TEXT );
                editText2.setInputType( InputType.TYPE_CLASS_TEXT |                    InputType.TYPE_TEXT_VARIATION_PASSWORD);

                //過去の入力内容が表示されるようにする
                editText1.setText(sBefLogin);
                editText2.setText(sBefPswd);

                // dialogOKボタン
                dialog.setPositiveButton("OK",new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        sBefLogin= editText1.getText().toString();
                        sBefPswd = editText2.getText().toString();
                        Toast.makeText(getApplicationContext(), editText1.getText().toString(),                Toast.LENGTH_SHORT).show();
                // ダイアログを消す
                        removeDialog(0);
                    }
                });
                // dialogキャンセルボタン
                dialog.setNegativeButton("キャンセル",new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        dialog.cancel();
                    }
                });
                break;
        }
        return dialog.create();
    }

    //ボタンを作成します
    private Button makeButton(String sText,int id) {
        Button button=new Button(this);
        //ボタンの表示テキストの設定
        button.setText(sText);
        //ボタンのIDの割り振り
        button.setId(id);
        //クリックリスナーの実装
        button.setOnClickListener(this);
        //ボタンの表示方法の設定
        button.setLayoutParams(new LinearLayout.LayoutParams(WC,WC));
        return button;
    }

    private TextView make_TextView(String sMessage){
        //テキストビューの生成
        TextView tv = new TextView(getApplicationContext());
        //メッセージの設定
        tv.setText(sMessage);
        return tv;
    }*/
}