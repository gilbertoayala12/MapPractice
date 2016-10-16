package com.example.gilberto.googlemapsrecyclerview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class PlaceListActivity extends AppCompatActivity implements ListClickElement {
    RecyclerView mPlaceListRecyclerView;
    private LinearLayoutManager mLayoutManager;
    private PlaceListAdapter mAdapter;
    private List<Place> mPlaceList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_place_list);

        mPlaceListRecyclerView  = (RecyclerView) findViewById(R.id.Recycler);
        mLayoutManager = new LinearLayoutManager(this);
        mPlaceListRecyclerView.setLayoutManager(mLayoutManager);
        generatePlaceList();

        mAdapter = new PlaceListAdapter(mPlaceList, this);
        mPlaceListRecyclerView.setAdapter(mAdapter);


    }

    private void generatePlaceList() {
        mPlaceList = new ArrayList<>();


            mPlaceList.add(new Place("Nirsoootf ", 29.097437, -111.022033));
        mPlaceList.add(new Place("Restaurante chidori ", 25, 50));
        mPlaceList.add(new Place("Vende cosas shilas ", 65, 34));
        mPlaceList.add(new Place("Vende Catsup ", 144, 69));
        mPlaceList.add(new Place("Vende botas ", 35, 299));
        mPlaceList.add(new Place("Vente queso ", 142, 234));

    }

    @Override
    public void onItemClick(Place place) {
        MapsActivity.start(this, place);
    }
}
