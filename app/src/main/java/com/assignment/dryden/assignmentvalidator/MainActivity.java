package com.assignment.dryden.assignmentvalidator;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import com.assignment.dryden.assignmentvalidator.Validator;


// I heavily borrowed from assignment 1 to set up my activity once I tried my best to write espresso tests for the UI.
// This is a new project created from scratch, so I did a lot of comparing between this and assignment 1.
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button button = findViewById(R.id.button_id);
        final EditText input = findViewById(R.id.password_field);
        final TextView output = findViewById(R.id.textView);
        button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
               if(5 == Validator.validate(input.getText().toString())){
                   output.setText("Valid Password!");
               }
               else {
                   output.setText("Invalid Password!");
               }
            }
        });
    }
}
