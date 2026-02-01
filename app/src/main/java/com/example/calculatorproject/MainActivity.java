package com.example.calculatorproject;



import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private EditText etResult, etNum1, etNum2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // Link this Activity to your XML layout
        setContentView(R.layout.activity_main);

        // Initialize views
        etResult = findViewById(R.id.etResult);
        etNum1 = findViewById(R.id.etNum1);
        etNum2 = findViewById(R.id.etNum2);
    }

    // Addition
    public void add(View view) {
        double num1 = getNumber(etNum1);
        double num2 = getNumber(etNum2);
        etResult.setText(String.valueOf(num1 + num2));
    }

    // Subtraction
    public void sub(View view) {
        double num1 = getNumber(etNum1);
        double num2 = getNumber(etNum2);
        etResult.setText(String.valueOf(num1 - num2));
    }

    // Multiplication
    public void mul(View view) {
        double num1 = getNumber(etNum1);
        double num2 = getNumber(etNum2);
        etResult.setText(String.valueOf(num1 * num2));
    }

    // Division
    public void div(View view) {
        double num1 = getNumber(etNum1);
        double num2 = getNumber(etNum2);
        if (num2 != 0) {
            etResult.setText(String.valueOf(num1 / num2));
        } else {
            etResult.setText("Error: Divide by 0");
        }
    }

    // Helper method to safely parse numbers
    private double getNumber(EditText editText) {
        String text = editText.getText().toString();
        if (text.isEmpty()) {
            return 0;
        }
        try {
            return Double.parseDouble(text);
        } catch (NumberFormatException e) {
            return 0;
        }
    }
}