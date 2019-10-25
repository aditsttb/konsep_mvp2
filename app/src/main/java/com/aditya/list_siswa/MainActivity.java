package com.aditya.list_siswa;


import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;


public class MainActivity extends AppCompatActivity {


    private RecyclerView recyclerView;
    private MahasiswaAdapter adapter;
    private ArrayList<Mahasiswa> mahasiswaArrayList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        addData();

        recyclerView = (RecyclerView) findViewById(R.id.recycler_view);

        adapter = new MahasiswaAdapter(mahasiswaArrayList);

        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(MainActivity.this);

        recyclerView.setLayoutManager(layoutManager);

        recyclerView.setAdapter(adapter);
    }

    void addData(){

        mahasiswaArrayList = new ArrayList<>();
        mahasiswaArrayList.add(new Mahasiswa("Nama : Aditya Permana", "NPM : 16111156", "no : 08987181123"));
        mahasiswaArrayList.add(new Mahasiswa("Nama : Aldi", "NPM : 161111234", "no : 081223344817"));
        mahasiswaArrayList.add(new Mahasiswa("Nama : Bintang", "NPM : 16111267", "no : 082377834278"));
        mahasiswaArrayList.add(new Mahasiswa("Nama : Rafa", "NPM : 161156632", "no : 0852244118"));


    }

    public void onClick(View view) {
        Intent intent = new Intent(MainActivity.this, hal_detail.class);

        startActivity(intent);
    }

}
