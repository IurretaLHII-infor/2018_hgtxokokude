package com.example.usuario.txokokudeaketa;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Mahai extends AppCompatActivity {
    Button btnAtzeraMahaiak;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mahai);
        btnAtzeraMahaiak=(Button)findViewById(R.id.btnAtzeraMahaiak);
        btnAtzeraMahaiak.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent2 = new Intent (Mahai.this, erreserbak.class);
                startActivity(intent2);
                finish();
            }
        });


    }
}
