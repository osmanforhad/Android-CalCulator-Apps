package com.osmanforhad.calculatorapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    //Create object or Declare variable
    private Button zero;
    private Button one;
    private Button two;
    private Button three;
    private Button four;
    private Button five;
    private Button six;
    private Button seven;
    private Button eight;
    private Button nine;
    private Button add;
    private Button sub;
    private Button mul;
    private Button div;
    private Button equal;
    private Button clear;
    private TextView info;
    private TextView result;
    //Define Constant For Arithmetic operation
    private final char ADDITION = '+';
    private final char SUBTRACTION = '-';
    private final char MULTIPLICATION = '*';
    private final char DIVISION = '/';
    private final char EQU = 0;
    //Define 2 values for Arithmetic operation
    private double val1 = Double.NaN;
    private double val2;
    private char ACTION;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //Call the all ui through calling the method
        setupUIViews();
        //for clickable button
        zero.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Assign user click within the textview
                info.setText(info.getText().toString() + "0");
            }
        });

        //for clickable button
        one.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Assign user click within the textview
                info.setText(info.getText().toString() + "1");
            }
        });

        //for clickable button
        two.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Assign user click within the textview
                info.setText(info.getText().toString() + "2");
            }
        });

        //for clickable button
        three.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Assign user click within the textview
                info.setText(info.getText().toString() + "3");
            }
        });

        //for clickable button
        four.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Assign user click within the textview
                info.setText(info.getText().toString() + "4");
            }
        });

        //for clickable button
        five.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Assign user click within the textview
                info.setText(info.getText().toString() + "5");
            }
        });

        //for clickable button
        six.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Assign user click within the textview
                info.setText(info.getText().toString() + "6");
            }
        });

        //for clickable button
        seven.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Assign user click within the textview
                info.setText(info.getText().toString() + "7");
            }
        });

        //for clickable button
        eight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Assign user click within the textview
                info.setText(info.getText().toString() + "8");
            }
        });

        //for clickable button
        nine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Assign user click within the textview
                info.setText(info.getText().toString() + "9");
            }
        });

        //for clickable button
        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Cale compute method for operation through the logic
                compute();
                //for what this button will do Call from switch case
                ACTION = ADDITION;
                //for getting result
                result.setText(String.valueOf(val1) + "+");
                info.setText(null);

            }
        });

        //for clickable button
        sub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Cale compute method for operation through the logic
                compute();
                //for what this button will do Call from switch case
                ACTION = SUBTRACTION;
                //for getting result
                result.setText(String.valueOf(val1) + "-");
                info.setText(null);

            }
        });
        //for clickable button
        mul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Cale compute method for operation through the logic
                compute();
                //for what this button will do Call from switch case
                ACTION = MULTIPLICATION;
                //for getting result
                result.setText(String.valueOf(val1) + "*");
                info.setText(null);

            }
        });
        //for clickable button
        div.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Cale compute method for operation through the logic
                compute();
                //for what this button will do Call from switch case
                ACTION = DIVISION;
                //for getting result
                result.setText(String.valueOf(val1) + "/");
                info.setText(null);

            }
        });

        //for clickable button
        equal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Call the method of compute
                compute();
                //for what this button will do Call from switch case
                ACTION = EQU;
                //for result
                result.setText(result.getText().toString() + String.valueOf(val2) + "=" + String.valueOf(val1));
                // 5 + 4 = 9
                info.setText(null);
            }
        });

        //For Clicable button
        clear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (info.getText().length() > 0){
                    CharSequence name = info.getText().toString();
                    info.setText(name.subSequence(0, name.length()-1));
                }
                else {
                    val1 = Double.NaN;
                    val2 = Double.NaN;
                    info.setText(null);
                    result.setText(null);
                }
            }
        });

    }

    //declare an void method for Initial XML UI
    private void setupUIViews(){
        zero = (Button)findViewById(R.id.btn0);
        one = (Button)findViewById(R.id.btn1);
        two = (Button)findViewById(R.id.btn2);
        three = (Button)findViewById(R.id.btn3);
        four = (Button)findViewById(R.id.btn4);
        five = (Button)findViewById(R.id.btn5);
        six = (Button)findViewById(R.id.btn6);
        seven = (Button)findViewById(R.id.btn7);
        eight = (Button)findViewById(R.id.btn8);
        nine = (Button)findViewById(R.id.btn9);
        add = (Button)findViewById(R.id.btnadd);
        sub = (Button)findViewById(R.id.btnsub);
        mul = (Button)findViewById(R.id.btnmul);
        div = (Button)findViewById(R.id.btndivide);
        equal = (Button)findViewById(R.id.btnequal);
        clear = (Button)findViewById(R.id.btnclear);
        info = (TextView)findViewById(R.id.tvControl);
        result = (TextView)findViewById(R.id.tvResult);

    }
    //Declare an void Method for Computing all the operation
    private void compute(){
        /*Start Writing Logic*/
        if (!Double.isNaN(val1)){
            /*Check val1 is a number
         if not it will goto else for get value of val1*/
            val2 = Double.parseDouble(info.getText().toString());

            //Logic for What operation it will do and when
            switch (ACTION){
                case ADDITION:
                    val1 = val1 + val2;
                    break;
                case SUBTRACTION:
                    val1 = val1 - val2;
                    break;
                case MULTIPLICATION:
                    val1 = val1 * val2;
                    break;
                case DIVISION:
                    val1 = val1 / val2;
                    break;
                    //for out after process arithmetic operation
                case EQU:
                    break;
            }

        }
        else{
            val1 = Double.parseDouble(info.getText().toString());
        }

    }

}
