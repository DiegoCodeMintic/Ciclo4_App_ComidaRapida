package com.diego.bernal.ciclo4_app_v1.ui.gallery;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;

import com.diego.bernal.ciclo4_app_v1.R;
import com.diego.bernal.ciclo4_app_v1.databinding.FragmentContactoBinding;


public class GalleryFragment extends Fragment {

    private GalleryViewModel galleryViewModel;
    private FragmentContactoBinding binding;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        galleryViewModel =
                new ViewModelProvider(this).get(GalleryViewModel.class);

        binding = FragmentContactoBinding.inflate(inflater, container, false);
        View root = binding.getRoot();

        final TextView textView = binding.textView6;

        return root;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}