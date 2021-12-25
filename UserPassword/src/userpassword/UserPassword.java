/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package userpassword;

import java.util.Scanner;

/**
 *
 * @author burakdemir
 */
public class UserPassword {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String actualUser="demirb20";
        String actualPassword="password";
        Scanner scanner=new Scanner(System.in);
        
        int count =3;
        while (true) {            
            if (count==0) {
                break;
            }
            else{
            System.out.println("Enter your username :");
            String userName=scanner.nextLine();
            System.out.println("Enter your password :");
            String password = scanner.nextLine();
            
            if (userName.equals(actualUser)&&password.equals(actualPassword)) {
                System.out.println("Succesful, you are being directed to system...");
                break;
            }
            else{
                System.out.println("Wrong username or password try again ");
                count--;
                System.out.println("Your right to try again :  "+count);
            }
            }
        }
        
    }
    
}
