package com.aditya.list_siswa.feature.mahasiswa;

import com.aditya.list_siswa.model.Mahasiswa;
import com.aditya.list_siswa.base.BasePresenter;
import com.aditya.list_siswa.base.BaseView;

import java.util.List;

public class MahasiswaContract {
    interface View extends BaseView<Presenter> {
        void setItemToView(List<Mahasiswa> list);
    }

    interface Presenter extends BasePresenter {
        void loadData();
    }
}
