package com.example.usuario.txokokudeaketa;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.CalendarView;

public class MainActivity extends Activity {
    Button btnSartu;
    CalendarView calenario;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnSartu = (Button)findViewById(R.id.btnSartu);
        btnSartu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ejecutar();
            }
        });

    }
    private void ejecutar(){
        Intent intent = new Intent (MainActivity.this, erreserbak.class);
        startActivity(intent);
        finish();
    }

}
