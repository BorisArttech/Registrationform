package com.example.boris3327.registrationform;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class AboutActivity extends AppCompatActivity implements View.OnClickListener{
    EditText editText4;
    Button AboutBtnDone;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about);

        editText4 = (EditText) findViewById(R.id.editText4);
        AboutBtnDone = (Button) findViewById(R.id.AboutBtnDone);
        AboutBtnDone.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        Intent intent = new Intent(this, RegisterActivity.class);
        intent.putExtra("About", editText4.getText().toString() );
        startActivity(intent);

    }
}
