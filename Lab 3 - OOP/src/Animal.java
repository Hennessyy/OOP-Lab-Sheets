public class Animal {
    private String type;
    private String[] continents;
    private double weight;
    private int age;

    //mutator methods


    public void setType(String type) {
        this.type = type;
    }

    public void setContinents(String[] continents) {
        this.continents = continents;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public void setAge(int age) {
        this.age = age;
    }

    //accessor methods


    public String getType() {
        return type;
    }

    public String[] getContinents() {
        return continents;
    }

    public double getWeight() {
        return weight;
    }

    public int getAge() {
        return age;
    }

    //toString method

    public String toString(){
        return "Type: "+getType()+"\nContinents:"+arrayToString(continents)+"\nWeight: "+getWeight()+"\nAge: "+getAge();

    }

    //no args constructor
    public Animal(){
        this("Not specified",null,0.0f,0);
    }

    //4 argument constructor

    public Animal(String type,String[] continents,double weight, int age){
        setType(type);
        setContinents(continents);
        setWeight(weight);
        setAge(age);

    }

    public String arrayToString(String[] continents){

        String arrayString="";

        for(int i=0;i<continents.length;i++){
            arrayString += "\n"+continents[i];

        }


        return arrayString;
    }





}
