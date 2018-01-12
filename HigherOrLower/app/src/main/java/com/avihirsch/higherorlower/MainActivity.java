package com.avihirsch.higherorlower;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import java.util.Random;

import static android.R.id.input;

public class MainActivity extends AppCompatActivity {

    Random rng;
    int answer;
    int input;
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        generate();
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void guess(View view) {
        EditText inputTextField = (EditText) findViewById(R.id.inputTextField);
        this.input = Integer.parseInt(inputTextField.getText().toString());
        if (input == answer) {
            Toast.makeText(this, "You got it right! Try again.", Toast.LENGTH_SHORT).show();
            generate();
        } else if (input < answer)
            Toast.makeText(this, "Higher...", Toast.LENGTH_SHORT).show();
          else if (input > answer)
            Toast.makeText(this, "Lower...", Toast.LENGTH_SHORT).show();
    }
    private void generate() {
        this.rng = new Random();
        this.answer = rng.nextInt(20) + 1;
    }
}
