package com.example.clinicaelaa_proyecto;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class recuperar_correo extends AppCompatActivity {

    Button enviarCorreo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recuperar_correo);
        enviarCorreo=findViewById(R.id.btncorreo);

        enviarCorreo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent= new Intent(getApplicationContext(),recuperarcontrasena_datos.class);
                startActivity(intent);
                finish();
            }
        });
    }
}