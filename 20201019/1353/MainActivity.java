package com.example.myapplication2_1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText sname,fname,phone;
    TextView txv;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        sname = (EditText) findViewById(R.id.surName);
        fname = (EditText) findViewById(R.id.firstName);
        phone = (EditText) findViewById(R.id.phone);
        txv = (TextView) findViewById(R.id.txv);


    }

    public void onclick(View v){
        txv.setText(sname.getText().toString()+fname.getText()+"的電話是"+phone.getText());
    }
}
