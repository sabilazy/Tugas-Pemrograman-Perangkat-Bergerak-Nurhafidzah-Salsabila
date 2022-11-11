package com.example.proyek1nurhafidzah;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

public class LatihanActivity extends AppCompatActivity {
    String kepada, subyek, isi;
    EditText textfor;
    EditText textsub;
    EditText textmessage;
    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_latihan);

        kepada = getIntent().getExtras().getString("kepada");
        subyek = getIntent().getExtras().getString("subyek");
        isi = getIntent().getExtras().getString("isi");

        textfor = findViewById(R.id.to);
        textsub = findViewById(R.id.sub);
        textmessage = findViewById(R.id.teks);
        button = findViewById(R.id.send);

        textfor.setText(kepada);
        textsub.setText(subyek);
        textmessage.setText(isi);
    }
}