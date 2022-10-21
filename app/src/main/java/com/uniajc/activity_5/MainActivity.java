package com.uniajc.activity_5;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

public class MainActivity extends AppCompatActivity {

    private EditText num1, num2;
    private TextView txtV;
    private Spinner spinner;

    public void operation(View view) {
        try {
            String valor1 = num1.getText().toString();
            String valor2 = num2.getText().toString();
            int n1 = Integer.parseInt(valor1);
            int n2 = Integer.parseInt(valor2);
            String msj = "";

            String selec = spinner.getSelectedItem().toString();

            if  (selec.equals("SUMAR")) {
                msj += "SUMA: " + String.valueOf(n1 + n2) + "\n";
            }
            if  (selec.equals("RESTAR")) {
                msj += " RESTA: "+String.valueOf(n1 - n2)+"\n";
            }
            if  (selec.equals("EXPONENTE")) {
                msj += "EXPONENTE: "+String.valueOf( Math.pow(n1, n2))+"\n";
            }
            if  (selec.equals("RADICACIÓN")) {
                msj += "RADICACIÓN: "+"\n"+"A = "+ String.valueOf(Math.sqrt(n1)) +"\n B = "+ String.valueOf(Math.sqrt(n2))+"\n" ;
            }

            txtV.setText(msj);

        } catch (Exception e) {
            // TODO: handle exception
            txtV.setText("Primero selecciona una opción");
        }
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        num1 = findViewById(R.id.num1);
        num2 = findViewById(R.id.num2);
        txtV = findViewById(R.id.txtV);
        spinner = findViewById(R.id.spinner);
    }
}