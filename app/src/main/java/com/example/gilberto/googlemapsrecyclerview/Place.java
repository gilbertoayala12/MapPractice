package com.example.gilberto.googlemapsrecyclerview;

import android.os.Parcel;
import android.os.Parcelable;

import com.google.gson.annotations.SerializedName;

/**
 * Created by Gilberto on 15/10/2016.
 */
public class Place implements Parcelable{
    @SerializedName("name")
    private String name;
    @SerializedName("long")
    private double longitud;
    @SerializedName("lat")
    private double latitud;
    @SerializedName("image_url")
    private String imageUrl;
    @SerializedName("ranking")
    private int ranking;


    public int getRanking() {
        return ranking;
    }

    public void setRanking(int ranking) {
        this.ranking = ranking;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

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
