import javax.swing.*;

public class makeLaptop {

    public static Computer[] computer = new Computer[3];

    public static void main(String[] args) {
        //Laptop laptop = new Laptop();
        //laptop = lTopDesign();
        //JOptionPane.showMessageDialog(null,laptop.toString());
        //Computer comp = new Computer();
        arrayDesign();



    }

    public static Laptop lTopDesign() {

        String id = JOptionPane.showInputDialog("Enter Id of Laptop");
        String make = JOptionPane.showInputDialog("Enter make of Laptop");
        String type = JOptionPane.showInputDialog("Enter type of memory");
        int size = Integer.parseInt(JOptionPane.showInputDialog("Enter size of memory"));
        boolean screen = (JOptionPane.showConfirmDialog(null, "Does it have a touch screen?", "Yes/No", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION);

        Laptop finalLTopDesign = new Laptop(id, make, type, size, screen);
        return finalLTopDesign;
    }

    public static Computer compDesign() {

        String id = JOptionPane.showInputDialog("Enter id of Computer");
        String make = JOptionPane.showInputDialog("Enter make of Computer");
        String type = JOptionPane.showInputDialog("Enter type of memory");
        int size = Integer.parseInt(JOptionPane.showInputDialog("Enter size of memory"));

        Computer finalCompDesign = new Computer(id, make, type, size);

        return finalCompDesign;

    }

    public static void arrayDesign() {


        for (int i = 0; i < computer.length; i++) {

            if (JOptionPane.showConfirmDialog(null, "Yes for Computer\nNo For Laptop", "Computer or Laptop", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) {
                computer[i] = compDesign();

            } else {
                computer[i] = lTopDesign();
            }
        }
    }


}