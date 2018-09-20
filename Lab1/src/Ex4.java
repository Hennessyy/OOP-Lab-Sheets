import javax.swing.*;

public class Ex4 {

    static String fullName;

    public static void main(String[] args) {


     fullName=inputData();
     outputData(fullName);

    }


    public static String inputData(){


        String nameString= JOptionPane.showInputDialog("Please enter your full name");



        return nameString;
    }


    public static void outputData(String name){

        int charAmount=0;

        for(int i=0;i<name.length();i++){

            if(name.charAt(i)!=' '){
                 charAmount++;
            }

        }



        char firstInitial=name.charAt(0);
        String surname = name.substring(name.lastIndexOf(' '),name.length());



     JOptionPane.showMessageDialog(null,"There are "+charAmount+" characters in your name\n"+
             "Initial of the firtname is: "+firstInitial+"\nName in all caps is: "+ name.toUpperCase()+
             "\nSurname: "+surname);



    }


}
