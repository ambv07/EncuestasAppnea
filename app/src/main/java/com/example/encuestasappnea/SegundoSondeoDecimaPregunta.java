package com.example.encuestasappnea;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class SegundoSondeoDecimaPregunta extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_segundo_sondeo_decima_pregunta);
    }

    public void btn_finalizar_dos(View view) {
        startActivity(new Intent(getApplicationContext(), SondeoPreguntas.class));
    }

}