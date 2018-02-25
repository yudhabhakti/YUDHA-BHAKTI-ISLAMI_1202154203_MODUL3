package com.example.asus.yudhabhaktiislami_1202154203_modul3;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class MenuAdapter extends RecyclerView.Adapter<MenuAdapter.MineralViewHolder>{
    //inisiasi variable
    public ArrayList<ItemMenu> data;
    //agar data yang ditampung dapat dipanggil dan digunakan
    public MenuAdapter(ArrayList<ItemMenu> data) {
        this.data = data;


        Log.d("JUMLAH_ARRAYLIST","Items: "+getItemCount());
    }

    @Override   //memanggail item menu agar dapat digunakan
    public MineralViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View view = layoutInflater.inflate(R.layout.activity_item_menu, parent, false);
        return new MineralViewHolder(view);
    }

    @Override
    public void onBindViewHolder(MineralViewHolder holder, int position) {
        final  ItemMenu item = data.get(position);
        holder.bindTo(item);
        //Agar nama deskripsi dan gambar dapat ditampilkan sesuai yang dipilih pada daftar menu
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent go = new Intent(view.getContext().getApplicationContext(),DetailAirMineral.class);
                go.putExtra("etitle",item.getJudul());
                go.putExtra("edesc",item.getDetail());
                go.putExtra("eimg",item.getGambar());
                view.getContext().startActivity(go);
            }
        });
    }

    @Override
    public int getItemCount() {
        return data.size();
    }

    class MineralViewHolder extends RecyclerView.ViewHolder{

        // menginisiasikan variable
        private TextView mMineralJudul;
        private TextView mMineralInfo;
        private ImageView mMineralImg;
        private Context mContext;
        private ItemMenu mCurrentMineral;

        public MineralViewHolder(View itemView) {
            super(itemView);
            //memanggil id yang akan ditampilkan
            mMineralJudul = (TextView)itemView.findViewById(R.id.itemjudul);
            mMineralInfo = (TextView)itemView.findViewById(R.id.itemDeskripsi);
            mMineralImg = (ImageView)itemView.findViewById(R.id.itemMenu);
        }

        public void bindTo(ItemMenu mineral){
            //mengirimkan informasi agar ditangkap oleh MinumanItem
            mCurrentMineral = mineral;
            mMineralImg.setImageResource(mineral.getGambar());
            mMineralJudul.setText(mineral.getJudul());
            mMineralInfo.setText(mineral.getInfo());
        }
    }
}