package com.example.encuestasappnea;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class SegundoSondeoNovenabPregunta extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_segundo_sondeo_novenab_pregunta);
    }

    public void btn_segundo_sondeo_decima_pregunta(View view) {
        startActivity(new Intent(getApplicationContext(),SegundoSondeoDecimaPregunta.class));
    }
}