
import java.util.Scanner;
import javax.swing.text.StyleConstants;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author burakdemir
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String menu ="1-Find Literature's 1.Student\n"+
                "2-Find Math's 1.Student\n"+
                "q for Quit\n "+
                "**************************************";
        while (true) {            
            System.out.println(menu);
            String option=scanner.nextLine();
            System.out.println("1.student name :");
            String name=scanner.nextLine();
            System.out.println("1.student mat's true question :");
            int mat1=scanner.nextInt();
            System.out.println("1.student science's true question :");
            int science1=scanner.nextInt();
            System.out.println("1.student english's true question :");
            int english1=scanner.nextInt();
            System.out.println("1.student literature's true question :");
            int literature1=scanner.nextInt();
            scanner.nextLine();
            System.out.println("**************************************");
            System.out.println("2.student name :");
            String name2=scanner.nextLine();
            System.out.println("2.student mat's true question :");
            int mat2=scanner.nextInt();
            System.out.println("2.student science's true question :");
            int science2=scanner.nextInt();
            System.out.println("2.student english's true question :");
            int english2=scanner.nextInt();
            System.out.println("2.student literature's true question :");
            int literature2=scanner.nextInt();
            scanner.nextLine();
            System.out.println("**************************************");
            System.out.println("3.student name :");
            String name3=scanner.nextLine();
            System.out.println("3.student mat's true question :");
            int mat3=scanner.nextInt();
            System.out.println("3.student science's true question :");
            int science3=scanner.nextInt();
            System.out.println("3.student english's true question :");
            int english3=scanner.nextInt();
            System.out.println("3.student literature's true question :");
            int literature3=scanner.nextInt();
            scanner.nextLine();
            
            
            if (option.equals("1")){
                    Literature student1=new Literature(mat1, science1, english1, literature1, name);
                    Literature student2=new Literature(mat2, science2, english2, literature2, name2);
                    Literature student3=new Literature(mat3, science3, english3, literature3, name3);
                    Literature numberOne = first(student1,student2,student3);
                    System.out.println(numberOne.getName());
            }
            if (option.equals("2")) {
                    Math student1 =new Math(mat1, science1, english1, literature1, name);
                    Math student2 = new Math(mat2, science2, english2, literature2, name2);
                    Math student3 =new Math(mat3, science3, english3, literature3, name3);
                    Math numberOne = first(student1,student2,student3);
                    numberOne.getName();
                    System.out.println(numberOne.getName());
                    
            }
            
            
                    
                    
                    
                
                
            
        }
    }
    
    public static <E extends Students> E first (E e1,E e2,E e3){
                if (e1.calculate_point()> e2.calculate_point()&& e1.calculate_point()> e3.calculate_point()) 
                    {
            
                            return e1;
                    }
                 
                else if (e2.calculate_point()> e1.calculate_point()&& e2.calculate_point()> e3.calculate_point()) {
            
                    return e2;
                }
                else if (e3.calculate_point()> e2.calculate_point()&& e3.calculate_point()> e1.calculate_point()) {
            
                 return e3;
                   }
                    else {
                         return e1;
                        }
            }
}
