package com.app.recicladorsimple;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.sql.Array;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ArrayList<String> listaDatos;//datos con los que se construirá el reciclador
    RecyclerView recycler;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //obtuve el reciclador
        recycler = (RecyclerView) findViewById(R.id.recicladorId);
        //como quiero mostrarlo
        //recycler.setLayoutManager(new LinearLayoutManager(this,LinearLayoutManager.HORIZONTAL,false));
        recycler.setLayoutManager(new GridLayoutManager(this,3));

        listaDatos= new ArrayList<String>();

        //simular el llenado de datos
        for(int i=0; i<=60;i++){
            listaDatos.add("Mi Dato #"+i+"");

        }

        //utilizamos el adaptador

        Adaptador adapter= new Adaptador(listaDatos);
        recycler.setAdapter(adapter);

    }
}