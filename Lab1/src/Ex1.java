import javax.swing.*;

public class Ex1 {


    public static void main(String[] args) {

    convertMethod();
    }


    private static void convertMethod(){

    float convertor=.1f;
    String convertorAsString="";

        while(convertor>0) {

            convertorAsString=JOptionPane.showInputDialog("Please enter a £ value (0 to exit)");
            convertor = Float.parseFloat(convertorAsString);
            if(convertor!=0){
                JOptionPane.showMessageDialog(null, "£" + String.format("%.2f",convertor)+ " is worth €" +
                        String.format("%.2f", convertor * 1.12490));
            }


        }

    }





}
