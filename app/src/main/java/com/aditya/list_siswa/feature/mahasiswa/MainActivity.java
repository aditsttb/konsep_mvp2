package com.aditya.list_siswa.feature.mahasiswa;


import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.aditya.list_siswa.feature.detail.DetailActivity;
import com.aditya.list_siswa.model.Mahasiswa;
import com.aditya.list_siswa.R;

import java.util.List;


public class MainActivity extends AppCompatActivity implements MahasiswaContract.View {

    MahasiswaContract.Presenter presenter;

    private RecyclerView recyclerView;
    private MahasiswaAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        presenter = new MahasiswaPresenter(this);
        presenter.start();
    }

    public void onClick(View view) {
        Intent intent = new Intent(MainActivity.this, DetailActivity.class);
        startActivity(intent);
    }

    @Override
    public void setItemToView(List<Mahasiswa> list) {
        recyclerView = findViewById(R.id.recycler_view);
        adapter = new MahasiswaAdapter(list);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(MainActivity.this);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setAdapter(adapter);
    }

    @Override
    public void setPresenter(MahasiswaContract.Presenter presenter) {
        this.presenter = presenter;
    }
}
