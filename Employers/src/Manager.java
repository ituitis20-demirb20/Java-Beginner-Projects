/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author burakdemir
 */
public class Manager extends Employers {
    private int numEmployers;
    public Manager(String name,String id,int salary,int numEmployers){
        super(name,id,salary);
        this.numEmployers=numEmployers;
    }

    public int getNumEmployers() {
        return numEmployers;
    }

    public void setNumEmployers(int numEmployers) {
        this.numEmployers = numEmployers;
    }
    public void showInformation(){
        super.showInformation();
        System.out.println("Number Of Employers : "+ numEmployers);
    }
}
