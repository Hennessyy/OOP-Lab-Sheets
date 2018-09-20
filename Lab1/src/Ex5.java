import javax.swing.*;

public class Ex5 {



    public static void main(String[] args) {


    mathMethod();

    }


    public static void mathMethod(){

    int a=1,b=6,c=-16;

    int plusResult = (int)(-b+(Math.sqrt(Math.pow(b,2)-(4*(a)*(c)))))/(2*a);

    int minusResult = (int)(-b-(Math.sqrt(Math.pow(b,2)-(4*(a)*(c)))))/(2*a);


        JOptionPane.showMessageDialog(null,"Positive root variable is "+ plusResult+
                "\nNegative root variable is "+minusResult);

    }



}


