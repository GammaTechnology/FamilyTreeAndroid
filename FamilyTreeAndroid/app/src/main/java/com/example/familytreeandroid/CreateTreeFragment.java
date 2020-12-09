package com.example.familytreeandroid;

import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

public class CreateTreeFragment extends Fragment {

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
                Intent intent = new Intent(getActivity(), ReadInfoTreeActivity.class);
                startActivity(intent);
            }
        });
        btnMama.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity(), ReadInfoTreeActivity.class);
                startActivity(intent);
            }
        });
        btnDad.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity(), ReadInfoTreeActivity.class);
                startActivity(intent);
            }
        });
        btnGrandmaM.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity(), ReadInfoTreeActivity.class);
                startActivity(intent);
            }
        });
        btnGrandpaM.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity(), ReadInfoTreeActivity.class);
                startActivity(intent);
            }
        });
        btnGrandmaD.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity(), ReadInfoTreeActivity.class);
                startActivity(intent);
            }
        });
        btnGrandpaD.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity(), ReadInfoTreeActivity.class);
                startActivity(intent);
            }
        });
        btnGgfatherMM.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity(), ReadInfoTreeActivity.class);
                startActivity(intent);
            }
        });
        btnGgmotherMM.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity(), ReadInfoTreeActivity.class);
                startActivity(intent);
            }
        });
        btnGgfatherMD.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity(), ReadInfoTreeActivity.class);
                startActivity(intent);
            }
        });
        btnGgmotherMD.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity(), ReadInfoTreeActivity.class);
                startActivity(intent);
            }
        });
        btnGgfatherDM.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity(), ReadInfoTreeActivity.class);
                startActivity(intent);
            }
        });
        btnGgmotherDM.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity(), ReadInfoTreeActivity.class);
                startActivity(intent);
            }
        });
        btnGgfatherDD.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity(), ReadInfoTreeActivity.class);
                startActivity(intent);
            }
        });
        btnGgmotherDD.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity(), ReadInfoTreeActivity.class);
                startActivity(intent);
            }
        });
        return v;
    }
}