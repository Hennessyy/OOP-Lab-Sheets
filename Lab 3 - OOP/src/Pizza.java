public class Pizza {
    private String pizzaName;
    private int toppingNum;
    private String[] toppings;


    //mutator methods

    public void setPizzaName(String pizzaName) {
        this.pizzaName = pizzaName;
    }

    public void setToppingNum(int toppingNum) {
        this.toppingNum = toppingNum;
    }

    public void setToppings(String[] toppings) {
        this.toppings = toppings;
    }

    //accessor methods


    public String getPizzaName() {
        return pizzaName;
    }

    public int getToppingNum() {
        return toppingNum;
    }

    public String[] getToppings() {
        return toppings;
    }


    //no args constructor

    public Pizza(){
        pizzaName="No Pizza";
        toppingNum=0;
        toppings=null;

    }

    public Pizza(String pizzaName,int toppingNum,String[] toppings){
        setPizzaName(pizzaName);
        setToppingNum(toppingNum);
        setToppings(toppings);

    }

   //toString method

    public String toString() {
        return "Pizza Name: "+getPizzaName()+"\nNumber of Toppings"+getToppingNum()+"\nToppings: "+getToppings();
    }

    public String toString1() {
        return "Pizza Name: "+getPizzaName()+"\nNumber of Toppings"+getToppingNum()+"\nToppings: "+pizzaArray(toppings);
    }



    //pizzaArray

    public String pizzaArray(String[] toppings){

        String toppingArray="";

        for(int i=0;i<toppings.length;i++){
            toppingArray += "\n" +toppings[i];
        }

      return toppingArray;
    }


}
