import javax.swing.*;

public class VendingMachine {
    private int token;
    private int sodaCans;

    //mutator methods


    public void setToken(int token) {
        this.token = token;
    }

    public void setSodaCans(int sodaCans) {
        this.sodaCans = sodaCans;
    }


    //accessor methods
    public int getTokenCount() {
        return token;
    }

    public int getCanCount() {
        return sodaCans;
    }

    //toString
    public String toString(){
        return "Number of tokens: "+getTokenCount()+"\nNumber of soda cans: "+getCanCount();
    }

    //no args constructor

    public VendingMachine(){
        this(0,0);
    }

    public VendingMachine(int token,int sodaCans){
        setToken(token);
        setSodaCans(sodaCans);
    }

    public void purchase(int x){

        if(getCanCount()<x){
            JOptionPane.showMessageDialog(null,"Not enough cans avaialable");
            return;
        }

        this.sodaCans=sodaCans-x;

       this.token=token+x;


    }

    public void fillUp(int x){
        this.sodaCans=sodaCans+x;
    }



}
