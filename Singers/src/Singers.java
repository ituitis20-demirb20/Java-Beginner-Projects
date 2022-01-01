
import java.util.ArrayList;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author burakdemir
 */
public class Singers {
    private ArrayList<String> singers=new ArrayList<String>();
    
    public void print_singers(){
        for (int i = 0; i < singers.size(); i++) {
            System.out.println((i+1)+ ". singer : "+singers.get(i));
        }
    }
    public void add_singer(String name){
        singers.add(name);
        System.out.println("Singer added. ->"+name);
    }
    public void update_singer(String name,int position){
        singers.set(position-1, name);
        System.out.println(name+" added at "+(position));
    }
    public void remove_singer(String name){
        int position=singers.indexOf(name);
        singers.remove(position);
        
        System.out.println(name+" removed from "+(position+1));
    }
    public void search_singer(String name){
        int position=singers.indexOf(name);
        if (position>=0) {
            System.out.println(name+" found at "+(position+1));
        } else {
            System.out.println(name+" cannot found ");
        }
        
    }
}
