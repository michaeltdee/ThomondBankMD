package thomondbankgui;

import javax.swing.*;

public class thomondbankgui1 {
    private JPanel rootPanel;
    private JTabbedPane tabbedPane1;
    private JPanel bankOfficerTabbedPane;
    private JPanel userTabbedPane;
    private JLabel accountIdLbl;
    private JTextField accountIdTxt;
    private JButton createAccountBtn;
    private JButton changeAIRBtn;
    private JButton changeOverdraftLimitBtn;
    private JRadioButton depositrRadBtn;
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
}
