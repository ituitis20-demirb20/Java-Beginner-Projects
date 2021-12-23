/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package BMI;

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
        Scanner scanner =new Scanner(System.in);
        
        System.out.println("Enter Height");
        float height = scanner.nextFloat()/100;
        System.out.println("Enter Body Mass");
        float weight = scanner.nextFloat();
        
        float bmi=weight/(height*height);
        System.out.println("Your BMI :"+ bmi);
        
        
    }
    
}
