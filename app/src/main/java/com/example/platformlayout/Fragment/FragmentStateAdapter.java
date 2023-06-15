package com.example.platformlayout.Fragment;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;

import java.util.ArrayList;
import java.util.List;

public class FragmentStateAdapter extends FragmentStatePagerAdapter {;
    private final List<Fragment> listFragment = new ArrayList<>();
    private final List<String> titleFragement = new ArrayList<>();
    public FragmentStateAdapter(@NonNull FragmentManager fm) {
        super(fm);
    }

    public void addFragment (Fragment fragment, String title){
        listFragment.add(fragment);
        titleFragement.add(title);
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        return listFragment.get(position);
    }

    @Override
    public int getCount() {
        return 3;
    }
}
