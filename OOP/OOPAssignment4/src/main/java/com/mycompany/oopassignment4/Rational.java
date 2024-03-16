/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.oopassignment4;

/**
 *
 * @author sohai
 */
class Rational {
    private int numerator, denominator;
    private int wholeNumber;
    
    public Rational(int numerator, int denominator){
        this.numerator = numerator;
        this.denominator = denominator;
    }
    public Rational(int wholeNumber){
        this.numerator = wholeNumber;
        this.denominator = 1;
    }
    public Rational(){
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
    public static Rational add (Rational r1, Rational r2){
        if(r1.denominator == r2.denominator){
            Rational r3 = new Rational(r1.numerator + r2.numerator,r1.denominator);
            return r3;
        } else {
            Rational r3 = new Rational((r1.numerator * r2.denominator) + (r2.numerator * r1.denominator), (r1.denominator * r2.denominator));
            return r3;
        }
    }
    public Rational add (Rational r2){
        if(this.denominator == r2.denominator){
            Rational r3 = new Rational(this.denominator + r2.numerator,this.denominator);
            return r3;
        } else {
            Rational r3 = new Rational((this.denominator * r2.denominator) + (r2.numerator * this.denominator), (this.denominator * r2.denominator));
            return r3;
        }
    }
    public static Rational sub (Rational r1, Rational r2){
        if(r1.denominator == r2.denominator){
            Rational r3 = new Rational(r1.numerator - r2.numerator,r1.denominator);
            return r3;
        } else {
            Rational r3 = new Rational((r1.numerator * r2.denominator) - (r2.numerator * r1.denominator), (r1.denominator * r2.denominator));
            return r3;
        }
    } 
    public Rational sub (Rational r2){
        if(this.denominator == r2.denominator){
            Rational r3 = new Rational(this.denominator - r2.numerator,this.denominator);
            return r3;
        } else {
            Rational r3 = new Rational((this.denominator * r2.denominator) - (r2.numerator * this.denominator), (this.denominator * r2.denominator));
            return r3;
        }
    } 
    public static Rational multiply (Rational r1, Rational r2){
        Rational r3 = new Rational(r1.numerator * r2.numerator, r1.denominator * r2.denominator);
        return r3;
    }
    public Rational multiply (Rational r2){
        Rational r3 = new Rational(this.denominator * r2.numerator, this.denominator * r2.denominator);
        return r3;
    }
    public static Rational divide (Rational r1, Rational r2){
        Rational r3 = new Rational(r1.numerator * r2.denominator, r1.denominator * r2.numerator);
        return r3;
    }
    public Rational divide (Rational r2){
        Rational r3 = new Rational(this.denominator * r2.denominator, this.denominator * r2.numerator);
        return r3;
    }
    @Override
    public String toString(){
       return ("The rational number is: " + getNumerator() + "/" + getDenominator() + ".");
    }
    public boolean equals(Rational r2){
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
