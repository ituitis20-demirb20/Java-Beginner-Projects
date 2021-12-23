/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package hypotenus;

import java.util.Scanner;

/**
 *
 * @author burakdemir
 */
public class Hypotenus {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter 1st Edge : ");
        int firstEdge=scanner.nextInt();
        System.out.println("Enter 2nd Edge : ");
        int secondEdge=scanner.nextInt();
        
        double hypotenus = Math.sqrt(firstEdge*firstEdge+secondEdge*secondEdge);
        System.out.println("Hypotenus is : "+ hypotenus);
    }
    
}
