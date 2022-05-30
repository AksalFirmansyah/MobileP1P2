package com.example.aksalfirmansyah_uas.PM1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.aksalfirmansyah_uas.R;

public class P2 extends AppCompatActivity {
    private EditText editText;
    private Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_p2);

        editText
                = (EditText)findViewById(R.id.editTextTextPersonName);
        button
                = (Button)findViewById(R.id.button);

        button.setOnClickListener(
                new View.OnClickListener() {

                    @Override
                    public void onClick(View v)
                    {
                        String name
                                = editText.getText()
                                .toString();
                        Toast.makeText(P2.this,"Welcome to UNPAM "+ name,Toast.LENGTH_SHORT).show();
                    }
                });
    }
}