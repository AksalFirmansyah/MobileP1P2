package com.example.aksalfirmansyah_uas.PM1;

import androidx.appcompat.app.AppCompatActivity;

import android.app.ListActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;

import com.example.aksalfirmansyah_uas.R;

public class Teman extends ListActivity {
    String [] teman ={"Hafiz", "Restu", "Ade", "Candra"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_teman);
        setListAdapter(new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, teman));
    }
}