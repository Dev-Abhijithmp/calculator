package com.example.calculator;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;


public class MainActivity extends AppCompatActivity {


    private TextView resultTextView;
    private StringBuilder inputStringBuilder;

    private double operand1;
    private String operator;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        resultTextView = findViewById(R.id.resultTextView);
        inputStringBuilder = new StringBuilder();
        Button button0 = findViewById(R.id.button0);
        Button button1 = findViewById(R.id.button1);
        Button button2 = findViewById(R.id.button2);
        Button button3 = findViewById(R.id.button3);
        Button button4 = findViewById(R.id.button4);
        Button button5 = findViewById(R.id.button5);
        Button button6 = findViewById(R.id.button6);
        Button button7 = findViewById(R.id.button7);
        Button button8 = findViewById(R.id.button8);
        Button button9 = findViewById(R.id.button9);
        Button buttonSubtract = findViewById(R.id.buttonSubtract);
        Button buttonAdd = findViewById(R.id.buttonAdd);
        Button buttonDivide = findViewById(R.id.buttonDivide);
        Button buttonEqual = findViewById(R.id.buttonEqual);
        Button buttonModulus = findViewById(R.id.buttonModulus);
        Button buttonMultiply = findViewById(R.id.buttonMultiply);
        Button buttonClear = findViewById(R.id.buttonClear);
        button0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onNumberButtonClick(v);
            }
        });
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onNumberButtonClick(v);
            }
        });
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onNumberButtonClick(v);
            }
        });
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onNumberButtonClick(v);
            }
        });
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onNumberButtonClick(v);
            }
        });
        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onNumberButtonClick(v);
            }
        });
        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onNumberButtonClick(v);
            }
        });
        button7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onNumberButtonClick(v);
            }
        });
        button8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onNumberButtonClick(v);
            }
        });
        button9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onNumberButtonClick(v);
            }
        });
        buttonAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onOperatorButtonClick(v);
            }
        });
        buttonSubtract.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
              onOperatorButtonClick(v);
            }
        });
        buttonMultiply.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onOperatorButtonClick(v);
            }
        });
        buttonDivide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onOperatorButtonClick(v);
            }
        });
        buttonModulus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onOperatorButtonClick(v);
            }
        });
        buttonEqual.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onEqualButtonClick(v);
            }
        });
        buttonClear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onClearButtonClick(v);
            }
        });


    }

    public void onNumberButtonClick(View view) {
        Button button = (Button) view;
        String buttonText = button.getText().toString();
        inputStringBuilder.append(buttonText);
        resultTextView.setText(inputStringBuilder.toString());
    }
    public void onOperatorButtonClick(View view) {
        Button button = (Button) view;
        operator = button.getText().toString();
        operand1 = Double.parseDouble(inputStringBuilder.toString());
        inputStringBuilder.setLength(0);
    }

    public void onEqualButtonClick(View view) {
        double operand2 = Double.parseDouble(inputStringBuilder.toString());
        double result = performOperation(operand1, operand2, operator);
        resultTextView.setText(String.valueOf(result));
        inputStringBuilder.setLength(0);
        inputStringBuilder.append(result);
    }

    public void onClearButtonClick(View view) {
        inputStringBuilder.setLength(0);
        resultTextView.setText("0");
    }

    private double performOperation(double operand1, double operand2, String operator) {
        double result = 0;
        switch (operator) {
            case "+":
                result = operand1 + operand2;
                break;
            case "-":
                result = operand1 - operand2;
                break;
            case "*":
                result = operand1 * operand2;
                break;
            case "/":
                result = operand1 / operand2;
                break;
            case "%":
                result = operand1 % operand2;
                break;
        }
        return result;
    }
}