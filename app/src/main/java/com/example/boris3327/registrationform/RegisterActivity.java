package com.example.boris3327.registrationform;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class RegisterActivity extends AppCompatActivity implements View.OnClickListener {
    TextView textView;
    TextView textView2;
    TextView textView3;
    TextView textView4;
    Button button5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

         textView = (TextView) findViewById(R.id.tvfirstName);
         textView2 = (TextView) findViewById(R.id.tvlastName);
        textView3 = (TextView) findViewById(R.id.tvBirthday);
         textView4 = (TextView) findViewById(R.id.tvAbout);
        button5 = (Button) findViewById(R.id.button5);
        button5.setOnClickListener(this);

        Intent intent = getIntent();
        String FirstName = intent.getStringExtra("FirstName");
        textView.setText("FistName");
        String LasrName = intent.getStringExtra("LastName");
        textView2.setText("LastName");
        String Birthday = intent.getStringExtra("Birthday");
        textView3.setText("Birthday");
        String About = intent.getStringExtra("About");
        textView4.setText("About");


    }

    @Override
    public void onClick(View v) {
        Intent intent = new Intent();
        onStop();
    }
}
