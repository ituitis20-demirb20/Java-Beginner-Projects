/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author burakdemir
 */
public class Beyblade {
    private String beyblader;
    private String beybladeName;
    private int power;
    private int speed;
    
    
    public Beyblade(String beyblader, String beybladeName, int power, int speed) {
        this.beyblader = beyblader;
        this.beybladeName = beybladeName;
        this.power = power;
        this.speed = speed;
    }

    public String getBeyblader() {
        return beyblader;
    }

    public void setBeyblader(String beyblader) {
        this.beyblader = beyblader;
    }

    public String getBeybladeName() {
        return beybladeName;
    }

    public void setBeybladeName(String beybladeName) {
        this.beybladeName = beybladeName;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }
    public void attack(){
        System.out.println(getBeyblader()+" is attacking with "+getBeybladeName()+". It's power is : "+power+" It's speed is : "+ speed);
    }
    public void holyBeast(){
        System.out.println(getBeyblader()+" doesn't have holy beast ");
    }
    public void showInfo(){
        System.out.println("Beyblader: "+beyblader+"\nBeyblade Name : "+beybladeName+"\nPower :"+power+"\nSpeed: "+speed);
    }
    
    
}
