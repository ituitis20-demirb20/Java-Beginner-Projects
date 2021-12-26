
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author burakdemir
 */
public class ATM {
    public void start(Account account){
        int money;
        Login login=new Login();
        System.out.println("Welcome");
        System.out.println("********************");
        System.out.println("User Input");
        System.out.println("********************");
        int input_right=3;
        while (true) {    
            if (input_right==0) {
                System.out.println("Exiting.....");
                return;
            }
            if(login.loginAttempt(account)){
                System.out.println("Succesful");
                System.out.println("********************");
                break;
            }
            else{
                System.out.println("Wrong Password or Username");
                input_right-=1;
            }
        }
        Scanner scanner =new Scanner(System.in);
        
        String menu = "1. Show Budget\n"
                + "2. Add Money\n"
                + "3. Get Money\n"
                + "q. press q for Exit";
       
        
        while (true) { 
            System.out.println(menu);
            System.out.println("********************");
            String choice = scanner.nextLine();
            if (choice.equals("q")) {
                System.out.println("Exiting...");
                break;
            }
            else if (choice.equals("2")) {
                System.out.print("Add Money : ");
                money=scanner.nextInt();
                scanner.nextLine();
                account.addMoney(money);
            }
            else if (choice.equals("3")) {
                System.out.print("Get Money : ");
                money=scanner.nextInt();
                scanner.nextLine();
                account.getMoney(money);
            }
            else if (choice.equals("1")) {
                System.out.println("Your Budget is :"+ account.getbudget());
            }
            else{
                System.out.println("Wrong Character Input");
            }
        }
     


    }
}
