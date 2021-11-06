package com.example.demo02;

import androidx.appcompat.app.AppCompatActivity;


import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends Activity {


    private Context mContext;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
        public void simple(View source)
        {
            AlertDialog.Builder builder = new AlertDialog.Builder(this)
                    // 设置对话框标题
                    .setTitle("简单对话框")
                    // 设置图标
                    .setIcon(R.drawable.tools)
                    .setMessage("对话框的测试内容\n第二行内容");
                    // 为AlertDialog.Builder添加“确定”按钮
            builder.setPositiveButton("创建", new DialogInterface.OnClickListener() {

                @Override
                public void onClick(DialogInterface dialog, int which) {
                    // TODO Auto-generated method stub

                }
            });
            //为对话框设置一个”取消“按钮
            builder.setNegativeButton("取消", new DialogInterface.OnClickListener(){
                @Override
                public void onClick(DialogInterface dialog, int which) {
                    // TODO Auto-generated method stub
                }
            }).create().show(); }


        public void test(View source){
            AlertDialog.Builder builder = new AlertDialog.Builder(this)
                    .setTitle("test");
            // Add the buttons

            builder.setPositiveButton("ok", new DialogInterface.OnClickListener() {
                public void onClick(DialogInterface dialog, int id) {
                    // User clicked OK button
                }
            });
            builder.setNegativeButton("cancel", new DialogInterface.OnClickListener() {
                public void onClick(DialogInterface dialog, int id) {
                    // User cancelled the dialog
                }
            }).create().show();
            // Set other dialog properties

            // Create the AlertDialog
//            AlertDialog dialog = builder.create();
//            dialog.show();
        }
    public void loginmethod(View source){
        AlertDialog.Builder builder = new AlertDialog.Builder(this)
                .setView(R.layout.login)
                .setPositiveButton("Sign in", new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialog, int id) {
                // User clicked OK button
            }
        });
           builder.setNegativeButton("Cancel", new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialog, int id) {
                // User cancelled the dialog
            }
        }).create().show();
        // Set other dialog properties

        // Create the AlertDialog
//            AlertDialog dialog = builder.create();
//            dialog.show();
    }



    public void XMLtest(){

    }
    }

