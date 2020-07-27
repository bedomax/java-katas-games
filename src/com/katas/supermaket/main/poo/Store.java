package com.katas.supermaket.main.poo;

import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

public class Store {
    private ArrayList<Product> products;
    private ArrayList<Order> orders;
    public Store(){
        this.products = new ArrayList<Product>();
        this.orders = new ArrayList<Order>();
        this.load();
    }
    private void load(){
        String[] result;
        try {
            String fileToPath = Constants.PATH_CONFIGURATION_DATA;
            Scanner scanner = new Scanner(new File(fileToPath));
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                result = line.split(";");
                this.addProduct(new Product(result[0],Float.parseFloat(result[1])));
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
    public void addProduct(Product product){
        this.products.add(product);
    }
    public ArrayList<Product> getProducts() {
        return products;
    }
    public void CheckOut(Order order){
        this.orders.add(order);
    }
}
