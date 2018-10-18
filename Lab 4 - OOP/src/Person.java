public class Person {

    private String name;

    //mutator method


    public void setName(String name) {
        this.name = name;
    }


    //accessor method


    public String getName() {
        return name;
    }


    //no arg con

    public Person(){

      name="No Owner Specified";
    }

    //1 arg construcot

    public Person(String name){

        setName(name);
    }


    //toString

    public String toString(){
        return name;
    }


}
