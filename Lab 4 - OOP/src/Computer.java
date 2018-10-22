public class Computer implements IDable {

    private String id;
    private String make;
    protected Memory memory;



    //no arg constructor
    public Computer(){
        this("Not Specified","Not Specified","Not Specified",0);
    }

    // arg constructor
    public Computer(String id,String make,String type,int size){
        setID(id);
        setMake(make);
        setMemory(new Memory(type,size));
    }


    //toString method

    public String toString(){
        return "Id:"+getId()+"\nMake: "+getMake()+"\nMemory: "+getMemory();
    }


    //mutator methods
    public void setMake(String make) {
        this.make = make;
    }

    public void setID(String id) {
        this.id=id;
    }

    public void setMemory(Memory memory) {
        this.memory = memory;
    }

    //accessor methods


    public String getId() {
        return id;
    }

    public String getMake() {
        return make;
    }

    public Memory getMemory() {
        return memory;
    }


}
