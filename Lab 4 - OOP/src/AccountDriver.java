import javax.swing.*;

public class AccountDriver {

    public static void main(String[] args) {



        SavingsAccount account = new SavingsAccount("Leon Hennessy",123456789,15241.89);

        JOptionPane.showMessageDialog(null,account.toString());

        JOptionPane.showMessageDialog(null,String.format("Tax due on amount is €%.2f",account.calcTax()));

        account.lodge(500.99);

        JOptionPane.showMessageDialog(null,account.toString());

        account.withdraw(499.25);

        JOptionPane.showMessageDialog(null,account.toString());



    }
}
