package com.example.gilberto.googlemapsrecyclerview;

import android.os.Parcel;
import android.os.Parcelable;

/**
 * Created by Gilberto on 15/10/2016.
 */
public class Place implements Parcelable{
    private String name;
    private double longitud;
    private double latitud;

    public Place(String name, double longitud, double latitud) {
        this.name = name;
        this.longitud = longitud;
        this.latitud = latitud;
    }

    protected Place(Parcel in) {
        name = in.readString();
        longitud = in.readDouble();
        latitud = in.readDouble();
    }

    public static final Creator<Place> CREATOR = new Creator<Place>() {
        @Override
        public Place createFromParcel(Parcel in) {
            return new Place(in);
        }

        @Override
        public Place[] newArray(int size) {
            return new Place[size];
        }
    };

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getLongitud() {
        return longitud;
    }

    public void setLongitud(double longitud) {
        this.longitud = longitud;
    }

    public double getLatitud() {
        return latitud;
    }

    public void setLatitud(double latitud) {
        this.latitud = latitud;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(name);
        dest.writeDouble(longitud);
        dest.writeDouble(latitud);
    }
}
