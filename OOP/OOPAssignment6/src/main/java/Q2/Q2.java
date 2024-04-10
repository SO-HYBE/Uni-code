/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Q2;

/**
 *
 * @author sohai
 */

import java.util.StringTokenizer;
import java.util.Scanner;
import java.util.ArrayList;
public class Q2 {
    
    public static void main(String[] args) {
        System.out.println("Enter a string of integers seperated by spaces: ");
        Scanner scan = new Scanner(System.in);
        String s1 = scan.nextLine();
        StringTokenizer st = new StringTokenizer(s1);
        int sum = 0;
        ArrayList<Integer> list = new ArrayList<>();
        while(st.hasMoreElements()){
            int i = Integer.parseInt(st.nextToken());
            list.add(i);
            sum+=i;
        }
        System.out.println("The average of the number entered is: " + (sum/list.size()));
    }   
}
