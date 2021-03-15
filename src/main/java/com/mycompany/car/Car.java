
package com.mycompany.car;


public class Car {

    public String brand;
    public String model;
    public String color;
    private int buildYear;
    private int Mileage = 0;
    private int fuel;
    private int consumption = 5;
    private int fuelUp;
    
    public Car() {
        this.brand = "";
        this.model = "";
        this.color = "";
        this.buildYear = 0;
    }
    
      public Car(String brand, String model, String color, int buildYear, int mileage, int fuel, int consumption) {
        this.brand = brand;
        this.model = model;
        this.color = color;
        this.buildYear = buildYear; 
        this.Mileage = mileage;
        this.fuel = fuel;
        this.consumption = consumption;
        
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
    
    private int getConsumption() {
        return this.consumption;
    }

    private int getFuel() {
        return this.fuel;
    }
    private void setFuel(int fuel) {
        this.fuel = fuel;
    }
   
    
    public void printAttributes() {
        System.out.println("Brand: " + this.brand);
        System.out.println("Model: " + this.model);
        System.out.println("Color: " + this.color);
        System.out.println("Build year: " + this.getbuildYear());
        System.out.println("Mileage: " + this.getMileage());
        System.out.println("Current fuel: " + this.getFuel());
    }

    public void tavel(int distance) {
        int fuelNeededForTrip = this.getConsumption() * distance /100;
        if (this.getFuel() >= fuelNeededForTrip) {
            this.setMileage(this.Mileage + distance);
            this.setFuel(this.getFuel() - fuelNeededForTrip);
            System.out.println("Uspesno je predjen put: " + distance + "  kilometara");
        } else
            System.out.println("Nema dovoljno goriva za takav put");
    }
    
 }
