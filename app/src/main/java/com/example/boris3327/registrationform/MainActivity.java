package com.example.boris3327.registrationform;

import android.app.DownloadManager;
import android.support.v7.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import static android.R.attr.data;
import static android.R.attr.transitionGroup;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    Button button;
    Button button2;
    Button button3;
    Button button4;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

         button = (Button) findViewById(R.id.button);
         button2 = (Button) findViewById(R.id.button2);
         button3 = (Button) findViewById(R.id.button3);
         button4 = (Button) findViewById(R.id.button4);
        button.setOnClickListener(this);
        button2.setOnClickListener(this);
        button3.setOnClickListener(this);
        button4.setOnClickListener(this);


    }

    @Override
    public void onClick(View v) {
        Intent intent;
        switch (v.getId()){
            case R.id.button:
                intent = new Intent(this, NameActyvity.class);
                startActivity(intent);
                break;
            case R.id.button2:
                intent = new Intent(MainActivity.this, BirthdayActivity.class);
                startActivity(intent);
                break;
            case R.id.button3:
                intent = new Intent(MainActivity.this, AboutActivity.class);
                startActivity(intent);
                break;
            case R.id.button4:
                intent = new Intent(MainActivity.this, RegisterActivity.class);
                startActivity(intent);
                break;
            default:
                break;
        }
    }
    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

        if (data == null){
            return;
        } String FirstName = data.getStringExtra("FirstName");
    }

}
