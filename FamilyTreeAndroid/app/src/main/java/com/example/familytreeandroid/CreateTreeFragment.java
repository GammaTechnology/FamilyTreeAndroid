package com.example.familytreeandroid;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class CreateTreeFragment extends Fragment {

    public static int check;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View v = inflater.inflate(R.layout.fragment_create_tree, container, false);

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
                Intent intent = new Intent(getActivity(), ReadInfoTreeActivity.class);
                startActivity(intent);
                check = 0;
            }
        });
        btnMama.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity(), ReadInfoTreeActivity.class);
                startActivity(intent);
                check = 1;
            }
        });
        btnDad.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity(), ReadInfoTreeActivity.class);
                startActivity(intent);
                check = 2;
            }
        });
        btnGrandmaM.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity(), ReadInfoTreeActivity.class);
                startActivity(intent);
                check = 3;
            }
        });
        btnGrandpaM.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity(), ReadInfoTreeActivity.class);
                startActivity(intent);
                check = 4;
            }
        });
        btnGrandmaD.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity(), ReadInfoTreeActivity.class);
                startActivity(intent);
                check = 5;
            }
        });
        btnGrandpaD.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity(), ReadInfoTreeActivity.class);
                startActivity(intent);
                check = 6;
            }
        });
        btnGgfatherMM.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity(), ReadInfoTreeActivity.class);
                startActivity(intent);
                check = 7;
            }
        });
        btnGgmotherMM.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity(), ReadInfoTreeActivity.class);
                startActivity(intent);
                check = 8;
            }
        });
        btnGgfatherMD.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity(), ReadInfoTreeActivity.class);
                startActivity(intent);
                check = 9;
            }
        });
        btnGgmotherMD.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity(), ReadInfoTreeActivity.class);
                startActivity(intent);
                check = 10;
            }
        });
        btnGgfatherDM.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity(), ReadInfoTreeActivity.class);
                startActivity(intent);
                check = 11;
            }
        });
        btnGgmotherDM.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity(), ReadInfoTreeActivity.class);
                startActivity(intent);
                check = 12;
            }
        });
        btnGgfatherDD.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity(), ReadInfoTreeActivity.class);
                startActivity(intent);
                check = 13;
            }
        });
        btnGgmotherDD.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity(), ReadInfoTreeActivity.class);
                startActivity(intent);
                check = 14;
            }
        });
        return v;
    }
}