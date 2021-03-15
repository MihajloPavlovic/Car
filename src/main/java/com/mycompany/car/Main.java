
package com.mycompany.car;


public class Main {

    public static void main(String[] args) {
        
        Car audi = new Car();
        audi.printAttributes();
        audi.brand = "Audi";
        audi.model = "A4";
        audi.color = "Black";
        audi.printAttributes();
        audi.tavel(150);
        audi.printAttributes();
        
        Car bmw = new Car("BMW", "X5", "Red", 2018, 0, 20, 5);
        bmw.printAttributes();
        
        Car lada = new Car("Lada", "Niva", "Green", 2005, 0, 50, 10);
        lada.printAttributes();
        lada.tavel(300);
        lada.printAttributes();
        lada.tavel(200);
        lada.printAttributes();
        lada.tavel(100);
        lada.printAttributes();
    }
}
