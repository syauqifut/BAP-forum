package Forum7;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ActionListenerExample extends JFrame implements ActionListener {

    JButton btnTampilkan = new JButton("Tampilkan dialog isi textfield");
    JTextField txtValue = new JTextField();

    public ActionListenerExample() {
        setVisible(true);
        setSize(400, 400);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


        setLayout(new GridLayout(2, 1));
        add(txtValue);
        add(btnTampilkan);

        btnTampilkan.addActionListener(this);
    }

    public static void main(String[] args) {
        new ActionListenerExample();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == btnTampilkan) {
            JOptionPane.showMessageDialog(null, txtValue.getText());
        }
    }
}
