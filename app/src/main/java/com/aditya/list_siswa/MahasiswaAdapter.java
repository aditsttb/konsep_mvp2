package com.aditya.list_siswa;

import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class MahasiswaAdapter extends RecyclerView.Adapter <MahasiswaAdapter.MahasiswaViewHolder> {


    private ArrayList <Mahasiswa> dataList;
    public MahasiswaAdapter(ArrayList<Mahasiswa> dataList)
    {
        this.dataList = dataList;
    }



    @Override
    public MahasiswaViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View view = layoutInflater.inflate(R.layout.row_mahasiswa, parent, false);
        return new MahasiswaViewHolder(view);
    }

    @Override
    public void onBindViewHolder(final MahasiswaViewHolder holder, final int position) {
        holder.txtNama.setText(dataList.get(position).getNama());
        holder.txtNpm.setText(dataList.get(position).getNpm());
        holder.txtNoHp.setText(dataList.get(position).getNohp());

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                View itemView = holder.itemView;

                Toast.makeText(itemView.getContext(), "halaman berpindah", Toast.LENGTH_LONG).show();

                Intent myIntent = new Intent(itemView.getContext(), hal_detail.class);
                myIntent.putExtra("KEY_DATA", dataList.get(position));
                itemView.getContext().startActivity(myIntent);



            }
        });
    }


    @Override
    public int getItemCount() {
        return (dataList !=null)? dataList.size():0;

    }

    public class MahasiswaViewHolder extends RecyclerView.ViewHolder{
        private TextView txtNama, txtNpm, txtNoHp;

        public MahasiswaViewHolder(final View itemView){
            super(itemView);
            txtNama = (TextView) itemView.findViewById(R.id.txt_nama_mahasiswa);
            txtNpm = (TextView) itemView.findViewById(R.id.txt_npm_mahasiswa);
            txtNoHp = (TextView) itemView.findViewById(R.id.txt_nohp_mahasiswa);

        }

        private void startActivity(Intent myIntent) {
        }

    }

}
