/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author burakdemir
 */
public class Literature extends Students{

    public Literature(int mat, int science, int english, int literature,String name) {
        super(mat, science, english, literature,name);
    }

    @Override
    int calculate_point() {
         return getMat()*1+getScience()*1+getEnglish()*4+getLiterature()*4;
    }
    
}
