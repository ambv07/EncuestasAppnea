package com.example.encuestasappnea;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class SegundoSondeoNovenaPregunta extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_segundo_sondeo_novena_pregunta);
    }

    public void btn_segundo_sondeo_novenab_pregunta(View view) {
        startActivity(new Intent(getApplicationContext(),SegundoSondeoNovenabPregunta.class));
    }
}