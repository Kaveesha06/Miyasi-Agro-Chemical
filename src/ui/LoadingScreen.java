package ui;

import javax.swing.*;
import java.awt.*;

public class LoadingScreen extends JFrame {

    public LoadingScreen() {
        setUndecorated(true); // Removes title bar for modern look
        setSize(300, 300);
        setLocationRelativeTo(null); // Center screen
        getContentPane().setBackground(Color.WHITE);
        setLayout(new BorderLayout());

        // Add GIF as a label
        JLabel gifLabel = new JLabel(new ImageIcon(getClass().getResource("/resourse/loading.gif")));
        gifLabel.setHorizontalAlignment(SwingConstants.CENTER);
        add(gifLabel, BorderLayout.CENTER);

        // Optional text below GIF
        JLabel text = new JLabel("Data Loading...", JLabel.CENTER);
        text.setFont(new Font("Arial", Font.ROMAN_BASELINE, 20));
        add(text, BorderLayout.SOUTH);
    }
}