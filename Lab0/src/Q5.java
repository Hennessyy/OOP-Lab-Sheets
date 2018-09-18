import com.sun.xml.internal.ws.api.streaming.XMLStreamReaderFactory;

import javax.swing.JOptionPane;




public class Q5 {



    public static void main(String[] args) {

    decideMethod();


    }


    private static void decideMethod(){
      String x="ab";
      char y='a';
      String numberOneAsString="",numberTwoAsString="";
      float numberOne=.0f,numberTwo=.0f,answer=.0f;

        x=JOptionPane.showInputDialog("Option A: Addition\nOption S: Subtraction\nOption M: Multiplication\nOption D: Division");
        y=x.charAt(0);

       switch(y){
           case'A': numberOneAsString=JOptionPane.showInputDialog("Please enter your first value");
                    numberOne=Float.parseFloat(numberOneAsString);
                    numberTwoAsString=JOptionPane.showInputDialog("Please enter your second value");
                    numberTwo=Float.parseFloat(numberTwoAsString);
                    answer=(numberOne+numberTwo);

                    JOptionPane.showMessageDialog(null,numberOne+"+"+numberTwo+"="+answer);

                    break;
           case'S': numberOneAsString=JOptionPane.showInputDialog("Please enter your first value");
                    numberOne=Float.parseFloat(numberOneAsString);
                    numberTwoAsString=JOptionPane.showInputDialog("Please enter your second value");
                    numberTwo=Float.parseFloat(numberTwoAsString);
                    answer=(numberOne-numberTwo);

                    JOptionPane.showMessageDialog(null,numberOne+"-"+numberTwo+"="+answer);

                        break;
           case'M':
                    numberOneAsString=JOptionPane.showInputDialog("Please enter your first value");
                    numberOne=Float.parseFloat(numberOneAsString);
                    numberTwoAsString=JOptionPane.showInputDialog("Please enter your second value");
                    numberTwo=Float.parseFloat(numberTwoAsString);
                    answer=(numberOne*numberTwo);

                    JOptionPane.showMessageDialog(null,numberOne+"*"+numberTwo+"="+answer);

                    break;

           case'D':
                    numberOneAsString=JOptionPane.showInputDialog("Please enter your first value");
                    numberOne=Float.parseFloat(numberOneAsString);
                     numberTwoAsString=JOptionPane.showInputDialog("Please enter your second value");
                     numberTwo=Float.parseFloat(numberTwoAsString);
                    answer=(numberOne/numberTwo);

                    JOptionPane.showMessageDialog(null,numberOne+"/"+numberTwo+"="+answer);

                    break;

            default: JOptionPane.showMessageDialog(null,"Sorry the input you entered is not valid.");
                    break;
       }



    }




}
