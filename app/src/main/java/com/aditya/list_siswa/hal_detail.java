package com.aditya.list_siswa;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import java.util.ArrayList;

public class hal_detail extends AppCompatActivity {

    Mahasiswa mahasiswa;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hal_detail);

        mahasiswa = getIntent().getParcelableExtra("KEY_DATA");

        TextView nama = findViewById(R.id.tx_nama);
        TextView nomor = findViewById(R.id.txt_no);
        TextView npm = findViewById(R.id.tx_npm);

        nama.setText(mahasiswa.getNama());
        nomor.setText(mahasiswa.getNohp());
        npm.setText(mahasiswa.getNpm());


    }
}
