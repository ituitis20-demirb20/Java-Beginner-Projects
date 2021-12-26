/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author burakdemir
 */
public class Train {
    private int burpee;
    private int pushup;
    private int pullup;
    private int situp;
    
    public void setburpee(int burpee){
        this.burpee=burpee;
    }
    public int getburpee(){
        return burpee;
    }
    public void setpushup(int pushup){
        this.pushup=pushup;
    }
    public int getpushup(){
        return pushup;
    }
    public void setpullup(int pullup){
        this.pullup=pullup;
    }
    public int getpullup(){
        return pullup;
    }
    public void setsitup(int situp){
        this.situp=situp;
    }
    public int getsitup(){
        return situp;
    } 

    public Train(int burpee,int pushup,int pullup,int situp){
        this.burpee=burpee;
        this.pushup=pushup;
        this.pullup=pullup;
        this.situp=situp;
    }
    public void chooseTrain(String train,int num){
        if (train.equals("burpee")) {
            doBurpee(num);
        }
        else if (train.equals("pullup")) {
            doPullup(num);
        }
        else if (train.equals("pushup")) {
            doPushup(num);
        }
        else if (train.equals("situp")) {
            doSitup(num);
        }
        
        
    }
    public boolean isFinished(){
        if (burpee==0&&pushup==0&&pullup==0&&situp==0) {
            return true;
        }
        else{
            return false;
        }
    }
    public void doBurpee(int burpee){
        if (this.burpee>=burpee) {
            this.burpee-=burpee;
            System.out.println("Remain Burpee : "+this.burpee);
        }
        else{
            this.burpee=0;
            System.out.println("Remained : 0 burpee ");
            
        }
    }
    public void doPushup(int pushup){
        if (this.pushup>=pushup) {
            this.pushup-=pushup;
            System.out.println("Remain Pushup : "+this.pushup);
        }
        else{
            this.pushup=0;
            System.out.println("Remained : 0 pushup ");
            
        }
    }
    public void doPullup(int pullup){
        if (this.pullup>=pullup) {
            this.pullup-=pullup;
            System.out.println("Remain pullup : "+this.pullup);
        }
        else{
            this.pullup=0;
            System.out.println("Remained : 0 pullup ");
            
        }
    }
    public void doSitup(int situp){
        if (this.situp>=situp) {
            this.situp-=situp;
            System.out.println("Remain situp : "+this.situp);
        }
        else{
            this.situp=0;
            System.out.println("Remained : 0 situp ");
            
        }
    }
    
    
}
