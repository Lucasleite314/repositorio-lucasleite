package com.example.adm.botao;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;


public class MainActivity2 extends AppCompatActivity {
    Button btnActivity2;
    TextView txtView2;
    String valFromAct1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        btnActivity2 = (Button)findViewById(R.id.idbtnActivity2);
        txtView2 = (TextView)findViewById(R.id.idTxtactivity_main2);
        valFromAct1 = getIntent().getExtras().getString("Value");
        txtView2.setText(valFromAct1);
    }
    public void btnClickAct2(View v){
        Intent i = new Intent(this,MainActivity.class);
        startActivity(i);
        finish();
    }
}
