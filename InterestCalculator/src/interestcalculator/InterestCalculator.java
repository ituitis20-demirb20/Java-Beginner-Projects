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
        int months;
        System.out.print("Enter the monthly interest rate: ");
        Scanner scanner=new Scanner(System.in);
        interestRate=scanner.nextFloat();
        System.out.print("Enter the money that you want the invest or take as a credit: ");
        budget=scanner.nextFloat();
        System.out.print("Enter how many months : ");
        months=scanner.nextInt();
        
        for (int i = 1; i <= months; i++) {
            if(i==5){
                 budget+=(budget*interestRate)/100;
                 System.out.println((i)+".month money : "+budget);
            }
            else if(i==8){
            System.out.println("Enter 8.month's interest rate");
            interestRate=scanner.nextInt();
            scanner.nextLine();
            
                budget+=(budget*interestRate)/100;
                 System.out.println((i)+".month money : "+budget);
        }
            else if(i==10){
            System.out.println("Enter 10.month's interest rate");
            interestRate=scanner.nextInt();
            scanner.nextLine();
            
                budget+=(budget*interestRate)/100;
                 System.out.println((i)+".month money : "+budget);
        }
            else{
            
            
            budget+=(budget*interestRate)/100;
            System.out.println((i)+".month money : "+budget);
            }
        }
    }
    
}
