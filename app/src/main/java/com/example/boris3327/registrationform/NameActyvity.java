package com.example.boris3327.registrationform;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;


/**
 * Created by boris3327 on 24.02.17.
 */

    public class NameActyvity extends MainActivity implements View.OnClickListener {

        EditText editText;
        EditText editText2;
        Button nameBtnDone;
        Button nameBtnCancel;


        @Override
        public void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_name);

            editText = (EditText) findViewById(R.id.editText);
            editText2 = (EditText) findViewById(R.id.editText2);
            nameBtnDone = (Button) findViewById(R.id.nameBtnDone);
            nameBtnCancel = (Button) findViewById(R.id.nameBtnCancel);
            nameBtnDone.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(NameActyvity.this, MainActivity.class);
                    intent.putExtra("FirstName", editText.getText().toString());
                    intent.putExtra("LastName", editText2.getText().toString());
                    setResult(RESULT_OK, intent);
                    finish();
                }


            });
            nameBtnCancel.setOnClickListener(new View.OnClickListener(){
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent();
                    onStop();
                }
            });


        }




}
