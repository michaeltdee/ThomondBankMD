package thomondbankgui;

import Model.Account;
import Model.CurrentAccount;
import Model.DepositAccount

import javax.swing.*;
import java.util.ArrayList;

public class thomondbankgui1 extends JFrame {

    public static ArrayList<Account> thomondAccounts = new ArrayList<>();

    private JPanel rootPanel;
    private JTabbedPane tabbedPane1;
    private JPanel bankOfficerTabbedPane;
    private JPanel userTabbedPane;
    private JLabel accountIdLbl;
    private JTextField accountIdTxt;
    private JButton createAccountBtn;
    private JButton changeAIRBtn;
    private JButton changeOverdraftLimitBtn;
    private JRadioButton depositRadBtn;
    private JRadioButton currentRadBtn;
    private JButton withdrawBtn;
    private JButton checkBalanceBtn;
    private JButton logoutBtn;
    private JButton depositBtn;

    public static void main(String[] args) {
        JFrame frame = new JFrame("thomondbankgui1");
        frame.setContentPane(new thomondbankgui1().rootPanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }

    public thomondbankgui1() {
        initComponents();
        populateMyAccounts();
    }

    private void populateMyAccounts() {
// used to populate myAccounts ArrayList with test data
        thomondAccounts.add(new DepositAccount(1, 1));
        thomondAccounts.get(0).deposit(100);
        thomondAccounts.add(new DepositAccount(2, 2));
        thomondAccounts.get(1).deposit(500);
        thomondAccounts.add(new DepositAccount(3, 3));
        thomondAccounts.get(2).deposit(300);
        thomondAccounts.add(new DepositAccount(4, 4));
        thomondAccounts.get(3).deposit(300);
        thomondAccounts.add(new CurrentAccount(4, 1, 100));
        thomondAccounts.add(new CurrentAccount(5, 2, 1000));
        thomondAccounts.add(new CurrentAccount(6, 4, 200));

    }
}