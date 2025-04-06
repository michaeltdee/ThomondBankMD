package changeairgui;

import Model.Account;
import Model.CurrentAccount;
import Model.DepositAccount;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class changeairgui {
    public JPanel rootPanel;
    private JRadioButton airDepositRadBtn;
    private JRadioButton airCurrentRadBtn;
    private JTextField currentAIRTxt;
    private JTextField newAIRTxt;
    private JLabel accountTypeLbl;
    private JLabel currentAIRLbl;
    private JLabel newAIRLbl;
    private JButton confirmChangeAIRBtn;
    private DepositAccount depositAccount;
    private CurrentAccount currentAccount;


    public changeairgui() {
        airDepositRadBtn.setSelected(true);
        currentAIRTxt.setText(String.valueOf(DepositAccount.getAIR()));
        airDepositRadBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                currentAIRTxt.setText(String.valueOf(DepositAccount.getAIR()));
            }
        });
        airCurrentRadBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                currentAIRTxt.setText(String.valueOf(CurrentAccount.getAIR()));
            }
        });
        confirmChangeAIRBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double newAIR = Double.parseDouble(newAIRTxt.getText());

                if (airDepositRadBtn.isSelected()) {
                    depositAccount.setAIR(newAIR);
                    JOptionPane.showMessageDialog(rootPanel, "Changed Deposit AIR to " + newAIR);
                }
                else if (airCurrentRadBtn.isSelected()) {
                    currentAccount.setAIR(newAIR);
                    JOptionPane.showMessageDialog(rootPanel, "Changed Current AIR to " + newAIR);
                }
            }
        });
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("changeairgui");
        frame.setContentPane(new changeairgui().rootPanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}

