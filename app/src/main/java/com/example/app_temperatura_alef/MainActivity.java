package com.example.app_temperatura_alef;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    EditText edt_celsius, edt_fahrenheit, edt_kelvin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edt_celsius = findViewById(R.id.edt_celsius);
        edt_fahrenheit = findViewById(R.id.edt_fahrenheit);
        edt_kelvin = findViewById(R.id.edt_kelvin);
    }
        public void calcular(View v){
        String str_celsius = edt_celsius.getText().toString();
        String str_fahrenheit = edt_fahrenheit.getText().toString();
        String str_kelvin = edt_kelvin.getText().toString();
            if (!str_celsius.equals("")) {
                double celsius = Double.parseDouble(str_celsius);

                double fahrenheit = ((celsius * 9) / 5) + 32;
                double kelvin = celsius + 273;

                edt_fahrenheit.setText("Fahrenheit: " + fahrenheit);
                edt_kelvin.setText("Kelvin: " + kelvin);
            } else if (!str_fahrenheit.equals("")) {
                double fahrenheit = Double.parseDouble(str_fahrenheit);

                double celsius = ((fahrenheit - 32) * 5) / 9;
                double kelvin = celsius + 273;
                edt_celsius.setText("Celsius: " + celsius);
                edt_kelvin.setText("Kelvin: " + kelvin);

            } else {
                double kelvin = Double.parseDouble(str_kelvin);
                double celsius = kelvin - 273;
                double fahrenheit = ((celsius * 9) / 5) + 32;
                edt_celsius.setText("Celsius: " + celsius);
                edt_fahrenheit.setText("Fahrenheit: " + fahrenheit);

            }
        }
        public void limpar_clique(View v){
        edt_kelvin.setText("");
        edt_fahrenheit.setText("");
        edt_celsius.setText("");
        }

}


