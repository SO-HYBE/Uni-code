/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.oopassignment2;

/**
 *
 * @author sohai
 */
class Odometer {
    private int miles;
    private double efficiency;
    public double gallons;
            
    public void Odometer (){
        miles = 0;
        efficiency = 0;
    }

    public int getMiles() {
        return miles;
    }

    public void setTotalMiles(int miles) {
        this.miles = miles + this.miles;
    }
    
    public void resetMiles() {
        this.miles = 0;
    }

    public void setEfficiency(double efficiency) {
        this.efficiency = efficiency;
    }
    
    public double getGallons(){
        this.gallons = this.miles/this.efficiency;
        return gallons;
    }
}
