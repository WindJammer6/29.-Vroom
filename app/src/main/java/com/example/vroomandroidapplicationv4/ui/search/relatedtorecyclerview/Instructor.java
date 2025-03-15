package com.example.vroomandroidapplicationv4.ui.search.relatedtorecyclerview;

import com.prolificinteractive.materialcalendarview.CalendarDay;

import java.util.List;

public class Instructor {
    private String name, shortDescription, fullDescription, price, vehicleClass, address, drivingCenter;
    private double rating;
    private int imageResId; // Profile image resource ID
    private List<CalendarDay> datesUnavailable; // Now stores CalendarDay objects directly

    public Instructor(String name, String shortDescription, String fullDescription, String price, double rating, int imageResId, String vehicleClass, String address, String drivingCenter, List<CalendarDay> datesUnavailable) {
        this.name = name;
        this.shortDescription = shortDescription;
        this.fullDescription = fullDescription;
        this.price = price;
        this.rating = rating;
        this.imageResId = imageResId;
        this.vehicleClass = vehicleClass;
        this.address = address;
        this.drivingCenter = drivingCenter;
        this.datesUnavailable = datesUnavailable;
    }

    public String getName() { return name; }
    public String getShortDescription() { return shortDescription; }
    public String getFullDescription() { return fullDescription; }
    public String getPrice() { return price; }
    public double getRating() { return rating; }
    public int getImageResId() { return imageResId; }
    public String getVehicleClass() { return vehicleClass; }
    public String getAddress() { return address; }
    public String getDrivingCenter() { return drivingCenter; }
    public List<CalendarDay> getDatesUnavailable() { return datesUnavailable; }
}

