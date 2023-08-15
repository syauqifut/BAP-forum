package Forum9;

import javax.swing.*;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

public class ItemEventExample extends JFrame {
    String[] items = {"Pilihan 1", "Pilihan 2", "Pilihan 3"};
    JComboBox cbx = new JComboBox<>(items);
    public ItemEventExample() {
        setVisible(true);
        setSize(400, 400);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        cbx.addItemListener(new ItemListener() {
            public void itemStateChanged(ItemEvent e) {
                if (e.getStateChange() == ItemEvent.SELECTED) {
                    String selectedOption = (String) cbx.getSelectedItem();
                    System.out.println("Anda Memilih : " + selectedOption);
                }
            }
        });
        add(cbx);
    }

    public static void main(String[] args) {
        new ItemEventExample();
    }
}
