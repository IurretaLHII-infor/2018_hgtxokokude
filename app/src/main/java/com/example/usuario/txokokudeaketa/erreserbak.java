package com.example.usuario.txokokudeaketa;



import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.Button;


public class erreserbak extends AppCompatActivity {
    Button btnAuk;
    Button btnmahaiak;
    Button btnGorde;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_erreserbak);
        btnmahaiak = (Button)findViewById(R.id.btnMahaiak);
        btnmahaiak.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent2 = new Intent (erreserbak.this, Mahai.class);
                startActivity(intent2);
            }
        });
        btnAuk = (Button)findViewById(R.id.btnAukeratuEguna);
        btnAuk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent (erreserbak.this, CalendarActivity.class);
                startActivity(intent);
            }
        });
        btnGorde = (Button)findViewById(R.id.btnGorde);
        btnGorde.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent (erreserbak.this, MainActivity.class);
                startActivity(intent);
            }
        });

    }


}