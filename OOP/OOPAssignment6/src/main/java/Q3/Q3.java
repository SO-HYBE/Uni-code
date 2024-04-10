/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Q3;

/**
 *
 * @author sohai
 */
import java.util.ArrayList;
import java.util.Scanner;
import java.util.StringTokenizer;
public class Q3 {
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a string of numbers seperated by commas: ");
        String s1 = scan.nextLine();
        StringTokenizer st = new StringTokenizer(s1,",");
        int sum = 0;
        ArrayList<Integer> list = new ArrayList<>();
        while(st.hasMoreElements()){
            int i = Integer.parseInt(st.nextToken());
            list.add(i);
            sum+=i;
        }
        int avg = sum/list.size();
        System.out.println("The average of the number entered is: " + avg);
        System.out.println("The even numbers which are greater than the average value are: ");
        for(int i =0; i<list.size();i++){
            if(list.get(i) % 2 == 0 && list.get(i) > avg){
                System.out.println(list.get(i));
            }
        }
    }
}
