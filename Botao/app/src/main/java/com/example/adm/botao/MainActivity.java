package com.example.adm.botao;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    Button btnActivity1;
    EditText editText1;
    String editTextVal;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnActivity1 = (Button)findViewById(R.id.idbtnActivity1);
        editText1 = (EditText)findViewById(R.id.idTxtActivity1);
    }
    public void btnClickAct1(View v){
        Intent i = new Intent(this,MainActivity2.class);
        editTextVal = editText1.getText().toString();
        i.putExtra("Value",editTextVal);
        startActivity(i);
        finish();
    }
}
