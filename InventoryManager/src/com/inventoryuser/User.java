package com.inventoryuser;

import com.inventorysystem.InventorySystem;
import com.inventorysystem.Product;
import com.inventorysystem.Size;

import java.util.Map;

public class User {
    public void addProduct(){
        InventorySystem system = new InventorySystem();
        system.addProduct(new Product("123",100.0d,"abc", 34.12, Size.L));
    }

    public void executeOrder(Order order){
        InventorySystem system = new InventorySystem();
        for(Map.Entry<Product, Integer> item: order.productCount.entrySet()){
            // have to remove each item from product list and location
            for(int i=0;i<item.getValue(); i++){
                system.removeUnit(item.getKey());
            }
        }
    }
}
