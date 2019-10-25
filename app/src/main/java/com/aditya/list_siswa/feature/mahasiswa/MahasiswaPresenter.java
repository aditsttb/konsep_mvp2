package com.aditya.list_siswa.feature.mahasiswa;

import com.aditya.list_siswa.model.Mahasiswa;

import java.util.ArrayList;

public class MahasiswaPresenter implements MahasiswaContract.Presenter{

    private MahasiswaContract.View view;

    public MahasiswaPresenter(MahasiswaContract.View view) {
        this.view = view;
        this.view.setPresenter(this);
    }

    @Override
    public void loadData() {
        ArrayList<Mahasiswa> mahasiswaArrayList;
        mahasiswaArrayList = new ArrayList<>();
        mahasiswaArrayList.add(new Mahasiswa("Nama : Aditya Permana", "NPM : 16111156", "no : 08987181123"));
        mahasiswaArrayList.add(new Mahasiswa("Nama : Aldi", "NPM : 161111234", "no : 081223344817"));
        mahasiswaArrayList.add(new Mahasiswa("Nama : Bintang", "NPM : 16111267", "no : 082377834278"));
        mahasiswaArrayList.add(new Mahasiswa("Nama : Rafa", "NPM : 161156632", "no : 0852244118"));
        view.setItemToView(mahasiswaArrayList);
    }

    @Override
    public void start() {
        loadData();
    }
}
