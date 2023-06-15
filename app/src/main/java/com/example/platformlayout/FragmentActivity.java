package com.example.platformlayout;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;

import com.example.platformlayout.Fragment.Fragment1;
import com.example.platformlayout.Fragment.Fragment2;
import com.example.platformlayout.Fragment.Fragment3;
import com.example.platformlayout.Fragment.FragmentStateAdapter;

public class FragmentActivity extends AppCompatActivity {
    ViewPager viewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fragment);

        viewPager = findViewById(R.id.viewPager);
        setupViewPager(viewPager);
    }

    private void setupViewPager(ViewPager viewPager) {
        FragmentStateAdapter adapter = new FragmentStateAdapter(getSupportFragmentManager());
        adapter.addFragment(new Fragment1(), "ini f1");
        adapter.addFragment(new Fragment2(), "ini f2");
        adapter.addFragment(new Fragment3(), "ini f3");
        viewPager.setAdapter(adapter);
    }
    public void setPage(int page) {
        viewPager.setCurrentItem(page);
    }
}