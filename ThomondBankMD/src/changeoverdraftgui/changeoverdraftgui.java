package changeoverdraftgui;


import Model.Account;
import Model.CurrentAccount;
import Model.DepositAccount;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import static thomondbankgui.thomondbankgui1.thomondAccounts;

public class changeoverdraftgui {
    public JPanel rootPanel;
    private JTextField accountIdtxt;
    private JTextField currentOverdraftTxt;
    private JTextField newOverdraftTxt;
    private JLabel enterAccountIDLbl;
    private JLabel currentOverdraftLbl;
    private JLabel newOverdraftLbl;
    private JButton changeOverdraftLbl;


    public changeoverdraftgui() {
        accountIdtxt.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                boolean accountFound = false;  // Flag to check if the account is found

                try {
                    // Parse the account ID from the text field
                    int accountId = Integer.parseInt(accountIdtxt.getText().trim());

                    for (Account account : thomondAccounts) {
                        if (account.getId() == accountId && account instanceof CurrentAccount) {

                            CurrentAccount selectedAccount = (CurrentAccount) account;

                            currentOverdraftLbl.setVisible(true);
                            newOverdraftLbl.setVisible(true);
                            currentOverdraftTxt.setVisible(true);
                            newOverdraftTxt.setVisible(true);
                            currentOverdraftTxt.setText(String.valueOf(selectedAccount.getOverdraft()));

                            accountFound = true;
                            break;
                        }

                        else if (account.getId() == accountId && account instanceof DepositAccount) {
                            JOptionPane.showMessageDialog(rootPanel, "Cannot change overdraft for deposit account");
                            accountFound = true;
                            break;
                        }
                    }

                    if (!accountFound) {
                        JOptionPane.showMessageDialog(rootPanel, "Account doesn't exist");
                    }
                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(rootPanel, "Please enter a valid account ID");
                }
            }
        });
        changeOverdraftLbl.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    double newOverdraft = Double.parseDouble(newOverdraftTxt.getText().trim());

                    int accountId = Integer.parseInt(accountIdtxt.getText().trim());


                    for (Account account : thomondAccounts) {
                        if (account.getId() == accountId && account instanceof CurrentAccount) {

                            CurrentAccount selectedAccount = (CurrentAccount) account;
                            selectedAccount.setOverdraft(newOverdraft);


                            JOptionPane.showMessageDialog(rootPanel, "Overdraft updated to: €" + newOverdraft);
                            break;
                        }
                    }
                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(rootPanel, "Please enter a valid overdraft value.");
                }
            }
        });
    }
}
