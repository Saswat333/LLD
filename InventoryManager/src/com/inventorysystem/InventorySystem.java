package com.inventorysystem;

import java.util.HashMap;
import java.util.Map;

public class InventorySystem {
    //Map : ProductId and Product object
    Map<String, Product> product_list = new HashMap<>();
    //Map: LocationObject and unit
    Map<Location, Unit> locationMap = new HashMap<>();

    // add product
    public void addProduct(Product product){
        product_list.put(product.productId,product);
    }


    public Product getProduct(String productId){
        //hardcoded product
        Product prod = new Product("1",12.0,"abc",20,Size.L);
        return prod;
    }

    public void placeUnit(Unit unit){
        //use algorithm to check which is best place to store the product
        // but for now iterate over the location map and place the object inside the location if empty
        for(Map.Entry<Location, Unit> entry: locationMap.entrySet()){
            // check if the location size is big enough: done by the algorithm
            //get lock on the entry.getKey()
            if (entry.getValue() == null){
                unit.locationId = entry.getKey().locationId;
            }
            //release lock
        }
    }

    public void removeUnit(Product product){
        //implement an algorithm
        //as of now we can iterate over all location and
        for(Map.Entry<Location, Unit> entry: locationMap.entrySet()){
            // check if the location size is big enough: done by the algorithm
            //get lock on the entry.getKey()
            if (entry.getValue() != null && product.productId == entry.getValue().productId){
                //remove unit
                locationMap.remove(entry.getKey());
            }
            //release lock
        }
    }

    public Map<Location, Unit> getShelveStatus(){
        Map<Location, Unit> unitStatus = new HashMap<>();
        unitStatus.put(new Location("A12",Size.M), new Unit("12","123","a12", Status.INVENTORY));
        return unitStatus;
    }

    public String getUnitLocation(){
        //call the getter in unitLocation map
        return "123";
    }

    public void updateStatusOfUnit(Unit unit, Status currentStatus){
        //updates the unit current status
        unit.status = currentStatus;
    }
}