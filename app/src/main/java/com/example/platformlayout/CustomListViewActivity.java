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

        Konten konten1 = new Konten(R.drawable.img01, "10/03/2023", "Anna of Arendelle", getResources().getString(R.string.loremipsum));
        Konten konten2 = new Konten(R.drawable.img02, "11/03/2023", "Moana Waialiki", getResources().getString(R.string.loremipsum));
        Konten konten3 = new Konten(R.drawable.img03, "12/03/2023", "Cinderella", getResources().getString(R.string.loremipsum));
        Konten konten4 = new Konten(R.drawable.img04, "13/03/2023", "Belle", getResources().getString(R.string.loremipsum));
        Konten konten5 = new Konten(R.drawable.img05, "14/03/2023", "Vanellope von Schweetz", getResources().getString(R.string.loremipsum));
        Konten konten6 = new Konten(R.drawable.img06, "15/03/2023", "Rapunzel", getResources().getString(R.string.loremipsum));
        Konten konten7 = new Konten(R.drawable.img07, "16/03/2023", "Princess Aurora", getResources().getString(R.string.loremipsum));
        Konten konten8 = new Konten(R.drawable.img08, "17/03/2023", "Queen Ariel", getResources().getString(R.string.loremipsum));

        listKonten.add(konten1);
        listKonten.add(konten2);
        listKonten.add(konten3);
        listKonten.add(konten4);
        listKonten.add(konten5);
        listKonten.add(konten6);
        listKonten.add(konten7);
        listKonten.add(konten8);

        CustomAdapter adapter = new CustomAdapter(this, R.layout.single_list_item, listKonten);
        customListView.setAdapter(adapter);
    }
}