/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.sumofpostivienumbers;

/**
 *
 * @author lab_services_student
 */
import java.util.Scanner;
public class SumOfPostivieNumbers {

    public static void main(String[] args) {
        
        int sum,number;
        sum = 0;
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a number: ");
        number = input.nextInt();
        
        while (number >=0){
            sum = sum+number;
            System.out.println("Please enter a number: ");
            number=input.nextInt();
            
           
        }
        System.out.println("Sum of Postive Numbers:" + sum);
        
        
        
       // System.out.println("Hello World!");
    }
}
