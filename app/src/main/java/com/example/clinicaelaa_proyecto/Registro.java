package com.example.clinicaelaa_proyecto;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class Registro extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registro);
        getSupportFragmentManager().beginTransaction().setReorderingAllowed(true).replace(R.id.registro,registro_usuarios.class,null)
                .commit();
    }
}