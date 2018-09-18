import javax.swing.*;

public class Ex2 {




    public static void main(String[] args) {
     textMethod();
    }



    public static void textMethod(){

        JTextArea textArea = new JTextArea("");

        String txtForArea="Yards\tInches\n-------\t--------";

        textArea.append(txtForArea);

        for(int i=1;i<11;i++){

            textArea.append("\n"+i+"\t"+i*36);

        }

        JOptionPane.showMessageDialog(null,textArea);



    }





}
