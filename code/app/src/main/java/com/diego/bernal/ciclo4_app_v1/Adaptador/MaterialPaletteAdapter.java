package com.diego.bernal.ciclo4_app_v1.Adaptador;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.diego.bernal.ciclo4_app_v1.Modelo.Color;
import com.diego.bernal.ciclo4_app_v1.R;

import java.util.List;

/**
 * @author danielme.com
 */
public class MaterialPaletteAdapter extends RecyclerView.Adapter<PaletteViewHolder> {
  private final List<Color> data;
  private final RecyclerViewOnItemClickListener recyclerViewOnItemClickListener;

  public MaterialPaletteAdapter(@NonNull List<Color> data,
                                @NonNull RecyclerViewOnItemClickListener
                                        recyclerViewOnItemClickListener) {
    this.data = data;
    this.recyclerViewOnItemClickListener = recyclerViewOnItemClickListener;
  }

  @Override
  @NonNull
  public PaletteViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
    View row = LayoutInflater.from(parent.getContext()).inflate(R.layout.row, parent, false);
    return new PaletteViewHolder(row, recyclerViewOnItemClickListener);
  }

  @Override
  public void onBindViewHolder(PaletteViewHolder holder, int position) {
    holder.bindRow(data.get(position));
  }

  @Override
  public int getItemCount() {
    return data.size();
  }


}

