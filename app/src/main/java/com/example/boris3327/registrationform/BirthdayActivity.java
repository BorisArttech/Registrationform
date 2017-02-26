package com.example.boris3327.registrationform;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class BirthdayActivity extends AppCompatActivity implements View.OnClickListener {
    EditText editText3;
    Button birthdayBtnDone;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_birthday);

        editText3 = (EditText) findViewById(R.id.editText3);
        birthdayBtnDone = (Button) findViewById(R.id.birthdayBtnDone);
        birthdayBtnDone.setOnClickListener(this);
        };

    @Override
    public void onClick(View v) {
        Intent intent = new Intent(BirthdayActivity.this, MainActivity.class);
        intent.putExtra("Birthday", editText3.getText().toString());}

    }


