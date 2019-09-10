package com.example.student.kiemtra;

import android.content.DialogInterface;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText tk,pw;
    Button dn,thoat;
    CheckBox luu;
    AlertDialog.Builder dialog;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tk = (EditText) findViewById(R.id.ed_tk);
        pw = (EditText) findViewById(R.id.ed_pw);
        luu = (CheckBox) findViewById(R.id.cb_luutt);
        dn = (Button) findViewById(R.id.bt_dn);
        thoat = (Button) findViewById(R.id.bt_thoat);
        dialog= new AlertDialog.Builder(this);
        dialog.setTitle("Thong bao");
        dn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(luu.isChecked()){
                    dialog.setMessage("Chào mừng bạn đăng nhập hệ thống, thông tin của bạn đã được lưu");
                }
                else{
                    dialog.setMessage("Chào mừng bạn đăng nhập hệ thống, thông tin của bạn khong được lưu");
                }
                dialog.show();
            }
        });
        thoat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                AlertDialog.Builder t = new AlertDialog.Builder(MainActivity.this);
                t.setTitle("thong bao");
                t.setMessage("ban co muon thoat ???");
                t.setPositiveButton("Có", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        finish();
                    }
                });
                t.setNegativeButton("Không", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        finish();
                    }
                });
            }
        });
    }
}
