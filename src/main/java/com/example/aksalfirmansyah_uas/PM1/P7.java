package com.example.aksalfirmansyah_uas.PM1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.aksalfirmansyah_uas.R;

public class P7 extends AppCompatActivity {

    //pertama
    Button btnPindah;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_p7);
        //kedua
        btnPindah = (Button)findViewById(R.id.NextButton);
        btnPindah.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(), Halaman_A.class);
                startActivity(i); }
        });
    }
}