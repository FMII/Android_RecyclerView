package com.example.practica_recyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.practica_recyclerview.Adapter.JujutsuKaisenAdapter;
import com.example.practica_recyclerview.Models.Anime;
import com.example.practica_recyclerview.Models.Especie;
import com.example.practica_recyclerview.Models.Habilidades;
import com.example.practica_recyclerview.Models.JujutsuKaisen;

import java.util.ArrayList;
import java.util.List;

public class MainMain extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_main);
        List<JujutsuKaisen> JK = new ArrayList<>();
        JK.add(new JujutsuKaisen("Nanami", "28", new Habilidades("Manejo del infinito"), new Especie("humano")));
        JK.add(new JujutsuKaisen("Gojo", "28", new Habilidades("Maldicion ilimitada"), new Especie("humano")));
        JK.add(new JujutsuKaisen("Yuta", "17", new Habilidades("Técnica de Mimetismo"), new Especie("humano")));
        JK.add(new JujutsuKaisen("Choso", "150", new Habilidades("Técnica Cosecha, Contracción y Supernova"), new Especie("Híbrido")));
        JK.add(new JujutsuKaisen("Sukuna", "+1000", new Habilidades("Técnica maldita de curación"), new Especie("Espiritu Maldito")));

        JujutsuKaisenAdapter JKA = new JujutsuKaisenAdapter(JK);
        RecyclerView rv = (RecyclerView) findViewById(R.id.rvJK);
        rv.setAdapter(JKA);
        rv.setLayoutManager(new LinearLayoutManager(this));
        rv.setHasFixedSize(true);
    }
}