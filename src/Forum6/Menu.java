package Forum6;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Menu extends JFrame {
    JMenuBar menuBar = new JMenuBar();

    JMenu fileMenu = new JMenu("File");
    JMenu editMenu = new JMenu("Edit");
    JMenu helpMenu = new JMenu("Help");

    JMenuItem newItem = new JMenuItem("New");
    JMenuItem openItem = new JMenuItem("Open");
    JMenuItem saveItem = new JMenuItem("Save");
    JMenuItem exitItem = new JMenuItem("Exit");


    public Menu() {
        setTitle("Menu");
        setVisible(true);
        setSize(400, 400);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        fileMenu.add(newItem);
        fileMenu.add(openItem);
        fileMenu.add(saveItem);
        fileMenu.addSeparator();
        fileMenu.add(exitItem);

        menuBar.add(fileMenu);
        menuBar.add(editMenu);
        menuBar.add(helpMenu);

        setJMenuBar(menuBar);

        exitItem.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });
    }

    public static void main(String[] args) {
        new Menu();
    }
}
