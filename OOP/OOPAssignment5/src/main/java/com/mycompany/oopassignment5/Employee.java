/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.oopassignment5;

/**
 *
 * @author sohai
 */
abstract class Employee {
    protected int baseSalary;
    protected String Name;
    
    public Employee(int baseSalary, String Name){
        this.baseSalary = baseSalary;
        this.Name = Name;
    }
    public Employee(){
        this.baseSalary = 0;
        this.Name = "";
    }

    public int getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(int baseSalary) {
        this.baseSalary = baseSalary;
    }

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }
    
    abstract double calculateSalary();
    
    abstract void displayInfo();
}

class Manager extends Employee{
    private double bonus;
    public Manager(String Name, double bonus){
        this.baseSalary = 15000;
        this.Name = "Manager " + Name;
        this.bonus = bonus;
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }
    
    @Override
    public double calculateSalary(){
        return (this.baseSalary + (this.baseSalary * bonus));
    }
    
    @Override
    public void displayInfo(){
        System.out.println("The Manager's name is: " + this.Name);
        System.out.println("The Manager's base salary is: " + this.baseSalary);
        System.out.println("The Manager's total salary is: " + calculateSalary());
    }
}

class Programmer extends Employee{
    private double bonus;
    public Programmer(String Name, double bonus){
        this.baseSalary = 10000;
        this.Name = "Programmer " + Name;
        this.bonus = bonus;
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }
    
    @Override
    public double calculateSalary(){
        return (this.baseSalary + (this.baseSalary * bonus));
    }
    
    @Override
    public void displayInfo(){
        System.out.println("The Programmer's name is: " + this.Name);
        System.out.println("The Programmer's base salary is: " + this.baseSalary);
        System.out.println("The Programmer's total salary is: " + calculateSalary());
    }
}
