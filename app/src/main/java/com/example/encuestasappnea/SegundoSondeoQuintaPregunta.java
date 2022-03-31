package com.example.encuestasappnea;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class SegundoSondeoQuintaPregunta extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_segundo_sondeo_quinta_pregunta);
    }

    public void btn_segundo_sondeo_sexta_pregunta(View view) {
        startActivity(new Intent(getApplicationContext(),SegundoSondeoSextaPregunta.class));
    }
}