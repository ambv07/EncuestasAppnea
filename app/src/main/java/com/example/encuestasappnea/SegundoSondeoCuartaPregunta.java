package com.example.encuestasappnea;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class SegundoSondeoCuartaPregunta extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_segundo_sondeo_cuarta_pregunta);
    }

    public void btn_segundo_sondeo_quinta_pregunta(View view) {
        startActivity(new Intent(getApplicationContext(),SegundoSondeoQuintaPregunta.class));
    }
}