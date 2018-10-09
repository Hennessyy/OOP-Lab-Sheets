/*import javax.swing.*;
import java.awt.*;

public class BookDriver {

    public static void main(String[] args) {

     //Book book1 = new Book();



     JOptionPane.showMessageDialog(null,book1);

     book1.setTitle(JOptionPane.showInputDialog("Please enter title of the book"));
     while(book1.getISBN().length()<10||book1.getISBN().length()>13) {
         book1.setISBN(JOptionPane.showInputDialog("Enter books ISBN"));
     }
     book1.setPrice(Double.parseDouble(JOptionPane.showInputDialog("Enter the price of the book")));
     book1.setNumPages(Integer.parseInt(JOptionPane.showInputDialog("Enter number of pages in the books")));

     JOptionPane.showMessageDialog(null,book1);



    display();

    }


    public static void display(){

        Book[] books = new Book[1];
        boolean fixProblem=false;

        for(int i=0;i<books.length;i++){

            books[i] = new Book(JOptionPane.showInputDialog("Book Name"),
                    JOptionPane.showInputDialog("ISBN"),
                    Integer.parseInt(JOptionPane.showInputDialog("Pages")),
                    Double.parseDouble(JOptionPane.showInputDialog("Price")));

               do {
                    books[i].setISBN(JOptionPane.showInputDialog("Re-type ISBN"));

                }while(books[i].getISBN().length()>14||books[i].getISBN().length()<10);


        }




        JTextArea jArea = new JTextArea();

        for(int j=0;j<books.length;j++){

         jArea.append("Title: "+books[j].getTitle()+"\n");
         jArea.append("ISBN: "+books[j].getISBN()+"\n");
         jArea.append("Price: "+books[j].getPrice()+"\n");
         jArea.append("Number Of Pages: "+books[j].getNumPages()+"\n\n");
        }

        JOptionPane.showMessageDialog(null,jArea);

    }
}
*/