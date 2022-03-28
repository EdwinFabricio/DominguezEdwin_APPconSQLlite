package com.example.app_sqlite;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.app_sqlite.modelo.DBHelper;
import com.example.app_sqlite.modelo.Persona;

public class MainActivity extends AppCompatActivity {
    Button btnCrear;
    Button irCrud;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnCrear=findViewById(R.id.button1);

        btnCrear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                   //crear bd

                DBHelper dbHelper = new DBHelper(getApplicationContext());
                SQLiteDatabase db = dbHelper.getWritableDatabase();
                if (db != null) {
                    Toast.makeText(getApplicationContext(), "BASE CREADA", Toast.LENGTH_LONG).show();
                }else{
                    Toast.makeText(getApplicationContext(), "ERROR AL CREAR LA BASE", Toast.LENGTH_LONG).show();
                }
            }
        });

        irCrud = findViewById(R.id.irCrud);
        irCrud.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
               // startActivity(new Intent(activity_iniciarSesion.this, activity_instrucciones.class));
                startActivity(new Intent(MainActivity.this, activity_2.class));
            }
        });










    }


}