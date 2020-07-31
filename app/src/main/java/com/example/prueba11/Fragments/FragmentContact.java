package com.example.prueba11.Fragments;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.prueba11.Adaptadores.AdaptadorMascotaFavorita;
import com.example.prueba11.Contacto;
import com.example.prueba11.R;

import java.util.ArrayList;
import java.util.List;


public class FragmentContact extends Fragment {

    private RecyclerView myrecyclerview;
    private List<Contacto> contactoList;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View v =  inflater.inflate(R.layout.mascota_fragment, container, false);
        myrecyclerview = (RecyclerView) v.findViewById(R.id.contact_recyclerview);
        AdaptadorMascotaFavorita MascotaAdaptador= new AdaptadorMascotaFavorita(getContext(),contactoList);
        myrecyclerview.setLayoutManager(new LinearLayoutManager(getActivity()));
        myrecyclerview.setAdapter(MascotaAdaptador);
        return v;
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        contactoList= new ArrayList<>();
        contactoList.add(new Contacto("TORPE",R.drawable.gato));
        contactoList.add(new Contacto("mencito",R.drawable.perro));
        contactoList.add(new Contacto("TORPE",R.drawable.gato));
        contactoList.add(new Contacto("mencito",R.drawable.perro));







    }
}