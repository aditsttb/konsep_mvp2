package com.aditya.list_siswa.feature.detail;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import com.aditya.list_siswa.model.Mahasiswa;
import com.aditya.list_siswa.R;

public class DetailActivity extends AppCompatActivity {

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
