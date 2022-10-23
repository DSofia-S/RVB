package com.example.rvb;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Ventana extends AppCompatActivity {
    Button Libros;
    Button Progreso;
    Button Favoritos;
    Button Ayuda;
    Button Manual;
    Button Usuario;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ventana);
        Libros = (Button) findViewById(R.id.button12);
        Libros.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Ventana.this, Libros.class);
                startActivity(i);
            }
        });
        Progreso = (Button) findViewById(R.id.button14);
        Progreso.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Ventana.this, Estadisticas.class);
                startActivity(i);
            }
        });
        Favoritos = (Button) findViewById(R.id.button15);
        Favoritos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Ventana.this, Favoritos.class);
                startActivity(i);
            }
        });
        Manual = (Button) findViewById(R.id.button17);
        Manual.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Ventana.this, Manual_de_Uso.class);
                startActivity(i);
            }
        });
        Usuario = (Button) findViewById(R.id.button22);
        Usuario.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Ventana.this, Datos.class);
                startActivity(i);
            }
        });
    }
}