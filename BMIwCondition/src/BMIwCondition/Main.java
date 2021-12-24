/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BMIwCondition;

import java.util.Scanner;

/**
 *
 * @author burakdemir
 */
public class Main {
    public static void main(String[] args) {
        
        Scanner scanner=new Scanner(System.in);
        System.out.println("Write your height : ");
        float height=scanner.nextInt()/100f;
        System.out.println("Write your weight : ");
        int weight=scanner.nextInt();
        float bmi=weight/(height*height);
        System.out.println("Your BMI : "+bmi);
        if(bmi<=18.5){
            System.out.println("Too Skin");
        }
        else if(bmi>18.5&&bmi<25){
            System.out.println("Ideal Weight");
        }
        else if(bmi>25&&bmi<30){
            System.out.println("OverWeight");
        }
        else{
                        System.out.println("Obese");

        }
        
    }
}
