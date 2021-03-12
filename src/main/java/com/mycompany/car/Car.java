
package com.mycompany.car;


public class Car {

    public String brand;
    public String model;
    public String color;
    private int buildYear;
    private int Mileage = 0;
    private int fuel;
    
    public Car() {
        this.brand = "";
        this.model = "";
        this.color = "";
        this.buildYear = 0;
    }
    
    public int getbuildYear() {
    return this.buildYear;
   }
    
    private int getMileage() {
        return this.Mileage;
    }
    
    private void setMileage(int newMileage) {
        this.Mileage = newMileage;
    }
    
    
    public Car(String brand, String model, String color, int buildYear) {
        this.brand = brand;
        this.model = model;
        this.color = color;
        this.buildYear = buildYear;
        
    }
    
    public void printAttributes() {
        System.out.println("Brand: " + this.brand);
        System.out.println("Model: " + this.model);
        System.out.println("Color: " + this.color);
        System.out.println("Build year: " + this.getbuildYear());
    }

    public void tavel(int distance) {
//        int newMileage = this.getMileage()+ distance;
//        this.setMileage(newMileage);
        
        this.setMileage(this.getMileage() + distance);
    }
    
 }
