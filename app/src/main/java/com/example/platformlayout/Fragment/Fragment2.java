package com.example.platformlayout.Fragment;

import androidx.fragment.app.Fragment;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import com.example.platformlayout.FragmentActivity;
import com.example.platformlayout.MainActivity;
import com.example.platformlayout.R;

public class Fragment2 extends Fragment {

    Button btnFrag1, btnFrag2, btnFrag3, btnMainActivity;
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment2_layout, container, false);

        btnFrag1 = v.findViewById(R.id.btnKeFragment1);
        btnFrag2 = v.findViewById(R.id.btnKeFragment2);
        btnFrag3 = v.findViewById(R.id.btnKeFragment3);
        btnMainActivity = v.findViewById(R.id.btnKeMainActivity);

        btnFrag1.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View view) {
                Toast.makeText(getActivity(), "Pindah ke fragment 1", Toast.LENGTH_SHORT).show();
                ((FragmentActivity)getActivity()).setPage(0);
            }
        });

        btnFrag2.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View view) {
                Toast.makeText(getActivity(), "Pindah ke fragment 2", Toast.LENGTH_SHORT).show();
                ((FragmentActivity)getActivity()).setPage(1);
            }
        });

        btnFrag3.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View view) {
                Toast.makeText(getActivity(), "Pindah ke fragment 3", Toast.LENGTH_SHORT).show();
                ((FragmentActivity)getActivity()).setPage(2);
            }
        });

        btnMainActivity.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View view) {
                Toast.makeText(getActivity(), "Pindah ke main activity", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(getActivity(), MainActivity.class);
                startActivity(intent);
                getActivity().finish();
            }
        });
        return v;
    }
}
