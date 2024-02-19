package com.example.mynewprojektkurs2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Second extends AppCompatActivity {

    Button button;
    TextView surnames,names,patronymics,ages;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_secend);
        button = findViewById(R.id.button);
        surnames = findViewById(R.id.surnameS);
        names = findViewById(R.id.nameS);
        patronymics = findViewById(R.id.patron);
        ages = findViewById(R.id.ageS);
        Intent into = getIntent();
        String surname = into.getStringExtra("s");
        String name = into.getStringExtra("n");
        String patron = into.getStringExtra("p");
        String age = into.getStringExtra("a");
        surnames.setText(surname);
        names.setText(name);
        patronymics.setText(patron);
        ages.setText(age);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Second.this,MainActivity.class);
                startActivity(intent);
            }
        });
    }
}