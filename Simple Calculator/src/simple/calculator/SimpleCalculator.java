/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package simple.calculator;

import java.util.Scanner;

/**
 *
 * @author burakdemir
 */
public class SimpleCalculator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scanner =new Scanner(System.in);
        System.out.println("Select the operation : ");
        String menu = "1. Add operator\n"+"2. Substract operator\n"+"3. Multiplication operator\n"+"4. Divider Operator\n";
        System.out.println(menu);
        int operator=scanner.nextInt();
        int first,second,result;
        switch (operator) {
            case 1:
                System.out.println("Write first number: ");
                first=scanner.nextInt();
                System.out.println("Write second number: ");
                second=scanner.nextInt();
                result=first+second;
                System.out.println("Result "+ result);
                break;
            case 2:
                System.out.println("Write first number: ");
                first=scanner.nextInt();
                System.out.println("Write second number: ");
                second=scanner.nextInt();
                result=first-second;
                System.out.println("Result "+ result);
                break;
            case 3:
                System.out.println("Write first number: ");
                first=scanner.nextInt();
                System.out.println("Write second number: ");
                second=scanner.nextInt();
                result=first*second;
                System.out.println("Result "+ result);
                break;
            case 4:
                System.out.println("Write first number: ");
                first=scanner.nextInt();
                System.out.println("Write second number: ");
                second=scanner.nextInt();
                result=first/second;
                System.out.println("Result "+ result);
                break;
            default:
                System.out.println("Wrong Character Input");
               
        }
    }
    
}
