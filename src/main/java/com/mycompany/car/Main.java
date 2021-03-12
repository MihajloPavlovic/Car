
package com.mycompany.car;


public class Main {

    public static void main(String[] args) {
        
        Car audi = new Car();
        audi.printAttributes();
        
        
        Car bmw = new Car("BMW", "X5", "Red", 2018);
        bmw.printAttributes();
        
        Car lada = new Car("Lada", "Niva", "Green", 2005);
        lada.printAttributes();
    }
}
