import javax.swing.*;

public class HouseDriver {
    public static void main(String[] args) {


        House house = new House();
        house.setAddress(JOptionPane.showInputDialog("Enter address of house"));
        house.setType(JOptionPane.showInputDialog("Enter type of house"));
        while(house.getPrice()<=0.0) {
            house.setPrice(Double.parseDouble(JOptionPane.showInputDialog("Enter price of house")));
        }
        house.setOwner(JOptionPane.showInputDialog("Enter owners name"));

        JOptionPane.showMessageDialog(null,house.toString());


    }
}
