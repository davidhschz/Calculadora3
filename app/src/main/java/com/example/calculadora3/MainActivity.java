package com.example.calculadora3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    //Instanciar los objetos con los ids del archivo xml.

    EditText valor1, valor2;
    TextView resultado;
    Button suma, resta, multiplicacion, division, reset;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // Referenciamos los objetos importados de los IDs del archivo xml.

        valor1 = findViewById(R.id.etvalor1);
        valor2 = findViewById(R.id.etvalor2);
        resultado = findViewById(R.id.tvresultado);
        suma = findViewById(R.id.btnsuma);
        resta = findViewById(R.id.btnresta);
        division = findViewById(R.id.btnsmultiplicacion);
        multiplicacion = findViewById(R.id.btndivision);
        reset = findViewById(R.id.btnreset);

        //Interactuar con la información de los objetos del xml.
        // Evento click de los 5 botones de la calculadora.

        suma.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double num1 = Double.parseDouble(String.valueOf(valor1.getText().toString()));
                double num2 = Double.parseDouble(String.valueOf(valor2.getText().toString()));
                double total = num1 + num2;
                resultado.setText(""+ total);
            }
        });

        resta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double num1 = Double.parseDouble(String.valueOf(valor1.getText().toString()));
                double num2 = Double.parseDouble(String.valueOf(valor2.getText().toString()));
                double total = num1 - num2;
                resultado.setText(""+ total);
            }
        });
    }
}