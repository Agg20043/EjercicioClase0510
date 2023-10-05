package com.example.ejercicioclase0410;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.io.IOException;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void sumar(View vista) {
        int numero=0;
        int numero2=0;
        TextView myTextView = null;

        try {
            EditText valor = (EditText) findViewById(R.id.editTextValor1);
            EditText valor2 = (EditText) findViewById(R.id.editTextValor2);


            numero = Integer.parseInt(valor.getText().toString());
            numero2 = Integer.parseInt(valor.getText().toString());


        } catch (NumberFormatException e) {
            Toast.makeText(this, "Caracter erroneo", Toast.LENGTH_SHORT).show();
        }
        myTextView = (TextView) findViewById(R.id.editTextRes);
        int resultado = numero + numero2;
        String cadena = String.valueOf(resultado);
        myTextView.setText(cadena);

    }
}