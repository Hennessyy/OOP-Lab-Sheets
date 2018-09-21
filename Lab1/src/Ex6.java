import jdk.nashorn.internal.scripts.JO;

import javax.swing.*;
import java.awt.*;

public class Ex6 {


    public static int counter=1;

    public static void main(String[] args) {



        while(counter<16){

            myMethods.cube(counter);
            counter++;
        }
        displayResult();
    }





    public static void displayResult(){


        
        JOptionPane.showMessageDialog(null,myMethods.textArea);


    }
}
