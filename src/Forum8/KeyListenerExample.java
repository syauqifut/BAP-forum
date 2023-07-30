package Forum8;

import javax.swing.*;
import java.awt.event.KeyListener;

public class KeyListenerExample extends JFrame implements KeyListener {
    JTextField txtValue = new JTextField();

    public KeyListenerExample() {
        setVisible(true);
        setSize(400, 400);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        add(txtValue);
        txtValue.addKeyListener(this);
    }

    public static void main(String[] args) {
        new KeyListenerExample();
    }

    @Override
    public void keyTyped(java.awt.event.KeyEvent e) {
        if (e.getSource() == txtValue) {
            char c = e.getKeyChar();
            System.out.println("Anda mengetik karakter '" + c + "'");
        }

    }

    @Override
    public void keyPressed(java.awt.event.KeyEvent e) {
//
    }

    @Override
    public void keyReleased(java.awt.event.KeyEvent e) {
//
    }
}
