import javax.swing.JOptionPane;




public class Q3 {

    public static void main(String[] args) {

     String userName="";
     float userIncome=.0f;
     double taxedAmount;


     userName=requestName(userName);
     userIncome=requestIncome(userIncome);
     taxedAmount=calcTax(userIncome);
     displayResult(userName,userIncome,taxedAmount);
    }



    private static String requestName(String a){

       String nameOfUser = JOptionPane.showInputDialog("Enter your name");

      return nameOfUser;
    }

    private static float requestIncome(float a){

        float incomeReturn=.0f;
        String incomeAsString = JOptionPane.showInputDialog("Enter your income");

        incomeReturn=Float.parseFloat(incomeAsString);

        return incomeReturn;
    }



    private static double calcTax(float b){
        double x=.0f,y=.0f,j=.0f;


     if(b<20000.01){

         return x;

     }else if(b>20000&&b<36000.01){

      x=b-20000;

      y= x*.2;

      return y;


     }
     else{

     x=b-36000;

     y=x*.41;

     j=y+3200;

     return j;

     }




    }




    private static void displayResult(String a,float b,double c){

    if(c==0){
        JOptionPane.showMessageDialog(null, "Name: "+ a +"\nGross Income: " +b+
                "\nTax Rate: 0\nAmount Taxed: " + c + "\nIncome After Tax: "+b);


    }else if(c>0&&c<7200.01){

        JOptionPane.showMessageDialog(null, "Name: "+ a +"\nGross Income: " +b+
                "\nTax Rate: 20\nAmount Taxed: " + c + "\nIncome After Tax: "+(b-c));
    }
    else
        JOptionPane.showMessageDialog(null, "Name: "+ a +"\nGross Income: " +b+
                "\nTax Rate: 41\nAmount Taxed: " + c + "\nIncome After Tax: "+(b-c));





    }


}
