package com.example.encuestasappnea;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class PrimerSondeoTerceraPregunta extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_primer_sondeo_tercera_pregunta);
    }

    public void btn_primer_sondeo_cuarta_pregunta(View view) {
        startActivity(new Intent(getApplicationContext(),PrimerSondeoCuartaPregunta.class));
    }
}