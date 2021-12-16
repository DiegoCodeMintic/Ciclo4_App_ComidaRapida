package com.diego.bernal.ciclo4_app_v1.ui.home;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.diego.bernal.ciclo4_app_v1.Modelo.Color;
import com.diego.bernal.ciclo4_app_v1.Adaptador.MaterialPaletteAdapter;
import com.diego.bernal.ciclo4_app_v1.R;
import com.diego.bernal.ciclo4_app_v1.Adaptador.RecyclerViewOnItemClickListener;
import com.diego.bernal.ciclo4_app_v1.databinding.FragmentHomeBinding;


import java.util.ArrayList;
import java.util.List;

public class HomeFragment extends Fragment implements View.OnClickListener {

    private HomeViewModel homeViewModel;
    private FragmentHomeBinding binding;

    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        homeViewModel = new ViewModelProvider(this).get(HomeViewModel.class);

        binding = FragmentHomeBinding.inflate(inflater, container, false);
        View root = binding.getRoot();




        binding.imageView4.setOnClickListener(this);





        //NUEVO
        RecyclerView recyclerView = binding.recyclerView;
        final List<Color> colors = buildColors();
        recyclerView.setAdapter(new MaterialPaletteAdapter(colors, new RecyclerViewOnItemClickListener() {
            @Override
            public void onClick(View v, int position) {
                String text = position + " " + colors.get(position).getName();
                Toast.makeText(getContext(), text, Toast.LENGTH_SHORT).show();
            }
        }));
        //VERTICAL
        //recyclerView.setLayoutManager(new LinearLayoutManager(this.getContext()));
        //HORIZONTAL
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext(), LinearLayoutManager.HORIZONTAL, false));

        DividerItemDecoration dividerItemDecoration = new DividerItemDecoration(getContext(),((LinearLayoutManager) recyclerView.getLayoutManager()).getOrientation());
        recyclerView.addItemDecoration(dividerItemDecoration);

        //NUEVO

        //NUEVO
        RecyclerView recyclerView1 = binding.recyclerView1;

        recyclerView1.setAdapter(new MaterialPaletteAdapter(colors, new RecyclerViewOnItemClickListener() {
            @Override
            public void onClick(View v, int position) {
                String text = position + " " + colors.get(position).getName();
                Toast.makeText(getContext(), text, Toast.LENGTH_SHORT).show();
            }
        }));
        //VERTICAL
        //recyclerView.setLayoutManager(new LinearLayoutManager(this.getContext()));
        //HORIZONTAL
        recyclerView1.setLayoutManager(new LinearLayoutManager(getContext(), LinearLayoutManager.HORIZONTAL, false));

        DividerItemDecoration dividerItemDecoration1 = new DividerItemDecoration(getContext(),((LinearLayoutManager) recyclerView1.getLayoutManager()).getOrientation());
        recyclerView1.addItemDecoration(dividerItemDecoration1);

        return root;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.imageView:
                Toast.makeText(getContext(),"Espacio para Carrusel de imagenes",Toast.LENGTH_LONG).show();
                break;


            case R.id.imageView4:
                Toast.makeText(getContext(),"Lista de Productos",Toast.LENGTH_LONG).show();
                break;
        }
    }



    private void setupRecyclerView() {





    }

    private List<Color> buildColors() {
        List<Color> colors = new ArrayList<>();
        colors.add(new Color(getString(R.string.blue), "#2196F3"));
        colors.add(new Color(getString(R.string.blue), "#2196F3"));
        colors.add(new Color(getString(R.string.blue), "#2196F3"));
        colors.add(new Color(getString(R.string.blue), "#2196F3"));
        colors.add(new Color(getString(R.string.blue), "#2196F3"));
        colors.add(new Color(getString(R.string.blue), "#2196F3"));
        return colors;
    }
}