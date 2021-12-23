/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package fuelconsumption;

import java.util.Scanner;

/**
 *
 * @author burakdemir
 */
public class FuelConsumption {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your car fuel consumption as Litre per 100 km : ");
        float litreConsumption=scanner.nextFloat();
        System.out.print("How many kilometers that you travel ? : ");
        int kmTravel=scanner.nextInt();
        float costFuel=9.4f;
        float cost = litreConsumption*kmTravel*costFuel/100;
        System.out.println("The cost of your travel is : "+cost+"$");
        
        
    }
    
}
