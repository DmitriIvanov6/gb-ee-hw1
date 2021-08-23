package ru.gb.webapp.application;

public class Product {

    private int id;
    private String title;
    private int cost;
    public Product(int id, String title, int cost){
        this.id = id;
        this.title = title;
        this.cost = cost;

    }

    public int getCost() {
        return cost;
    }

    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }
}
