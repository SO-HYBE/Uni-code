/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.oopassignment4;

/**
 *
 * @author sohai
 */
class Rational2 {
    private int numerator, denominator;
    private int wholeNumber;
    
    public Rational2(int numerator, int denominator){
        this.numerator = numerator;
        this.denominator = denominator;
    }
    public Rational2(int wholeNumber){
        this.numerator = wholeNumber;
        this.denominator = 1;
    }
    public Rational2(){
        this.numerator = 0;
        this.denominator = 1;
    }

    public int getNumerator() {
        return numerator;
    }

    public void setNumerator(int numerator) {
        this.numerator = numerator;
    }

    public int getDenominator() {
        return denominator;
    }

    public void setDenominator(int denominator) {
        this.denominator = denominator;
    }

    public int getWholeNumber() {
        return wholeNumber;
    }

    public void setWholeNumber(int wholeNumber) {
        this.wholeNumber = wholeNumber;
    }
    public static Rational2 add (Rational2 r1, Rational2 r2){
        if(r1.denominator == r2.denominator){
            Rational2 r3 = new Rational2(r1.numerator + r2.numerator,r1.denominator);
            return r3;
        } else {
            Rational2 r3 = new Rational2((r1.numerator * r2.denominator) + (r2.numerator * r1.denominator), (r1.denominator * r2.denominator));
            return r3;
        }
    }
    public void add (Rational2 r2){
        if(this.denominator == r2.denominator){
            this.numerator = this.denominator + r2.numerator;
        } else {
            this.numerator = (this.denominator * r2.denominator) + (r2.numerator * this.denominator);
            this.denominator = (this.denominator * r2.denominator); 
        }
    }
    public static Rational2 sub (Rational2 r1, Rational2 r2){
        if(r1.denominator == r2.denominator){
            Rational2 r3 = new Rational2(r1.numerator - r2.numerator,r1.denominator);
            return r3;
        } else {
            Rational2 r3 = new Rational2((r1.numerator * r2.denominator) - (r2.numerator * r1.denominator), (r1.denominator * r2.denominator));
            return r3;
        }
    } 
    public void sub (Rational2 r2){
        if(this.denominator == r2.denominator){
            this.numerator = this.denominator - r2.numerator;
        } else {
            this.numerator = (this.denominator * r2.denominator) - (r2.numerator * this.denominator);
            this.denominator = (this.denominator * r2.denominator); 
        }
    } 
    public static Rational2 multiply (Rational2 r1, Rational2 r2){
        Rational2 r3 = new Rational2(r1.numerator * r2.numerator, r1.denominator * r2.denominator);
        return r3;
    }
    public void multiply (Rational2 r2){
        this.numerator = this.numerator * r2.numerator;
        this.denominator = this.denominator * r2.denominator;
    }
    public static Rational2 divide (Rational2 r1, Rational2 r2){
        Rational2 r3 = new Rational2(r1.numerator * r2.denominator, r1.denominator * r2.numerator);
        return r3;
    }
    public void divide (Rational2 r2){
        this.numerator = this.numerator * r2.denominator;
        this.denominator = this.denominator * r2.numerator;
    }
    @Override
    public String toString(){
       return ("The rational number is: " + getNumerator() + "/" + getDenominator() + ".");
    }
    public boolean equals(Rational2 r2){
        return this.numerator * r2.denominator == this.denominator * r2.numerator;
    }
    public void normalize (){
        if(getNumerator() > 0 && getDenominator() < 0 ){
            setNumerator(getNumerator()*-1);
            setDenominator(getDenominator()*-1);
        }else if(getNumerator() < 0 && getDenominator() < 0 ){
            setNumerator(getNumerator()*-1);
            setDenominator(getDenominator()*-1);
        }
    }
          
}
