import javax.swing.JOptionPane;

public class Q2 {





    public static void main(String[] args) {
        String firstName="",initials="",surname="";
        float totalCycled=.0f;


        firstName=firstRequest(firstName);
        initials=initialOfName(initials);
        surname=surnameRequest(surname);
        totalCycled=amountCycled(totalCycled);

        if(totalCycled<=10){
           lowerBracket(firstName,initials,surname,totalCycled);
        }else
            higherBracket(firstName,initials,surname,totalCycled);

    }

    private static String firstRequest(String c){

        String username=JOptionPane.showInputDialog("Please enter your first name");

        return username;
    }

    private static String initialOfName(String b){

        String usernamex=JOptionPane.showInputDialog("Please enter your initials");

        return usernamex;
    }

    private static String surnameRequest(String g){

        String usernamey=JOptionPane.showInputDialog("Please enter your last name");

        return usernamey;

    }



    private static float amountCycled(float l){

        String amountAsString=JOptionPane.showInputDialog("Please enter the amount you cycled");
        float amount = Float.parseFloat(amountAsString);



        return amount;
    }


    private static void lowerBracket(String y,String a, String b, float x){

        double charity = x*.07;


        JOptionPane.showMessageDialog(null,"First Name: " + y + "\nInitials: " + a +
                "\nLast Name: "+b +"\n Amount raised: €"+String.format("%.2f",charity));


    }

    private static void higherBracket(String y,String a, String b, float x){

        double charityTwo = x-10;
        double lol = charityTwo*.10;
        double finalAnswer = lol +.70;

        JOptionPane.showMessageDialog(null,"First Name: " + y + "\nInitials: " + a +
                "\nLast Name: "+b +"\n Amount raised: €"+String.format("%.2f",finalAnswer));

    }










}
