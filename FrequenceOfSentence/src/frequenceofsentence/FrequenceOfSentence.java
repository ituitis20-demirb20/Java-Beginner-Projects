/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package frequenceofsentence;

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

/**
 *
 * @author burakdemir
 */
public class FrequenceOfSentence {

    
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scanner =new Scanner(System.in);
        System.out.print("Enter the Sentence: ");
        String sentence=scanner.nextLine();
        Map<Character,Integer>frequence=new TreeMap<Character,Integer>();
        for(int i=0;i<sentence.length();i++){
            
           char c= sentence.charAt(i);
            if (frequence.containsKey(c)) {
                frequence.replace(c, frequence.get(c)+1);
            }
            else{
                frequence.put(c, 1);
            }

        }
        for (Map.Entry<Character, Integer> entry : frequence.entrySet()) {
            System.out.println("The Letter "+entry.getKey()+" has repeated "+entry.getValue()+" times");
            
        }
        
        
    }
    
}
