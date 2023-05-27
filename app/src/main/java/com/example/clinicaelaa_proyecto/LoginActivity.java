package com.example.clinicaelaa_proyecto;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class LoginActivity extends AppCompatActivity {

    Button registrar;
    TextView olvidecontraseña;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        registrar=findViewById(R.id.btn_registrar);
        olvidecontraseña = findViewById(R.id.tv_olvidecontrasea);
        registrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent= new Intent(getApplicationContext(),Registro.class);
                startActivity(intent);
                finish();
            }
        });
        olvidecontraseña.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(getApplicationContext(),recuperar_correo.class);
                startActivity(intent);
                finish();
            }
        });
    }

}