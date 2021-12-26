/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author burakdemir
 */
public class Account {
    private String userName;
    private String password;
    private int budget;

   public Account(String userName,String password,int budget){
       this.userName=userName;
       this.password=password;
       this.budget=budget;
   }
    
   public void setuserName(String userName){
       this.userName=userName;
   }
   public String getuserName(){
       return userName;
   }
   public void setpassword(String password){
       this.password=password;
   }
   public String getpassword(){
       return password;
   }
   public void setbudget(int budget){
       this.budget=budget;
   }
   public int getbudget(){
       return budget;
   }
   
   public void getMoney(int money){
       
       if (money<=budget) {
           budget-=money;
           System.out.println("New Budget : "+budget);
       }
       else {
           System.out.println("Your budget is not enough, budget : "+budget);
       }

   }
   public void addMoney(int money){
       
           
           budget+=money;
           System.out.println("New Budget : "+budget);
      
         
       

   }
   
    
    
}
