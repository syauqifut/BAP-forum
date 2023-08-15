package Forum9;

import Forum8.KeyListenerExample;

import javax.swing.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class MouseEventExample extends JFrame {
    JButton btnOK = new JButton("klik saya");

    public MouseEventExample() {
        setVisible(true);
        setSize(400, 400);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        btnOK.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {
                if (e.getButton() == MouseEvent.BUTTON1) {
                    System.out.println("Anda melakukan klik kiri pada tombol.");
                }
            }
        });
        add(btnOK);
    }

    public static void main(String[] args) {
        new MouseEventExample();
    }

}
