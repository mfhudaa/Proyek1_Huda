package com.example.miftahulhuda;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.Toast;

public class frame2layout extends AppCompatActivity {
    EditText eUserName;
    ImageButton blogin;
    String user;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_frame2layout);
        eUserName = findViewById(R.id.username);
        blogin = findViewById(R.id.login);
        blogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) { login(); }
        });
    }
    public void login (){
        user = eUserName.getText().toString();
        Intent intent = new Intent(frame2layout.this,Linear_Activity3.class);
        intent.putExtra("user",user);
        Toast.makeText(this,"Selamat Datang"+user,Toast.LENGTH_LONG).show();
        startActivity(intent);
    }
}