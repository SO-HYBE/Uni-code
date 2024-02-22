/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.assignmentsec1;

/**
 *
 * @author sohai
 */

import java.util.Scanner;
public class Q2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int quarts=0, nickels=0, dimes=0;
        System.out.println("Enter a price for the item you want. (It should between 25 and 100 cents in 5-cent increment): ");
        int price = scanner.nextInt();
        if(price < 25 || price > 100 || price%5!=0){
            System.out.println("The price you entered is invalid");
        } else if(price%5==0){
            System.out.println("You bought an item for " + price + " cents and gave me a dollar, so your change is: ");
            int change = 100 - price;
            while(change!=0){
                if(change%25==0){
                    quarts++;
                    change = change - 25;
                } else if(change%10==0){
                    dimes++;
                    change = change - 10;
                } else if(change%5==0){
                    nickels++;
                    change = change - 5;
                }
            }
            
        System.out.println(quarts + " quarters,");
        System.out.println(dimes + " dimes,");
        System.out.println(nickels + " nickels.");
        }
    }
}
