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
                for (Account account : thomondAccounts){
                    int newCustNo = Integer.parseInt(accountIdTxt.getText());
                    if (depositRadBtn.isSelected()){
                        thomondAccounts.add(new DepositAccount(thomondAccounts.size(), newCustNo));
                    }
                    else if (currentRadBtn.isSelected()){
                        double overdraftAmount = Double.parseDouble(overdraftTxt.getText());
                        thomondAccounts.add(new CurrentAccount(thomondAccounts.size(), newCustNo, overdraftAmount));
                    }
                }
            }
        });
    }
}
