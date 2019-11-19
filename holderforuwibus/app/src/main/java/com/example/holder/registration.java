package com.example.holder;

import androidx.appcompat.app.AppCompatActivity;
import android.view.View;
import android.os.Bundle;
import android.widget.EditText;




public class registration extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registration);
    }
    public void addStudent(View view) {
        myDBHandler dbHandler = new myDBHandler(this, "studentDB.db", null, 1);
        EditText edit = findViewById(R.id.studentID);
        int id = Integer.parseInt(edit.getText().toString());
        edit.setText("");

        edit = findViewById(R.id.studentName);
        String name = edit.getText().toString();
        edit.setText("");

        edit = findViewById(R.id.number);
        String number = edit.getText().toString();
        edit.setText("");

        edit = findViewById(R.id.email);
        String email = edit.getText().toString();
        edit.setText("");

        edit = findViewById(R.id.contact);
        String contact = edit.getText().toString();
        edit.setText("");

        Student student = new Student (id, name,number,email,contact);
        dbHandler.addHandler(student);

    }
    public void loadStudents(View view) {
        myDBHandler dbHandler = new myDBHandler(this, "studentDB.db", null, 1);
        EditText lst = findViewById(R.id.editText10);
        lst.setText(dbHandler.loadHandler());

    }

}

