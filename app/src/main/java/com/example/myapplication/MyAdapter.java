package com.example.myapplication;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;

public class MyAdapter extends RecyclerView.Adapter<MyAdapter.MyViewHolder> {

    int enteros[];
    Context ct;

    public MyAdapter(Context context, int n[]) {
        ct = context;
        enteros = n;
    }

    public static class MyViewHolder extends RecyclerView.ViewHolder {

        TextView textNumber;
        public MyViewHolder(View v) {
            super(v);
            textNumber = v.findViewById(R.id.number);
        }
    }

    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(ct);
        View v = inflater.inflate(R.layout.fila_layout, parent, false);
        return new MyViewHolder(v);
    }

    public void onBindViewHolder(MyViewHolder holder, int position) {
        holder.textNumber.setText("" + enteros[position]);
    }

    public int getItemCount() {
        return enteros.length;
    }
}
