package com.example.rvb;

import android.content.ContentValues;
import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.sql.SQLData;

public class Iniciar_Sesion extends AppCompatActivity {
    Button Iniciar_Sesion;
    Button Regístrate;
    Button Contr;

    private EditText etn, etp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etn = (EditText)findViewById(R.id.txt_Nombre);
        etp = (EditText)findViewById(R.id.txt_Contraseña);
        Regístrate = (Button) findViewById(R.id.button3);
        Regístrate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Iniciar_Sesion.this, Registarse.class);
                startActivity(i);
            }
        });
        Contr = (Button) findViewById(R.id.button24);
        Contr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Iniciar_Sesion.this, Contrasena.class);
                startActivity(i);
            }
        });
    }

    public void IniciarSesion (View view){
        String Correo = etn.getText().toString();
        String Contraseña = etp.getText().toString();

        if(Correo.length() == 0){
            Toast.makeText(this,"Debes de ingresar un Correo Electronico", Toast.LENGTH_LONG).show();
        }
        if(Contraseña.length() == 0){
            Toast.makeText(this,"Debes ingresar una Contraseña",Toast.LENGTH_LONG).show();
        }
        if(Correo.length() !=0 && Contraseña.length() !=0){
            Toast.makeText(this,"Inicio de Sesion en progreso...",Toast.LENGTH_LONG).show();
            Iniciar_Sesion = (Button) findViewById(R.id.button2);
            Iniciar_Sesion.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent i = new Intent(Iniciar_Sesion.this, Perfil.class);
                    startActivity(i);
                }
            });
        }

    }

    /*public void Iniciar_Sesion(View view){
        AdminSQL admin = new AdminSQL(this, "Iniciar Sesion", null, 1);
        SQLiteDatabase BaseDeDatos = admin.getWritableDatabase();

        String Correo = etn.getText().toString();
        String Contraseña = etp.getText().toString();

        if(!Correo.isEmpty() && !Contraseña.isEmpty()){
            ContentValues inicio = new ContentValues();

            inicio.put("Correo", Correo);
            inicio.put("Contraseña", Contraseña);

            BaseDeDatos.insert("Correos", null, inicio);

            BaseDeDatos.close();

            etn.setText("");
            etp.setText("");

            Toast.makeText(this, "Inicio de Sesion exitoso", Toast.LENGTH_SHORT).show();
        }else{
            Toast.makeText(this, "Debes llenar todos los campos", Toast.LENGTH_SHORT).show();
        }
    }

    public void Buscar (View view){
        AdminSQL admin = new AdminSQL(this, "Iniciar Sesion", null, 1);
        SQLiteDatabase BaseDeDatos = admin.getWritableDatabase();

        String Correo = etn.getText().toString();

        if(!Correo.isEmpty()){
            Cursor Fila = BaseDeDatos.rawQuery("selec Correo, contraseña from articulos where Correo ="+Correo, null);
            if(Fila.moveToFirst()){
                etn.setText(Fila.getString(0));
                etp.setText(Fila.getString(1));
                BaseDeDatos.close();
            }else{
                Toast.makeText(this, "No existe correo electronico", Toast.LENGTH_SHORT).show();
                BaseDeDatos.close();
            }
        }else{
            Toast.makeText(this, "Debes introducir el correo electronico", Toast.LENGTH_SHORT).show();
        }
    }
    */
}