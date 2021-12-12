package com.diego.bernal.ciclo4_app_v1.ui.home;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;
import androidx.viewbinding.ViewBinding;

import com.diego.bernal.ciclo4_app_v1.R;
import com.diego.bernal.ciclo4_app_v1.databinding.FragmentHomeBinding;

import org.imaginativeworld.whynotimagecarousel.ImageCarousel;
import org.imaginativeworld.whynotimagecarousel.listener.CarouselListener;
import org.imaginativeworld.whynotimagecarousel.model.CarouselItem;
import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class HomeFragment extends Fragment implements View.OnClickListener {

    private HomeViewModel homeViewModel;
    private FragmentHomeBinding binding;

    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        homeViewModel = new ViewModelProvider(this).get(HomeViewModel.class);

        binding = FragmentHomeBinding.inflate(inflater, container, false);
        View root = binding.getRoot();


        binding.imageView2.setOnClickListener(this);
        binding.imageView3.setOnClickListener(this);
        binding.imageView4.setOnClickListener(this);


        ImageCarousel carousel = binding.carousel;
        carousel.registerLifecycle(getLifecycle());
        List<CarouselItem> list = new ArrayList<>();

        list.add(new CarouselItem(R.drawable.comida1));
        list.add(new CarouselItem(R.drawable.comida2));
        list.add(new CarouselItem(R.drawable.comida3));
        list.add(new CarouselItem(R.drawable.comida4));
        list.add(new CarouselItem(R.drawable.comida5));
        list.add(new CarouselItem(R.drawable.comida6));
        list.add(new CarouselItem(R.drawable.comida7));
        list.add(new CarouselItem(R.drawable.comida8));

        carousel.setCarouselListener(new CarouselListener() {
            @Nullable
            @Override
            public ViewBinding onCreateViewHolder(@NonNull LayoutInflater layoutInflater, @NonNull ViewGroup viewGroup) {
                return null;
            }

            @Override
            public void onBindViewHolder(@NonNull ViewBinding viewBinding, @NonNull CarouselItem carouselItem, int i) {

            }





            @Override
            public void onLongClick(int position, @NotNull CarouselItem dataObject) {
                // ...
            }

            @Override
            public void onClick(int position, @NotNull CarouselItem carouselItem) {
                Toast.makeText(getContext(),"Lista de ima",Toast.LENGTH_LONG).show();
            }
        });


        carousel.setData(list);
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