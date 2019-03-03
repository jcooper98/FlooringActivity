package com.jcooper.flooringactivity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private static final int CIS3334_REQUEST_CODE = 1001;

    EditText editTextWidth, editTextLength;
    Button buttonResults;


    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editTextWidth = findViewById(R.id.editTextWidth);
        editTextLength = findViewById(R.id.editTextLength);
        buttonResults = findViewById(R.id.buttonResults);

    }


    public void onButtonClick( View view)
    {
        // Call the second activity

        Double width = Double.parseDouble(editTextWidth.getText().toString());
        Double length = Double.parseDouble(editTextLength.getText().toString());


        Intent secActIntent = new Intent(this, ResultActivity.class);
        secActIntent.putExtra("WidthNum", width);
        secActIntent.putExtra("LengthNum", length);

        startActivityForResult(secActIntent, CIS3334_REQUEST_CODE);

    }









}
