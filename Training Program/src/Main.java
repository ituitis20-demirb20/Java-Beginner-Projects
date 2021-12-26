
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author burakdemir
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        System.out.println("Enter your Burpee Program : ");
        int burpee=scanner.nextInt();
        System.out.println("Enter your Pullup Program : ");
        int pullup=scanner.nextInt();
        System.out.println("Enter your Pushup Program : ");
        int pushup=scanner.nextInt();
        System.out.println("Enter your Situp Program : ");
        int situp=scanner.nextInt();
        scanner.nextLine();
        Train train = new Train(burpee, pushup, pullup, situp);
        while (train.isFinished()==false) {   
            System.out.println("Enter train type : ");
            String training =scanner.nextLine();
            System.out.println("Enter count : ");
            int count=scanner.nextInt();
            scanner.nextLine();
            train.chooseTrain(training, count);
            
        }
        System.out.println("Finished,Great Job");
    }
    
}
