package com.example.calculadora3000;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    EditText etValor1, etValor2;
    Button btSomar, btSubtrair, btMultiplicar, btDividir;

    public String calcular(int op, double valor1, double valor2) {
        double res;
        String resposta = "";
        switch (op) {
            case 1:
                res = valor1 + valor2;
                resposta = "O resultado da soma é: " + res;
            break;
            case 2:
                res = valor1 - valor2;
                resposta = "O resultado da soma é: " + res;
            break;
            case 3:
                res = valor1 * valor2;
                resposta = "O resultado da multiplicação é: " + res;
            break;
            case 4:
                try {
                    res = valor1 / valor2;
                    resposta = "O resultado da divisão é: " + res;
                } catch (ArithmeticException ex) {
                    resposta("Um número não pode ser dividio por zero");
                }
                break;
        }
        return resposta;
    }

    public void resposta(String res){
        AlertDialog.Builder dialogo = new AlertDialog.Builder(MainActivity.this);
        dialogo.setTitle("Resultado da calculadora");
        dialogo.setMessage(res);
        dialogo.setNeutralButton("Ok", null);
        dialogo.show();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etValor1 = findViewById(R.id.etQuest1);
        etValor2 = findViewById(R.id.etQuest2);
        btSomar = findViewById(R.id.btSomar);
        btSubtrair = findViewById(R.id.btSubtrair);
        btDividir = findViewById(R.id.btDividir);
        btMultiplicar = findViewById(R.id.btMultiplicar);

        btSomar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (etValor1.getText().toString().equals("") || etValor2.getText().toString().equals("")) {
                    resposta("Por favor, informe os valores");
                }else {
                    double valor1, valor2;

                    valor1 = Double.parseDouble(etValor1.getText().toString());
                    valor2 = Double.parseDouble(etValor2.getText().toString());
                    resposta(calcular(1, valor1, valor2));
                }
            }
        });

        btSubtrair.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (etValor1.getText().toString().equals("") || etValor2.getText().toString().equals("")) {
                    resposta("Por favor, informe os valores");
                }else {
                    double valor1, valor2;

                    valor1 = Double.parseDouble(etValor1.getText().toString());
                    valor2 = Double.parseDouble(etValor2.getText().toString());
                    resposta(calcular(2, valor1, valor2));
                }
            }
        });

        btMultiplicar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (etValor1.getText().toString().equals("") || etValor2.getText().toString().equals("")) {
                    resposta("Por favor, informe os valores");
                }else {
                    double valor1, valor2;

                    valor1 = Double.parseDouble(etValor1.getText().toString());
                    valor2 = Double.parseDouble(etValor2.getText().toString());
                    resposta(calcular(3, valor1, valor2));
                }
            }
        });

        btDividir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (etValor1.getText().toString().equals("") || etValor2.getText().toString().equals("")) {
                    resposta("Por favor, informe os valores");
                }else {
                    double valor1, valor2;

                    valor1 = Double.parseDouble(etValor1.getText().toString());
                    valor2 = Double.parseDouble(etValor2.getText().toString());
                    resposta(calcular(4, valor1, valor2));
                }
            }
        });
    }
}