public abstract class BankAccount implements Transactable,Taxable {

    protected String name;
    protected int accnum;


    //mutator methods


    public void setName(String name) {
        this.name = name;
    }

    public void setAccnum(int accnum) {
        this.accnum = accnum;
    }


    //accessor methods


    public String getName() {
        return name;
    }

    public int getAccnum() {
        return accnum;
    }


    //no arg constructor


    public BankAccount(){

     this("Unknown",0);


    }


    public BankAccount(String name,int accnum){

        setName(name);
        setAccnum(accnum);

    }


    //toString method






}








