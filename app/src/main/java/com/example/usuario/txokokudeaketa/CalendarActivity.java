package com.example.usuario.txokokudeaketa;

import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CalendarView;
import android.widget.Toast;

public class CalendarActivity extends AppCompatActivity {
    Button btnAtz;
    CalendarView calendario;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calendar);
        btnAtz = (Button)findViewById(R.id.button);
        btnAtz.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ejecutar();
            }
        });
        CalendarView calendario =(CalendarView)findViewById(R.id.calendario);
        calendario.setOnDateChangeListener(new CalendarView.OnDateChangeListener() {
            @Override
            public void onSelectedDayChange(@NonNull CalendarView calendarView, int year, int month, int day) {
                Toast.makeText(getApplicationContext(), ""+day+ " / " +(month+1)+ " / "+year+ "", Toast.LENGTH_SHORT).show();
            }
        });

    }
    private void ejecutar(){
        Intent intent = new Intent (CalendarActivity.this, erreserbak.class);
        startActivity(intent);
        finish();
    }

}