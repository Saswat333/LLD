package com.inventorysystem;

public class Location{
    String locationId;
    Size locationSize;

    public Location(String locationId, Size locationSize) {
        this.locationId = locationId;
        this.locationSize = locationSize;
    }
}