/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package armstrong;

import java.util.Scanner;

/**
 *
 * @author burakdemir
 */
public class Armstrong {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Write the number : ");
        Scanner scanner =new Scanner(System.in);
        int number=scanner.nextInt();
        int ladder=0;
        int tempNum=number;
        
        while (tempNum>0) {  
            ladder++;
            tempNum/=10;   
        } //to find the ladder
        
        int temp=0;
        int a;
        tempNum=number;
        while (tempNum>0) { 
            a=tempNum%10;
            temp+=Math.pow(a, ladder);
            tempNum/=10;   
        }
        if (temp==number) {
            System.out.println("Armstrong");
        }
        else{
        System.out.println("Not Armstrong");
        }
        
        
    }
    
}
