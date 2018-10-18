public class SavingsAccount extends BankAccount {


    private double balance;

    //mutator method


    public void setBalance(double balance) {
        this.balance = balance;
    }



    //accessor method

    public double getBalance(){
        return balance;
    }

    //no constructor method

    public SavingsAccount(){

        this("Name not specified",0,0.0f);

    }

    public SavingsAccount(String name,int accnum,double amount){

        super(name,accnum);
        setBalance(amount);

    }


    public void lodge(double amount) {

        this.balance = this.balance + amount;

    }


    public void withdraw(double amount) {

        this.balance = this.balance - amount;
    }



    public double calcTax() {

        double tax = getBalance()*.2;

        return tax;
    }


    public String toString(){

        return "Name: "+getName()+"\nAccount Number: "+getAccnum()+"\nBalance: "+getBalance();

    }



}
