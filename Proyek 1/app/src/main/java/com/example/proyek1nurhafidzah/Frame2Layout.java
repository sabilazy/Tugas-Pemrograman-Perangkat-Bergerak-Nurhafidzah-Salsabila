package com.example.proyek1nurhafidzah;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class Frame2Layout extends AppCompatActivity {
    EditText textuname;
    ImageButton tomlogin;
    String user;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_frame2_layout);

        textuname = findViewById(R.id.username);
        tomlogin = findViewById(R.id.login);
        tomlogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                login();
            }
        });
    }

    public void login() {
        user = textuname.getText().toString();
        Intent intent = new Intent(Frame2Layout.this, LinearActivity2.class);
        intent.putExtra("user", user);
        Toast.makeText(this, "Selamat Datang"+user, Toast.LENGTH_LONG).show();
        startActivity(intent);
    }
}