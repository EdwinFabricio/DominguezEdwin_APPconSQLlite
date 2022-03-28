package com.example.app_sqlite;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.app_sqlite.modelo.Persona;

public class activity_2 extends AppCompatActivity {

    Button btnGrabar;
    EditText txtID, txtNombre, txtCorreo, txtTelefono;
    //grabar



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2);

        btnGrabar= findViewById(R.id.buttonGrabar);
        txtID= findViewById(R.id.editTextTextPersonID);
        txtNombre= findViewById(R.id.editTextTextPersonNombre);
        txtCorreo= findViewById(R.id.editTextTextPersonCorreo);
        txtTelefono = findViewById(R.id.editTextTextPersonTelefono);
        btnGrabar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //grabar
                Persona p =new Persona();
                p.setId( Integer.parseInt( txtID.getText().toString()));
                p.setNombre(txtNombre.getText().toString());
                p.setCorreo(txtCorreo.getText().toString());
                p.setTelefono(txtTelefono.getText().toString());
                p.guardar(getApplicationContext());
                Toast.makeText(getApplicationContext(), "Persona Creada", Toast.LENGTH_LONG).show();

            }
        });


    }
}