package com.driver;

public class Pizza {

    private int price;
    private Boolean isVeg;
    private String bill;

    public Pizza(Boolean isVeg){
        this.isVeg = isVeg;
        this.price = 200;  // Base price for a regular pizza
    }

    public int getPrice(){
        return this.price;
    }

    public void addExtraCheese(){
        this.price += 30;  // Additional cost for extra cheese
    }

    public void addExtraToppings(){
        this.price += 50;  // Additional cost for extra toppings
    }

    public void addTakeaway(){
        this.price += 20;  // Additional cost for takeaway
    }

    public String getBill(){
        this.bill = "Pizza Type: " + (isVeg ? "Veg" : "Non-Veg") + "\nTotal Bill: $" + price;
        return this.bill;
    }
}
