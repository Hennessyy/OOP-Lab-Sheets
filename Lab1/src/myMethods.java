import javax.swing.*;

public class myMethods {


    public static JTextArea textArea = new JTextArea();


    public static void cube(int request) {

        int returnInt = (int) Math.pow(request, 3);

        if (Ex6.counter == 1) {
            textArea.append("Number\tCubed");
        }
        textArea.append("\n" + Ex6.counter + "\t" + returnInt);

    }
}