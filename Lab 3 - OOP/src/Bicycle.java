public class Bicycle {
    private String name;
    private double value;
    private String make;

    //mutator methods


    public void setName(String name) {
        this.name = name;
    }

    public void setValue(double value) {
        this.value = value;
    }

    public void setMake(String make) {
        this.make = make;
    }

    //accessor methods


    public String getName() {
        return name;
    }

    public double getValue() {
        return value;
    }

    public String getMake() {
        return make;
    }

    //toString method
    public String toString(){
        return "Owner: "+getName()+"\nValue: €"+String.format("%.2f",getValue())+"\nMake: "+getMake();
    }

    //no args constructor

    public Bicycle(){
        this("No owner specified",0,"no make specified");
    }


    //3 arg constructor

    public Bicycle(String name,double value,String make){

        setName(name);
        setValue(value);
        setMake(make);

    }

    public void increasePrice(double value){

       this.value += 10;

    }

    public double calcValue(double bike1,double bike2){

     double returnVal;
      returnVal= bike1+bike2;

      return returnVal;

    }


}
