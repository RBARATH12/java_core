package com.learning.core.day5;

import java.util.HashSet;

class Product {
    private String productId;
    private String productName;

    public Product(String productId, String productName) {
        this.productId = productId;
        this.productName = productName;
    }

    public String getProductId() {
        return productId;
    }

    public String getProductName() {
        return productName;
    }

    @Override
    public String toString() {
        return productId + " " + productName;
    }

    @Override
    public int hashCode() {
        return productId.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null || getClass() != obj.getClass())
            return false;
        Product product = (Product) obj;
        return productId.equals(product.productId);
    }
}

public class D05P05 {
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

        
        String removeProductId = "P002";
        boolean removed = false;
        for (Product product : productSet) {
            if (product.getProductId().equals(removeProductId)) {
                productSet.remove(product);
                removed = true;
                System.out.println("Product removed: " + product);
                break;
            }
        }
        if (!removed) {
            System.out.println("Product with ID " + removeProductId + " not found.");
        }

        
        System.out.println("Product Details after removal:");
        for (Product product : productSet) {
            System.out.println(product);
        }
    }
}