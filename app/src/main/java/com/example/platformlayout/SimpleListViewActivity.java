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
        ar_nama_mahasiswa.add("Vanellope von Schweetz");
        ar_nama_mahasiswa.add("Snow White");
        ar_nama_mahasiswa.add("Aurora (Sleeping Beauty)");
        ar_nama_mahasiswa.add("Ariel (The Little Mermaid)");
        ar_nama_mahasiswa.add("Belle (Beauty and the Beast)");
        ar_nama_mahasiswa.add("Jasmine (Aladdin)");
        ar_nama_mahasiswa.add("Pocahontas");
        ar_nama_mahasiswa.add("Mulan");
        ar_nama_mahasiswa.add("Esmeralda");
        ar_nama_mahasiswa.add("Rapunzel (Tangled)");
        ar_nama_mahasiswa.add("Merida (Brave)");
        ar_nama_mahasiswa.add("Anna (Frozen)");
        ar_nama_mahasiswa.add("Clarabelle Cow");
        ar_nama_mahasiswa.add("Alice (Alice in Wonderland)");
        ar_nama_mahasiswa.add("Violet Parr (The Incredibles)");
        ar_nama_mahasiswa.add("Elsa (Frozen)");
        ar_nama_mahasiswa.add("Jane Porter (Tarzan)");
        ar_nama_mahasiswa.add("Tiana (The Princess and the Frog)");
        ar_nama_mahasiswa.add("Edna Mode");

        adapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1, ar_nama_mahasiswa);
        simpleList.setAdapter(adapter);
    }
}