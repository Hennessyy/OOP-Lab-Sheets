import jdk.nashorn.internal.scripts.JO;

import javax.swing.JOptionPane;



public class Q1 {





    public static void main(String[] args) {
        String studentName="",className="";
        int snackAmount=0,owedAmount=0;


        studentName=firstRequest(studentName);
        className=secondRequest(className);
        snackAmount=thirdRequest(snackAmount);
        owedAmount=snackAmount*2;
        displayResult(studentName,className,snackAmount,owedAmount);


    }


    private static String firstRequest(String n){

        String name=JOptionPane.showInputDialog("Please enter your name");

        return name;
    }

    private static String secondRequest(String c){

        String className=JOptionPane.showInputDialog("Please enter your class");

        return className;
    }

    private static int thirdRequest(int s){

        String snackCounterString=JOptionPane.showInputDialog("How many snacks kid?");
        int snackCounter=Integer.parseInt(snackCounterString);
        return snackCounter;

    }

    private static void displayResult(String n,String c,int s,int g) {


        JOptionPane.showMessageDialog(null,"Name: "+n+"\nClass: "+c+"\nSnacks Requested: "+s+
                "\nThe amount owed is "+g);


    }



}
