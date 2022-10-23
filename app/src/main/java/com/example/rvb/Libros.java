package com.example.rvb;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Libros extends AppCompatActivity {
    Button Ajustes;
    Button Continuar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_libros);
        Ajustes=(Button) findViewById(R.id.button8);
        Ajustes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(Libros.this, Ventana.class);
                startActivity(i);
            }
        });
        Continuar=(Button) findViewById(R.id.button6);
        Continuar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(Libros.this, Ventana.class);
                startActivity(i);
            }
        });
    }
}