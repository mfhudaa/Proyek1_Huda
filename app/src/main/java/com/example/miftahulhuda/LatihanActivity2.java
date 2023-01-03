package com.example.miftahulhuda;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.EditText;

public class LatihanActivity2 extends AppCompatActivity {
String kepada, subyek, pesan;
EditText eKepada, eSubyek, ePesan;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_latihan2);
        kepada = getIntent().getExtras().getString("kepada");
        subyek = getIntent().getExtras().getString("subyek");
        pesan = getIntent().getExtras().getString("pesan");
        eKepada = findViewById(R.id.kepada2);
        eSubyek = findViewById(R.id.subyek2);
        ePesan = findViewById(R.id.pesan2);
        eKepada.setText(kepada);
        eSubyek.setText(subyek);
        ePesan.setText(pesan);
    }
}