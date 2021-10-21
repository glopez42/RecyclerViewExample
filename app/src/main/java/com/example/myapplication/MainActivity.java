package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //para generar los enteros
        int numeros[] = new int[1000];
        for (int i = 0; i < numeros.length; i++)
            numeros[i]=i;

        RecyclerView recyclerView = findViewById(R.id.rec_View);

        MyAdapter myAdapter = new MyAdapter(this, numeros);
        recyclerView.setAdapter(myAdapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

    }
}