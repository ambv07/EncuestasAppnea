package com.example.encuestasappnea;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

    }

    public void btn_registro(View view) {

        startActivity(new Intent(getApplicationContext(), Registro.class));
    }

    public void btn_sondeo_preguntas(View view) {
        startActivity(new Intent(getApplicationContext(),SondeoPreguntas.class));
    }


}