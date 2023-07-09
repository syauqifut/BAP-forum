package VC;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GUI extends JFrame implements ActionListener {
    JPanel panelGrid = new JPanel();
    JPanel panelBorder = new JPanel();

    JButton btn1 = new JButton("1");
    JButton btn2 = new JButton("2");
    JButton btn3 = new JButton("3");
    JButton btn4 = new JButton("4");
    JButton btn5 = new JButton("5");
    JButton btn6 = new JButton("6");
    JButton btn7 = new JButton("7");
    JButton btn8 = new JButton("8");
    JButton btn9 = new JButton("9");
    JButton btnOK = new JButton("OK");
    JTextField txtValue = new JTextField();

    public GUI() {
        setVisible(true);
        setSize(400, 400);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        panelGrid.setLayout(new GridLayout(3, 3));
        panelGrid.add(btn1);panelGrid.add(btn2);panelGrid.add(btn3);
        panelGrid.add(btn4);panelGrid.add(btn5);panelGrid.add(btn6);
        panelGrid.add(btn7);panelGrid.add(btn8);panelGrid.add(btn9);
//        add(panelGrid);

        panelBorder.setLayout(new BorderLayout());
        panelBorder.add(txtValue, BorderLayout.NORTH);
        panelBorder.add(panelGrid, BorderLayout.CENTER);

        setLayout(new GridLayout(1, 2));
        add(btnOK);
        add(panelBorder);

        btnOK.addActionListener(this);
    }
    public static void main(String[] args) {
        new GUI();
//        JFrame frame = new JFrame("My Frame");
//        JButton btnSubmit = new JButton("Submit");
//        JButton btnCancel = new JButton("Cancel");
//        JLabel lblFName = new JLabel("First Name");
//        JTextField txtFName = new JTextField();
//
////        frame.setLayout(new FlowLayout());
////        frame.setLayout(new BorderLayout());
//
//        frame.setLayout(new GridLayout(3, 2, 5, 4));
//        frame.add(lblFName);
//        frame.add(txtFName);
//        frame.add(btnSubmit);
//        frame.add(btnCancel);


    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == btnOK) {
            System.out.println("OK");
            JOptionPane.showMessageDialog(null, txtValue.getText());
        }
        else if (e.getSource() == btn1) {
            txtValue.setText(txtValue.getText() + "1");
        }
    }
}
