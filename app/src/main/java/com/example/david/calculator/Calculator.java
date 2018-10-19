package com.example.david.calculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Calculator extends AppCompatActivity {
    private TextView number;
    private Button zero, one, two, three, four, five, six, seven, eight, nine, div, prod, minus, plus, point, AC, tang, cosi, sine, square, loga, abso, equals  ;
    private double result;
    private String visualNumber, operator, savedNumber;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculator);
        number = (TextView) findViewById(R.id.number);
        zero = (Button) findViewById(R.id.button0);
        one = (Button) findViewById(R.id.button1);
        two = (Button) findViewById(R.id.button2);
        three = (Button) findViewById(R.id.button3);
        four = (Button) findViewById(R.id.button4);
        five = (Button) findViewById(R.id.button5);
        six = (Button) findViewById(R.id.button6);
        seven = (Button) findViewById(R.id.button7);
        eight = (Button) findViewById(R.id.button8);
        nine = (Button) findViewById(R.id.button9);
        minus = (Button) findViewById(R.id.buttonMinus);
        prod = (Button) findViewById(R.id.buttonMult);
        div = (Button) findViewById(R.id.buttonSlash);
        point = (Button) findViewById(R.id.buttonPoint);
        plus = (Button) findViewById(R.id.buttonPlus);
        AC = (Button) findViewById(R.id.buttonAC);
        abso = (Button) findViewById(R.id.buttonAbs);
        tang = (Button) findViewById(R.id.buttonTan);
        cosi = (Button) findViewById(R.id.buttonCos);
        sine = (Button) findViewById(R.id.buttonSin);
        square = (Button) findViewById(R.id.buttonDec);
        loga = (Button) findViewById(R.id.buttonLog);
        equals = (Button) findViewById(R.id.buttonEquals);

        one.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                visualNumber= number.getText().toString();
                visualNumber =  visualNumber + "1";
                number.setText(visualNumber);
            }
        });
        zero.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                visualNumber= number.getText().toString();
                visualNumber =  visualNumber + "0";
                number.setText(visualNumber);
            }
        });
        two.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                visualNumber= number.getText().toString();
                visualNumber =  visualNumber + "2";
                number.setText(visualNumber);
            }
        });
        three.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                visualNumber= number.getText().toString();
                visualNumber =  visualNumber + "3";
                number.setText(visualNumber);
            }
        });
        four.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                visualNumber= number.getText().toString();
                visualNumber =  visualNumber + "4";
                number.setText(visualNumber);
            }
        });
        five.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                visualNumber= number.getText().toString();
                visualNumber =  visualNumber + "5";
                number.setText(visualNumber);
            }
        });
        six.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                visualNumber= number.getText().toString();
                visualNumber =  visualNumber + "6";
                number.setText(visualNumber);
            }
        });
        seven.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                visualNumber= number.getText().toString();
                visualNumber =  visualNumber + "7";
                number.setText(visualNumber);
            }
        });
        eight.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                visualNumber= number.getText().toString();
                visualNumber =  visualNumber + "8";
                number.setText(visualNumber);
            }
        });
        nine.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                visualNumber= number.getText().toString();
                visualNumber =  visualNumber + "9";
                number.setText(visualNumber);
            }
        });


        plus.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                savedNumber = number.getText().toString();
                operator = "+";
                number.setText("");
            }
        });

        minus.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                savedNumber = number.getText().toString();
                operator = "-";
                number.setText("");
            }
        });
        prod.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                savedNumber = number.getText().toString();
                operator = "*";
                number.setText("");
            }
        });
        div.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                savedNumber = number.getText().toString();
                operator = "/";
                number.setText("");
            }
        });
        point.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                visualNumber = number.getText().toString();
                visualNumber = visualNumber+ ".";
                number.setText(visualNumber);
            }
        });

        AC.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                visualNumber = "";
                number.setText(visualNumber);
                savedNumber = "";
                operator = "";
            }
        });
        tang.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                visualNumber = number.getText().toString();
                savedNumber = visualNumber;
                visualNumber = "tan("+visualNumber+")";
                operator = "tan";
                number.setText(visualNumber);
            }
        });
        sine.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                visualNumber = number.getText().toString();
                savedNumber = visualNumber;
                visualNumber = "sin("+visualNumber+")";
                operator = "sin";
                number.setText(visualNumber);
            }
        });
        cosi.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                visualNumber = number.getText().toString();
                savedNumber = visualNumber;
                visualNumber = "cos("+visualNumber+")";
                operator = "cos";
                number.setText(visualNumber);
            }
        });
        square.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                visualNumber = number.getText().toString();
                savedNumber = visualNumber;
                visualNumber = "sqr("+visualNumber+")";
                operator = "sqr";
                number.setText(visualNumber);
            }
        });
        loga.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                visualNumber = number.getText().toString();
                savedNumber = visualNumber;
                visualNumber = "log("+visualNumber+")";
                operator = "log";
                number.setText(visualNumber);
            }
        });
        abso.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                visualNumber = number.getText().toString();
                savedNumber = visualNumber;
                visualNumber = "abs("+visualNumber+")";
                operator = "abs";
                number.setText(visualNumber);
            }
        });
        equals.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                visualNumber = number.getText().toString();
                double result;
                if(operator.equals("-")){
                    result = Double.parseDouble(savedNumber) - Double.parseDouble(visualNumber);
                    number.setText(String.valueOf(result));
                }
                if(operator.equals("+")){
                    result = Double.parseDouble(savedNumber) + Double.parseDouble(visualNumber);
                    number.setText(String.valueOf(result));
                }
                if(operator.equals("/")){
                    result = Double.parseDouble(savedNumber) / Double.parseDouble(visualNumber);
                    number.setText(String.valueOf(result));
                }
                if(operator.equals("*")){
                    result = Double.parseDouble(savedNumber) * Double.parseDouble(visualNumber);
                    number.setText(String.valueOf(result));
                }
                if(operator.equals("tan")){
                    result = Double.parseDouble(savedNumber);
                    number.setText(String.valueOf(Math.tan(result)));
                }
                if(operator.equals("sin")){
                    result = Double.parseDouble(savedNumber);
                    number.setText(String.valueOf(Math.sin(result)));
                }
                if(operator.equals("cos")){
                    result = Double.parseDouble(savedNumber);
                    number.setText(String.valueOf(Math.cos(result)));
                }
                if(operator.equals("sqr")){
                    result = Double.parseDouble(savedNumber);
                    number.setText(String.valueOf(result*result));
                }
                if(operator.equals("log")){
                    result = Double.parseDouble(savedNumber);
                    number.setText(String.valueOf(Math.log(result)));
                }
                if(operator.equals("abs")){
                    result = Double.parseDouble(savedNumber);
                    number.setText(String.valueOf(Math.abs(result)));
                }
            }
        });



    }




}
