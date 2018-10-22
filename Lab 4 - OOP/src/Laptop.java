public class Laptop extends Computer{

    private boolean touchScreen;


    //no arg constructor

    public Laptop(){
        this.touchScreen=touchScreen;
    }

    //1 arg constructor

    public Laptop(String id, String make, String type, int size, boolean touchScreen){
        super(id,make,type,size);
        setTouchScreen(touchScreen);
    }


    //toString method

    public String toString(){
        return super.toString()+"\nTouch Screen: "+touchScreen;
    }



    //mutator method

    public void setTouchScreen(boolean touchScreen){
        this.touchScreen=touchScreen;
    }

    //accessor method

    public boolean isTouchScreen() {
        return touchScreen;
    }






}
