import javax.swing.JOptionPane;


public class Q4 {
    static int i=0;

    public static void main(String[] args) {

        int totaler=0,total=0;


        totaler=loopMethod(totaler);
        total+=totaler;

        displayResult(total);
    }



    private static int loopMethod(int a){

        String numberAsString="";
        int x=0,totalAmount=0,counter=0,lengthOfString;


       while(!numberAsString.equals("q")) {

           numberAsString = JOptionPane.showInputDialog("Please enter a number <Q to exit>");


           if(!numberAsString.equals("q")){


               x = Integer.parseInt(numberAsString);

               totalAmount+=x;
               counterMethod();


           }







       }

    return totalAmount;
    }

    public static int counterMethod(){

        i++;

        return i;

    }


    private static void displayResult(int a){

        JOptionPane.showMessageDialog(null,"The total amount is: "+a+
                "\nThe cycle ran: "+(counterMethod()-1));


    }



}
