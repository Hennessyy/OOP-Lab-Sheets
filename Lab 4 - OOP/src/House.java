public class House {

    private String address;
    private String type;
    private double price;
    private Person owner;


    //mutator method


    public void setAddress(String address) {
        this.address = address;
    }


    public void setType(String type) {
        this.type = type;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setOwner(String own) {
        this.owner = new Person(own);
    }

    //accessor methods


    public String getAddress() {
        return address;
    }

    public String getType() {
        return type;
    }

    public double getPrice() {
        return price;
    }

    public Person getOwner() {
        return owner;
    }


    //toString method

    public String toString(){
        return "Address: "+getAddress()+"\nType: "+getType()+"\nPrice: "+getPrice()+"\nOwner: "+getOwner();
    }


    //no arg constructor
    public House(){
        this("","",0.0f,"No Name Specified");
    }

    public House(String address,String type,double price,String name){
        setAddress(address);
        setType(type);
        setPrice(price);
        owner = new Person(name);

    }

}
