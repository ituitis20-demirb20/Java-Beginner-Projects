
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author burakdemir
 */
public class Login {
    public boolean loginAttempt(Account account){
        Scanner scanner =new Scanner(System.in);
        System.out.print("Enter your username : ");
        String username=scanner.nextLine();
        System.out.print("Enter your password : ");
        String password=scanner.nextLine();
        if (account.getuserName().equals(username)&&account.getpassword().equals(password)){
            return true;
        }
        else{
            return false;
        }
    }
}
