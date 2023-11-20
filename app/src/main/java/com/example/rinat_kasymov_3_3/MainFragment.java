package com.example.rinat_kasymov_3_3;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;



public class MainFragment extends Fragment {

    private RecyclerView rvFilm;
    private ArrayList<String> filmList = new ArrayList<>();

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_main, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState){
        super.onViewCreated(view, savedInstanceState);
        initView(view);
        loadData();
        initAdapter();
    }

    private void initView(View view) {
        rvFilm = view.findViewById(R.id.rv_films);
        rvFilm.setLayoutManager(new LinearLayoutManager(requireContext()));
    }

    private void initAdapter() {
        FilmAdapter filmAdapter = new FilmAdapter(filmList);
        rvFilm.setAdapter(filmAdapter);
    }

    private void loadData() {

        filmList.add("Семь");
        filmList.add("Молчание ягнят");
        filmList.add("Убить Билла");
        filmList.add("Джанго освобожденный");
        filmList.add("Довод");
        filmList.add("Интерстеллар ");
        filmList.add("Крестный лтнц");
        filmList.add("Пленницы");
        filmList.add("Шоу Трумана");
    }
}