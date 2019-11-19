package com.example.sweproject;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;

public class Rides extends AppCompatActivity {

    private Button button1,button2,button3;
    ImageView image;
    String location;
    String destination;
    String date;
    String time;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rides);
        location = getIntent().getStringExtra("location");
        destination = getIntent().getStringExtra("destination");
        date = getIntent().getStringExtra("date");
        time = getIntent().getStringExtra("time");
        button1 =   findViewById(R.id.button3);
        button1.setOnClickListener(new Button_Clicker());
        button2 =  (Button) findViewById(R.id.button4);
        button2.setOnClickListener(new Button_Clicker());
        button3 =  (Button) findViewById(R.id.button5);
        button3.setOnClickListener(new Button_Clicker());


        EditText edit = findViewById(R.id.editText);
            edit.setText("John Smith");
            image = (ImageView) findViewById(R.id.imageView);
            image.setImageResource(R.drawable.pro);

            edit = findViewById(R.id.editText2);
            edit.setText("Amy Singh");
            image = (ImageView) findViewById(R.id.imageView2);
            image.setImageResource(R.drawable.pro2);


            edit = findViewById(R.id.editText4);
            edit.setText("Ryan Garcia");
            image = (ImageView) findViewById(R.id.imageView3);
            image.setImageResource(R.drawable.pro3);
    }


    class Button_Clicker implements Button.OnClickListener {

        @Override

        public void onClick(View v) {

            if (v == button1) {
                /*EditText edit = findViewById(R.id.editText5);
                edit.setText(location);
                edit = findViewById(R.id.editText6);
                edit.setText(destination);
                edit = findViewById(R.id.editText7);
                edit.setText(date);
                edit = findViewById(R.id.editText8);
                edit.setText(time);
                EditText driver = findViewById(R.id.editText);
                edit = findViewById(R.id.editText9);
                edit.setText(driver.getText());
                edit = findViewById(R.id.editText10);
                edit.setText("$30");*/
                driver1();



            }
            if(v==button2){
                /*EditText edit = findViewById(R.id.editText5);
                edit.setText(location);
                edit = findViewById(R.id.editText6);
                edit.setText(destination);
                edit = findViewById(R.id.editText7);
                edit.setText(date);
                edit = findViewById(R.id.editText8);
                edit.setText(time);
                EditText driver = findViewById(R.id.editText2);
                edit = findViewById(R.id.editText9);
                edit.setText(driver.getText());
                edit = findViewById(R.id.editText10);
                edit.setText("$30");*/
                driver2();

            }
            if(v==button3){
               /* EditText edit = findViewById(R.id.editText5);
                edit.setText(location);
                edit = findViewById(R.id.editText6);
                edit.setText(destination);
                edit = findViewById(R.id.editText7);
                edit.setText(date);
                edit = findViewById(R.id.editText8);
                edit.setText(time);
                EditText driver = findViewById(R.id.editText4);
                edit = findViewById(R.id.editText9);
                edit.setText(driver.getText());
                edit = findViewById(R.id.editText10);
                edit.setText("$30");*/
               driver3();
            }


        }
    }

    public String driver1(){

        EditText edit = findViewById(R.id.editText5);
        edit.setText(location);
        edit = findViewById(R.id.editText6);
        edit.setText(destination);
        edit = findViewById(R.id.editText7);
        edit.setText(date);
        edit = findViewById(R.id.editText8);
        edit.setText(time);
        EditText driver = findViewById(R.id.editText);
        edit = findViewById(R.id.editText9);
        edit.setText(driver.getText());
        edit = findViewById(R.id.editText10);
        edit.setText("$30");
        return driver.getText().toString();

    }
    public String driver2(){

        EditText edit = findViewById(R.id.editText5);
        edit.setText(location);
        edit = findViewById(R.id.editText6);
        edit.setText(destination);
        edit = findViewById(R.id.editText7);
        edit.setText(date);
        edit = findViewById(R.id.editText8);
        edit.setText(time);
        EditText driver = findViewById(R.id.editText);
        edit = findViewById(R.id.editText9);
        edit.setText(driver.getText());
        edit = findViewById(R.id.editText10);
        edit.setText("$30");
        return driver.getText().toString();

    }
    public String driver3(){

        EditText edit = findViewById(R.id.editText5);
        edit.setText(location);
        edit = findViewById(R.id.editText6);
        edit.setText(destination);
        edit = findViewById(R.id.editText7);
        edit.setText(date);
        edit = findViewById(R.id.editText8);
        edit.setText(time);
        EditText driver = findViewById(R.id.editText);
        edit = findViewById(R.id.editText9);
        edit.setText(driver.getText());
        edit = findViewById(R.id.editText10);
        edit.setText("$30");
        return driver.getText().toString();

    }



}
