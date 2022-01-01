/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author burakdemir
 */
public class Math extends Students{

    public Math(int mat, int science, int english, int literature, String name) {
        super(mat, science, english, literature, name);
    }

    @Override
    int calculate_point() {
         return getMat()*4+getScience()*4+getEnglish()*1+getLiterature()*1;
    }
    
}
