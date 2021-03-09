
package com.mycompany.car;


public class Main {

    public static void main(String[] args) {
        Car audi = new Car();
        audi.brand = "Audi";
        audi.model = "A4";
        audi.color = "Black";
        audi.printTtributes();
    
        Car bmw = new Car();
        bmw.brand = "BMW";
        bmw.model = "X5";
        bmw.color = "Red";
        bmw.printTtributes();
    
    
        Car fiat = new Car(2010);
        System.out.println("Godina proizvodnje: " + fiat.getBuildYear());
    
        Car lada = new Car("Lada", "Niva", "green", 2018);
        lada.printTtributes();
    }
    
}
