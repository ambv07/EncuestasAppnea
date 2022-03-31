package com.example.encuestasappnea;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;

public class Registro extends AppCompatActivity {

    String [] edades = {"-", "Entre 15 y 20 años", "Entre 21 y 25 años", "Entre 26 y 30 años", "Entre 31 y 35 años", "Entre 36  y 40 años"};
    AutoCompleteTextView autoCompleteTxt;
    ArrayAdapter<String> adapterEdades;

    String [] embarazos = {"-", "Ninguno", "1", "2", "3", "4", "Más"};
    AutoCompleteTextView autoCompleteTxts;
    ArrayAdapter<String> adapterEmbarazos;

    String [] enfermedades = {"-", "Diabetes", "Sobrepeso", "Hipertensión", "Ninguna de las anteriores"};
    AutoCompleteTextView autoCompleteTxtx;
    ArrayAdapter<String> adapterEnfermedades;

    String [] estrato = {"-", "1", "2", "3", "4", "5", "6"};
    AutoCompleteTextView autoCompleteTxtxs;
    ArrayAdapter<String> adapterEstrato;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registro);

        autoCompleteTxt = findViewById(R.id.auto_complete_txt_edad);
        adapterEdades = new ArrayAdapter<String>(this,R.layout.lista_opciones, edades);
        autoCompleteTxt.setAdapter(adapterEdades);

        autoCompleteTxts = findViewById(R.id.auto_complete_txt_embarazos_previos);
        adapterEmbarazos = new ArrayAdapter<String>(this,R.layout.lista_opciones, embarazos);
        autoCompleteTxts.setAdapter(adapterEmbarazos);

        autoCompleteTxtx = findViewById(R.id.auto_complete_txt_enfermedades);
        adapterEnfermedades = new ArrayAdapter<String>(this,R.layout.lista_opciones, enfermedades);
        autoCompleteTxtx.setAdapter(adapterEnfermedades);

        autoCompleteTxtxs = findViewById(R.id.auto_complete_txt_estrato_socieconomico);
        adapterEstrato = new ArrayAdapter<String>(this,R.layout.lista_opciones, estrato);
        autoCompleteTxtxs.setAdapter(adapterEstrato);
    }

    public void btn_registrar_encuesta(View view) {
        startActivity(new Intent(getApplicationContext(),LoginActivity.class));
    }

}