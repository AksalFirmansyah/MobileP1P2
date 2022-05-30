package com.example.aksalfirmansyah_uas.PM1;

import androidx.appcompat.app.AppCompatActivity;

import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.example.aksalfirmansyah_uas.MainActivity;
import com.example.aksalfirmansyah_uas.R;

public class P12 extends ListActivity {
    String[] perangkat = { "Activity Laptop", "Activity Smartphone"};
    @Override
    public void onCreate (Bundle savedInstanceState ){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_p12);
        setListAdapter(new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1, perangkat));
    }
    public void onListItemClick(ListView parent, View v, int urutan, long id) {
        Object detail = this.getListAdapter().getItem(urutan);
        String tampil = detail.toString();
        Intent i = null;
        if(tampil=="Activity Laptop")
        {
            i = new Intent(P12.this, Laptop.class);
            startActivity(i);
        }
        else if(tampil=="Activity Smartphone")
        {
            i = new Intent(P12.this, Smartphone.class);

        } }
}