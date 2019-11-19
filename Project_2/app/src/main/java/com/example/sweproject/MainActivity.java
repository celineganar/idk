package com.example.sweproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.CalendarView;
import android.widget.EditText;
import android.widget.Spinner;

import java.text.SimpleDateFormat;
import java.util.Date;

public class MainActivity extends AppCompatActivity {
    private Button search,login;
    Spinner spinner,spinner2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        search =  (Button) findViewById(R.id.button);
        search.setOnClickListener(new Button_Clicker());


        spinner =  (Spinner) findViewById(R.id.spinner);
        spinner.setOnItemSelectedListener(new CustomOnItemSelectedListener());
        spinner2 =  findViewById(R.id.spinner2);
        spinner2.setOnItemSelectedListener(new CustomOnItemSelectedListener());
    }
    class Button_Clicker implements Button.OnClickListener {

        @Override

        public void onClick(View v) {

            if (v == search) {
                findDrivers();
            }




        }
    }

    class CustomOnItemSelectedListener implements AdapterView.OnItemSelectedListener {

        public void onItemSelected(AdapterView<?> parent, View view, int pos, long id) {



        }
        @Override
        public void onNothingSelected(AdapterView <?> arg0) {

        }
    }

    public void findDrivers(){
        Intent myIntent = new Intent(getApplicationContext(),Rides.class);
        String location = spinner.getSelectedItem().toString();
        String destination=spinner2.getSelectedItem().toString();
        CalendarView cv = findViewById(R.id.calendarView);
        SimpleDateFormat sdf= new SimpleDateFormat("dd/MM/yyyy");
        String selectedDate = sdf.format(new Date(cv.getDate()));
        EditText time = findViewById(R.id.editText3);
        String sTime =time.getText().toString();
        myIntent.putExtra("location",location);
        myIntent.putExtra("destination",destination);
        myIntent.putExtra("date",selectedDate);
        myIntent.putExtra("time",sTime);

        startActivity(myIntent);
    }

}
