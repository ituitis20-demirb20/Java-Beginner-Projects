/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author burakdemir
 */
public class SoftwareDeveloper extends Employers {
    private String language;
    public SoftwareDeveloper(String name,String id,int salary,String language) {
        super(name, id, salary);
        this.language =language;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }
    
    public void showInformation(){
        super.showInformation();
        System.out.println("Languages : "+ language);
    }
    
}
