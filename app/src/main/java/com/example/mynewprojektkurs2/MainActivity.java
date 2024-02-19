package com.example.mynewprojektkurs2;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Button button;
    TextView surnameT,nameT,patronymicT,ageT;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button = findViewById(R.id.btn);
        surnameT = findViewById(R.id.surname);
        nameT = findViewById(R.id.name);
        patronymicT = findViewById(R.id.patronymic);
        ageT = findViewById(R.id.age);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String surname = surnameT.getText().toString();
                String name = nameT.getText().toString();
                String patronymic = patronymicT.getText().toString();
                String age = ageT.getText().toString();
                Intent intent = new Intent(MainActivity.this, Second.class);
                intent.putExtra("s", surname);
                intent.putExtra("n", name);
                intent.putExtra("p", patronymic);
                intent.putExtra("a", age);
                startActivity(intent);
            }
        });
    }
}