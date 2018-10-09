import javax.swing.*;

public class VendingDriver {
    public static void main(String[] args) {

        int buy,fill=0;

        VendingMachine vending = new VendingMachine();

        vending.setSodaCans(25);
        vending.setToken(0);

        JOptionPane.showMessageDialog(null, vending.toString());

        buy=Integer.parseInt(JOptionPane.showInputDialog("How many soda cans do you want to buy?"));

        vending.purchase(buy);

        JOptionPane.showMessageDialog(null,vending.toString());

        fill = Integer.parseInt(JOptionPane.showInputDialog("How many cans are you filling up the machine with?"));

        vending.fillUp(fill);

        JOptionPane.showMessageDialog(null,vending.toString());


    }




}
