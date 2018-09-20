import jdk.nashorn.internal.scripts.JO;

import javax.swing.*;
import java.awt.*;

public class Ex6 {


    static int counter=1;
    static JTextArea textArea = new JTextArea();




    public static void main(String[] args) {



        while(counter<16){

            cube(counter);
            counter++;
        }
        displayResult();
    }




    public static void cube(int request){

        int returnInt=(int)Math.pow(request,3);

        if(counter==1){
            textArea.append("Number\tCubed");
        }
        textArea.append("\n"+counter+"\t"+returnInt);




    }

    public static void displayResult(){


        
        JOptionPane.showMessageDialog(null,textArea);


    }
}
