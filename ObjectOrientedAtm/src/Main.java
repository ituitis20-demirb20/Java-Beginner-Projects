
public class Main {
    public static void main(String[] args) {
        ATM atm =new ATM();
        Account account =new Account("admin","password",200);
        
        atm.start(account);
    }
    
   

   
    
}
