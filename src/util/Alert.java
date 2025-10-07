package util;

import javax.swing.*;
import java.awt.*;

public class Alert {

    public static void show(String message, AlertType type) {
        JWindow window = new JWindow();
        JLabel label = new JLabel(message, SwingConstants.CENTER);

        // Set style based on alert type
        switch (type) {
            case SUCCESS:
                label.setBackground(new Color(46, 204, 113)); // green
                label.setForeground(Color.WHITE);
                label.setText(" " + message);
                break;
            case WARNING:
                label.setBackground(new Color(241, 196, 15)); // yellow
                label.setForeground(Color.BLACK);
                label.setText(" " + message);
                break;
            case ERROR:
                label.setBackground(new Color(231, 76, 60)); // red
                label.setForeground(Color.WHITE);
                label.setText(" " + message);
                break;
        }

        label.setFont(new Font("poppins", Font.BOLD, 14));
        label.setOpaque(true);
        label.setBorder(BorderFactory.createLineBorder(Color.DARK_GRAY));

        window.getContentPane().add(label);
        window.setSize(300, 50);

        // Top center of the screen
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        int x = (screenSize.width - window.getWidth()) / 2;
        int y = 250; // distance from the top (adjust as needed)
        window.setLocation(x, y);

        window.setAlwaysOnTop(true);
        window.setVisible(true);

        new Timer(5000, e -> window.dispose()).start();
    }

    public enum AlertType {
        SUCCESS, WARNING, ERROR
    }
}
