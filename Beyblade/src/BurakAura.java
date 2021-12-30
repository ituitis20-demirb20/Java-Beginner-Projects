/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author burakdemir
 */
public class BurakAura extends Beyblade {
    private String holyBeast="Burakaura";
   

    public BurakAura(String beyblader, String beybladeName, int power, int speed,String holyBeast) {
        super(beyblader, beybladeName, power, speed);
        this.holyBeast=holyBeast;
    }

    public String getHolyBeast() {
        return holyBeast;
    }

    public void setHolyBeast(String holyBeast) {
        this.holyBeast = holyBeast;
    }
    @Override
    public void showInfo() {
        super.showInfo(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
        System.out.println("Holy Beast : "+holyBeast);
    }

    @Override
    public void holyBeast() {
        System.out.println("Holy Beast is coming ... : "+holyBeast);
    }
}

