package com.example.proyek1nurhafidzah;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

public class LinearActivity2 extends AppCompatActivity {
    Button button;
    String user, kepada, subyek, isi;
    EditText textfor,textsub, textmessage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_linear2);
        
        button = findViewById(R.id.Kirim);
        user = getIntent().getExtras().getString("user");
        textfor = findViewById(R.id.Kepada);
        textsub = findViewById(R.id.Subject);
        textmessage = findViewById(R.id.Pesan);
        
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(LinearActivity2.this, LatihanActivity.class);

                intent.putExtra("kepada", textfor.getText().toString());
                intent.putExtra("subyek", textsub.getText().toString());
                intent.putExtra("isi", textmessage.getText().toString());
                startActivity(intent);
            }
        });
        

    }
}