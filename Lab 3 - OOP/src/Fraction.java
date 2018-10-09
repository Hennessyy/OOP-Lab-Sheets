public class Fraction {

    private int numerator;
    private int denominator;

    //mutator methods


    public void setNumerator(int numerator) {
        this.numerator = numerator;
    }

    public void setDenominator(int denominator) {
        this.denominator = denominator;
    }

    //accessor methods


    public int getNumerator() {
        return numerator;
    }

    public int getDenominator() {
        return denominator;
    }

    //toString method

    public String toString(){
        return numerator+"/"+denominator;
    }

    //no args constructor

    public Fraction(){
        this(0,1);


    }

    //2 args constructor

    public Fraction(int numerator,int denominator){

        setNumerator(numerator);
        setDenominator(denominator);

    }

    //addition method

    public String addition(int a, int b,   int c,int d){

        int numeratorAnswer=((a*d)+(c*b));
        int denominatorAnswer= (b*d);

        return numeratorAnswer+"/"+denominatorAnswer;
    }

    //subtraction method
    /*public String subtraction(){

    }

    //multiplication method
    public String multiplication(){

    }

    //division method
    public String division(){

    }
*/

}
