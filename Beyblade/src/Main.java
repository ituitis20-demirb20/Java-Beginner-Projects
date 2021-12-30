/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author burakdemir
 */

public class Main {
    public static void getBeyblade(Beyblade beyblade){
        beyblade.showInfo();
        System.out.println("*******************************");
        beyblade.attack();
        System.out.println("*******************************");
        beyblade.holyBeast();
        System.out.println("*******************************");
    }
    public static void main(String[] args) {
        Beyblade beyblade =new Drayga("Kai", "Dragon", 85, 70, "Drayga");
        Beyblade beyblade2 =new NurAura("Nur", "Princess", 60, 85, "NurAura");
        Beyblade beyblade3 =new BurakAura("Burak", "Bull", 90, 58, "BurakAura");
        Beyblade beyblade4 =new SaryaAura("Sarya", "Bird", 65, 78, "SaryaAura");
        
        getBeyblade(beyblade);
        getBeyblade(beyblade2);
        getBeyblade(beyblade3);
        getBeyblade(beyblade4);
        
        
    }
}
