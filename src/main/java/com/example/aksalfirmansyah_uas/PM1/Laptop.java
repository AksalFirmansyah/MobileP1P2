package com.example.aksalfirmansyah_uas.PM1;

import androidx.appcompat.app.AppCompatActivity;

import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import com.example.aksalfirmansyah_uas.R;

public class Laptop extends ListActivity {
    String[] perangkat = { "Activity Asus", "Activity Acer",
            "Activity Toshiba", "Activity Sony", "Activity Axioo", "Activity Dell", "<< Kembali"};

    public void onListItemClick(ListView parent, View v, int urutan, long id) {
        Object detail = this.getListAdapter().getItem(urutan);
        String tampil = detail.toString();
        Intent i = null;
        if(tampil=="<< Kembali")
        {
            i = new Intent(Laptop.this,P12.class); startActivity(i);
        } else {

            Toast.makeText(this, "Anda Memilih : " + tampil, Toast.LENGTH_SHORT).show();
        } }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_laptop);
        setListAdapter(new ArrayAdapter<String>
                (this,android.R.layout.simple_list_item_1, perangkat));
    }
}