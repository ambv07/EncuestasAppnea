package com.example.encuestasappnea;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class SegundoSondeoPrimeraPregunta extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_segundo_sondeo_primera_pregunta);
    }

    public void btn_segundo_sondeo_segunda_pregunta(View view) {
        startActivity(new Intent(getApplicationContext(),SegundoSondeoSegundaPregunta.class));
    }
}