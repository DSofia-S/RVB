package com.example.rvb;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Registarse extends AppCompatActivity {
    Button Continuar;
    Button Iniciar_Sesion;

    private EditText etn, etc, etp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registarse);
        etn = (EditText)findViewById(R.id.txt_nombre);
        etc = (EditText)findViewById(R.id.txt_Correo);
        etp = (EditText)findViewById(R.id.txt_password);
        Iniciar_Sesion=(Button) findViewById(R.id.button);
        Iniciar_Sesion.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(Registarse.this, Iniciar_Sesion.class);
                startActivity(i);
            }
        });
    }

    public void Registrarse(View view){
        String Nombre = etn.getText().toString();
        String Correo = etc.getText().toString();
        String Contraseña = etp.getText().toString();
        if(Nombre.length() == 0){
            Toast.makeText(this,"Debes llenar todos los espacios en blanco", Toast.LENGTH_LONG).show();
        }
        if(Correo.length() == 0){
            Toast.makeText(this,"Debes llenar todos los espacios en blanco", Toast.LENGTH_LONG).show();
        }
        if(Contraseña.length() == 0){
            Toast.makeText(this,"Debes llenar todos los espacios en blanco", Toast.LENGTH_LONG).show();
        }
        if(Nombre.length() != 0 && Correo.length() != 0 && Contraseña.length() != 0){
            Toast.makeText(this,"Registro en proceso...",Toast.LENGTH_LONG).show();
            Continuar=(Button) findViewById(R.id.button4);
            Continuar.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent i=new Intent(Registarse.this, Perfil.class);
                    startActivity(i);
                }
            });
        }
    }
}