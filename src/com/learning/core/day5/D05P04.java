package com.learning.core.day5;

import java.util.HashSet;


public class D05P04 {
    public static void main(String[] args) {
        HashSet<Product> productSet = new HashSet<>();

        
        Product product1 = new Product("P001", "Maruti 800");
        Product product2 = new Product("P002", "Maruti Zen");
        Product product3 = new Product("P003", "Maruti Desire");
        Product product4 = new Product("P004", "Maruti Alto");

     
        productSet.add(product1);
        productSet.add(product2);
        productSet.add(product3);
        productSet.add(product4);

        
        String searchProductId = "P002";
        boolean found = false;
        for (Product product : productSet) {
            if (product.getProductId().equals(searchProductId)) {
                found = true;
                System.out.println("Product found: " + product);
                break;
            }
        }
        if (!found) {
            System.out.println("Product with ID " + searchProductId + " not found.");
        }
    }
}