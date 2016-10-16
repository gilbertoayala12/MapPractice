package com.example.gilberto.googlemapsrecyclerview;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

/**
 * Created by Gilberto on 15/10/2016.
 */

public class PlaceListAdapter extends RecyclerView.Adapter<PlaceListAdapter.ViewHolder> {

    private List<Place> mPlaceList;
    private ListClickElement mListClickElement;
    PlaceListAdapter(List<Place> placeList, ListClickElement listClickElement){
        mListClickElement = listClickElement;
        mPlaceList = placeList;
    }


    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.place_info_row, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {

        final Place place = mPlaceList.get(position);
        double latitud = place.getLatitud();
        double longitud = place.getLongitud();
        String name = place.getName() ;
        holder.titleTextView.setText(name);
        holder.latLong.setText("longitud es: "+ longitud + " "+ "latitud es: "+ latitud);
        holder.titleTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mListClickElement.onItemClick(place);
            }
        });
    }

    @Override
    public int getItemCount() {
        return mPlaceList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        TextView titleTextView;
        TextView latLong;
        public ViewHolder(View itemView) {
            super(itemView);
            titleTextView = (TextView) itemView.findViewById(R.id.place_title);
            latLong = (TextView) itemView.findViewById(R.id.longLat);

        }

    }
}
