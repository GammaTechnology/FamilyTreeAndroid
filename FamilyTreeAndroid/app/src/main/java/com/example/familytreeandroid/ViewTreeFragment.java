package com.example.familytreeandroid;

import android.content.Intent;
import android.os.Bundle;

import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class ViewTreeFragment extends Fragment {

    public static int check1;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View v = inflater.inflate(R.layout.fragment_view_tree, container, false);

        Button btnI = v.findViewById(R.id.btnI);
        Button btnMama = v.findViewById(R.id.btnMama);
        Button btnDad = v.findViewById(R.id.btnDad);
        Button btnGrandmaM = v.findViewById(R.id.btnGrandmaM);
        Button btnGrandpaM = v.findViewById(R.id.btnGrandpaM);
        Button btnGrandmaD = v.findViewById(R.id.btnGrandmaD);
        Button btnGrandpaD = v.findViewById(R.id.btnGrandpaD);
        Button btnGgfatherMM = v.findViewById(R.id.btnGgfatherMM);
        Button btnGgmotherMM = v.findViewById(R.id.btnGgmotherMM);
        Button btnGgfatherMD = v.findViewById(R.id.btnGgfatherMD);
        Button btnGgmotherMD = v.findViewById(R.id.btnGgmotherMD);
        Button btnGgfatherDM = v.findViewById(R.id.btnGgfatherDM);
        Button btnGgmotherDM = v.findViewById(R.id.btnGgmotherDM);
        Button btnGgfatherDD = v.findViewById(R.id.btnGgfatherDD);
        Button btnGgmotherDD = v.findViewById(R.id.btnGgmotherDD);

        btnI.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                check1 = 0;
                Intent intent = new Intent(getActivity(), ViewInfoTreeActivity.class);
                startActivity(intent);
            }
        });
        btnMama.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                check1 = 1;
                Intent intent = new Intent(getActivity(), ViewInfoTreeActivity.class);
                startActivity(intent);
            }
        });
        btnDad.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                check1 = 2;
                Intent intent = new Intent(getActivity(), ViewInfoTreeActivity.class);
                startActivity(intent);
            }
        });
        btnGrandmaM.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                check1 = 3;
                Intent intent = new Intent(getActivity(), ViewInfoTreeActivity.class);
                startActivity(intent);
            }
        });
        btnGrandpaM.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                check1 = 4;
                Intent intent = new Intent(getActivity(), ViewInfoTreeActivity.class);
                startActivity(intent);
            }
        });
        btnGrandmaD.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                check1 = 5;
                Intent intent = new Intent(getActivity(), ViewInfoTreeActivity.class);
                startActivity(intent);
            }
        });
        btnGrandpaD.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                check1 = 6;
                Intent intent = new Intent(getActivity(), ViewInfoTreeActivity.class);
                startActivity(intent);
            }
        });
        btnGgfatherMM.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                check1 = 7;
                Intent intent = new Intent(getActivity(), ViewInfoTreeActivity.class);
                startActivity(intent);
            }
        });
        btnGgmotherMM.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                check1 = 8;
                Intent intent = new Intent(getActivity(), ViewInfoTreeActivity.class);
                startActivity(intent);
            }
        });
        btnGgfatherMD.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                check1 = 9;
                Intent intent = new Intent(getActivity(), ViewInfoTreeActivity.class);
                startActivity(intent);
            }
        });
        btnGgmotherMD.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                check1 = 10;
                Intent intent = new Intent(getActivity(), ViewInfoTreeActivity.class);
                startActivity(intent);
            }
        });
        btnGgfatherDM.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                check1 = 11;
                Intent intent = new Intent(getActivity(), ViewInfoTreeActivity.class);
                startActivity(intent);
            }
        });
        btnGgmotherDM.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                check1 = 12;
                Intent intent = new Intent(getActivity(), ViewInfoTreeActivity.class);
                startActivity(intent);
            }
        });
        btnGgfatherDD.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                check1 = 13;
                Intent intent = new Intent(getActivity(), ViewInfoTreeActivity.class);
                startActivity(intent);
            }
        });
        btnGgmotherDD.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                check1 = 14;
                Intent intent = new Intent(getActivity(), ViewInfoTreeActivity.class);
                startActivity(intent);
            }
        });
        return v;
    }
}