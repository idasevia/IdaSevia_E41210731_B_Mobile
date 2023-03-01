package net.androku.databindingmvvm;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
//import android.support.v7.widget.LinearLayoutManager;
//import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

public class
MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private MahasiswaAdapter adapter;
    private ArrayList<Mahasiswa> mahasiswaArrayList;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        addData();

        recyclerView = (RecyclerView) findViewById(R.id.recycler_view
        );
        adapter = new MahasiswaAdapter(mahasiswaArrayList);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(MainActivity.this);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setAdapter(adapter);
    }

    void addData(){
        mahasiswaArrayList = new ArrayList<>();
        mahasiswaArrayList.add(new Mahasiswa("Masayu Pratitis", "1414370309", "123456789"));
        mahasiswaArrayList.add(new Mahasiswa("Duwi Wirda", "1214234560", "987654321"));
        mahasiswaArrayList.add(new Mahasiswa("Ida Sevia", "1214230345", "987648765"));
        mahasiswaArrayList.add(new Mahasiswa("Citra Fionita", "1214378098", "098758124"));
        mahasiswaArrayList.add(new Mahasiswa("Fransisca Ani", "1210912035", "980028765"));
        mahasiswaArrayList.add(new Mahasiswa("Della Monica", "1216573889", "098988765"));
        mahasiswaArrayList.add(new Mahasiswa("Leo Adi", "1214230212", "987611165"));
        mahasiswaArrayList.add(new Mahasiswa("Aprilia Adila", "1214378445", "096508124"));
        mahasiswaArrayList.add(new Mahasiswa("Adinda", "1894230345", "087648765"));
        mahasiswaArrayList.add(new Mahasiswa("Aristo Kai", "1109378098", "088758124"));
    }
}