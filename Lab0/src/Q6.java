import javax.swing.JOptionPane;




public class Q6 {


    public static void main(String[] args) {


    calcMethod();
    }






    private static void calcMethod(){


    float firstNum=.0f,secondNum=.0f;
    char nameIntake='x';
    String nameIntakeString="xx",firstNumAsString,secondNumAsString;


    while(nameIntake!='Q'){

        nameIntakeString=JOptionPane.showInputDialog("Options\nAddition: A\nSubtraction: S\nMultiplication: M\nDivision: D\nQ to exit.");
        nameIntake=nameIntakeString.charAt(0);

       switch(nameIntake){

            case 'A':
                firstNumAsString=JOptionPane.showInputDialog("Please enter first number");
                firstNum=Float.parseFloat(firstNumAsString);
                secondNumAsString=JOptionPane.showInputDialog("Please enter second number");
                secondNum=Float.parseFloat(secondNumAsString);
                JOptionPane.showMessageDialog(null,firstNum + (" + ") + secondNum + " = "+(firstNum+secondNum));

                break;
            case 'S':
                firstNumAsString=JOptionPane.showInputDialog("Please enter first number");
                firstNum=Float.parseFloat(firstNumAsString);
                secondNumAsString=JOptionPane.showInputDialog("Please enter second number");
                secondNum=Float.parseFloat(secondNumAsString);
                JOptionPane.showMessageDialog(null,firstNum + (" - ") + secondNum + " = "+(firstNum-secondNum));

                break;

            case 'M':
                firstNumAsString=JOptionPane.showInputDialog("Please enter first number");
                firstNum=Float.parseFloat(firstNumAsString);
                secondNumAsString=JOptionPane.showInputDialog("Please enter second number");
                secondNum=Float.parseFloat(secondNumAsString);
                JOptionPane.showMessageDialog(null,firstNum + (" * ") + secondNum + " = "+(firstNum*secondNum));

                break;

            case 'D':
                firstNumAsString=JOptionPane.showInputDialog("Please enter first number");
                firstNum=Float.parseFloat(firstNumAsString);
                secondNumAsString=JOptionPane.showInputDialog("Please enter second number");
                secondNum=Float.parseFloat(secondNumAsString);
                JOptionPane.showMessageDialog(null,firstNum + (" / ") + secondNum + " = "+(firstNum/secondNum));

                break;
           case 'Q':
               break;

             default: JOptionPane.showMessageDialog(null,"Incorrect input - Please try again.");
                 break;

        }







    }





    }











}
