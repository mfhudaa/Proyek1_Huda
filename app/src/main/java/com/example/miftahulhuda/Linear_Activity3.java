package com.example.miftahulhuda;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Linear_Activity3 extends AppCompatActivity {
String user, kepada, subyek, pesan ;
EditText eKepada, eSubyek, ePesan;
Button bkirim;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_linear3);
        user = getIntent().getExtras().getString("user");
        eKepada = findViewById(R.id.kepada);
        eSubyek = findViewById(R.id.subyek);
        ePesan = findViewById(R.id.pesan);
        bkirim = findViewById(R.id.kirim);
        bkirim.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) { kirim(); }
        });
    }
    public void  kirim () {
        kepada = eKepada.getText().toString();
        subyek = eSubyek.getText().toString();
        pesan = ePesan.getText().toString();
        Intent intent = new Intent(Linear_Activity3.this,LatihanActivity2.class);
        intent.putExtra("kepada",kepada);
        intent.putExtra("subyek",subyek);
        intent.putExtra("pesan",pesan);
        Toast.makeText(this,"Selamat Datang"+kepada,Toast.LENGTH_LONG).show();
        startActivity(intent);
    }
}