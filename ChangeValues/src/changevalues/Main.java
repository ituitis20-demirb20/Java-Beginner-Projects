/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package changevalues;

import java.util.Scanner;

/**
 *
 * @author burakdemir
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Enter Two values that you want to change with each other : ");
        Scanner scanner =new Scanner(System.in);
        int firstValue= scanner.nextInt();
        int secondValue=scanner.nextInt();
        int temp=firstValue;
        firstValue=secondValue;
        secondValue=temp;
        System.out.println("The numbers before changing : "+secondValue+" "+firstValue);
        System.out.println("The numbers after changing : "+firstValue+" "+secondValue);        
        
              
    }
    
}
