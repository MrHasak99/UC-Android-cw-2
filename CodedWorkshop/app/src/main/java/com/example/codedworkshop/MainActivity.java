package com.example.codedworkshop;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EditText editFirstNumber = findViewById(R.id.editTextTextFirstNumber);
        EditText editSecondNumber = findViewById(R.id.editTextTextSecondNumber);
        TextView textResult = findViewById(R.id.textViewResult);
        Button calc = findViewById(R.id.buttonCalc);

        calc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String FN = editFirstNumber.getText().toString();
                int FirNum = Integer.parseInt(FN);

                String SN = editSecondNumber.getText().toString();
                int SecNum = Integer.parseInt(SN);

                int Res = FirNum + SecNum;

                textResult.setText(String.valueOf(Res));

            }
        });

    }

    public int sum(int FirNum, int SecNum) {

        int Result = FirNum + SecNum;
        return Result;

    }

}