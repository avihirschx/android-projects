package com.avihirsch.numbershapes;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    boolean isSquare;
    boolean isTriangular;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void eval (View view) {
        String input;
        int inputInt;
        EditText inputTextField = (EditText) findViewById(R.id.inputTextField);
        input = inputTextField.getText().toString();
        if (input.isEmpty())
            return;
        inputInt = Integer.parseInt(input);
        switch (check(inputInt)) {
            case 0:
                makeToast("Neither!");
                break;
            case 1:
                makeToast("Square!");
                break;
            case 2:
                makeToast("Triangular!");
                break;
            case 3:
                makeToast("Both!");
                break;
        }
    }
    private int check(int input) {
        this.isSquare = false;
        this.isTriangular = false;
        if (input == 1 || input == 0)
            return 3;
        //check square
        for(int i = 1; i <= input / 2; i++) {
            if(i * i == input)
                this.isSquare = true;
        }
        //check triangle
        for(int i = 1; i <= (input * 2) / 3; i++) {
            if((i * (i + 1)) / 2 == input)
                this.isTriangular = true;
        }
        if (this.isSquare) {
            if (this.isTriangular)
                return 3;
            return 1;
        }
        if (this.isTriangular)
            return 2;
        return 0;
    }
    private void makeToast(String str) {
        Toast.makeText(this, str, Toast.LENGTH_SHORT).show();
    }
}
