package com.example.prueba11.Adaptadores;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;


import com.example.prueba11.Contacto;
import com.example.prueba11.R;

import java.util.List;

public class AdaptadorMascotaFavorita extends RecyclerView.Adapter<AdaptadorMascotaFavorita.MascotaFavViewHolder> {

    Context mContext;
    List<Contacto> mascotas;

    public AdaptadorMascotaFavorita(Context mContext, List<Contacto> mascotas ) {
        this.mContext = mContext;
        this.mascotas= mascotas;
    }

    @NonNull
    @Override
    public MascotaFavViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(mContext).inflate(R.layout.cardview_favmascotas,parent,false);
        MascotaFavViewHolder vHolder = new MascotaFavViewHolder(v);

        return vHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull MascotaFavViewHolder holder, int position) {
        final Contacto mascota = mascotas.get(position);
        holder.TextNombreM.setText(mascota.getNombre());
        holder.ImgFotoM.setImageResource(mascota.getFoto());


    }

    @Override
    public int getItemCount(){
        return mascotas.size();

    }


    public class MascotaFavViewHolder extends RecyclerView.ViewHolder {


        private ImageView ImgFotoM;
        private TextView TextNombreM;



        public MascotaFavViewHolder(@NonNull View itemView) {
            super(itemView);
            ImgFotoM     = (ImageView) itemView.findViewById(R.id.ImgFotoM);
            TextNombreM  = (TextView) itemView.findViewById(R.id.TexTNombreM);


        }
    }
}
