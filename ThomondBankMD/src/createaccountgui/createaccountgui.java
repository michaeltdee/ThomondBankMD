package createaccountgui;

import Model.Account;
import Model.CurrentAccount;
import Model.DepositAccount;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import static thomondbankgui.thomondbankgui1.thomondAccounts;

public class createaccountgui {
    public JPanel rootPanel;
    private JRadioButton depositRadBtn;
    private JRadioButton currentRadBtn;
    private JLabel accountTypeLbl;
    private JTextField accountIdTxt;
    private JLabel accountIdLbl;
    private JTextField overdraftTxt;
    private JLabel overdraftLbl;
    private JButton addNewAccountBtn;

    public createaccountgui() {
        depositRadBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                accountIdLbl.setVisible(true);
                accountIdTxt.setVisible(true);
                addNewAccountBtn.setVisible(true);
                overdraftLbl.setVisible(false);
                overdraftTxt.setVisible(false);
            }
        });
        currentRadBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                accountIdLbl.setVisible(true);
                accountIdTxt.setVisible(true);
                overdraftLbl.setVisible(true);
                overdraftTxt.setVisible(true);
                addNewAccountBtn.setVisible(true);
            }
        });
        addNewAccountBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    int newCustNo = Integer.parseInt(accountIdTxt.getText());

                    if (depositRadBtn.isSelected()) {
                        thomondAccounts.add(new DepositAccount(thomondAccounts.size() + 1, newCustNo));
                        JOptionPane.showMessageDialog(null, "Deposit Account created successfully!");
                    } else if (currentRadBtn.isSelected()) {
                        double overdraftAmount = Double.parseDouble(overdraftTxt.getText());
                        thomondAccounts.add(new CurrentAccount(thomondAccounts.size() + 1, newCustNo, overdraftAmount));
                        JOptionPane.showMessageDialog(null, "Current Account created successfully!");
                    } else {
                        JOptionPane.showMessageDialog(null, "Please select an account type.");
                    }
                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(null, "Please enter valid numbers for Account ID and Overdraft.");
                }
            }
        });
    }
}
