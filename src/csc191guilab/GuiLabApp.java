package csc191guilab;

import javax.swing.SwingUtilities;
import javax.swing.UIManager;

/**
 * CSC 191 - Java GUI Lab
 *
 * NETBEANS: Run this file (Shift+F6) to launch the starter application.
 */
public class GuiLabApp {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            try {
                UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
            } catch (Exception ignored) {
                // The program can still run with Java's default look and feel.
            }

            EventRegistrationFrame frame = new EventRegistrationFrame();
            frame.setVisible(true);
        });
    }
}
