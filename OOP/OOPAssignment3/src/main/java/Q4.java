/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author sohai
 */
public class Q4 {
     public static void main(String[] args) {
        Person P1 = new Person("Haitham");
    
        Truck T1 = new Truck("Daihatsu", 6, P1, 15.2, 20);
    
        System.out.println(P1.toString());
        System.out.println("The name of the manufacturer is: " + T1.getManufacture());
        System.out.println("The number of cylinders in the engine is: " + T1.getCylinders());
        System.out.println("The load capacity in tons is: " + T1.getlCapacity());
        System.out.println("The towing capacity in pounds is: " + T1.gettCapacity());
    }

}
