package com.example.currencyconverter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    public void convertCurrency(View view) {
        Log.i("Info", "Button Pressed");

        EditText editText = (EditText) findViewById(R.id.editTextCurrency);

        String amountInYen = editText.getText().toString();

        double amountInYenDouble = Double.parseDouble(amountInYen);

        double amountInDollarsDouble = amountInYenDouble * 0.0091;

        String amountInDollarsString = String.format("%.2f", amountInDollarsDouble);

        Toast.makeText(this, "¥" + amountInYen + " is $" + amountInDollarsString , Toast.LENGTH_LONG).show();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}