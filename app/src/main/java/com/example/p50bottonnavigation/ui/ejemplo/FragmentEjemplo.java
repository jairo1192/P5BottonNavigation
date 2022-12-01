package com.example.p50bottonnavigation.ui.ejemplo;

import androidx.lifecycle.ViewModelProvider;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.p50bottonnavigation.R;

public class FragmentEjemplo extends Fragment {

    private FragmentEjemploViewModel mViewModel;

    public static FragmentEjemplo newInstance() {
        return new FragmentEjemplo();
    }

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_fragment_ejemplo, container, false);
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        mViewModel = new ViewModelProvider(this).get(FragmentEjemploViewModel.class);
        // TODO: Use the ViewModel
    }

}