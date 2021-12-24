/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package gradecalculator;

import java.util.Scanner;

/**
 *
 * @author burakdemir
 */
public class GradeCalculator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scanner =new Scanner(System.in);
        System.out.println("Write your Midterm1 grade : ");
        int mid1=scanner.nextInt();
        System.out.println("Write your Midterm2 grade : ");
        int mid2=scanner.nextInt();
        System.out.println("Write your Final grade : ");
        int finalGrade =scanner.nextInt();
        
        float grade = (mid1*3+mid2*3+finalGrade*4)/10f;
        if (grade>90) {
            System.out.println("Your Grade is : AA");
        }
        else if (grade>80) {
            System.out.println("Your Grade is : BA");
        }
        else if (grade>70) {
            System.out.println("Your Grade is : BB");
        }
        else if (grade>60) {
            System.out.println("Your Grade is : CB");
        }
        else if (grade>50) {
            System.out.println("Your Grade is : CC");
        }
        else if (grade>45) {
            System.out.println("Your Grade is : DC");
        }
         else if (grade>40) {
            System.out.println("Your Grade is : DD");
            System.out.println("What is your avarage ? ");
            float average=scanner.nextFloat();
            if (average<2.50) {
                System.out.println("You can think about take this lecture again");
            }
        }
        else {
            System.out.println("Your Grade is : FF");

        }
    }
    
}
