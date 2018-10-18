import javax.swing.*;

public class AccountDriver {

    public static void main(String[] args) {

        SavingsAccount account = new SavingsAccount();

        JOptionPane.showMessageDialog(null,account.toString());



    }
}
