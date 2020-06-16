package com.example.interfazgrafica;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainSaludo extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_saludo);
        TextView txtSaludo = (TextView)findViewById(R.id.txtMuestra);
//Recuperamos la información pasada en el intent
        Bundle bundle = this.getIntent().getExtras();
//Construimos el mensaje a mostrartx
        txtSaludo.setText("Hola!, Bienvenido \n " + bundle.getString("NOMBRE ") + bundle.getString("GENERO ")+ bundle.getString("FECHA "));
    }
}