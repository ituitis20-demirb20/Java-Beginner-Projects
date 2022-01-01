
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
    private static Singers singers=new Singers();
    private static Scanner scanner=new Scanner(System.in);
    private static String name;
    private static int position;
    public static void print_menu(){
        
        System.out.println("\t 1-Print Singers");
        System.out.println("\t 2-Add Singers");
        System.out.println("\t 3-Update Singers");
        System.out.println("\t 4-Remove Singers");
        System.out.println("\t 5-Search Singers");
        System.out.println("\t 6-Quit Program");
    }
    public static void print_singers(){
        singers.print_singers();
    }
    public static void add_singers(){
        System.out.println("Enter Singers' Name : ");
        name =scanner.nextLine();
        singers.add_singer(name);
    }
    public static void update_singers(){
        System.out.println("Enter Singers' Name : ");
        name=scanner.nextLine();
        System.out.println("Enter Singers' Position : ");
        position=scanner.nextInt();
        scanner.nextLine();
        singers.update_singer(name, position);
    }
    public static void remove_singers(){
        System.out.println("Enter Singers' Name : ");
        name=scanner.nextLine();
        singers.remove_singer(name);
    }
    public static void search_singers(){
        System.out.println("Enter Singers' Name : ");
        name=scanner.nextLine();
        singers.search_singer(name);
    }
    public static void main(String[] args) {
        
        boolean quit=false;
        while (!quit) {  
            System.out.println("**************************************");
            print_menu();
            System.out.print("\nEnter Option: ");
            String option =scanner.nextLine();
            
            switch (option) {
                
               
                case "1":
                    print_singers();
                    break;
                case "2":
                    add_singers();
                    break; 
                case "3":
                    update_singers();
                    break;
                case "4":
                    remove_singers();
                    break;
                case "5":
                    search_singers();
                    break;
                case "6":
                    quit=true;
                    break;  
                    
                default:
                    System.out.println("Wrong Character Input");
                    break;
                    
            }
            
            
        }
    }
}
