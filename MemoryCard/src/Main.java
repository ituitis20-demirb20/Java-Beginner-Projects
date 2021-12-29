
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
    private static Card cards[][]=new Card[4][4];
    
 
        
    public static void main(String[] args) {
         
        cards[0][0]=new Card('A');
        cards[0][1]=new Card('B');
        cards[0][2]=new Card('C');
        cards[0][3]=new Card('D');
        cards[1][0]=new Card('E');
        cards[1][1]=new Card('F');
        cards[1][2]=new Card('G');
        cards[1][3]=new Card('H');
        cards[2][0]=new Card('H');
        cards[2][1]=new Card('G');
        cards[2][2]=new Card('F');
        cards[2][3]=new Card('E');
        cards[3][0]=new Card('D');
        cards[3][1]=new Card('C');
        cards[3][2]=new Card('B');
        cards[3][3]=new Card('A');
        
       showTable();
        System.out.println("***********************");
        while (!isFinished()) {            
            guess();
            showTable();
            System.out.println("***********************");
        }
       
        
        
    }
    public static void showTable(){
        System.out.println("_______________");
        
        for (int i = 0; i < 4; i++) {
            
            for (int j = 0; j < 4; j++) {
                if (cards[i][j].isGuess()) {
                    System.out.print("|"+cards[i][j].getValue()+"|");
                } else {
                    System.out.print("|x| ");
                }
             
            }
            System.out.println("");
            System.out.println("_______________");
        }
    }
    public static boolean isFinished(){
        for (int i = 0; i < 4; i++) {
            
            for (int j = 0; j < 4; j++) {
                if (cards[i][j].isGuess()==false) {
                    return false;
                } 
            } 
        }
        return true;
        
    
    
    }
    
    public static void guess(){
        Scanner scanner =new Scanner(System.in);
        System.out.println("Enter the Card Number that you open for ex.(2 5) : ");
        int row=scanner.nextInt()-1;
        int column=scanner.nextInt()-1;
        cards[row][column].setGuess(true);
        showTable();
        System.out.println("***********************");
        System.out.println("Enter the Card Number that you open for ex.(2 5) : ");
        int row2=scanner.nextInt()-1;
        int column2=scanner.nextInt()-1;
        cards[row2][column2].setGuess(true);
        showTable();
        System.out.println("***********************");
        if (cards[row][column].getValue()!=cards[row2][column2].getValue()) {
            System.out.println("Wrong Guess");
            System.out.println("***********************");
             cards[row][column].setGuess(false);
            cards[row2][column2].setGuess(false);
          
        } 
        else{
            System.out.println("True Guess");
            System.out.println("***********************");
        }
    }
   
    
}
