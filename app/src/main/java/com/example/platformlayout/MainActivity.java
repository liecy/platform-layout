package com.example.platformlayout;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.example.platformlayout.Fragment.Fragment1;

public class MainActivity extends AppCompatActivity {

    Button btnSLV, btnCLV, btnCL, btnND, btnFrag;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnSLV = findViewById(R.id.btnSimpleListView);
        btnCLV = findViewById(R.id.btnCustomListView);
        btnCL = findViewById(R.id.btnCoordinatorLayout);
        btnFrag = findViewById(R.id.btnFragment);
        btnND = findViewById(R.id.btnNavigationDrawer);

        btnSLV.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent1 = new Intent(MainActivity.this, SimpleListViewActivity.class);
                startActivity(intent1);
                Toast.makeText(MainActivity.this, "simple list view activity", Toast.LENGTH_SHORT).show();
            }
        });

        btnCLV.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent2 = new Intent(MainActivity.this, CustomListViewActivity.class);
                startActivity(intent2);
                Toast.makeText(MainActivity.this, "custom list view activity", Toast.LENGTH_SHORT).show();
            }
        });

        btnCL.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent3 = new Intent(MainActivity.this, CoordinatorLayoutActivity.class);
                startActivity(intent3);
                Toast.makeText(MainActivity.this, "coordinator layout", Toast.LENGTH_SHORT).show();
            }
        });

        btnFrag.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent4 = new Intent(MainActivity.this, FragmentActivity.class);
                startActivity(intent4);
                Toast.makeText(MainActivity.this, "fragment", Toast.LENGTH_SHORT).show();
            }
        });

        btnND.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent5 = new Intent(MainActivity.this, NavigationDrawerActivity.class);
                startActivity(intent5);
                Toast.makeText(MainActivity.this, "navigation drawer", Toast.LENGTH_SHORT).show();
            }
        });

    }

}