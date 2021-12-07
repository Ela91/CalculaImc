package com.example.sprint2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.text.DecimalFormat;

public class MainActivity extends AppCompatActivity {

    private EditText etPeso, etAltura;
    private Button btnCalcula;
    private TextView tvResultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etPeso = (EditText) findViewById(R.id.etPeso);
        etAltura = (EditText) findViewById(R.id.etAltura);
        btnCalcula = (Button) findViewById(R.id.btnCalcula);
        tvResultado = (TextView) findViewById(R.id.tvResultado);

        btnCalcula.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double peso, altura, imc;
                DecimalFormat formateador = new DecimalFormat("##.##");
                peso = Double.parseDouble(etPeso.getText().toString());
                altura = Double.parseDouble(etAltura.getText().toString());
                imc= peso/Math.pow(altura,2);
                tvResultado.setText(" Tu IMC es: "+formateador.format(imc));
            }

        });
        }
    }

