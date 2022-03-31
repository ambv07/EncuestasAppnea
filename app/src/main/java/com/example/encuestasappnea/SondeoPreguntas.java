package com.example.encuestasappnea;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class SondeoPreguntas extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sondeo_preguntas);
    }

    public void btn_primer_sondeo_primera_pregunta(View view) {
        startActivity(new Intent(getApplicationContext(),PrimerSondeoPrimeraPregunta.class));
    }

    public void btn_segundo_sondeo_primera_pregunta(View view) {
        startActivity(new Intent(getApplicationContext(),SegundoSondeoPrimeraPregunta.class));
    }

}