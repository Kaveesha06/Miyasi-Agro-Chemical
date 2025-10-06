package util;

import java.awt.Color;
import java.awt.Font;
import javax.swing.BorderFactory;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JWindow;
import javax.swing.SwingConstants;
import javax.swing.Timer;
import ui.Dashboard;

public class Message {

    public static void error(String message, String title) {
        JOptionPane.showMessageDialog(Dashboard.getInstance(), message, title, JOptionPane.ERROR_MESSAGE);
    }

    public static void error(JDialog dialog, String message, String title) {
        JOptionPane.showMessageDialog(Dashboard.getInstance(), message, title, JOptionPane.ERROR_MESSAGE);
    }

    public static void sucsses(String message, String title) {
        JOptionPane.showMessageDialog(Dashboard.getInstance(), message, title, JOptionPane.INFORMATION_MESSAGE);
    }

    public static void sucsses(JDialog dialog, String message, String title) {
        JOptionPane.showMessageDialog(Dashboard.getInstance(), message, title, JOptionPane.INFORMATION_MESSAGE);
    }

    public static void warning(String message, String title) {
        JOptionPane.showMessageDialog(Dashboard.getInstance(), message, title, JOptionPane.WARNING_MESSAGE);
    }

    public static void warning(JDialog dialog, String message, String title) {
        JOptionPane.showMessageDialog(Dashboard.getInstance(), message, title, JOptionPane.WARNING_MESSAGE);
    }
}
