package com.example.aksalfirmansyah_uas.PM1;

import androidx.appcompat.app.AppCompatActivity;

import android.app.ListActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;

import com.example.aksalfirmansyah_uas.R;

public class Berita extends ListActivity {
    String [] berita ={"Jadwal Piala Dunia 2014", "Capres Indonesia", "Debat Capres",
            "Debat Cawapres"};
    //ubah
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_berita);
        setListAdapter(new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, berita));
    }
}