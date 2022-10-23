package com.example.rvb;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Datos extends AppCompatActivity {
    Button Continuar;
    Button Cerrar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_datos);
        Continuar = (Button) findViewById(R.id.button9);
        Continuar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Datos.this, Ventana.class);
                startActivity(i);
            }
        });
        Cerrar = (Button) findViewById(R.id.button7);
        Cerrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Datos.this, Iniciar_Sesion.class);
                startActivity(i);
            }
        });
    }
}