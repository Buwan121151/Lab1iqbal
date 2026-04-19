package com.example.lab1_iqbal;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    TextView tvMessage;
    EditText etName;
    Button submitButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

       
        tvMessage = findViewById(R.id.textView);
        etName = findViewById(R.id.editText);
        submitButton = findViewById(R.id.button);
    }

   
    public void displayText(View view) {

        String name = etName.getText().toString().trim();

        if (!name.isEmpty()) {
            String message = "Welcome " + name;

            tvMessage.setText(message);
            Toast.makeText(this, message, Toast.LENGTH_SHORT).show();

        } else {
            tvMessage.setText("Please enter your name");
            Toast.makeText(this, "Name is empty", Toast.LENGTH_SHORT).show();
        }
    }
}
