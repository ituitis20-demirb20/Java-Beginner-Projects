/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package interestcalculator;

import java.util.Scanner;

/**
 *
 * @author burakdemir
 */
public class InterestCalculator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        float interestRate;
        float budget;
        int year;
        System.out.print("Enter the yearly interest rate: ");
        Scanner scanner=new Scanner(System.in);
        interestRate=scanner.nextFloat();
        System.out.print("Enter the money that you want the invest or take as a credit: ");
        budget=scanner.nextFloat();
        System.out.print("Enter how many year : ");
        year=scanner.nextInt();
        
        for (int i = 0; i < year; i++) {
            budget+=(budget*interestRate)/100;
            System.out.println((i+1)+".year money : "+budget);
        }
    }
    
}
