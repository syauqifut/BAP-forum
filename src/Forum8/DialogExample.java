package Forum8;

import javax.swing.*;

public class DialogExample {
    public static void MessageDialog(String[] args) {
        JOptionPane.showMessageDialog(null, "Ini adalah contoh Message Dialog");
    }

    public static void ConfirmDialog(String[] args)  {
        int option = JOptionPane.showConfirmDialog(null, "Silakan konfirmasi?");
        switch (option){
            case JOptionPane.YES_OPTION:
                JOptionPane.showMessageDialog(null, "Anda Memilih Yes"); break;
            case JOptionPane.NO_OPTION:
                JOptionPane.showMessageDialog(null, "Anda Memilih No"); break;
            case JOptionPane.CANCEL_OPTION:
                JOptionPane.showMessageDialog(null, "Anda Memilih Cancel"); break;
            default:
                System.exit(0); break;
        }
    }

    public static void InputDialog(String[] args) {
        String input = JOptionPane.showInputDialog("Inputkan Sesuatu");
        JOptionPane.showMessageDialog(null, "Kamu meng-inputkan: " + input);
    }

    public static void OptionDialog(String[] args) {
        String[] options = {"Merah", "Hijau", "Biru"};
        int choice = JOptionPane.showOptionDialog(null, "Pilih warna favorit Anda:", "Pilihan Warna", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, options, options[0]);

        if (choice >= 0 && choice < options.length) {
            JOptionPane.showMessageDialog(null, "Warna favorit Anda adalah " + options[choice]);
        } else {
            JOptionPane.showMessageDialog(null, "Anda tidak memilih opsi apa pun.");
        }
    }

    public static void main(String[] args) {
        MessageDialog(args);
        ConfirmDialog(args);
        InputDialog(args);
        OptionDialog(args);
    }
}

