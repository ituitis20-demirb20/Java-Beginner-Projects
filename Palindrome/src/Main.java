
import java.util.Scanner;
import java.util.Stack;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author burakdemir
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static boolean isPalindrome(String polindrome,Stack<Character> stack){
        for (int i = 0; i < polindrome.length()/2+1;  i++) {
            if(polindrome.charAt(i)!=(stack.pop())){
                return false;
            }
            
        }
        return true;
    }
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scanner =new Scanner(System.in);
        System.out.print("Enter Sentence : ");
        String polindrome= scanner.nextLine();
        Stack<Character> stack=new Stack<Character>();
        for (int i = 0; i < polindrome.length(); i++) {
            stack.push(polindrome.charAt(i));
        }
        if(isPalindrome(polindrome, stack)){
            System.out.println("Palindrome");
            return;
        }
        System.out.println("Not Palindrome");
        
                
    }
    
}
