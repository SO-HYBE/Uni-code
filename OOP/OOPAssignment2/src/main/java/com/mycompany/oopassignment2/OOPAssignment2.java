/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.oopassignment2;

/**
 *
 * @author sohai
 */
public class OOPAssignment2 {

    public static void main(String[] args) {
        Odometer odm = new Odometer();
        odm.setTotalMiles(27);
        odm.setEfficiency(3.5);
        
        System.out.println("The number of total miles in the first trip is: " + odm.getMiles());
        System.out.println("The number of gallons left in the first trip is: " + odm.getGallons());
        
        odm.resetMiles();
        
        System.out.println("The miles after the odemeter is reset is: " + odm.getMiles());
        
        odm.setTotalMiles(20);
        odm.setTotalMiles(10);
        odm.setTotalMiles(5);
        odm.setEfficiency(2.5);
        
        
        System.out.println("The number of total miles in the second trip is: " + odm.getMiles());
        System.out.println("The number of gallons left in the second trip is: " + odm.getGallons());
    }
}
