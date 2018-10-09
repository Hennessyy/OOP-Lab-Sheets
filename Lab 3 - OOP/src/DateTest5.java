import javax.swing.JOptionPane;
import java.util.*;
import java.text.*;

/*public class DateTest5 {
    public static void main(String[] args) {


    int firstDay=0,firstMonth=0,firstYear=0,secondDay=0,secondMonth=0,secondYear=0,testDate=0, difference;



    while(testDate==0)
        {

        firstDay = Integer.parseInt(JOptionPane.showInputDialog("Enter day of first month"));
        firstMonth = Integer.parseInt(JOptionPane.showInputDialog("Enter month for first month"));
        firstMonth=firstMonth-1;
        firstYear=Integer.parseInt(JOptionPane.showInputDialog("Enter day of first month"));

        secondDay=Integer.parseInt(JOptionPane.showInputDialog("Enter day of second month"));
        secondMonth=Integer.parseInt(JOptionPane.showInputDialog("Enter month for second month"));
        secondMonth=secondMonth-1;
        secondYear=Integer.parseInt(JOptionPane.showInputDialog("Enter day of second month"));


        if((firstYear==secondYear)&& ((firstMonth<secondMonth) || (firstMonth==secondMonth && firstDay<secondDay))){
            testDate++;

        }

    }

    GregorianCalendar borrowDate = new GregorianCalendar(firstYear,(firstMonth),firstDay);
    GregorianCalendar returnDate = new GregorianCalendar(secondYear,(secondMonth),secondDay);


    SimpleDateFormat s = new SimpleDateFormat("dd  MM  yyyy");

    difference= returnDate.get(Calendar.DAY_OF_YEAR) - borrowDate.get(Calendar.DAY_OF_YEAR) + ((secondYear-firstYear)*365);

    JOptionPane.showMessageDialog(null,"Borrow Date: "+s.format(borrowDate.getTime())+"\nReturn Date: "+s.format(returnDate.getTime())+
            "\n\nDifference in days: "+difference
    );

    }
}*/

