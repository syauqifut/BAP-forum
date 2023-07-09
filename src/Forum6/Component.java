package Forum6;

import javax.swing.*;
import java.awt.*;

public class Component extends JFrame {
    JPanel panelGrid = new JPanel();

    // Jcombobox, Jradiobutton dan Jbutton.
    String[] items = {"Pilihan 1", "Pilihan 2", "Pilihan 3"};
    JComboBox cbx = new JComboBox<>(items);

    JRadioButton rbkiri = new JRadioButton("Kiri");
    JRadioButton rbkanan = new JRadioButton("Kanan");

    JButton  btn = new JButton("OK");

    JPanel radioPanel = new JPanel(new GridLayout(1, 2));

    public Component() {
        setVisible(true);
        setSize(400, 400);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        panelGrid.setLayout(new GridLayout( 3,1));
        panelGrid.add(cbx);

        radioPanel.add(rbkiri);
        radioPanel.add(rbkanan);
        panelGrid.add(radioPanel);

        panelGrid.add(btn);
        add(panelGrid);
    }

    public static void main(String[] args) {
        new Component();
    }
}
