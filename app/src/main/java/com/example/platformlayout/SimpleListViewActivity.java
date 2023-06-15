package com.example.platformlayout;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class SimpleListViewActivity extends AppCompatActivity {

    private static final String TAG = "SimpleListViewActivity";

    private ListView simpleList;
    private ArrayList ar_nama_mahasiswa;
    private ArrayAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_simple_list_view);

        simpleList = findViewById(R.id.simpleListView);

        ar_nama_mahasiswa = new ArrayList<String>();
        ar_nama_mahasiswa.add("asdfghjkl");
        ar_nama_mahasiswa.add("asdfghjkl");
        ar_nama_mahasiswa.add("asdfghjkl");
        ar_nama_mahasiswa.add("asdfghjkl");
        ar_nama_mahasiswa.add("asdfghjkl");
        ar_nama_mahasiswa.add("asdfghjkl");
        ar_nama_mahasiswa.add("asdfghjkl");
        ar_nama_mahasiswa.add("asdfghjkl");
        ar_nama_mahasiswa.add("asdfghjkl");
        ar_nama_mahasiswa.add("asdfghjkl");
        ar_nama_mahasiswa.add("asdfghjkl");
        ar_nama_mahasiswa.add("asdfghjkl");
        ar_nama_mahasiswa.add("asdfghjkl");
        ar_nama_mahasiswa.add("asdfghjkl");
        ar_nama_mahasiswa.add("asdfghjkl");

        adapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1, ar_nama_mahasiswa);
        simpleList.setAdapter(adapter);
    }
}