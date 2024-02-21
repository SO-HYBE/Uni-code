/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.assignmentsec1;

/**
 *
 * @author sohai
 */

import java.util.Scanner;
public class AssignmentSec1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter the Purchase Price (P): ");
        int P = scanner.nextInt();
        System.out.println("Enter the Salvage Value (S): ");
        int S = scanner.nextInt();
        System.out.println("Enter the number of years (Y): ");
        int Y = scanner.nextInt();

        int D = (P-S)/Y;
        System.out.print("The yearly Deprecation in value (D) is : "+ D);
        
    }
}
