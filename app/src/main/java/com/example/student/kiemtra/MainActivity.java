package com.example.student.kiemtra;

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
    Button dn;
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
    }
}
