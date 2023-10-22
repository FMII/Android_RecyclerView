package com.example.practica_recyclerview.Adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.practica_recyclerview.Models.JujutsuKaisen;
import com.example.practica_recyclerview.R;

import java.util.List;

public class JujutsuKaisenAdapter extends RecyclerView.Adapter<JujutsuKaisenAdapter.ViewHolder> {
    private List<JujutsuKaisen> JK;
    public JujutsuKaisenAdapter(List<JujutsuKaisen> JK) {

        this.JK = JK;
    }

    @NonNull
    @Override
    public JujutsuKaisenAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View v = layoutInflater.inflate(R.layout.jkitem, parent, false);

        return new ViewHolder(v); //constructor
    }

    @Override
    public void onBindViewHolder(@NonNull JujutsuKaisenAdapter.ViewHolder holder, int position) {
        JujutsuKaisen J = JK.get(position);
        holder.setData(J);
    }

    @Override
    public int getItemCount() {
        return JK.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        TextView txtNombre, txtEdad, txtTecnica, txtEspecie;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            txtNombre = itemView.findViewById(R.id.tvpersonaje);
            txtEdad = itemView.findViewById(R.id.tvedad);
            txtTecnica = itemView.findViewById(R.id.tvTecnica);
            txtEspecie = itemView.findViewById(R.id.tvEspecie);
        }

        public void setData(JujutsuKaisen j) {
            txtNombre.setText(j.getPersonaje());
            txtEdad.setText(j.getEdad());
            txtTecnica.setText(j.getHabilidades().gettecnica());
            txtEspecie.setText(j.getEspecie().getTipo());
        }
    }
}
