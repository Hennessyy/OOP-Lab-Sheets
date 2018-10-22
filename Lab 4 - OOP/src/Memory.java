public class Memory {

    private String type;
    private int size;



    //no arg constructor
    public Memory(){
        this("Type Unknown",0);
    }


    //2 arg constructor
    public Memory(String type, int size){

        setType(type);
        setSize(size);
    }

    //toString method

    public String toString(){
        return "Type: "+getType()+"\nSize: "+getSize();
    }



    //mutator methods

    public void setType(String type){
        this.type = type;
    }

    public void setSize(int size){
        this.size = size;
    }

    //accessor methods

    public String getType(){
        return type;
    }

    public int getSize(){
        return size;
    }

}
