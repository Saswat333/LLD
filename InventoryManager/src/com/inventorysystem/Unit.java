package com.inventorysystem;

class Unit{
    String unitId;
    String productId;
    String locationId;
    Status status;

    public Unit(String unitId, String productId, String locationId, Status status) {
        this.unitId = unitId;
        this.productId = productId;
        this.locationId = locationId;
        this.status = status;
    }
}