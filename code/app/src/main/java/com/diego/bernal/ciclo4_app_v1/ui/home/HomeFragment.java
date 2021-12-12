package com.diego.bernal.ciclo4_app_v1.ui.home;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;

import com.diego.bernal.ciclo4_app_v1.R;
import com.diego.bernal.ciclo4_app_v1.databinding.FragmentHomeBinding;

public class HomeFragment extends Fragment implements View.OnClickListener {

    private HomeViewModel homeViewModel;
    private FragmentHomeBinding binding;

    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        homeViewModel = new ViewModelProvider(this).get(HomeViewModel.class);

        binding = FragmentHomeBinding.inflate(inflater, container, false);
        View root = binding.getRoot();

        binding.imageView.setOnClickListener(this);
        binding.imageView2.setOnClickListener(this);
        binding.imageView3.setOnClickListener(this);
        binding.imageView4.setOnClickListener(this);


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
            case R.id.imageView2:
                Toast.makeText(getContext(),"Lista de categorias",Toast.LENGTH_LONG).show();
                break;
            case R.id.imageView3:
                Toast.makeText(getContext(),"Lista de promociones",Toast.LENGTH_LONG).show();
                break;
            case R.id.imageView4:
                Toast.makeText(getContext(),"Lista de Productos",Toast.LENGTH_LONG).show();
                break;
        }
    }
}