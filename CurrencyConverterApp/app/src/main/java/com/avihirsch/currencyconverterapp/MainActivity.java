package com.avihirsch.currencyconverterapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void dollarConvert(View view) {
        String inputString;
        double input;
        double output;
        String outputString;
        EditText dollarTextField = (EditText) findViewById(R.id.dollarTextField);

        inputString = dollarTextField.getText().toString();
        input = Double.parseDouble(inputString);
        output = input * 0.740183;
        outputString = String.format("%.2f", output);
        Toast.makeText(this, "£" + outputString, Toast.LENGTH_SHORT).show();
    }

    public void poundConvert(View view) {
        String inputString;
        double input;
        double output;
        String outputString;
        EditText poundTextField = (EditText) findViewById(R.id.poundTextField);

        inputString = poundTextField.getText().toString();
        input = Double.parseDouble(inputString);
        output = input * 1.35102;
        outputString = String.format("%.2f", output);
        Toast.makeText(this, "$" + outputString, Toast.LENGTH_SHORT).show();
    }
}
