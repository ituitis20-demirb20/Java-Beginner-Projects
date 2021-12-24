/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package sumofnumbers;

import java.util.Scanner;

/**
 *
 * @author burakdemir
 */
public class SumofNumbers {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scanner=new Scanner(System.in);
        System.out.println("Write the Number: ");
        int number =scanner.nextInt();
        int sum=0;
        
        while(number>0){
            sum+= number%10;
            number/=10;
        }
        
        
        
        
        
        System.out.println("Sum "+sum);
    }
    
}
