package com.example.demo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Spinner spin1, spin2;
    EditText amount;
    TextView display;
    Button convert, reset;

    Double[] ratesLKR = {366.06, 390.32, 442.71, 250.61, 1189.29};
    Double[] ratesINR = {82.33, 87.79, 99.57, 56.42, 267.51};
    Double[] ratesPKR = {227.11, 242.15, 274.65, 155.61, 737.83};
    Double[] ratesMYR = {4.41, 4.69, 5.32, 3.01, 14.31};
    Double[] ratesJPY = {132.09, 140.84, 159.74, 90.51, 429.14};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        spin1 = (Spinner) findViewById(R.id.spinFrom);
        spin2 = (Spinner) findViewById(R.id.spinTo);
        amount = (EditText) findViewById(R.id.from);
        display = (TextView) findViewById(R.id.to);
        convert = (Button) findViewById(R.id.convertBtn);
        reset = (Button) findViewById(R.id.resetBtn);


        String[] from = {"USD", "EUR", "GBP","AUD","KWD"};
        //limited only to 5 currency types bcz this code not using live currency converter API
        ArrayAdapter ad = new ArrayAdapter<String>(this, androidx.appcompat.R.layout.support_simple_spinner_dropdown_item,from);
        spin1.setAdapter(ad);

        String[] to = {"LKR","INR","PKR","MYR","JPY"};
        ArrayAdapter ad1 = new ArrayAdapter<String>(this, androidx.appcompat.R.layout.support_simple_spinner_dropdown_item,to);
        spin2.setAdapter(ad1);



        convert.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String x = amount.getText().toString();
                if(!x.isEmpty()){
                    calculation();

                }else{
                    Toast.makeText(MainActivity.this, "Please Enter Amount", Toast.LENGTH_LONG).show();
                }
                }
        });


        reset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                amount.setText(null);
                display.setText(null);

            }
        });

    }

    public void calculation() {
        Double total;
        Double value = Double.parseDouble(amount.getText().toString());

        if ( spin1.getSelectedItem().toString() == "USD" && spin2.getSelectedItem().toString() == "LKR") {

            total = value * ratesLKR[0];
            display.setText(String.format("%.2f", total));
        } else if (spin1.getSelectedItem().toString() == "USD" && spin2.getSelectedItem().toString() == "INR") {

            total = value * ratesINR[0];
            display.setText(String.format("%.2f", total));
        } else if (spin1.getSelectedItem().toString() == "USD" && spin2.getSelectedItem().toString() == "PKR") {

            total = value * ratesPKR[0];
            display.setText(String.format("%.2f", total));
        } else if (spin1.getSelectedItem().toString() == "USD" && spin2.getSelectedItem().toString() == "MYR") {

            total = value * ratesMYR[0];
            display.setText(String.format("%.2f", total));
        } else if (spin1.getSelectedItem().toString() == "USD" && spin2.getSelectedItem().toString() == "JPY") {

            total = value * ratesJPY[0];
            display.setText(String.format("%.2f", total));
        } else if (spin1.getSelectedItem().toString() == "EUR" && spin2.getSelectedItem().toString() == "LKR") {

            total = value * ratesLKR[1];
            display.setText(String.format("%.2f", total));
        } else if (spin1.getSelectedItem().toString() == "EUR" && spin2.getSelectedItem().toString() == "INR") {

            total = value * ratesINR[1];
            display.setText(String.format("%.2f", total));
        } else if (spin1.getSelectedItem().toString() == "EUR" && spin2.getSelectedItem().toString() == "PKR") {

            total = value * ratesPKR[1];
            display.setText(String.format("%.2f", total));
        } else if (spin1.getSelectedItem().toString() == "EUR" && spin2.getSelectedItem().toString() == "MYR") {

            total = value * ratesMYR[1];
            display.setText(String.format("%.2f", total));
        } else if (spin1.getSelectedItem().toString() == "EUR" && spin2.getSelectedItem().toString() == "JPY") {

            total = value * ratesJPY[1];
            display.setText(String.format("%.2f", total));
        } else if (spin1.getSelectedItem().toString() == "GBP" && spin2.getSelectedItem().toString() == "LKR") {

            total = value * ratesLKR[2];
            display.setText(String.format("%.2f", total));
        } else if (spin1.getSelectedItem().toString() == "GBP" && spin2.getSelectedItem().toString() == "INR") {

            total = value * ratesINR[2];
            display.setText(String.format("%.2f", total));
        } else if (spin1.getSelectedItem().toString() == "GBP" && spin2.getSelectedItem().toString() == "PKR") {

            total = value * ratesPKR[2];
            display.setText(String.format("%.2f", total));
        } else if (spin1.getSelectedItem().toString() == "GBP" && spin2.getSelectedItem().toString() == "MYR") {

            total = value * ratesMYR[2];
            display.setText(String.format("%.2f", total));
        } else if (spin1.getSelectedItem().toString() == "GBP" && spin2.getSelectedItem().toString() == "JPY") {

            total = value * ratesJPY[2];
            display.setText(String.format("%.2f", total));
        } else if (spin1.getSelectedItem().toString() == "AUD" && spin2.getSelectedItem().toString() == "LKR") {

            total = value * ratesLKR[3];
            display.setText(String.format("%.2f", total));
        } else if (spin1.getSelectedItem().toString() == "AUD" && spin2.getSelectedItem().toString() == "INR") {

            total = value * ratesINR[3];
            display.setText(String.format("%.2f", total));
        } else if (spin1.getSelectedItem().toString() == "AUD" && spin2.getSelectedItem().toString() == "PKR") {

            total = value * ratesPKR[3];
            display.setText(String.format("%.2f", total));
        } else if (spin1.getSelectedItem().toString() == "AUD" && spin2.getSelectedItem().toString() == "MYR") {

            total = value * ratesMYR[3];
            display.setText(String.format("%.2f", total));
        } else if (spin1.getSelectedItem().toString() == "AUD" && spin2.getSelectedItem().toString() == "JPY") {

            total = value * ratesJPY[3];
            display.setText(String.format("%.2f", total));
        } else if (spin1.getSelectedItem().toString() == "KWD" && spin2.getSelectedItem().toString() == "LKR") {

            total = value * ratesLKR[4];
            display.setText(String.format("%.2f", total));
        } else if (spin1.getSelectedItem().toString() == "KWD" && spin2.getSelectedItem().toString() == "INR") {

            total = value * ratesINR[4];
            display.setText(String.format("%.2f", total));
        } else if (spin1.getSelectedItem().toString() == "KWD" && spin2.getSelectedItem().toString() == "PKR") {

            total = value * ratesPKR[4];
            display.setText(String.format("%.2f", total));
        } else if (spin1.getSelectedItem().toString() == "KWD" && spin2.getSelectedItem().toString() == "MYR") {

            total = value * ratesMYR[4];
            display.setText(String.format("%.2f", total));

        } else if (spin1.getSelectedItem().toString() == "KWD" && spin2.getSelectedItem().toString() == "JPY") {

            total = value * ratesJPY[4];
            display.setText(String.format("%.2f", total));
        } else {

            Toast.makeText(MainActivity.this, "Please Enter Amount", Toast.LENGTH_LONG).show();
        }

    }

    }