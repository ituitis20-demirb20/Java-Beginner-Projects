/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package atm.application;

import java.util.Scanner;

/**
 *
 * @author burakdemir
 */
public class ATMApplication {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scanner = new Scanner(System.in);
        String menu="1- Show Wallet "+"2- Add Money "+"3- Get Money "+"q- Press q to quit";
        System.out.println(menu);
        System.out.println("***************************");
        int budget=0;
        boolean temp=true;
        while(temp){
            System.out.println("***************************");
            System.out.print("Choose your option : ");
            String option=scanner.nextLine();
            switch (option) {
                case "1":
                    System.out.println("Your Budget is : "+budget);
                    break;
                case "2":
                    System.out.print("Enter your money : ");
                    int addMoney=scanner.nextInt();
                    scanner.nextLine();
                    budget+=addMoney;
                    System.out.println("New Budget is : "+budget);
                    break;
                case "3":
                    System.out.print("Enter the money you want : ");
                    int getMoney=scanner.nextInt();
                    scanner.nextLine();
                    if (getMoney>budget) {
                        System.out.println("There is not enough money in your wallet");  
                        System.out.println("Your Budget is : "+budget);
                    }else{
                        budget-=getMoney;
                        System.out.println(budget);
                        System.out.println("New Budget is : "+budget);
                    }
                    
                    break;
                case "q":
                    System.out.println("System is closing....");
                    temp=false;
                    break;
                default:
                       System.out.println("Enter Valid Character");
                       break;
            }
            
            System.out.println("***************************");
            
        }
        
    }
    
}
