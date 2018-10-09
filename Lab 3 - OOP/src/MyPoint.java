public class MyPoint {
    private double xVal;
    private double yVal;

    //mutator methods


    public void setxVal(double xVal) {
        this.xVal = xVal;
    }

    public void setyVal(double yVal) {
        this.yVal = yVal;
    }

    //accessor methods


    public double getxVal() {
        return xVal;
    }

    public double getyVal() {
        return yVal;
    }

    //toString method

    public String toString(){
        return "X Value: "+getyVal()+"\nY Value: "+getyVal();
    }

    //no args constructor

    public MyPoint(){
        xVal=0;
        yVal=0;
    }

    public MyPoint(double xVal, double yVal){

        setxVal(xVal);
        setyVal(yVal);


    }

    public void moveHorizontally(double newValOne){

    this.xVal+=newValOne;
    }

    public void moveVertically(double newValTwo){

    this.yVal+=newValTwo;
    }

    public void translate(double xVal,double yVal){

        moveHorizontally(xVal);
        moveVertically(yVal);

    }

    public String distanceFromOrigin(){
         return String.format("%.2f",Math.hypot(xVal,yVal));
    }
}
