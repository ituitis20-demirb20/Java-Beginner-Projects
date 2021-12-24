/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LargestNumber;

import java.util.Scanner;

/**
 *
 * @author burakdemir
 */
public class Main {
    public static void main(String[] args) {
        
    
     Scanner temp = new Scanner(System.in);
        System.out.println("1.sayiyi giriniz :");
        int num1=temp.nextInt();
        System.out.println("2.sayiyi giriniz :");
        int num2=temp.nextInt();
        System.out.println("3.sayiyi giriniz :");
        int num3=temp.nextInt();
        int max;
        if (num1>=num2&&num1>=num3) {
            max=num1;
            
        }
        else if(num2>=num1&&num2>=num3){
        max=num2;
        }
        else{
            max=num3;
        }
        System.out.println("Largest number is :" +max);
        }
}
