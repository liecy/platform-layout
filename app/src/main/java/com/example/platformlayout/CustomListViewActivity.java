package com.example.platformlayout;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class CustomListViewActivity extends AppCompatActivity {

    ListView customListView;
    List listKonten  = new ArrayList();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_custom_list_view);

        customListView = findViewById(R.id.customListView);

        Konten konten1 = new Konten(R.drawable.img1, "10/03/2023", "Rahmi Anisa", getResources().getString(R.string.loremipsum));
        Konten konten2 = new Konten(R.drawable.img1, "11/03/2023", "Rahmi Anisa", getResources().getString(R.string.loremipsum));
        Konten konten3 = new Konten(R.drawable.img1, "12/03/2023", "Rahmi Anisa", getResources().getString(R.string.loremipsum));
        Konten konten4 = new Konten(R.drawable.img1, "13/03/2023", "Rahmi Anisa", getResources().getString(R.string.loremipsum));
        Konten konten5 = new Konten(R.drawable.img1, "14/03/2023", "Rahmi Anisa", getResources().getString(R.string.loremipsum));

        listKonten.add(konten1);
        listKonten.add(konten2);
        listKonten.add(konten3);
        listKonten.add(konten4);
        listKonten.add(konten5);

        CustomAdapter adapter = new CustomAdapter(this, R.layout.single_list_item, listKonten);
        customListView.setAdapter(adapter);
    }
}