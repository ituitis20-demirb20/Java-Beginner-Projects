
import java.awt.BorderLayout;
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
        System.out.println("********************");
        System.out.println("Welcome");
        System.out.println("********************");
        String menu = "1- For Employer\n"
                + "2- For Software Developer\n"
                + "3- For Manager\n"
                + "q- press q for quit";
        Scanner scanner =new Scanner(System.in);
        
        while (true) {            
            System.out.println(menu);
            String choose=scanner.nextLine();
            if (choose.equals("1")) {
                System.out.println("********************");
                System.out.println("Welcome to the Employers' menu ");
                System.out.println("********************");
                System.out.print("Enter Employers' name : ");
                String name=scanner.nextLine();
                System.out.print("Enter Employers' id : ");
                String id=scanner.nextLine();
                System.out.print("Enter Employers' salary : ");
                int salary =scanner.nextInt();
                scanner.nextLine();
                Employers employers=new Employers(name, id, salary);
                String menuEmployer = "1-Show Information\n"
                + "q- press q for quit";
                
                while(true){
                    System.out.println("********************");
                    System.out.println(menuEmployer);
                    String chooseEmployer=scanner.nextLine();
                    if (chooseEmployer.equals("1")) {
                        employers.showInformation();
                    }
                    else if (chooseEmployer.equals("q")) {
                        break;
                    }
                    else {
                        System.out.println("Wrong Character Input");
                    }
                }
                
            }
            else if (choose.equals("2")) {
                System.out.println("********************");
                System.out.println("Welcome to the Software Developers' menu ");
                System.out.println("********************");
                System.out.print("Enter Developers' name : ");
                String name=scanner.nextLine();
                System.out.print("Enter Developers' id : ");
                String id=scanner.nextLine();
                System.out.print("Enter Developers' salary : ");
                int salary =scanner.nextInt();
                scanner.nextLine();
                System.out.print("Enter Developers' Languages : ");
                String language =scanner.nextLine();
                SoftwareDeveloper softwareDeveloper =new SoftwareDeveloper(name, id, salary, language);
                String menuDevelopers = "1-Show Information\n"
                       
                + "q- press q for quit";
                
                while(true){
                    System.out.println("********************");
                    System.out.println(menuDevelopers);
                    String chooseDevelopers=scanner.nextLine();
                    if (chooseDevelopers.equals("1")) {
                        softwareDeveloper.showInformation();
                    }
                    else if (chooseDevelopers.equals("q")) {
                        break;
                    }
                    else {
                        System.out.println("Wrong Character Input");
                    }
                }
            }
            else if (choose.equals("3")) {
                System.out.println("********************");
                System.out.println("Welcome to the Managers' menu ");
                System.out.println("********************");
                System.out.print("Enter Managers' name : ");
                String name=scanner.nextLine();
                System.out.print("Enter Managers' id : ");
                String id=scanner.nextLine();
                System.out.print("Enter Managers' salary : ");
                int salary =scanner.nextInt();
                System.out.print("Enter Managers' number of employers : ");
                int numEmployer =scanner.nextInt();scanner.nextLine();
                Manager manager=new Manager(name, id, salary, numEmployer);
                String menuManager = "1-Show Information\n"
                       
                + "q- press q for quit";
                
                while(true){
                    System.out.println("********************");
                    System.out.println(menuManager);
                    String chooseManager=scanner.nextLine();
                    if (chooseManager.equals("1")) {
                        manager.showInformation();
                    }
                    else if (chooseManager.equals("q")) {
                        break;
                    }
                    else {
                        System.out.println("Wrong Character Input");
                    }
                }
            }
            else if (choose.equals("q")) {
                break;
            }
            else{
                System.out.println("Wrong Character Input");
            }
        }
        
        
        
    }
}
